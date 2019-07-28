package typings.atTensorflowTfjsDashCore.distIoTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOHandler extends js.Object {
  var load: js.UndefOr[LoadHandler] = js.undefined
  var save: js.UndefOr[SaveHandler] = js.undefined
}

object IOHandler {
  @scala.inline
  def apply(load: LoadHandler = null, save: SaveHandler = null): IOHandler = {
    val __obj = js.Dynamic.literal()
    if (load != null) __obj.updateDynamic("load")(load)
    if (save != null) __obj.updateDynamic("save")(save)
    __obj.asInstanceOf[IOHandler]
  }
}

