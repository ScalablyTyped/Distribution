package typings
package threeLib.threeDashProjectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-projector", "RenderableFace")
@js.native
class RenderableFace () extends js.Object {
  var color: threeLib.threeDashCoreMod.Color = js.native
  var id: scala.Double = js.native
  var material: threeLib.threeDashCoreMod.Material = js.native
  var normalModel: threeLib.threeDashCoreMod.Vector3 = js.native
  var uvs: js.Array[js.Array[threeLib.threeDashCoreMod.Vector2]] = js.native
  var v1: RenderableVertex = js.native
  var v2: RenderableVertex = js.native
  var v3: RenderableVertex = js.native
  var vertexNormalsLength: scala.Double = js.native
  var vertexNormalsModel: js.Array[threeLib.threeDashCoreMod.Vector3] = js.native
  var z: scala.Double = js.native
}

