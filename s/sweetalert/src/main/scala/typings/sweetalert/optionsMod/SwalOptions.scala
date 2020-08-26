package typings.sweetalert.optionsMod

import typings.sweetalert.optionsButtonsMod.ButtonList
import typings.sweetalert.optionsContentMod.ContentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwalOptions extends js.Object {
  var buttons: ButtonList | (js.Array[String | Boolean]) = js.native
  var className: String = js.native
  var closeOnClickOutside: Boolean = js.native
  var closeOnEsc: Boolean = js.native
  var content: ContentOptions = js.native
  var dangerMode: Boolean = js.native
  var icon: String = js.native
  var text: String = js.native
  var timer: Double = js.native
  var title: String = js.native
}

object SwalOptions {
  @scala.inline
  def apply(
    buttons: ButtonList | (js.Array[String | Boolean]),
    className: String,
    closeOnClickOutside: Boolean,
    closeOnEsc: Boolean,
    content: ContentOptions,
    dangerMode: Boolean,
    icon: String,
    text: String,
    timer: Double,
    title: String
  ): SwalOptions = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], closeOnClickOutside = closeOnClickOutside.asInstanceOf[js.Any], closeOnEsc = closeOnEsc.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], dangerMode = dangerMode.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], timer = timer.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwalOptions]
  }
  @scala.inline
  implicit class SwalOptionsOps[Self <: SwalOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setButtonsVarargs(value: (String | Boolean)*): Self = this.set("buttons", js.Array(value :_*))
    @scala.inline
    def setButtons(value: ButtonList | (js.Array[String | Boolean])): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def setCloseOnClickOutside(value: Boolean): Self = this.set("closeOnClickOutside", value.asInstanceOf[js.Any])
    @scala.inline
    def setCloseOnEsc(value: Boolean): Self = this.set("closeOnEsc", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: ContentOptions): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setDangerMode(value: Boolean): Self = this.set("dangerMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimer(value: Double): Self = this.set("timer", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

