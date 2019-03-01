package typings
package svgoLib.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginCollapseGroups extends js.Object {
  var collapseGroups: scala.Boolean | js.Object
}

object PluginCollapseGroups {
  @scala.inline
  def apply(collapseGroups: scala.Boolean | js.Object): PluginCollapseGroups = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("collapseGroups")(collapseGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginCollapseGroups]
  }
}

