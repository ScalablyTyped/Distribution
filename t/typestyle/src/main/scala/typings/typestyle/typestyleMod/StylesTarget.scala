package typings.typestyle.typestyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StylesTarget extends js.Object {
  var textContent: String | Null
}

object StylesTarget {
  @scala.inline
  def apply(textContent: String = null): StylesTarget = {
    val __obj = js.Dynamic.literal()
    if (textContent != null) __obj.updateDynamic("textContent")(textContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylesTarget]
  }
}

