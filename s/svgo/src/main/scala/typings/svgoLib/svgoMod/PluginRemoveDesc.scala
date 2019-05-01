package typings
package svgoLib.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginRemoveDesc extends PluginConfig {
  var removeDesc: scala.Boolean | js.Object
}

object PluginRemoveDesc {
  @scala.inline
  def apply(removeDesc: scala.Boolean | js.Object): PluginRemoveDesc = {
    val __obj = js.Dynamic.literal(removeDesc = removeDesc.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginRemoveDesc]
  }
}

