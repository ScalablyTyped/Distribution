package typings.svgo.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginCleanupIDs extends PluginConfig {
  var cleanupIDs: Boolean | js.Object
}

object PluginCleanupIDs {
  @scala.inline
  def apply(cleanupIDs: Boolean | js.Object): PluginCleanupIDs = {
    val __obj = js.Dynamic.literal(cleanupIDs = cleanupIDs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginCleanupIDs]
  }
}

