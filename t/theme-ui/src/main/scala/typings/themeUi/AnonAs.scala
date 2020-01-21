package typings.themeUi

import typings.react.mod.ElementType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAs extends js.Object {
  var as: js.UndefOr[ElementType[_]] = js.undefined
}

object AnonAs {
  @scala.inline
  def apply(as: ElementType[_] = null): AnonAs = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAs]
  }
}

