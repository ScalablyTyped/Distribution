package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "Geometry")
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
  var colorsNeedUpdate: scala.Boolean = js.native
  /**
    * Set to true if the faces array has been updated.
    */
  var elementsNeedUpdate: scala.Boolean = js.native
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
  var groupsNeedUpdate: scala.Boolean = js.native
  /**
    * Unique number of this geometry instance
    */
  var id: scala.Double = js.native
  /**
    *
    */
  var lineDistances: js.Array[scala.Double] = js.native
  /**
    * Set to true if the linedistances array has been updated.
    */
  var lineDistancesNeedUpdate: scala.Boolean = js.native
  /**
    * Array of morph normals. Morph normals have similar structure as morph targets, each normal set is a Javascript object:
    *
    *     morphNormal = { name: "NormalName", normals: [ new THREE.Vector3(), ... ] }
    */
  var morphNormals: js.Array[MorphNormals] = js.native
  /**
    * Array of morph targets. Each morph target is a Javascript object:
    *
    *     { name: "targetName", vertices: [ new THREE.Vector3(), ... ] }
    *
    * Morph vertices match number and order of primary vertices.
    */
  var morphTargets: js.Array[MorphTarget] = js.native
  /**
    * Name for this geometry. Default is an empty string.
    */
  var name: java.lang.String = js.native
  /**
    * Set to true if the normals array has been updated.
    */
  var normalsNeedUpdate: scala.Boolean = js.native
  /**
    * Array of skinning indices, matching number and order of vertices.
    */
  var skinIndices: js.Array[Vector4] = js.native
  /**
    * Array of skinning weights, matching number and order of vertices.
    */
  var skinWeights: js.Array[Vector4] = js.native
  var `type`: java.lang.String = js.native
  var uuid: java.lang.String = js.native
  /**
    * Set to true if the uvs array has been updated.
    */
  var uvsNeedUpdate: scala.Boolean = js.native
  /**
    * The array of vertices hold every position of points of the model.
    * To signal an update in this array, Geometry.verticesNeedUpdate needs to be set to true.
    */
  var vertices: js.Array[Vector3] = js.native
  /**
    * Set to true if the vertices array has been updated.
    */
  var verticesNeedUpdate: scala.Boolean = js.native
  /**
    * Bakes matrix transform directly into vertex coordinates.
    */
  def applyMatrix(matrix: Matrix4): Geometry = js.native
  def center(): Geometry = js.native
  /**
    * Computes bounding box of the geometry, updating {@link Geometry.boundingBox} attribute.
    */
  def computeBoundingBox(): scala.Unit = js.native
  /**
    * Computes bounding sphere of the geometry, updating Geometry.boundingSphere attribute.
    * Neither bounding boxes or bounding spheres are computed by default. They need to be explicitly computed, otherwise they are null.
    */
  def computeBoundingSphere(): scala.Unit = js.native
  /**
    * Computes face normals.
    */
  def computeFaceNormals(): scala.Unit = js.native
  /**
    * Compute vertex normals, but duplicating face normals.
    */
  def computeFlatVertexNormals(): scala.Unit = js.native
  /**
    * Computes morph normals.
    */
  def computeMorphNormals(): scala.Unit = js.native
  /**
    * Computes vertex normals by averaging face normals.
    * Face normals must be existing / computed beforehand.
    */
  def computeVertexNormals(): scala.Unit = js.native
  def computeVertexNormals(areaWeighted: scala.Boolean): scala.Unit = js.native
  def copy(source: this.type): this.type = js.native
  /**
    * Removes The object from memory.
    * Don't forget to call this method when you remove an geometry because it can cuase meomory leaks.
    */
  def dispose(): scala.Unit = js.native
  def fromBufferGeometry(geometry: BufferGeometry): Geometry = js.native
  def lookAt(vector: Vector3): scala.Unit = js.native
  def merge(geometry: Geometry): scala.Unit = js.native
  def merge(geometry: Geometry, matrix: Matrix): scala.Unit = js.native
  def merge(geometry: Geometry, matrix: Matrix, materialIndexOffset: scala.Double): scala.Unit = js.native
  def mergeMesh(mesh: Mesh): scala.Unit = js.native
  /**
    * Checks for duplicate vertices using hashmap.
    * Duplicated vertices are removed and faces' vertices are updated.
    */
  def mergeVertices(): scala.Double = js.native
  def normalize(): Geometry = js.native
  def rotateX(angle: scala.Double): Geometry = js.native
  def rotateY(angle: scala.Double): Geometry = js.native
  def rotateZ(angle: scala.Double): Geometry = js.native
  def scale(x: scala.Double, y: scala.Double, z: scala.Double): Geometry = js.native
  def setFromPoints(points: js.Array[Vector2 | Vector3]): this.type = js.native
  def sortFacesByMaterialIndex(): scala.Unit = js.native
  def toJSON(): js.Any = js.native
  def translate(x: scala.Double, y: scala.Double, z: scala.Double): Geometry = js.native
}

