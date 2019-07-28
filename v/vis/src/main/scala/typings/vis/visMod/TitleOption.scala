package typings.vis.visMod

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
    if (style != null) __obj.updateDynamic("style")(style)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[TitleOption]
  }
}

