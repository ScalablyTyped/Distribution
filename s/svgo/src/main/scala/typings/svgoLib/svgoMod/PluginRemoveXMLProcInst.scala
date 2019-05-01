package typings
package svgoLib.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginRemoveXMLProcInst extends PluginConfig {
  var removeXMLProcInst: scala.Boolean | js.Object
}

object PluginRemoveXMLProcInst {
  @scala.inline
  def apply(removeXMLProcInst: scala.Boolean | js.Object): PluginRemoveXMLProcInst = {
    val __obj = js.Dynamic.literal(removeXMLProcInst = removeXMLProcInst.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginRemoveXMLProcInst]
  }
}

