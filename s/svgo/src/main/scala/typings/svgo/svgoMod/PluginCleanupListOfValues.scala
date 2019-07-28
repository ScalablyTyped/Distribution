package typings.svgo.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginCleanupListOfValues extends PluginConfig {
  var cleanupListOfValues: Boolean | js.Object
}

object PluginCleanupListOfValues {
  @scala.inline
  def apply(cleanupListOfValues: Boolean | js.Object): PluginCleanupListOfValues = {
    val __obj = js.Dynamic.literal(cleanupListOfValues = cleanupListOfValues.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginCleanupListOfValues]
  }
}

