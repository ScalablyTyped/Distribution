package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "Object3D")
@js.native
class Object3D () extends EventDispatcher {
  /**
    * Gets rendered into shadow map.
    */
  var castShadow: scala.Boolean = js.native
  /**
    * Array with object's children.
    */
  var children: js.Array[Object3D] = js.native
  /**
    * When this is set, it checks every frame if the object is in the frustum of the camera. Otherwise the object gets drawn every frame even if it isn't visible.
    */
  var frustumCulled: scala.Boolean = js.native
  /**
    * Unique number of this object instance.
    */
  var id: scala.Double = js.native
  /**
    * Used to check whether this or derived classes are Object3Ds. Default is true.
    * You should not change this, as it is used internally for optimisation.
    */
  var isObject3D: threeLib.threeLibNumbers.`true` = js.native
  var layers: Layers = js.native
  /**
    * Local transform.
    */
  var matrix: Matrix4 = js.native
  /**
    * When this is set, it calculates the matrix of position, (rotation or quaternion) and scale every frame and also recalculates the matrixWorld property.
    */
  var matrixAutoUpdate: scala.Boolean = js.native
  /**
    * The global transform of the object. If the Object3d has no parent, then it's identical to the local transform.
    */
  var matrixWorld: Matrix4 = js.native
  /**
    * When this is set, it calculates the matrixWorld in that frame and resets this property to false.
    */
  var matrixWorldNeedsUpdate: scala.Boolean = js.native
  var modelViewMatrix: Matrix4 = js.native
  /**
    * Optional name of the object (doesn't need to be unique).
    */
  var name: java.lang.String = js.native
  var normalMatrix: Matrix3 = js.native
  /**
    * Object's parent in the scene graph.
    */
  var parent: Object3D | scala.Null = js.native
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
  var receiveShadow: scala.Boolean = js.native
  var renderOrder: scala.Double = js.native
  /**
    * Object's local rotation (Euler angles), in radians.
    */
  var rotation: Euler = js.native
  /**
    * Object's local scale.
    */
  var scale: Vector3 = js.native
  var `type`: java.lang.String = js.native
  /**
    * Up direction.
    */
  var up: Vector3 = js.native
  /**
    * An object that can be used to store custom data about the Object3d. It should not hold references to functions as these will not be cloned.
    */
  var userData: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /**
    *
    */
  var uuid: java.lang.String = js.native
  /**
    * Object gets rendered if true.
    */
  var visible: scala.Boolean = js.native
  /**
    * Adds object as child of this object.
    */
  def add(`object`: Object3D*): this.type = js.native
  /**
    * This updates the position, rotation and scale with the matrix.
    */
  def applyMatrix(matrix: Matrix4): scala.Unit = js.native
  def applyQuaternion(quaternion: Quaternion): this.type = js.native
  def clone(recursive: scala.Boolean): this.type = js.native
  /**
    *
    * @param object
    * @param recursive
    */
  def copy(source: this.type): this.type = js.native
  def copy(source: this.type, recursive: scala.Boolean): this.type = js.native
  /**
    * Searches through the object's children and returns the first with a matching id.
    * @param id  Unique number of the object instance
    */
  def getObjectById(id: scala.Double): js.UndefOr[Object3D] = js.native
  /**
    * Searches through the object's children and returns the first with a matching name.
    * @param name  String to match to the children's Object3d.name property.
    */
  def getObjectByName(name: java.lang.String): js.UndefOr[Object3D] = js.native
  def getObjectByProperty(name: java.lang.String, value: java.lang.String): js.UndefOr[Object3D] = js.native
  def getWorldDirection(target: Vector3): Vector3 = js.native
  def getWorldPosition(target: Vector3): Vector3 = js.native
  def getWorldQuaternion(target: Quaternion): Quaternion = js.native
  def getWorldScale(target: Vector3): Vector3 = js.native
  /**
    * Updates the vector from local space to world space.
    * @param vector A local vector.
    */
  def localToWorld(vector: Vector3): Vector3 = js.native
  def lookAt(vector: scala.Double): scala.Unit = js.native
  def lookAt(vector: scala.Double, y: scala.Double): scala.Unit = js.native
  def lookAt(vector: scala.Double, y: scala.Double, z: scala.Double): scala.Unit = js.native
  /**
    * Rotates object to face point in space.
    * @param vector A world vector to look at.
    */
  def lookAt(vector: Vector3): scala.Unit = js.native
  def lookAt(vector: Vector3, y: scala.Double): scala.Unit = js.native
  def lookAt(vector: Vector3, y: scala.Double, z: scala.Double): scala.Unit = js.native
  def onAfterRender(
    renderer: WebGLRenderer,
    scene: Scene,
    camera: Camera,
    geometry: BufferGeometry,
    material: Material,
    group: Group
  ): scala.Unit = js.native
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
  ): scala.Unit = js.native
  def onBeforeRender(
    renderer: WebGLRenderer,
    scene: Scene,
    camera: Camera,
    geometry: BufferGeometry,
    material: Material,
    group: Group
  ): scala.Unit = js.native
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
  ): scala.Unit = js.native
  def raycast(raycaster: Raycaster, intersects: js.Array[Intersection]): scala.Unit = js.native
  /**
    * Removes object as child of this object.
    */
  def remove(`object`: Object3D*): this.type = js.native
  /**
    * Rotate an object along an axis in object space. The axis is assumed to be normalized.
    * @param axis  A normalized vector in object space.
    * @param angle  The angle in radians.
    */
  def rotateOnAxis(axis: Vector3, angle: scala.Double): this.type = js.native
  /**
    * Rotate an object along an axis in world space. The axis is assumed to be normalized. Method Assumes no rotated parent.
    * @param axis  A normalized vector in object space.
    * @param angle  The angle in radians.
    */
  def rotateOnWorldAxis(axis: Vector3, angle: scala.Double): this.type = js.native
  /**
    *
    * @param angle
    */
  def rotateX(angle: scala.Double): this.type = js.native
  /**
    *
    * @param angle
    */
  def rotateY(angle: scala.Double): this.type = js.native
  /**
    *
    * @param angle
    */
  def rotateZ(angle: scala.Double): this.type = js.native
  /**
    *
    */
  def setRotationFromAxisAngle(axis: Vector3, angle: scala.Double): scala.Unit = js.native
  /**
    *
    */
  def setRotationFromEuler(euler: Euler): scala.Unit = js.native
  /**
    *
    */
  def setRotationFromMatrix(m: Matrix4): scala.Unit = js.native
  /**
    *
    */
  def setRotationFromQuaternion(q: Quaternion): scala.Unit = js.native
  def toJSON(): js.Any = js.native
  def toJSON(meta: threeLib.Anon_GeometriesImages): js.Any = js.native
  /**
    * @param axis  A normalized vector in object space.
    * @param distance  The distance to translate.
    */
  def translateOnAxis(axis: Vector3, distance: scala.Double): this.type = js.native
  /**
    * Translates object along x axis by distance.
    * @param distance Distance.
    */
  def translateX(distance: scala.Double): this.type = js.native
  /**
    * Translates object along y axis by distance.
    * @param distance Distance.
    */
  def translateY(distance: scala.Double): this.type = js.native
  /**
    * Translates object along z axis by distance.
    * @param distance Distance.
    */
  def translateZ(distance: scala.Double): this.type = js.native
  def traverse(callback: js.Function1[/* object */ this.type, _]): scala.Unit = js.native
  def traverseAncestors(callback: js.Function1[/* object */ this.type, _]): scala.Unit = js.native
  def traverseVisible(callback: js.Function1[/* object */ this.type, _]): scala.Unit = js.native
  /**
    * Updates local transform.
    */
  def updateMatrix(): scala.Unit = js.native
  /**
    * Updates global transform of the object and its children.
    */
  def updateMatrixWorld(force: scala.Boolean): scala.Unit = js.native
  /**
    * Updates the vector from world space to local space.
    * @param vector A world vector.
    */
  def worldToLocal(vector: Vector3): Vector3 = js.native
}

@JSImport("three/three-core", "Object3D")
@js.native
object Object3D extends js.Object {
  var DefaultMatrixAutoUpdate: scala.Boolean = js.native
  var DefaultUp: threeLib.threeDashCoreMod.Vector3 = js.native
}

