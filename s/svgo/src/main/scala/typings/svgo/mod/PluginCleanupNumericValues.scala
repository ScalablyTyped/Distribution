package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginCleanupNumericValues extends PluginConfig {
  var cleanupNumericValues: Boolean | js.Object
}

object PluginCleanupNumericValues {
  @scala.inline
  def apply(cleanupNumericValues: Boolean | js.Object): PluginCleanupNumericValues = {
    val __obj = js.Dynamic.literal(cleanupNumericValues = cleanupNumericValues.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginCleanupNumericValues]
  }
}

