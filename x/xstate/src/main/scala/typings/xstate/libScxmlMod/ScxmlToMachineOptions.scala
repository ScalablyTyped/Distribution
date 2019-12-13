package typings.xstate.libScxmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScxmlToMachineOptions extends js.Object {
  var delimiter: js.UndefOr[String] = js.undefined
}

object ScxmlToMachineOptions {
  @scala.inline
  def apply(delimiter: String = null): ScxmlToMachineOptions = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScxmlToMachineOptions]
  }
}

