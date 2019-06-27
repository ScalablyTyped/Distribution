package typings
package svgoLib.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginPrefixIds extends PluginConfig {
  var removeUnusedNS: scala.Boolean | js.Object
}

object PluginPrefixIds {
  @scala.inline
  def apply(removeUnusedNS: scala.Boolean | js.Object): PluginPrefixIds = {
    val __obj = js.Dynamic.literal(removeUnusedNS = removeUnusedNS.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginPrefixIds]
  }
}

