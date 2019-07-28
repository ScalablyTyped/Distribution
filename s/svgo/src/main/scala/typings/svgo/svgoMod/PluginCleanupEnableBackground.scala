package typings.svgo.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginCleanupEnableBackground extends PluginConfig {
  var cleanupEnableBackground: Boolean | js.Object
}

object PluginCleanupEnableBackground {
  @scala.inline
  def apply(cleanupEnableBackground: Boolean | js.Object): PluginCleanupEnableBackground = {
    val __obj = js.Dynamic.literal(cleanupEnableBackground = cleanupEnableBackground.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginCleanupEnableBackground]
  }
}

