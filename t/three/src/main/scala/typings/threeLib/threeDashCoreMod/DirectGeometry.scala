package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "DirectGeometry")
@js.native
class DirectGeometry () extends EventDispatcher {
  var boundingBox: Box3 = js.native
  var boundingSphere: Sphere = js.native
  var colors: js.Array[Color] = js.native
  var colorsNeedUpdate: scala.Boolean = js.native
  var groups: js.Array[threeLib.Anon_MaterialIndex] = js.native
  var groupsNeedUpdate: scala.Boolean = js.native
  var id: scala.Double = js.native
  var indices: js.Array[scala.Double] = js.native
  var morphTargets: js.Array[MorphTarget] = js.native
  var name: java.lang.String = js.native
  var normals: js.Array[Vector3] = js.native
  var normalsNeedUpdate: scala.Boolean = js.native
  var skinIndices: js.Array[Vector4] = js.native
  var skinWeights: js.Array[Vector4] = js.native
  var `type`: java.lang.String = js.native
  var uuid: java.lang.String = js.native
  var uvs: js.Array[Vector2] = js.native
  var uvs2: js.Array[Vector2] = js.native
  var uvsNeedUpdate: scala.Boolean = js.native
  var vertices: js.Array[Vector3] = js.native
  var verticesNeedUpdate: scala.Boolean = js.native
  def computeBoundingBox(): scala.Unit = js.native
  def computeBoundingSphere(): scala.Unit = js.native
  def computeGroups(geometry: Geometry): scala.Unit = js.native
  def dispose(): scala.Unit = js.native
  def fromGeometry(geometry: Geometry): DirectGeometry = js.native
}

