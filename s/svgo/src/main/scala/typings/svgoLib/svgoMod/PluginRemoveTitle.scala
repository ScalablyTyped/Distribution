package typings
package svgoLib.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginRemoveTitle extends js.Object {
  var removeTitle: scala.Boolean | js.Object
}

object PluginRemoveTitle {
  @scala.inline
  def apply(removeTitle: scala.Boolean | js.Object): PluginRemoveTitle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("removeTitle")(removeTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveTitle]
  }
}

