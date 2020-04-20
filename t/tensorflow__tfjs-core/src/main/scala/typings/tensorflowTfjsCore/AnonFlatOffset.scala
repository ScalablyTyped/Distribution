package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.tensorMod.DataId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFlatOffset extends js.Object {
  var flatOffset: Double
  var origDataId: DataId
}

object AnonFlatOffset {
  @scala.inline
  def apply(flatOffset: Double, origDataId: DataId): AnonFlatOffset = {
    val __obj = js.Dynamic.literal(flatOffset = flatOffset.asInstanceOf[js.Any], origDataId = origDataId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFlatOffset]
  }
}

