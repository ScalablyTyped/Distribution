package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitMarginOptions extends js.Object {
  var `first-column`: js.UndefOr[String] = js.undefined
  var margin: js.UndefOr[String] = js.undefined
}

object UIkitMarginOptions {
  @scala.inline
  def apply(`first-column`: String = null, margin: String = null): UIkitMarginOptions = {
    val __obj = js.Dynamic.literal()
    if (`first-column` != null) __obj.updateDynamic("first-column")(`first-column`.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitMarginOptions]
  }
}

