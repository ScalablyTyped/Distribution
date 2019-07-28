package typings.sweetalert.typingsModulesOptionsMod

import typings.sweetalert.typingsModulesOptionsButtonsMod.ButtonList
import typings.sweetalert.typingsModulesOptionsContentMod.ContentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwalOptions extends js.Object {
  var buttons: ButtonList | (js.Array[String | Boolean])
  var className: String
  var closeOnClickOutside: Boolean
  var closeOnEsc: Boolean
  var content: ContentOptions
  var dangerMode: Boolean
  var icon: String
  var text: String
  var timer: Double
  var title: String
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
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], className = className, closeOnClickOutside = closeOnClickOutside, closeOnEsc = closeOnEsc, content = content, dangerMode = dangerMode, icon = icon, text = text, timer = timer, title = title)
  
    __obj.asInstanceOf[SwalOptions]
  }
}

