package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TitleOption extends js.Object {
  var style: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object TitleOption {
  @scala.inline
  def apply(style: String = null, text: String = null): TitleOption = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TitleOption]
  }
}

