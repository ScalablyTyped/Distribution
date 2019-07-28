package typings.svgo.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginCleanupAttrs extends PluginConfig {
  var cleanupAttrs: Boolean | js.Object
}

object PluginCleanupAttrs {
  @scala.inline
  def apply(cleanupAttrs: Boolean | js.Object): PluginCleanupAttrs = {
    val __obj = js.Dynamic.literal(cleanupAttrs = cleanupAttrs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginCleanupAttrs]
  }
}

