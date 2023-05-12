package typings.three

import org.scalablytyped.runtime.StringDictionary
import typings.three.anon.Geometries
import typings.three.srcAnimationAnimationClipMod.AnimationClip
import typings.three.srcCamerasCameraMod.Camera
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcCoreEventDispatcherMod.BaseEvent
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreEventDispatcherMod.EventDispatcher
import typings.three.srcCoreLayersMod.Layers
import typings.three.srcCoreRaycasterMod.Intersection
import typings.three.srcCoreRaycasterMod.Raycaster
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcMathEulerMod.Euler
import typings.three.srcMathMatrix3Mod.Matrix3
import typings.three.srcMathMatrix4Mod.Matrix4
import typings.three.srcMathQuaternionMod.Quaternion
import typings.three.srcMathVector3Mod.Vector3
import typings.three.srcObjectsGroupMod.Group
import typings.three.srcRenderersWebGLRendererMod.WebGLRenderer
import typings.three.srcScenesSceneMod.Scene
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreObject3DMod {
  
  @JSImport("three/src/core/Object3D", "Object3D")
  @js.native
  /**
    * This creates a new {@link Object3D} object.
    */
  open class Object3D[E /* <: BaseEvent */] () extends EventDispatcher[E] {
    
    /**
      * Adds another {@link Object3D} as child of this {@link Object3D}.
      * @remarks An arbitrary number of objects may be added
      * @remarks Any current parent on an {@link object} passed in here will be removed, since an {@link Object3D} can have at most one parent.
      * @see {@link attach}
      * @see {@link THREE.Group | Group} for info on manually grouping objects.
      * @param object
      */
    def add(`object`: Object3D[Event]*): this.type = js.native
    
    /**
      * Array with object's animation clips.
      * @defaultValue `[]`
      */
    var animations: js.Array[AnimationClip] = js.native
    
    /**
      * Applies the matrix transform to the object and updates the object's position, rotation and scale.
      * @param matrix
      */
    def applyMatrix4(matrix: Matrix4): Unit = js.native
    
    /**
      * Applies the rotation represented by the quaternion to the object.
      * @param quaternion
      */
    def applyQuaternion(quaternion: Quaternion): this.type = js.native
    
    /**
      * Adds a {@link Object3D} as a child of this, while maintaining the object's world transform.
      * @remarks Note: This method does not support scene graphs having non-uniformly-scaled nodes(s).
      * @see {@link add}
      * @param object
      */
    def attach(`object`: Object3D[Event]): this.type = js.native
    
    /**
      * Whether the object gets rendered into shadow map.
      * @defaultValue `false`
      */
    var castShadow: Boolean = js.native
    
    /**
      * Array with object's children.
      * @see {@link THREE.Object3DGroup | Group} for info on manually grouping objects.
      * @defaultValue `[]`
      */
    var children: js.Array[Object3D[Event]] = js.native
    
    /**
      * Removes all child objects.
      */
    def clear(): this.type = js.native
    
    def clone(recursive: Boolean): this.type = js.native
    
    /**
      * Copy the given object into this object
      * @remarks Note: event listeners and user-defined callbacks ({@link onAfterRender | .onAfterRender} and {@link onBeforeRender | .onBeforeRender}) are not copied.
      * @param source
      * @param recursive If true, descendants of the object are also copied. Default `true`
      */
    def copy(source: this.type): this.type = js.native
    def copy(source: this.type, recursive: Boolean): this.type = js.native
    
    // TODO Replace this to a Record?
    /**
      * Custom depth material to be used when rendering to the depth map.
      * @remarks Can only be used in context of meshes.
      * @remarks When shadow-casting with a {@link THREE.DirectionalLight | DirectionalLight} or {@link THREE.SpotLight | SpotLight},
      * if you are modifying vertex positions in the vertex shader you must specify a customDepthMaterial for proper shadows.
      * @defaultValue `undefined`
      */
    var customDepthMaterial: js.UndefOr[Material] = js.native
    
    /**
      * Same as {@link customDepthMaterial}, but used with {@link THREE.Object3DPointLight | PointLight}.
      * @defaultValue `undefined`
      */
    var customDistanceMaterial: js.UndefOr[Material] = js.native
    
    /**
      * When this is set, it checks every frame if the object is in the frustum of the camera before rendering the object.
      * If set to `false` the object gets rendered every frame even if it is not in the frustum of the camera.
      * @defaultValue `true`
      */
    var frustumCulled: Boolean = js.native
    
    /**
      * Searches through an object and its children, starting with the object itself, and returns the first with a matching id.
      * @remarks Note that ids are assigned in chronological order: 1, 2, 3, ..., incrementing by one for each new object.
      * @see {@link id}
      * @param id Unique number of the object instance. Expects a `Integer`
      */
    def getObjectById(id: Double): js.UndefOr[Object3D[Event]] = js.native
    
    /**
      * Searches through an object and its children, starting with the object itself, and returns the first with a matching name.
      * @remarks Note that for most objects the name is an empty string by default
      * @remarks You will have to set it manually to make use of this method.
      * @param name String to match to the children's Object3D.name property.
      */
    def getObjectByName(name: String): js.UndefOr[Object3D[Event]] = js.native
    
    /**
      * Searches through an object and its children, starting with the object itself,
      * and returns the first with a property that matches the value given.
      *
      * @param name - the property name to search for.
      * @param value - value of the given property.
      */
    def getObjectByProperty(name: String, value: Any): js.UndefOr[Object3D[Event]] = js.native
    
    /**
      * Searches through an object and its children, starting with the object itself,
      * and returns the first with a property that matches the value given.
      * @param name The property name to search for.
      * @param value Value of the given property.
      */
    def getObjectsByProperty(name: String, value: Any): js.Array[Object3D[Event]] = js.native
    
    /**
      * Returns a vector representing the direction of object's positive z-axis in world space.
      * @param target The result will be copied into this Vector3.
      */
    def getWorldDirection(target: Vector3): Vector3 = js.native
    
    /**
      * Returns a vector representing the position of the object in world space.
      * @param target The result will be copied into this Vector3.
      */
    def getWorldPosition(target: Vector3): Vector3 = js.native
    
    /**
      * Returns a quaternion representing the rotation of the object in world space.
      * @param target The result will be copied into this Quaternion.
      */
    def getWorldQuaternion(target: Quaternion): Quaternion = js.native
    
    /**
      * Returns a vector of the scaling factors applied to the object for each axis in world space.
      * @param target The result will be copied into this Vector3.
      */
    def getWorldScale(target: Vector3): Vector3 = js.native
    
    /**
      * Unique number for this {@link Object3D} instance.
      * @remarks Note that ids are assigned in chronological order: 1, 2, 3, ..., incrementing by one for each new object.
      * @remarks Expects a `Integer`
      */
    val id: Double = js.native
    
    /**
      * Flag to check if a given object is of type {@link Object3D}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isObject3D: `true` = js.native
    
    /**
      * The layer membership of the object.
      * @remarks The object is only visible if it has at least one layer in common with the {@link THREE.Object3DCamera | Camera} in use.
      * @remarks This property can also be used to filter out unwanted objects in ray-intersection tests when using {@link THREE.Raycaster | Raycaster}.
      * @defaultValue `new THREE.Layers()`
      */
    var layers: Layers = js.native
    
    /**
      * Converts the vector from this object's local space to world space.
      * @param vector A vector representing a position in this object's local space.
      */
    def localToWorld(vector: Vector3): Vector3 = js.native
    
    /**
      * Rotates the object to face a point in world space.
      * @remarks This method does not support objects having non-uniformly-scaled parent(s).
      * @param vector A vector representing a position in world space to look at.
      */
    def lookAt(vector: Vector3): Unit = js.native
    /**
      * Rotates the object to face a point in world space.
      * @remarks This method does not support objects having non-uniformly-scaled parent(s).
      * @param x Expects a `Float`
      * @param y Expects a `Float`
      * @param z Expects a `Float`
      */
    def lookAt(x: Double, y: Double, z: Double): Unit = js.native
    
    /**
      * The local transform matrix.
      * @defaultValue `new THREE.Matrix4()`
      */
    var matrix: Matrix4 = js.native
    
    /**
      * When this is set, it calculates the matrix of position, (rotation or quaternion) and
      * scale every frame and also recalculates the matrixWorld property.
      * @defaultValue {@link DEFAULT_MATRIX_AUTO_UPDATE} - that is `(true)`.
      */
    var matrixAutoUpdate: Boolean = js.native
    
    /**
      * The global transform of the object.
      * @remarks If the {@link Object3D} has no parent, then it's identical to the local transform {@link THREE.Object3D.matrix | .matrix}.
      * @defaultValue `new THREE.Matrix4()`
      */
    var matrixWorld: Matrix4 = js.native
    
    /**
      * If set, then the renderer checks every frame if the object and its children need matrix updates.
      * When it isn't, then you have to maintain all matrices in the object and its children yourself.
      * @defaultValue {@link DEFAULT_MATRIX_WORLD_AUTO_UPDATE} - that is `(true)`.
      */
    var matrixWorldAutoUpdate: Boolean = js.native
    
    /**
      * When this is set, it calculates the matrixWorld in that frame and resets this property to false.
      * @defaultValue `false`
      */
    var matrixWorldNeedsUpdate: Boolean = js.native
    
    /**
      * @defaultValue `new THREE.Matrix4()`
      */
    val modelViewMatrix: Matrix4 = js.native
    
    /**
      * Optional name of the object
      * @remarks _(doesn't need to be unique)_.
      * @defaultValue `""`
      */
    var name: String = js.native
    
    /**
      * @defaultValue `new THREE.Matrix3()`
      */
    val normalMatrix: Matrix3 = js.native
    
    /**
      * An optional callback that is executed immediately after a 3D object is rendered.
      * @remarks This function is called with the following parameters: renderer, scene, camera, geometry, material, group.
      * @remarks Please notice that this callback is only executed for `renderable` 3D objects.
      * Meaning 3D objects which define their visual appearance with geometries and materials like
      * instances of {@link THREE.Object3DMesh | Mesh}, {@link THREE.Object3DLine | Line}, {@link THREE.Object3DPoints | Points} or {@link THREE.Object3DSprite | Sprite}.
      * Instances of {@link THREE.Object3DObject3D | Object3D}, {@link THREE.Object3DGroup | Group} or {@link THREE.Object3DBone | Bone}
      * are not renderable and thus this callback is not executed for such objects.
      * @defaultValue `() => {}`
      */
    def onAfterRender(
      renderer: WebGLRenderer,
      scene: Scene,
      camera: Camera,
      geometry: BufferGeometry[NormalBufferAttributes],
      material: Material,
      group: Group
    ): Unit = js.native
    
    /**
      * An optional callback that is executed immediately before a 3D object is rendered.
      * @remarks This function is called with the following parameters: renderer, scene, camera, geometry, material, group.
      * @remarks Please notice that this callback is only executed for `renderable` 3D objects.
      * Meaning 3D objects which define their visual appearance with geometries and materials like
      * instances of {@link THREE.Object3DMesh | Mesh}, {@link THREE.Object3DLine | Line}, {@link THREE.Object3DPoints | Points} or {@link THREE.Object3DSprite | Sprite}.
      * Instances of {@link THREE.Object3DObject3D | Object3D}, {@link THREE.Object3DGroup | Group} or {@link THREE.Object3DBone | Bone}
      * are not renderable and thus this callback is not executed for such objects.
      * @defaultValue `() => {}`
      */
    def onBeforeRender(
      renderer: WebGLRenderer,
      scene: Scene,
      camera: Camera,
      geometry: BufferGeometry[NormalBufferAttributes],
      material: Material,
      group: Group
    ): Unit = js.native
    
    /**
      * Object's parent in the {@link https://en.wikipedia.org/wiki/Scene_graph | scene graph}.
      * @remarks An object can have at most one parent.
      * @defaultValue `null`
      */
    var parent: Object3D[Event] | Null = js.native
    
    /**
      * Object's local position.
      * @defaultValue `new THREE.Vector3()` - that is `(0, 0, 0)`.
      */
    val position: Vector3 = js.native
    
    /**
      * Object's local rotation as a {@link THREE.Quaternion | Quaternion}.
      * @defaultValue `new THREE.Quaternion()` - that is `(0,  0, 0, 1)`.
      */
    val quaternion: Quaternion = js.native
    
    /**
      * Abstract (empty) method to get intersections between a casted ray and this object
      * @remarks Subclasses such as {@link THREE.Mesh | Mesh}, {@link THREE.Line | Line}, and {@link THREE.Points | Points} implement this method in order to use raycasting.
      * @see {@link THREE.Raycaster | Raycaster}
      * @param raycaster
      * @param intersects
      * @defaultValue `() => {}`
      */
    def raycast(raycaster: Raycaster, intersects: js.Array[Intersection[Object3D[Event]]]): Unit = js.native
    
    /**
      * Whether the material receives shadows.
      * @defaultValue `false`
      */
    var receiveShadow: Boolean = js.native
    
    /**
      * Removes a {@link Object3D} as child of this {@link Object3D}.
      * @remarks An arbitrary number of objects may be removed.
      * @see {@link THREE.Group | Group} for info on manually grouping objects.
      * @param object
      */
    def remove(`object`: Object3D[Event]*): this.type = js.native
    
    /**
      * Removes this object from its current parent.
      */
    def removeFromParent(): this.type = js.native
    
    /**
      * This value allows the default rendering order of {@link https://en.wikipedia.org/wiki/Scene_graph | scene graph}
      * objects to be overridden although opaque and transparent objects remain sorted independently.
      * @remarks When this property is set for an instance of {@link Group | Group}, all descendants objects will be sorted and rendered together.
      * @remarks Sorting is from lowest to highest renderOrder.
      * @defaultValue `0`
      */
    var renderOrder: Double = js.native
    
    /**
      * Rotate an object along an axis in object space.
      * @remarks The axis is assumed to be normalized.
      * @param axis A normalized vector in object space.
      * @param angle The angle in radians. Expects a `Float`
      */
    def rotateOnAxis(axis: Vector3, angle: Double): this.type = js.native
    
    /**
      * Rotate an object along an axis in world space.
      * @remarks The axis is assumed to be normalized
      * @remarks Method Assumes no rotated parent.
      * @param axis A normalized vector in world space.
      * @param angle The angle in radians. Expects a `Float`
      */
    def rotateOnWorldAxis(axis: Vector3, angle: Double): this.type = js.native
    
    /**
      * Rotates the object around _x_ axis in local space.
      * @param rad The angle to rotate in radians. Expects a `Float`
      */
    def rotateX(angle: Double): this.type = js.native
    
    /**
      * Rotates the object around _y_ axis in local space.
      * @param rad The angle to rotate in radians. Expects a `Float`
      */
    def rotateY(angle: Double): this.type = js.native
    
    /**
      * Rotates the object around _z_ axis in local space.
      * @param rad The angle to rotate in radians. Expects a `Float`
      */
    def rotateZ(angle: Double): this.type = js.native
    
    /**
      * Object's local rotation ({@link https://en.wikipedia.org/wiki/Euler_angles | Euler angles}), in radians.
      * @defaultValue `new THREE.Euler()` - that is `(0, 0, 0, Euler.DEFAULT_ORDER)`.
      */
    val rotation: Euler = js.native
    
    /**
      * The object's local scale.
      * @defaultValue `new THREE.Vector3( 1, 1, 1 )`
      */
    val scale: Vector3 = js.native
    
    /**
      * Calls {@link THREE.Quaternion.setFromAxisAngle | setFromAxisAngle}({@link axis}, {@link angle}) on the {@link quaternion | .quaternion}.
      * @param axis A normalized vector in object space.
      * @param angle Angle in radians. Expects a `Float`
      */
    def setRotationFromAxisAngle(axis: Vector3, angle: Double): Unit = js.native
    
    /**
      * Calls {@link THREE.Quaternion.setFromEuler | setFromEuler}({@link euler}) on the {@link quaternion | .quaternion}.
      * @param euler Euler angle specifying rotation amount.
      */
    def setRotationFromEuler(euler: Euler): Unit = js.native
    
    /**
      * Calls {@link THREE.Quaternion.setFromRotationMatrix | setFromRotationMatrix}({@link m}) on the {@link quaternion | .quaternion}.
      * @remarks Note that this assumes that the upper 3x3 of m is a pure rotation matrix (i.e, unscaled).
      * @param m Rotate the quaternion by the rotation component of the matrix.
      */
    def setRotationFromMatrix(m: Matrix4): Unit = js.native
    
    /**
      * Copy the given {@link THREE.Quaternion | Quaternion} into {@link quaternion | .quaternion}.
      * @param q Normalized Quaternion.
      */
    def setRotationFromQuaternion(q: Quaternion): Unit = js.native
    
    /**
      * Convert the object to three.js {@link https://github.com/mrdoob/three.js/wiki/JSON-Object-Scene-format-4 | JSON Object/Scene format}.
      * @param meta Object containing metadata such as materials, textures or images for the object.
      */
    def toJSON(): Any = js.native
    def toJSON(meta: Geometries): Any = js.native
    
    /**
      * Translate an object by distance along an axis in object space
      * @remarks The axis is assumed to be normalized.
      * @param axis A normalized vector in object space.
      * @param distance The distance to translate. Expects a `Float`
      */
    def translateOnAxis(axis: Vector3, distance: Double): this.type = js.native
    
    /**
      * Translates object along x axis in object space by {@link distance} units.
      * @param distance Expects a `Float`
      */
    def translateX(distance: Double): this.type = js.native
    
    /**
      * Translates object along _y_ axis in object space by {@link distance} units.
      * @param distance Expects a `Float`
      */
    def translateY(distance: Double): this.type = js.native
    
    /**
      * Translates object along _z_ axis in object space by {@link distance} units.
      * @param distance Expects a `Float`
      */
    def translateZ(distance: Double): this.type = js.native
    
    /**
      * Executes the callback on this object and all descendants.
      * @remarks Note: Modifying the scene graph inside the callback is discouraged.
      * @param callback A function with as first argument an {@link Object3D} object.
      */
    def traverse(callback: js.Function1[/* object */ Object3D[Event], Any]): Unit = js.native
    
    /**
      * Executes the callback on all ancestors.
      * @remarks Note: Modifying the scene graph inside the callback is discouraged.
      * @param callback A function with as first argument an {@link Object3D} object.
      */
    def traverseAncestors(callback: js.Function1[/* object */ Object3D[Event], Any]): Unit = js.native
    
    /**
      * Like traverse, but the callback will only be executed for visible objects
      * @remarks Descendants of invisible objects are not traversed.
      * @remarks Note: Modifying the scene graph inside the callback is discouraged.
      * @param callback A function with as first argument an {@link Object3D} object.
      */
    def traverseVisible(callback: js.Function1[/* object */ Object3D[Event], Any]): Unit = js.native
    
    /**
      * A Read-only _string_ to check `this` object type.
      * @remarks This can be used to find a specific type of Object3D in a scene.
      * @remarks Sub-classes will update this value.
      * @defaultValue `Object3D`
      */
    val `type`: String | typings.three.threeStrings.Object3D = js.native
    
    /**
      * This is used by the {@link lookAt | lookAt} method, for example, to determine the orientation of the result.
      * @defaultValue {@link DEFAULT_UP | Object3D.DEFAULT_UP} - that is `(0, 1, 0)`.
      */
    var up: Vector3 = js.native
    
    /**
      * Updates local transform.
      */
    def updateMatrix(): Unit = js.native
    
    /**
      * Updates the global transform of the object.
      * And will update the object descendants if {@link matrixWorldNeedsUpdate | .matrixWorldNeedsUpdate} is set to true or if the {@link force} parameter is set to `true`.
      * @param force A boolean that can be used to bypass {@link matrixWorldAutoUpdate | .matrixWorldAutoUpdate}, to recalculate the world matrix of the object and descendants on the current frame.
      * Useful if you cannot wait for the renderer to update it on the next frame, assuming {@link matrixWorldAutoUpdate | .matrixWorldAutoUpdate} set to `true`.
      */
    def updateMatrixWorld(): Unit = js.native
    def updateMatrixWorld(force: Boolean): Unit = js.native
    
    /**
      * Updates the global transform of the object.
      * @param updateParents Recursively updates global transform of ancestors.
      * @param updateChildren Recursively updates global transform of descendants.
      */
    def updateWorldMatrix(updateParents: Boolean, updateChildren: Boolean): Unit = js.native
    
    /**
      * An object that can be used to store custom data about the {@link Object3D}.
      * @remarks It should not hold references to _functions_ as these **will not** be cloned.
      * @default `{}`
      */
    var userData: StringDictionary[Any] = js.native
    
    /**
      * {@link http://en.wikipedia.org/wiki/Universally_unique_identifier | UUID} of this object instance.
      * @remarks This gets automatically assigned and shouldn't be edited.
      */
    var uuid: String = js.native
    
    /**
      * Object gets rendered if `true`.
      * @defaultValue `true`
      */
    var visible: Boolean = js.native
    
    /**
      * Converts the vector from world space to this object's local space.
      * @param vector A vector representing a position in world space.
      */
    def worldToLocal(vector: Vector3): Vector3 = js.native
  }
  /* static members */
  object Object3D {
    
    @JSImport("three/src/core/Object3D", "Object3D")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The default setting for {@link matrixAutoUpdate} for newly created Object3Ds.
      * @defaultValue `true`
      */
    @JSImport("three/src/core/Object3D", "Object3D.DEFAULT_MATRIX_AUTO_UPDATE")
    @js.native
    def DEFAULT_MATRIX_AUTO_UPDATE: Boolean = js.native
    inline def DEFAULT_MATRIX_AUTO_UPDATE_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MATRIX_AUTO_UPDATE")(x.asInstanceOf[js.Any])
    
    /**
      * The default setting for {@link matrixWorldAutoUpdate} for newly created Object3Ds.
      * @defaultValue `true`
      */
    @JSImport("three/src/core/Object3D", "Object3D.DEFAULT_MATRIX_WORLD_AUTO_UPDATE")
    @js.native
    def DEFAULT_MATRIX_WORLD_AUTO_UPDATE: Boolean = js.native
    inline def DEFAULT_MATRIX_WORLD_AUTO_UPDATE_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MATRIX_WORLD_AUTO_UPDATE")(x.asInstanceOf[js.Any])
    
    /**
      * The default {@link up} direction for objects, also used as the default position for {@link THREE.DirectionalLight | DirectionalLight},
      * {@link THREE.HemisphereLight | HemisphereLight} and {@link THREE.Spotlight | Spotlight} (which creates lights shining from the top down).
      * @defaultValue `new THREE.Vector3( 0, 1, 0)`
      */
    @JSImport("three/src/core/Object3D", "Object3D.DEFAULT_UP")
    @js.native
    def DEFAULT_UP: Vector3 = js.native
    inline def DEFAULT_UP_=(x: Vector3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_UP")(x.asInstanceOf[js.Any])
  }
}
