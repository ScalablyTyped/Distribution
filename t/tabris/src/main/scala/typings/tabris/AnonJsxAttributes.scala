package typings.tabris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonJsxAttributes extends js.Object {
  var jsxAttributes: js.UndefOr[js.Any] = js.undefined
  var set: js.UndefOr[js.Any] = js.undefined
}

object AnonJsxAttributes {
  @scala.inline
  def apply(jsxAttributes: js.Any = null, set: js.Any = null): AnonJsxAttributes = {
    val __obj = js.Dynamic.literal()
    if (jsxAttributes != null) __obj.updateDynamic("jsxAttributes")(jsxAttributes.asInstanceOf[js.Any])
    if (set != null) __obj.updateDynamic("set")(set.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonJsxAttributes]
  }
}

