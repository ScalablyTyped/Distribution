package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginRemoveXMLNS extends PluginConfig {
  var removeXMLNS: Boolean | js.Object
}

object PluginRemoveXMLNS {
  @scala.inline
  def apply(removeXMLNS: Boolean | js.Object): PluginRemoveXMLNS = {
    val __obj = js.Dynamic.literal(removeXMLNS = removeXMLNS.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveXMLNS]
  }
}

