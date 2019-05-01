package typings
package svgoLib.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginMinifyStyles extends PluginConfig {
  var minifyStyles: scala.Boolean | js.Object
}

object PluginMinifyStyles {
  @scala.inline
  def apply(minifyStyles: scala.Boolean | js.Object): PluginMinifyStyles = {
    val __obj = js.Dynamic.literal(minifyStyles = minifyStyles.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginMinifyStyles]
  }
}

