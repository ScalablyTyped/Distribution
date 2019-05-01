package typings
package svgoLib.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginRemoveXMLNS extends PluginConfig {
  var removeXMLNS: scala.Boolean | js.Object
}

object PluginRemoveXMLNS {
  @scala.inline
  def apply(removeXMLNS: scala.Boolean | js.Object): PluginRemoveXMLNS = {
    val __obj = js.Dynamic.literal(removeXMLNS = removeXMLNS.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginRemoveXMLNS]
  }
}

