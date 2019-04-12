package typings
package threeLib.srcCoreDirectGeometryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/core/DirectGeometry", "DirectGeometry")
@js.native
class DirectGeometry ()
  extends threeLib.srcCoreEventDispatcherMod.EventDispatcher {
  var boundingBox: threeLib.srcMathBox3Mod.Box3 = js.native
  var boundingSphere: threeLib.srcMathSphereMod.Sphere = js.native
  var colors: js.Array[threeLib.srcMathColorMod.Color] = js.native
  var colorsNeedUpdate: scala.Boolean = js.native
  var groups: js.Array[threeLib.Anon_MaterialIndex] = js.native
  var groupsNeedUpdate: scala.Boolean = js.native
  var id: scala.Double = js.native
  var indices: js.Array[scala.Double] = js.native
  var morphTargets: js.Array[threeLib.srcCoreGeometryMod.MorphTarget] = js.native
  var name: java.lang.String = js.native
  var normals: js.Array[threeLib.srcMathVector3Mod.Vector3] = js.native
  var normalsNeedUpdate: scala.Boolean = js.native
  var skinIndices: js.Array[threeLib.srcMathVector4Mod.Vector4] = js.native
  var skinWeights: js.Array[threeLib.srcMathVector4Mod.Vector4] = js.native
  var `type`: java.lang.String = js.native
  var uuid: java.lang.String = js.native
  var uvs: js.Array[threeLib.srcMathVector2Mod.Vector2] = js.native
  var uvs2: js.Array[threeLib.srcMathVector2Mod.Vector2] = js.native
  var uvsNeedUpdate: scala.Boolean = js.native
  var vertices: js.Array[threeLib.srcMathVector3Mod.Vector3] = js.native
  var verticesNeedUpdate: scala.Boolean = js.native
  def computeBoundingBox(): scala.Unit = js.native
  def computeBoundingSphere(): scala.Unit = js.native
  def computeGroups(geometry: threeLib.srcCoreGeometryMod.Geometry): scala.Unit = js.native
  def dispose(): scala.Unit = js.native
  def fromGeometry(geometry: threeLib.srcCoreGeometryMod.Geometry): DirectGeometry = js.native
}

