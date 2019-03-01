package typings
package svgoLib.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginConvertColors extends js.Object {
  var convertColors: scala.Boolean | js.Object
}

object PluginConvertColors {
  @scala.inline
  def apply(convertColors: scala.Boolean | js.Object): PluginConvertColors = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("convertColors")(convertColors.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginConvertColors]
  }
}

