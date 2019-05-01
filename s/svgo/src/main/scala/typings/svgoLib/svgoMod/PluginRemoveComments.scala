package typings
package svgoLib.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginRemoveComments extends PluginConfig {
  var removeComments: scala.Boolean | js.Object
}

object PluginRemoveComments {
  @scala.inline
  def apply(removeComments: scala.Boolean | js.Object): PluginRemoveComments = {
    val __obj = js.Dynamic.literal(removeComments = removeComments.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginRemoveComments]
  }
}

