package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginCollapseGroups extends PluginConfig {
  var collapseGroups: Boolean | js.Object
}

object PluginCollapseGroups {
  @scala.inline
  def apply(collapseGroups: Boolean | js.Object): PluginCollapseGroups = {
    val __obj = js.Dynamic.literal(collapseGroups = collapseGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginCollapseGroups]
  }
}

