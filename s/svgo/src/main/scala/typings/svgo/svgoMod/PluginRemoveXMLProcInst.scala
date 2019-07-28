package typings.svgo.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginRemoveXMLProcInst extends PluginConfig {
  var removeXMLProcInst: Boolean | js.Object
}

object PluginRemoveXMLProcInst {
  @scala.inline
  def apply(removeXMLProcInst: Boolean | js.Object): PluginRemoveXMLProcInst = {
    val __obj = js.Dynamic.literal(removeXMLProcInst = removeXMLProcInst.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginRemoveXMLProcInst]
  }
}

