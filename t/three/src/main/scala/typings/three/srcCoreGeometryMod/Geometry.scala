package typings.three.srcCoreGeometryMod

import typings.three.srcAnimationAnimationClipMod.AnimationClip
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreEventDispatcherMod.EventDispatcher
import typings.three.srcCoreFace3Mod.Face3
import typings.three.srcMathBox3Mod.Box3
import typings.three.srcMathColorMod.Color
import typings.three.srcMathMatrix3Mod.Matrix
import typings.three.srcMathMatrix4Mod.Matrix4
import typings.three.srcMathSphereMod.Sphere
import typings.three.srcMathVector2Mod.Vector2
import typings.three.srcMathVector3Mod.Vector3
import typings.three.srcMathVector4Mod.Vector4
import typings.three.srcObjectsBoneMod.Bone
import typings.three.srcObjectsMeshMod.Mesh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/core/Geometry", "Geometry")
@js.native
class Geometry () extends EventDispatcher {
  var animation: AnimationClip = js.native
  var animations: js.Array[AnimationClip] = js.native
  // These properties do not exist in a normal Geometry class, but if you use the instance that was passed by JSONLoader, it will be added.
  var bones: js.Array[Bone] = js.native
  /**
  	 * Bounding box.
  	 */
  var boundingBox: Box3 = js.native
  /**
  	 * Bounding sphere.
  	 */
  var boundingSphere: Sphere = js.native
  /**
  	 * Array of vertex colors, matching number and order of vertices.
  	 * Used in ParticleSystem, Line and Ribbon.
  	 * Meshes use per-face-use-of-vertex colors embedded directly in faces.
  	 * To signal an update in this array, Geometry.colorsNeedUpdate needs to be set to true.
  	 */
  var colors: js.Array[Color] = js.native
  /**
  	 * Set to true if the colors array has been updated.
  	 */
  var colorsNeedUpdate: Boolean = js.native
  /**
  	 * Set to true if the faces array has been updated.
  	 */
  var elementsNeedUpdate: Boolean = js.native
  /**
  	 * Array of face UV layers.
  	 * Each UV layer is an array of UV matching order and number of vertices in faces.
  	 * To signal an update in this array, Geometry.uvsNeedUpdate needs to be set to true.
  	 */
  var faceVertexUvs: js.Array[js.Array[js.Array[Vector2]]] = js.native
  /**
  	 * Array of triangles or/and quads.
  	 * The array of faces describe how each vertex in the model is connected with each other.
  	 * To signal an update in this array, Geometry.elementsNeedUpdate needs to be set to true.
  	 */
  var faces: js.Array[Face3] = js.native
  /**
  	 *
  	 */
  var groupsNeedUpdate: Boolean = js.native
  /**
  	 * Unique number of this geometry instance
  	 */
  var id: Double = js.native
  var isGeometry: Boolean = js.native
  /**
  	 *
  	 */
  var lineDistances: js.Array[Double] = js.native
  /**
  	 * Set to true if the linedistances array has been updated.
  	 */
  var lineDistancesNeedUpdate: Boolean = js.native
  /**
  	 * Array of morph normals. Morph normals have similar structure as morph targets, each normal set is a Javascript object:
  	 *
  	 *		 morphNormal = { name: "NormalName", normals: [ new THREE.Vector3(), ... ] }
  	 */
  var morphNormals: js.Array[MorphNormals] = js.native
  /**
  	 * Array of morph targets. Each morph target is a Javascript object:
  	 *
  	 *		 { name: "targetName", vertices: [ new THREE.Vector3(), ... ] }
  	 *
  	 * Morph vertices match number and order of primary vertices.
  	 */
  var morphTargets: js.Array[MorphTarget] = js.native
  /**
  	 * Name for this geometry. Default is an empty string.
  	 */
  var name: String = js.native
  /**
  	 * Set to true if the normals array has been updated.
  	 */
  var normalsNeedUpdate: Boolean = js.native
  /**
  	 * Array of skinning indices, matching number and order of vertices.
  	 */
  var skinIndices: js.Array[Vector4] = js.native
  /**
  	 * Array of skinning weights, matching number and order of vertices.
  	 */
  var skinWeights: js.Array[Vector4] = js.native
  var `type`: String = js.native
  var uuid: String = js.native
  /**
  	 * Set to true if the uvs array has been updated.
  	 */
  var uvsNeedUpdate: Boolean = js.native
  /**
  	 * The array of vertices hold every position of points of the model.
  	 * To signal an update in this array, Geometry.verticesNeedUpdate needs to be set to true.
  	 */
  var vertices: js.Array[Vector3] = js.native
  /**
  	 * Set to true if the vertices array has been updated.
  	 */
  var verticesNeedUpdate: Boolean = js.native
  /**
  	 * Bakes matrix transform directly into vertex coordinates.
  	 */
  def applyMatrix(matrix: Matrix4): Geometry = js.native
  def center(): Geometry = js.native
  /**
  	 * Computes bounding box of the geometry, updating {@link Geometry.boundingBox} attribute.
  	 */
  def computeBoundingBox(): Unit = js.native
  /**
  	 * Computes bounding sphere of the geometry, updating Geometry.boundingSphere attribute.
  	 * Neither bounding boxes or bounding spheres are computed by default. They need to be explicitly computed, otherwise they are null.
  	 */
  def computeBoundingSphere(): Unit = js.native
  /**
  	 * Computes face normals.
  	 */
  def computeFaceNormals(): Unit = js.native
  /**
  	 * Compute vertex normals, but duplicating face normals.
  	 */
  def computeFlatVertexNormals(): Unit = js.native
  /**
  	 * Computes morph normals.
  	 */
  def computeMorphNormals(): Unit = js.native
  /**
  	 * Computes vertex normals by averaging face normals.
  	 * Face normals must be existing / computed beforehand.
  	 */
  def computeVertexNormals(): Unit = js.native
  def computeVertexNormals(areaWeighted: Boolean): Unit = js.native
  def copy(source: Geometry): this.type = js.native
  /**
  	 * Removes The object from memory.
  	 * Don't forget to call this method when you remove an geometry because it can cuase meomory leaks.
  	 */
  def dispose(): Unit = js.native
  def fromBufferGeometry(geometry: BufferGeometry): Geometry = js.native
  def lookAt(vector: Vector3): Unit = js.native
  def merge(geometry: Geometry): Unit = js.native
  def merge(geometry: Geometry, matrix: Matrix): Unit = js.native
  def merge(geometry: Geometry, matrix: Matrix, materialIndexOffset: Double): Unit = js.native
  def mergeMesh(mesh: Mesh): Unit = js.native
  /**
  	 * Checks for duplicate vertices using hashmap.
  	 * Duplicated vertices are removed and faces' vertices are updated.
  	 */
  def mergeVertices(): Double = js.native
  def normalize(): Geometry = js.native
  def rotateX(angle: Double): Geometry = js.native
  def rotateY(angle: Double): Geometry = js.native
  def rotateZ(angle: Double): Geometry = js.native
  def scale(x: Double, y: Double, z: Double): Geometry = js.native
  def setFromPoints(points: js.Array[Vector2 | Vector3]): this.type = js.native
  def sortFacesByMaterialIndex(): Unit = js.native
  def toJSON(): js.Any = js.native
  def translate(x: Double, y: Double, z: Double): Geometry = js.native
}

