package typings.wegameApi

import typings.wegameApi.wx.types.ButtonStyle
import typings.wegameApi.wx.types.ButtonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonText extends js.Object {
  var image: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[ButtonStyle] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var `type`: ButtonType
}

object AnonText {
  @scala.inline
  def apply(`type`: ButtonType, image: String = null, style: ButtonStyle = null, text: String = null): AnonText = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonText]
  }
}

