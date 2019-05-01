package typings
package svgoLib.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginCleanupIDs extends PluginConfig {
  var cleanupIDs: scala.Boolean | js.Object
}

object PluginCleanupIDs {
  @scala.inline
  def apply(cleanupIDs: scala.Boolean | js.Object): PluginCleanupIDs = {
    val __obj = js.Dynamic.literal(cleanupIDs = cleanupIDs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginCleanupIDs]
  }
}

