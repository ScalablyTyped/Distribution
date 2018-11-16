package typings
package threeLib.threeDashProjectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-projector", "RenderableVertex")
@js.native
class RenderableVertex () extends js.Object {
  var position: threeLib.threeDashCoreMod.Vector3 = js.native
  var positionScreen: threeLib.threeDashCoreMod.Vector4 = js.native
  var positionWorld: threeLib.threeDashCoreMod.Vector3 = js.native
  var visible: scala.Boolean = js.native
  def copy(vertex: RenderableVertex): scala.Unit = js.native
}

