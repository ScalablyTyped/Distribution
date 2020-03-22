package typings.sweetalert

import typings.sweetalert.optionsButtonsMod.ButtonList
import typings.sweetalert.optionsContentMod.ContentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<sweetalert.sweetalert/typings/modules/options.SwalOptions> */
trait PartialSwalOptions extends js.Object {
  var buttons: js.UndefOr[ButtonList | (js.Array[String | Boolean])] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var closeOnClickOutside: js.UndefOr[Boolean] = js.undefined
  var closeOnEsc: js.UndefOr[Boolean] = js.undefined
  var content: js.UndefOr[ContentOptions] = js.undefined
  var dangerMode: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var timer: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object PartialSwalOptions {
  @scala.inline
  def apply(
    buttons: ButtonList | (js.Array[String | Boolean]) = null,
    className: String = null,
    closeOnClickOutside: js.UndefOr[Boolean] = js.undefined,
    closeOnEsc: js.UndefOr[Boolean] = js.undefined,
    content: ContentOptions = null,
    dangerMode: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    text: String = null,
    timer: Int | Double = null,
    title: String = null
  ): PartialSwalOptions = {
    val __obj = js.Dynamic.literal()
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnClickOutside)) __obj.updateDynamic("closeOnClickOutside")(closeOnClickOutside.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnEsc)) __obj.updateDynamic("closeOnEsc")(closeOnEsc.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(dangerMode)) __obj.updateDynamic("dangerMode")(dangerMode.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (timer != null) __obj.updateDynamic("timer")(timer.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSwalOptions]
  }
}

