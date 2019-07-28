package typings.svgo.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginRemoveElementsByAttr extends PluginConfig {
  var removeElementsByAttr: Boolean | js.Object
}

object PluginRemoveElementsByAttr {
  @scala.inline
  def apply(removeElementsByAttr: Boolean | js.Object): PluginRemoveElementsByAttr = {
    val __obj = js.Dynamic.literal(removeElementsByAttr = removeElementsByAttr.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginRemoveElementsByAttr]
  }
}

