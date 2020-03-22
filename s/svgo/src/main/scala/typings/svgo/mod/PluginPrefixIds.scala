package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginPrefixIds extends PluginConfig {
  /** prefix IDs and classes with the SVG filename or an arbitrary string	 */
  var prefixIds: Boolean | js.Object
}

object PluginPrefixIds {
  @scala.inline
  def apply(prefixIds: Boolean | js.Object): PluginPrefixIds = {
    val __obj = js.Dynamic.literal(prefixIds = prefixIds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginPrefixIds]
  }
}

