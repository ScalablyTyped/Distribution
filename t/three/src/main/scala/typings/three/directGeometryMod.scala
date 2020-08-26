package typings.three

import typings.three.anon.MaterialIndexStart
import typings.three.box3Mod.Box3
import typings.three.colorMod.Color
import typings.three.geometryMod.Geometry
import typings.three.geometryMod.MorphTarget
import typings.three.sphereMod.Sphere
import typings.three.vector2Mod.Vector2
import typings.three.vector3Mod.Vector3
import typings.three.vector4Mod.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/core/DirectGeometry", JSImport.Namespace)
@js.native
object directGeometryMod extends js.Object {
  @js.native
  class DirectGeometry () extends js.Object {
    var boundingBox: Box3 | Null = js.native
    var boundingSphere: Sphere | Null = js.native
    var colors: js.Array[Color] = js.native
    var colorsNeedUpdate: Boolean = js.native
    var groups: js.Array[MaterialIndexStart] = js.native
    var groupsNeedUpdate: Boolean = js.native
    var id: Double = js.native
    var indices: js.Array[Double] = js.native
    var morphTargets: js.Array[MorphTarget] = js.native
    var name: String = js.native
    var normals: js.Array[Vector3] = js.native
    var normalsNeedUpdate: Boolean = js.native
    var skinIndices: js.Array[Vector4] = js.native
    var skinWeights: js.Array[Vector4] = js.native
    var `type`: String = js.native
    var uuid: String = js.native
    var uvs: js.Array[Vector2] = js.native
    var uvs2: js.Array[Vector2] = js.native
    var uvsNeedUpdate: Boolean = js.native
    var vertices: js.Array[Vector3] = js.native
    var verticesNeedUpdate: Boolean = js.native
    def computeBoundingBox(): Unit = js.native
    def computeBoundingSphere(): Unit = js.native
    def computeGroups(geometry: Geometry): Unit = js.native
    def dispose(): Unit = js.native
    def fromGeometry(geometry: Geometry): DirectGeometry = js.native
  }
  
}

