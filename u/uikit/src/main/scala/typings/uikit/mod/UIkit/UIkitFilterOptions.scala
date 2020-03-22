package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitFilterOptions extends js.Object {
  var selActive: js.UndefOr[String | Boolean] = js.undefined
  var target: js.UndefOr[String] = js.undefined
}

object UIkitFilterOptions {
  @scala.inline
  def apply(selActive: String | Boolean = null, target: String = null): UIkitFilterOptions = {
    val __obj = js.Dynamic.literal()
    if (selActive != null) __obj.updateDynamic("selActive")(selActive.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitFilterOptions]
  }
}

