package typings.tensorflowTfjsCore.anon

import typings.tensorflowTfjsCore.tensorMod.DataId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlatOffset extends js.Object {
  var flatOffset: Double
  var origDataId: DataId
}

object FlatOffset {
  @scala.inline
  def apply(flatOffset: Double, origDataId: DataId): FlatOffset = {
    val __obj = js.Dynamic.literal(flatOffset = flatOffset.asInstanceOf[js.Any], origDataId = origDataId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlatOffset]
  }
}

