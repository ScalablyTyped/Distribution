package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginSortDefsChildren extends PluginConfig {
  /** sort children of <defs> in order to improve compression */
  var sortDefsChildren: Boolean | js.Object
}

object PluginSortDefsChildren {
  @scala.inline
  def apply(sortDefsChildren: Boolean | js.Object): PluginSortDefsChildren = {
    val __obj = js.Dynamic.literal(sortDefsChildren = sortDefsChildren.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginSortDefsChildren]
  }
}

