package typings.sweetalert.anon

import typings.sweetalert.optionsButtonsMod.ButtonList
import typings.sweetalert.optionsContentMod.ContentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<sweetalert.sweetalert/typings/modules/options.SwalOptions> */
@js.native
trait PartialSwalOptions extends js.Object {
  var buttons: js.UndefOr[ButtonList | (js.Array[String | Boolean])] = js.native
  var className: js.UndefOr[String] = js.native
  var closeOnClickOutside: js.UndefOr[Boolean] = js.native
  var closeOnEsc: js.UndefOr[Boolean] = js.native
  var content: js.UndefOr[ContentOptions] = js.native
  var dangerMode: js.UndefOr[Boolean] = js.native
  var icon: js.UndefOr[String] = js.native
  var text: js.UndefOr[String] = js.native
  var timer: js.UndefOr[Double] = js.native
  var title: js.UndefOr[String] = js.native
}

object PartialSwalOptions {
  @scala.inline
  def apply(): PartialSwalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSwalOptions]
  }
  @scala.inline
  implicit class PartialSwalOptionsOps[Self <: PartialSwalOptions] (val x: Self) extends AnyVal {
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
    def deleteButtons: Self = this.set("buttons", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCloseOnClickOutside(value: Boolean): Self = this.set("closeOnClickOutside", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOnClickOutside: Self = this.set("closeOnClickOutside", js.undefined)
    @scala.inline
    def setCloseOnEsc(value: Boolean): Self = this.set("closeOnEsc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOnEsc: Self = this.set("closeOnEsc", js.undefined)
    @scala.inline
    def setContent(value: ContentOptions): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setDangerMode(value: Boolean): Self = this.set("dangerMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDangerMode: Self = this.set("dangerMode", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTimer(value: Double): Self = this.set("timer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimer: Self = this.set("timer", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

