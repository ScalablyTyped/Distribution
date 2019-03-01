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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    __obj.updateDynamic("className")(className)
    __obj.updateDynamic("closeOnClickOutside")(closeOnClickOutside)
    __obj.updateDynamic("closeOnEsc")(closeOnEsc)
    __obj.updateDynamic("content")(content)
    __obj.updateDynamic("dangerMode")(dangerMode)
    __obj.updateDynamic("icon")(icon)
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("timer")(timer)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[SwalOptions]
  }
}

