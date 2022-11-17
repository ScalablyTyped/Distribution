package typings.three

import org.scalablytyped.runtime.StringDictionary
import typings.three.anon.Geometries
import typings.three.srcAnimationAnimationClipMod.AnimationClip
import typings.three.srcCamerasCameraMod.Camera
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreObject3DMod {
  
  @JSImport("three/src/core/Object3D", "Object3D")
  @js.native
  open class Object3D[E /* <: BaseEvent */] () extends EventDispatcher[E] {
    
    /**
      * Adds object as child of this object.
      */
    def add(`object`: Object3D[Event]*): this.type = js.native
    
    /**
      * Array with animation clips.
      * @default []
      */
    var animations: js.Array[AnimationClip] = js.native
    
    /**
      * Applies the matrix transform to the object and updates the object's position, rotation and scale.
      */
    def applyMatrix4(matrix: Matrix4): Unit = js.native
    
    /**
      * Applies the rotation represented by the quaternion to the object.
      */
    def applyQuaternion(quaternion: Quaternion): this.type = js.native
    
    /**
      * Adds object as a child of this, while maintaining the object's world transform.
      */
    def attach(`object`: Object3D[Event]): this.type = js.native
    
    /**
      * Gets rendered into shadow map.
      * @default false
      */
    var castShadow: Boolean = js.native
    
    /**
      * Array with object's children.
      * @default []
      */
    var children: js.Array[Object3D[Event]] = js.native
    
    /**
      * Removes all child objects.
      */
    def clear(): this.type = js.native
    
    def clone(recursive: Boolean): this.type = js.native
    
    /**
      *
      * @param object
      * @param recursive
      */
    def copy(source: this.type): this.type = js.native
    def copy(source: this.type, recursive: Boolean): this.type = js.native
    
    /**
      * Custom depth material to be used when rendering to the depth map. Can only be used in context of meshes.
      * When shadow-casting with a DirectionalLight or SpotLight, if you are (a) modifying vertex positions in
      * the vertex shader, (b) using a displacement map, (c) using an alpha map with alphaTest, or (d) using a
      * transparent texture with alphaTest, you must specify a customDepthMaterial for proper shadows.
      */
    var customDepthMaterial: Material = js.native
    
    /**
      * Same as customDepthMaterial, but used with PointLight.
      */
    var customDistanceMaterial: Material = js.native
    
    /**
      * When this is set, it checks every frame if the object is in the frustum of the camera before rendering the object.
      * If set to false the object gets rendered every frame even if it is not in the frustum of the camera.
      * @default true
      */
    var frustumCulled: Boolean = js.native
    
    /**
      * Searches through the object's children and returns the first with a matching id.
      * @param id	Unique number of the object instance
      */
    def getObjectById(id: Double): js.UndefOr[Object3D[Event]] = js.native
    
    /**
      * Searches through the object's children and returns the first with a matching name.
      * @param name	String to match to the children's Object3d.name property.
      */
    def getObjectByName(name: String): js.UndefOr[Object3D[Event]] = js.native
    
    def getObjectByProperty(name: String, value: Any): js.UndefOr[Object3D[Event]] = js.native
    
    def getWorldDirection(target: Vector3): Vector3 = js.native
    
    def getWorldPosition(target: Vector3): Vector3 = js.native
    
    def getWorldQuaternion(target: Quaternion): Quaternion = js.native
    
    def getWorldScale(target: Vector3): Vector3 = js.native
    
    /**
      * Unique number of this object instance.
      */
    var id: Double = js.native
    
    /**
      * Used to check whether this or derived classes are Object3Ds. Default is true.
      * You should not change this, as it is used internally for optimisation.
      */
    val isObject3D: true = js.native
    
    /**
      * @default new THREE.Layers()
      */
    var layers: Layers = js.native
    
    /**
      * Updates the vector from local space to world space.
      * @param vector A local vector.
      */
    def localToWorld(vector: Vector3): Vector3 = js.native
    
    /**
      * Optionally, the x, y and z components of the world space position.
      * Rotates the object to face a point in world space.
      * This method does not support objects having non-uniformly-scaled parent(s).
      * @param vector A world vector to look at.
      */
    def lookAt(vector: Vector3): Unit = js.native
    def lookAt(x: Double, y: Double, z: Double): Unit = js.native
    
    /**
      * Local transform.
      * @default new THREE.Matrix4()
      */
    var matrix: Matrix4 = js.native
    
    /**
      * When this is set, it calculates the matrix of position, (rotation or quaternion) and scale every frame and also
      * recalculates the matrixWorld property.
      * @default THREE.Object3D.DefaultMatrixAutoUpdate
      */
    var matrixAutoUpdate: Boolean = js.native
    
    /**
      * The global transform of the object. If the Object3d has no parent, then it's identical to the local transform.
      * @default new THREE.Matrix4()
      */
    var matrixWorld: Matrix4 = js.native
    
    /**
      * When this is set, the renderer checks every frame if the object and its children need matrix updates.
      * Otherwise, you have to maintain all matrices in the object and its children yourself.
      * @default THREE.Object3D.DefaultMatrixWorldAutoUpdate
      */
    var matrixWorldAutoUpdate: Boolean = js.native
    
    /**
      * When this is set, it calculates the matrixWorld in that frame and resets this property to false.
      * @default false
      */
    var matrixWorldNeedsUpdate: Boolean = js.native
    
    /**
      * @default new THREE.Matrix4()
      */
    val modelViewMatrix: Matrix4 = js.native
    
    /**
      * Optional name of the object (doesn't need to be unique).
      * @default ''
      */
    var name: String = js.native
    
    /**
      * @default new THREE.Matrix3()
      */
    val normalMatrix: Matrix3 = js.native
    
    /**
      * Calls after rendering object
      */
    def onAfterRender(
      renderer: WebGLRenderer,
      scene: Scene,
      camera: Camera,
      geometry: BufferGeometry,
      material: Material,
      group: Group
    ): Unit = js.native
    
    /**
      * Calls before rendering object
      */
    def onBeforeRender(
      renderer: WebGLRenderer,
      scene: Scene,
      camera: Camera,
      geometry: BufferGeometry,
      material: Material,
      group: Group
    ): Unit = js.native
    
    /**
      * Object's parent in the scene graph.
      * @default null
      */
    var parent: Object3D[Event] | Null = js.native
    
    /**
      * Object's local position.
      * @default new THREE.Vector3()
      */
    val position: Vector3 = js.native
    
    /**
      * Object's local rotation as a Quaternion.
      * @default new THREE.Quaternion()
      */
    val quaternion: Quaternion = js.native
    
    def raycast(raycaster: Raycaster, intersects: js.Array[Intersection[Object3D[Event]]]): Unit = js.native
    
    /**
      * Material gets baked in shadow receiving.
      * @default false
      */
    var receiveShadow: Boolean = js.native
    
    /**
      * Removes object as child of this object.
      */
    def remove(`object`: Object3D[Event]*): this.type = js.native
    
    /**
      * Removes this object from its current parent.
      */
    def removeFromParent(): this.type = js.native
    
    /**
      * Overrides the default rendering order of scene graph objects, from lowest to highest renderOrder.
      * Opaque and transparent objects remain sorted independently though.
      * When this property is set for an instance of Group, all descendants objects will be sorted and rendered together.
      * @default 0
      */
    var renderOrder: Double = js.native
    
    /**
      * Rotate an object along an axis in object space. The axis is assumed to be normalized.
      * @param axis	A normalized vector in object space.
      * @param angle	The angle in radians.
      */
    def rotateOnAxis(axis: Vector3, angle: Double): this.type = js.native
    
    /**
      * Rotate an object along an axis in world space. The axis is assumed to be normalized. Method Assumes no rotated parent.
      * @param axis	A normalized vector in object space.
      * @param angle	The angle in radians.
      */
    def rotateOnWorldAxis(axis: Vector3, angle: Double): this.type = js.native
    
    /**
      * Rotates the object around x axis in local space.
      * @param angle the angle to rotate in radians.
      */
    def rotateX(angle: Double): this.type = js.native
    
    /**
      * Rotates the object around y axis in local space.
      * @param angle the angle to rotate in radians.
      */
    def rotateY(angle: Double): this.type = js.native
    
    /**
      * Rotates the object around z axis in local space.
      * @param angle the angle to rotate in radians.
      */
    def rotateZ(angle: Double): this.type = js.native
    
    /**
      * Object's local rotation (Euler angles), in radians.
      * @default new THREE.Euler()
      */
    val rotation: Euler = js.native
    
    /**
      * Object's local scale.
      * @default new THREE.Vector3()
      */
    val scale: Vector3 = js.native
    
    /**
      * axis -- A normalized vector in object space.
      * angle -- angle in radians
      * @param axis A normalized vector in object space.
      * @param angle angle in radians
      */
    def setRotationFromAxisAngle(axis: Vector3, angle: Double): Unit = js.native
    
    /**
      * Calls setRotationFromEuler(euler) on the .quaternion.
      * @param euler Euler angle specifying rotation amount.
      */
    def setRotationFromEuler(euler: Euler): Unit = js.native
    
    /**
      * Calls setFromRotationMatrix(m) on the .quaternion.
      *
      * Note that this assumes that the upper 3x3 of m is a pure rotation matrix (i.e, unscaled).
      * @param m rotate the quaternion by the rotation component of the matrix.
      */
    def setRotationFromMatrix(m: Matrix4): Unit = js.native
    
    /**
      * Copy the given quaternion into .quaternion.
      * @param q normalized Quaternion
      */
    def setRotationFromQuaternion(q: Quaternion): Unit = js.native
    
    def toJSON(): Any = js.native
    def toJSON(meta: Geometries): Any = js.native
    
    /**
      * Translate an object by distance along an axis in object space. The axis is assumed to be normalized.
      * @param axis	A normalized vector in object space.
      * @param distance	The distance to translate.
      */
    def translateOnAxis(axis: Vector3, distance: Double): this.type = js.native
    
    /**
      * Translates object along x axis by distance.
      * @param distance Distance.
      */
    def translateX(distance: Double): this.type = js.native
    
    /**
      * Translates object along y axis by distance.
      * @param distance Distance.
      */
    def translateY(distance: Double): this.type = js.native
    
    /**
      * Translates object along z axis by distance.
      * @param distance Distance.
      */
    def translateZ(distance: Double): this.type = js.native
    
    def traverse(callback: js.Function1[/* object */ Object3D[Event], Any]): Unit = js.native
    
    def traverseAncestors(callback: js.Function1[/* object */ Object3D[Event], Any]): Unit = js.native
    
    def traverseVisible(callback: js.Function1[/* object */ Object3D[Event], Any]): Unit = js.native
    
    /**
      * @default 'Object3D'
      */
    var `type`: String = js.native
    
    /**
      * Up direction.
      * @default THREE.Object3D.DefaultUp.clone()
      */
    var up: Vector3 = js.native
    
    /**
      * Updates local transform.
      */
    def updateMatrix(): Unit = js.native
    
    /**
      * Updates global transform of the object and its children.
      */
    def updateMatrixWorld(): Unit = js.native
    def updateMatrixWorld(force: Boolean): Unit = js.native
    
    /**
      * Updates the global transform of the object.
      * @param updateParents recursively updates global transform of ancestors.
      * @param updateChildren recursively updates global transform of descendants.
      */
    def updateWorldMatrix(updateParents: Boolean, updateChildren: Boolean): Unit = js.native
    
    /**
      * An object that can be used to store custom data about the Object3d. It should not hold references to functions as these will not be cloned.
      * @default {}
      */
    var userData: StringDictionary[Any] = js.native
    
    var uuid: String = js.native
    
    /**
      * Object gets rendered if true.
      * @default true
      */
    var visible: Boolean = js.native
    
    /**
      * Updates the vector from world space to local space.
      * @param vector A world vector.
      */
    def worldToLocal(vector: Vector3): Vector3 = js.native
  }
  /* static members */
  object Object3D {
    
    @JSImport("three/src/core/Object3D", "Object3D")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/src/core/Object3D", "Object3D.DefaultMatrixAutoUpdate")
    @js.native
    def DefaultMatrixAutoUpdate: Boolean = js.native
    inline def DefaultMatrixAutoUpdate_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultMatrixAutoUpdate")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/core/Object3D", "Object3D.DefaultMatrixWorldAutoUpdate")
    @js.native
    def DefaultMatrixWorldAutoUpdate: Boolean = js.native
    inline def DefaultMatrixWorldAutoUpdate_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultMatrixWorldAutoUpdate")(x.asInstanceOf[js.Any])
    
    @JSImport("three/src/core/Object3D", "Object3D.DefaultUp")
    @js.native
    def DefaultUp: Vector3 = js.native
    inline def DefaultUp_=(x: Vector3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultUp")(x.asInstanceOf[js.Any])
  }
}
