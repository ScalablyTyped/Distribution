package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginSortAttrs extends PluginConfig {
  var sortAttrs: Boolean | js.Object
}

object PluginSortAttrs {
  @scala.inline
  def apply(sortAttrs: Boolean | js.Object): PluginSortAttrs = {
    val __obj = js.Dynamic.literal(sortAttrs = sortAttrs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginSortAttrs]
  }
}

