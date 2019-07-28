package typings.svgo.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginRemoveUnusedNS extends PluginConfig {
  var removeUnusedNS: Boolean | js.Object
}

object PluginRemoveUnusedNS {
  @scala.inline
  def apply(removeUnusedNS: Boolean | js.Object): PluginRemoveUnusedNS = {
    val __obj = js.Dynamic.literal(removeUnusedNS = removeUnusedNS.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginRemoveUnusedNS]
  }
}

