package typings.atUifabricFoundation.libISlotsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProcessedSlotProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
}

object IProcessedSlotProps {
  @scala.inline
  def apply(className: String = null): IProcessedSlotProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProcessedSlotProps]
  }
}

