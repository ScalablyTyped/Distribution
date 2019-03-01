package typings
package svgoLib.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginConvertTransform extends js.Object {
  var convertTransform: scala.Boolean | js.Object
}

object PluginConvertTransform {
  @scala.inline
  def apply(convertTransform: scala.Boolean | js.Object): PluginConvertTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("convertTransform")(convertTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginConvertTransform]
  }
}

