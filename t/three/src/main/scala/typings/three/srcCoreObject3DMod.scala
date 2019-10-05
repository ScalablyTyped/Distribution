package typings.three

import org.scalablytyped.runtime.StringDictionary
import typings.three.srcCamerasCameraMod.Camera
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreEventDispatcherMod.EventDispatcher
import typings.three.srcCoreGeometryMod.Geometry
import typings.three.srcCoreLayersMod.Layers
import typings.three.srcCoreObject3DMod.Object3D
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
import typings.three.threeNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/core/Object3D", JSImport.Namespace)
@js.native
object srcCoreObject3DMod extends js.Object {
  @js.native
  class Object3D () extends EventDispatcher {
    /**
    	 * Gets rendered into shadow map.
    	 */
    var castShadow: Boolean = js.native
    /**
    	 * Array with object's children.
    	 */
    var children: js.Array[Object3D] = js.native
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
    	 * When this is set, it checks every frame if the object is in the frustum of the camera. Otherwise the object gets drawn every frame even if it isn't visible.
    	 */
    var frustumCulled: Boolean = js.native
    /**
    	 * Unique number of this object instance.
    	 */
    var id: Double = js.native
    /**
    	 * Used to check whether this or derived classes are Object3Ds. Default is true.
    	 * You should not change this, as it is used internally for optimisation.
    	 */
    var isObject3D: `true` = js.native
    var layers: Layers = js.native
    /**
    	 * Local transform.
    	 */
    var matrix: Matrix4 = js.native
    /**
    	 * When this is set, it calculates the matrix of position, (rotation or quaternion) and scale every frame and also recalculates the matrixWorld property.
    	 */
    var matrixAutoUpdate: Boolean = js.native
    /**
    	 * The global transform of the object. If the Object3d has no parent, then it's identical to the local transform.
    	 */
    var matrixWorld: Matrix4 = js.native
    /**
    	 * When this is set, it calculates the matrixWorld in that frame and resets this property to false.
    	 */
    var matrixWorldNeedsUpdate: Boolean = js.native
    var modelViewMatrix: Matrix4 = js.native
    /**
    	 * Optional name of the object (doesn't need to be unique).
    	 */
    var name: String = js.native
    var normalMatrix: Matrix3 = js.native
    /**
    	 * Object's parent in the scene graph.
    	 */
    var parent: Object3D | Null = js.native
    /**
    	 * Object's local position.
    	 */
    var position: Vector3 = js.native
    /**
    	 * Global rotation.
    	 */
    var quaternion: Quaternion = js.native
    /**
    	 * Material gets baked in shadow receiving.
    	 */
    var receiveShadow: Boolean = js.native
    /**
    	 * Overrides the default rendering order of scene graph objects, from lowest to highest renderOrder. Opaque and transparent objects remain sorted independently though. When this property is set for an instance of Group, all descendants objects will be sorted and rendered together.
    	 */
    var renderOrder: Double = js.native
    /**
    	 * Object's local rotation (Euler angles), in radians.
    	 */
    var rotation: Euler = js.native
    /**
    	 * Object's local scale.
    	 */
    var scale: Vector3 = js.native
    var `type`: String = js.native
    /**
    	 * Up direction.
    	 */
    var up: Vector3 = js.native
    /**
    	 * An object that can be used to store custom data about the Object3d. It should not hold references to functions as these will not be cloned.
    	 */
    var userData: StringDictionary[js.Any] = js.native
    /**
    	 *
    	 */
    var uuid: String = js.native
    /**
    	 * Object gets rendered if true.
    	 */
    var visible: Boolean = js.native
    /**
    	 * Adds object as child of this object.
    	 */
    def add(`object`: Object3D*): this.type = js.native
    /**
    	 * This updates the position, rotation and scale with the matrix.
    	 */
    def applyMatrix(matrix: Matrix4): Unit = js.native
    def applyQuaternion(quaternion: Quaternion): this.type = js.native
    /**
    	 * Adds object as a child of this, while maintaining the object's world transform.
    	 */
    def attach(`object`: Object3D): this.type = js.native
    def clone(recursive: Boolean): this.type = js.native
    /**
    	 *
    	 * @param object
    	 * @param recursive
    	 */
    def copy(source: this.type): this.type = js.native
    def copy(source: this.type, recursive: Boolean): this.type = js.native
    /**
    	 * Searches through the object's children and returns the first with a matching id.
    	 * @param id	Unique number of the object instance
    	 */
    def getObjectById(id: Double): js.UndefOr[Object3D] = js.native
    /**
    	 * Searches through the object's children and returns the first with a matching name.
    	 * @param name	String to match to the children's Object3d.name property.
    	 */
    def getObjectByName(name: String): js.UndefOr[Object3D] = js.native
    def getObjectByProperty(name: String, value: String): js.UndefOr[Object3D] = js.native
    def getWorldDirection(target: Vector3): Vector3 = js.native
    def getWorldPosition(target: Vector3): Vector3 = js.native
    def getWorldQuaternion(target: Quaternion): Quaternion = js.native
    def getWorldScale(target: Vector3): Vector3 = js.native
    /**
    	 * Updates the vector from local space to world space.
    	 * @param vector A local vector.
    	 */
    def localToWorld(vector: Vector3): Vector3 = js.native
    def lookAt(vector: Double): Unit = js.native
    def lookAt(vector: Double, y: Double): Unit = js.native
    def lookAt(vector: Double, y: Double, z: Double): Unit = js.native
    /**
    	 * Rotates object to face point in space.
    	 * @param vector A world vector to look at.
    	 */
    def lookAt(vector: Vector3): Unit = js.native
    def lookAt(vector: Vector3, y: Double): Unit = js.native
    def lookAt(vector: Vector3, y: Double, z: Double): Unit = js.native
    def onAfterRender(
      renderer: WebGLRenderer,
      scene: Scene,
      camera: Camera,
      geometry: BufferGeometry,
      material: Material,
      group: Group
    ): Unit = js.native
    /**
    	 * Calls after rendering object
    	 */
    def onAfterRender(
      renderer: WebGLRenderer,
      scene: Scene,
      camera: Camera,
      geometry: Geometry,
      material: Material,
      group: Group
    ): Unit = js.native
    def onBeforeRender(
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
      geometry: Geometry,
      material: Material,
      group: Group
    ): Unit = js.native
    def raycast(raycaster: Raycaster, intersects: js.Array[Intersection]): Unit = js.native
    /**
    	 * Removes object as child of this object.
    	 */
    def remove(`object`: Object3D*): this.type = js.native
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
    	 *
    	 * @param angle
    	 */
    def rotateX(angle: Double): this.type = js.native
    /**
    	 *
    	 * @param angle
    	 */
    def rotateY(angle: Double): this.type = js.native
    /**
    	 *
    	 * @param angle
    	 */
    def rotateZ(angle: Double): this.type = js.native
    /**
    	 *
    	 */
    def setRotationFromAxisAngle(axis: Vector3, angle: Double): Unit = js.native
    /**
    	 *
    	 */
    def setRotationFromEuler(euler: Euler): Unit = js.native
    /**
    	 *
    	 */
    def setRotationFromMatrix(m: Matrix4): Unit = js.native
    /**
    	 *
    	 */
    def setRotationFromQuaternion(q: Quaternion): Unit = js.native
    def toJSON(): js.Any = js.native
    def toJSON(meta: Anon_Geometries): js.Any = js.native
    /**
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
    def traverse(callback: js.Function1[/* object */ this.type, _]): Unit = js.native
    def traverseAncestors(callback: js.Function1[/* object */ this.type, _]): Unit = js.native
    def traverseVisible(callback: js.Function1[/* object */ this.type, _]): Unit = js.native
    /**
    	 * Updates local transform.
    	 */
    def updateMatrix(): Unit = js.native
    /**
    	 * Updates global transform of the object and its children.
    	 */
    def updateMatrixWorld(): Unit = js.native
    def updateMatrixWorld(force: Boolean): Unit = js.native
    def updateWorldMatrix(updateParents: Boolean, updateChildren: Boolean): Unit = js.native
    /**
    	 * Updates the vector from world space to local space.
    	 * @param vector A world vector.
    	 */
    def worldToLocal(vector: Vector3): Vector3 = js.native
  }
  
  var Object3DIdCount: Double = js.native
  /* static members */
  @js.native
  object Object3D extends js.Object {
    var DefaultMatrixAutoUpdate: Boolean = js.native
    var DefaultUp: Vector3 = js.native
  }
  
}

