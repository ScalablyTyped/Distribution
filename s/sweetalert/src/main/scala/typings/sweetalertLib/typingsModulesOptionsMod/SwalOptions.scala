package typings
package sweetalertLib.typingsModulesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwalOptions extends js.Object {
  var buttons: sweetalertLib.typingsModulesOptionsButtonsMod.ButtonList | (js.Array[java.lang.String | scala.Boolean])
  var className: java.lang.String
  var closeOnClickOutside: scala.Boolean
  var closeOnEsc: scala.Boolean
  var content: sweetalertLib.typingsModulesOptionsContentMod.ContentOptions
  var dangerMode: scala.Boolean
  var icon: java.lang.String
  var text: java.lang.String
  var timer: scala.Double
  var title: java.lang.String
}

object SwalOptions {
  @scala.inline
  def apply(
    buttons: sweetalertLib.typingsModulesOptionsButtonsMod.ButtonList | (js.Array[java.lang.String | scala.Boolean]),
    className: java.lang.String,
    closeOnClickOutside: scala.Boolean,
    closeOnEsc: scala.Boolean,
    content: sweetalertLib.typingsModulesOptionsContentMod.ContentOptions,
    dangerMode: scala.Boolean,
    icon: java.lang.String,
    text: java.lang.String,
    timer: scala.Double,
    title: java.lang.String
  ): SwalOptions = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], className = className, closeOnClickOutside = closeOnClickOutside, closeOnEsc = closeOnEsc, content = content, dangerMode = dangerMode, icon = icon, text = text, timer = timer, title = title)
  
    __obj.asInstanceOf[SwalOptions]
  }
}

