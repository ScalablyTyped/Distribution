package typings.three

import org.scalablytyped.runtime.StringDictionary
import typings.three.anon.MaterialIndex
import typings.three.anon.Start
import typings.three.srcConstantsMod.BuiltinShaderAttributeName
import typings.three.srcCoreBufferAttributeMod.BufferAttribute
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreEventDispatcherMod.EventDispatcher
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
    * This creates a new BufferGeometry. It also sets several properties to an default value.
    */
  open class BufferGeometry () extends EventDispatcher[Event] {
    
    /**
      * @deprecated Use {@link BufferGeometry#setAttribute .setAttribute()} instead.
      */
    def addAttribute(name: String, attribute: BufferAttribute): BufferGeometry = js.native
    def addAttribute(name: String, attribute: InterleavedBufferAttribute): BufferGeometry = js.native
    def addAttribute(name: Any, array: Any, itemSize: Any): Any = js.native
    
    /**
      * @deprecated Use {@link BufferGeometry#addGroup .addGroup()} instead.
      */
    def addDrawCall(start: Any, count: Any): Unit = js.native
    def addDrawCall(start: Any, count: Any, indexOffset: Any): Unit = js.native
    
    def addGroup(start: Double, count: Double): Unit = js.native
    def addGroup(start: Double, count: Double, materialIndex: Double): Unit = js.native
    
    /**
      * @deprecated Use {@link BufferGeometry#setIndex .setIndex()} instead.
      */
    def addIndex(index: Any): Unit = js.native
    
    /**
      * Bakes matrix transform directly into vertex coordinates.
      */
    def applyMatrix4(matrix: Matrix4): BufferGeometry = js.native
    
    def applyQuaternion(q: Quaternion): BufferGeometry = js.native
    
    /**
      * @default {}
      */
    var attributes: StringDictionary[BufferAttribute | InterleavedBufferAttribute] = js.native
    
    /**
      * @default null
      */
    var boundingBox: Box3 | Null = js.native
    
    /**
      * @default null
      */
    var boundingSphere: Sphere | Null = js.native
    
    def center(): BufferGeometry = js.native
    
    /**
      * @deprecated Use {@link BufferGeometry#clearGroups .clearGroups()} instead.
      */
    def clearDrawCalls(): Unit = js.native
    
    def clearGroups(): Unit = js.native
    
    /**
      * Computes bounding box of the geometry, updating Geometry.boundingBox attribute.
      * Bounding boxes aren't computed by default. They need to be explicitly computed, otherwise they are null.
      */
    def computeBoundingBox(): Unit = js.native
    
    /**
      * Computes bounding sphere of the geometry, updating Geometry.boundingSphere attribute.
      * Bounding spheres aren't' computed by default. They need to be explicitly computed, otherwise they are null.
      */
    def computeBoundingSphere(): Unit = js.native
    
    /**
      * Computes and adds tangent attribute to this geometry.
      */
    def computeTangents(): Unit = js.native
    
    /**
      * Computes vertex normals by averaging face normals.
      */
    def computeVertexNormals(): Unit = js.native
    
    def copy(source: BufferGeometry): this.type = js.native
    
    def deleteAttribute(name: String): BufferGeometry = js.native
    def deleteAttribute(name: BuiltinShaderAttributeName): BufferGeometry = js.native
    
    /**
      * Disposes the object from memory.
      * You need to call this when you want the bufferGeometry removed while the application is running.
      */
    def dispose(): Unit = js.native
    
    /**
      * @default { start: 0, count: Infinity }
      */
    var drawRange: Start = js.native
    
    /**
      * @deprecated Use {@link BufferGeometry#groups .groups} instead.
      */
    var drawcalls: Any = js.native
    
    def getAttribute(name: String): BufferAttribute | InterleavedBufferAttribute = js.native
    def getAttribute(name: BuiltinShaderAttributeName): BufferAttribute | InterleavedBufferAttribute = js.native
    
    def getIndex(): BufferAttribute | Null = js.native
    
    /**
      * @default []
      */
    var groups: js.Array[MaterialIndex] = js.native
    
    def hasAttribute(name: String): Boolean = js.native
    def hasAttribute(name: BuiltinShaderAttributeName): Boolean = js.native
    
    /**
      * Unique number of this buffergeometry instance
      */
    var id: Double = js.native
    
    /**
      * @default null
      */
    var index: BufferAttribute | Null = js.native
    
    val isBufferGeometry: `true` = js.native
    
    def lookAt(v: Vector3): Unit = js.native
    
    /**
      * @default {}
      */
    var morphAttributes: StringDictionary[js.Array[BufferAttribute | InterleavedBufferAttribute]] = js.native
    
    /**
      * @default false
      */
    var morphTargetsRelative: Boolean = js.native
    
    /**
      * @default ''
      */
    var name: String = js.native
    
    def normalizeNormals(): Unit = js.native
    
    /**
      * @deprecated Use {@link BufferGeometry#groups .groups} instead.
      */
    var offsets: Any = js.native
    
    /**
      * @deprecated Use {@link BufferGeometry#deleteAttribute .deleteAttribute()} instead.
      */
    def removeAttribute(name: String): BufferGeometry = js.native
    
    def rotateX(angle: Double): BufferGeometry = js.native
    
    def rotateY(angle: Double): BufferGeometry = js.native
    
    def rotateZ(angle: Double): BufferGeometry = js.native
    
    def scale(x: Double, y: Double, z: Double): BufferGeometry = js.native
    
    def setAttribute(name: String, attribute: BufferAttribute): BufferGeometry = js.native
    def setAttribute(name: String, attribute: InterleavedBufferAttribute): BufferGeometry = js.native
    def setAttribute(name: BuiltinShaderAttributeName, attribute: BufferAttribute): BufferGeometry = js.native
    def setAttribute(name: BuiltinShaderAttributeName, attribute: InterleavedBufferAttribute): BufferGeometry = js.native
    
    def setDrawRange(start: Double, count: Double): Unit = js.native
    
    def setFromPoints(points: js.Array[Vector2 | Vector3]): BufferGeometry = js.native
    
    def setIndex(): BufferGeometry = js.native
    def setIndex(index: js.Array[Double]): BufferGeometry = js.native
    def setIndex(index: BufferAttribute): BufferGeometry = js.native
    
    def toJSON(): Any = js.native
    
    def toNonIndexed(): BufferGeometry = js.native
    
    def translate(x: Double, y: Double, z: Double): BufferGeometry = js.native
    
    /**
      * @default 'BufferGeometry'
      */
    var `type`: String = js.native
    
    /**
      * @default {}
      */
    var userData: StringDictionary[Any] = js.native
    
    var uuid: String = js.native
  }
}
