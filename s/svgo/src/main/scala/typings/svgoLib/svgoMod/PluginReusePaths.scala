package typings
package svgoLib.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginReusePaths extends PluginConfig {
  var reusePaths: scala.Boolean | js.Object
}

object PluginReusePaths {
  @scala.inline
  def apply(reusePaths: scala.Boolean | js.Object): PluginReusePaths = {
    val __obj = js.Dynamic.literal(reusePaths = reusePaths.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginReusePaths]
  }
}

