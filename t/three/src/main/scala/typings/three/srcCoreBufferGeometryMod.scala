package typings.three

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import typings.three.anon.MaterialIndex
import typings.three.anon.Start
import typings.three.srcCoreBufferAttributeMod.BufferAttribute
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreEventDispatcherMod.EventDispatcher
import typings.three.srcCoreGlbufferattributeMod.GLBufferAttribute
import typings.three.srcCoreInterleavedBufferAttributeMod.InterleavedBufferAttribute
import typings.three.srcMathBox3Mod.Box3
import typings.three.srcMathMatrix4Mod.Matrix4
import typings.three.srcMathQuaternionMod.Quaternion
import typings.three.srcMathSphereMod.Sphere
import typings.three.srcMathVector2Mod.Vector2
import typings.three.srcMathVector3Mod.Vector3
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreBufferGeometryMod {
  
  @JSImport("three/src/core/BufferGeometry", "BufferGeometry")
  @js.native
  /**
    * This creates a new {@link THREE.BufferGeometry | BufferGeometry} object.
    */
  open class BufferGeometry[Attributes /* <: NormalOrGLBufferAttributes */] () extends EventDispatcher[Event] {
    
    /**
      * Adds a group to this geometry
      * @see the {@link BufferGeometry.groups | groups} property for details.
      * @param start
      * @param count
      * @param materialIndex
      */
    def addGroup(start: Double, count: Double): Unit = js.native
    def addGroup(start: Double, count: Double, materialIndex: Double): Unit = js.native
    
    /**
      * Applies the matrix transform to the geometry.
      * @param matrix
      */
    def applyMatrix4(matrix: Matrix4): this.type = js.native
    
    /**
      * Applies the rotation represented by the quaternion to the geometry.
      * @param quaternion
      */
    def applyQuaternion(quaternion: Quaternion): this.type = js.native
    
    /**
      * This hashmap has as id the name of the attribute to be set and as value the {@link THREE.BufferAttribute | buffer} to set it to. Rather than accessing this property directly,
      * use {@link setAttribute | .setAttribute} and {@link getAttribute | .getAttribute} to access attributes of this geometry.
      * @defaultValue `{}`
      */
    var attributes: Attributes = js.native
    
    /**
      * Bounding box for the {@link THREE.BufferGeometry | BufferGeometry}, which can be calculated with {@link computeBoundingBox | .computeBoundingBox()}.
      * @remarks Bounding boxes aren't computed by default. They need to be explicitly computed, otherwise they are `null`.
      * @defaultValue `null`
      */
    var boundingBox: Box3 | Null = js.native
    
    /**
      * Bounding sphere for the {@link THREE.BufferGeometry | BufferGeometry}, which can be calculated with {@link computeBoundingSphere | .computeBoundingSphere()}.
      * @remarks bounding spheres aren't computed by default. They need to be explicitly computed, otherwise they are `null`.
      * @defaultValue `null`
      */
    var boundingSphere: Sphere | Null = js.native
    
    /**
      * Center the geometry based on the bounding box.
      */
    def center(): this.type = js.native
    
    /**
      * Clears all groups.
      */
    def clearGroups(): Unit = js.native
    
    /**
      * Computes bounding box of the geometry, updating {@link boundingBox | .boundingBox} attribute.
      * @remarks Bounding boxes aren't computed by default. They need to be explicitly computed, otherwise they are `null`.
      */
    def computeBoundingBox(): Unit = js.native
    
    /**
      * Computes bounding sphere of the geometry, updating {@link boundingSphere | .boundingSphere} attribute.
      * @remarks bounding spheres aren't computed by default. They need to be explicitly computed, otherwise they are `null`.
      */
    def computeBoundingSphere(): Unit = js.native
    
    /**
      * Calculates and adds a tangent attribute to this geometry.
      * The computation is only supported for indexed geometries and if position, normal, and uv attributes are defined
      * @remarks
      * When using a tangent space normal map, prefer the MikkTSpace algorithm provided by
      * {@link BufferGeometryUtils.computeMikkTSpaceTangents} instead.
      */
    def computeTangents(): Unit = js.native
    
    /**
      * Computes vertex normals for the given vertex data. For indexed geometries, the method sets each vertex normal to
      * be the average of the face normals of the faces that share that vertex. For non-indexed geometries, vertices are
      * not shared, and the method sets each vertex normal to be the same as the face normal.
      */
    def computeVertexNormals(): Unit = js.native
    
    /**
      * Copies another BufferGeometry to this BufferGeometry.
      * @param source
      */
    def copy(source: BufferGeometry[NormalBufferAttributes]): this.type = js.native
    
    /**
      * Deletes the  {@link attributes | attribute} with the specified name.
      * @param name
      */
    def deleteAttribute(name: /* keyof Attributes */ String): this.type = js.native
    
    /**
      * Frees the GPU-related resources allocated by this instance.
      * @remarks Call this method whenever this instance is no longer used in your app.
      */
    def dispose(): Unit = js.native
    
    /**
      * Determines the part of the geometry to render. This should not be set directly, instead use {@link setDrawRange | .setDrawRange(...)}.
      * @remarks For non-indexed {@link THREE.BufferGeometry | BufferGeometry}, count is the number of vertices to render.
      * @remarks For indexed {@link THREE.BufferGeometry | BufferGeometry}, count is the number of indices to render.
      * @defaultValue `{ start: 0, count: Infinity }`
      */
    var drawRange: Start = js.native
    
    /**
      * Returns the {@link attributes | attribute} with the specified name.
      * @param name
      */
    def getAttribute[K /* <: /* keyof Attributes */ String */](name: K): /* import warning: importer.ImportType#apply Failed type conversion: Attributes[K] */ js.Any = js.native
    
    /**
      * Return the {@link index | .index} buffer.
      */
    def getIndex(): BufferAttribute | Null = js.native
    
    /**
      * Split the geometry into groups, each of which will be rendered in a separate WebGL draw call. This allows an array of materials to be used with the geometry.
      * @remarks Every vertex and index must belong to exactly one group — groups must not share vertices or indices, and must not leave vertices or indices unused.
      * @remarks Use {@link addGroup | .addGroup} to add groups, rather than modifying this array directly.
      * @defaultValue `[]`
      */
    var groups: js.Array[MaterialIndex] = js.native
    
    /**
      * Returns true if the {@link attributes | attribute} with the specified name exists.
      * @param name
      */
    def hasAttribute(name: /* keyof Attributes */ String): Boolean = js.native
    
    /**
      * Unique number for this {@link THREE.BufferGeometry | BufferGeometry} instance.
      * @remarks Expects a `Integer`
      */
    var id: Double = js.native
    
    /**
      * Allows for vertices to be re-used across multiple triangles; this is called using "indexed triangles".
      * Each triangle is associated with the indices of three vertices. This attribute therefore stores the index of each vertex for each triangular face.
      * If this attribute is not set, the {@link THREE.WebGLRenderer | renderer}  assumes that each three contiguous positions represent a single triangle.
      * @defaultValue `null`
      */
    var index: BufferAttribute | Null = js.native
    
    /**
      * Read-only flag to check if a given object is of type {@link BufferGeometry}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isBufferGeometry: `true` = js.native
    
    /**
      * Rotates the geometry to face a point in space.
      * @remarks This is typically done as a one time operation, and not during a loop.
      * @remarks Use {@link THREE.Object3D.lookAt | Object3D.lookAt} for typical real-time mesh usage.
      * @param vector A world vector to look at.
      */
    def lookAt(vector: Vector3): this.type = js.native
    
    /**
      * Hashmap of {@link THREE.BufferAttribute | BufferAttributes} holding details of the geometry's morph targets.
      * @remarks
      * Once the geometry has been rendered, the morph attribute data cannot be changed.
      * You will have to call {@link dispose | .dispose}(), and create a new instance of {@link THREE.BufferGeometry | BufferGeometry}.
      * @defaultValue `{}`
      */
    var morphAttributes: StringDictionary[js.Array[BufferAttribute | InterleavedBufferAttribute]] = js.native
    
    /**
      * Used to control the morph target behavior; when set to true, the morph target data is treated as relative offsets, rather than as absolute positions/normals.
      * @defaultValue `false`
      */
    var morphTargetsRelative: Boolean = js.native
    
    /**
      * Optional name for this {@link THREE.BufferGeometry | BufferGeometry} instance.
      * @defaultValue `''`
      */
    var name: String = js.native
    
    /**
      * Every normal vector in a geometry will have a magnitude of 1
      * @remarks This will correct lighting on the geometry surfaces.
      */
    def normalizeNormals(): Unit = js.native
    
    /**
      * Rotate the geometry about the X axis. This is typically done as a one time operation, and not during a loop.
      * @remarks Use {@link THREE.Object3D.rotation | Object3D.rotation} for typical real-time mesh rotation.
      * @param angle radians. Expects a `Float`
      */
    def rotateX(angle: Double): this.type = js.native
    
    /**
      * Rotate the geometry about the Y axis.
      * @remarks This is typically done as a one time operation, and not during a loop.
      * @remarks Use {@link THREE.Object3D.rotation | Object3D.rotation} for typical real-time mesh rotation.
      * @param angle radians. Expects a `Float`
      */
    def rotateY(angle: Double): this.type = js.native
    
    /**
      * Rotate the geometry about the Z axis.
      * @remarks This is typically done as a one time operation, and not during a loop.
      * @remarks Use {@link THREE.Object3D.rotation | Object3D.rotation} for typical real-time mesh rotation.
      * @param angle radians. Expects a `Float`
      */
    def rotateZ(angle: Double): this.type = js.native
    
    /**
      * Scale the geometry data.
      * @remarks This is typically done as a one time operation, and not during a loop.
      * @remarks Use {@link THREE.Object3D.scale | Object3D.scale} for typical real-time mesh scaling.
      * @param x Expects a `Float`
      * @param y Expects a `Float`
      * @param z Expects a `Float`
      */
    def scale(x: Double, y: Double, z: Double): this.type = js.native
    
    /**
      * Sets an {@link attributes | attribute} to this geometry with the specified name.
      * @remarks
      * Use this rather than the attributes property, because an internal hashmap of {@link attributes | .attributes} is maintained to speed up iterating over attributes.
      * @param name
      * @param attribute
      */
    def setAttribute[K /* <: /* keyof Attributes */ String */](
      name: K,
      attribute: /* import warning: importer.ImportType#apply Failed type conversion: Attributes[K] */ js.Any
    ): this.type = js.native
    
    /**
      * Set the {@link drawRange | .drawRange} property
      * @remarks For non-indexed BufferGeometry, count is the number of vertices to render
      * @remarks For indexed BufferGeometry, count is the number of indices to render.
      * @param start
      * @param count is the number of vertices or indices to render. Expects a `Integer`
      */
    def setDrawRange(start: Double, count: Double): Unit = js.native
    
    /**
      * Sets the attributes for this BufferGeometry from an array of points.
      * @param points
      */
    def setFromPoints(points: js.Array[Vector2 | Vector3]): this.type = js.native
    
    /**
      * Set the {@link THREE.BufferGeometry.index | .index} buffer.
      * @param index
      */
    def setIndex(): this.type = js.native
    def setIndex(index: js.Array[Double]): this.type = js.native
    def setIndex(index: BufferAttribute): this.type = js.native
    
    /**
      * Convert the buffer geometry to three.js {@link https://github.com/mrdoob/three.js/wiki/JSON-Object-Scene-format-4 | JSON Object/Scene format}.
      */
    def toJSON(): js.Object = js.native
    
    /**
      * Return a non-index version of an indexed BufferGeometry.
      */
    def toNonIndexed(): BufferGeometry[NormalBufferAttributes] = js.native
    
    /**
      * Translate the geometry.
      * @remarks This is typically done as a one time operation, and not during a loop.
      * @remarks Use {@link THREE.Object3D.position | Object3D.position} for typical real-time mesh rotation.
      * @param x Expects a `Float`
      * @param y Expects a `Float`
      * @param z Expects a `Float`
      */
    def translate(x: Double, y: Double, z: Double): this.type = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @defaultValue `BufferGeometry`
      */
    val `type`: String | typings.three.threeStrings.BufferGeometry = js.native
    
    /**
      * An object that can be used to store custom data about the BufferGeometry. It should not hold references to functions as these will not be cloned.
      * @defaultValue `{}`
      */
    var userData: StringDictionary[Any] = js.native
    
    /**
      * {@link http://en.wikipedia.org/wiki/Universally_unique_identifier | UUID} of this object instance.
      * @remarks This gets automatically assigned and shouldn't be edited.
      */
    var uuid: String = js.native
  }
  
  type NormalBufferAttributes = Record[String, BufferAttribute | InterleavedBufferAttribute]
  
  type NormalOrGLBufferAttributes = Record[String, BufferAttribute | InterleavedBufferAttribute | GLBufferAttribute]
}
