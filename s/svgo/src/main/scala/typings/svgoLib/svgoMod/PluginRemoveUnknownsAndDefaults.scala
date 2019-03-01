package typings
package svgoLib.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginRemoveUnknownsAndDefaults extends js.Object {
  var removeUnknownsAndDefaults: scala.Boolean | js.Object
}

object PluginRemoveUnknownsAndDefaults {
  @scala.inline
  def apply(removeUnknownsAndDefaults: scala.Boolean | js.Object): PluginRemoveUnknownsAndDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("removeUnknownsAndDefaults")(removeUnknownsAndDefaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveUnknownsAndDefaults]
  }
}

