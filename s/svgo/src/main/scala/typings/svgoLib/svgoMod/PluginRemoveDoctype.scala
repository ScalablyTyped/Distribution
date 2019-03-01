package typings
package svgoLib.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginRemoveDoctype extends js.Object {
  var removeDoctype: scala.Boolean | js.Object
}

object PluginRemoveDoctype {
  @scala.inline
  def apply(removeDoctype: scala.Boolean | js.Object): PluginRemoveDoctype = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("removeDoctype")(removeDoctype.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveDoctype]
  }
}

