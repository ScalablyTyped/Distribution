package typings
package svgoLib.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginRemoveHiddenElems extends PluginConfig {
  var removeHiddenElems: scala.Boolean | js.Object
}

object PluginRemoveHiddenElems {
  @scala.inline
  def apply(removeHiddenElems: scala.Boolean | js.Object): PluginRemoveHiddenElems = {
    val __obj = js.Dynamic.literal(removeHiddenElems = removeHiddenElems.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginRemoveHiddenElems]
  }
}

