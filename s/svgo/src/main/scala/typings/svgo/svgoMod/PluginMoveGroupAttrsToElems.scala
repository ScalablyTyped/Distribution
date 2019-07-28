package typings.svgo.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginMoveGroupAttrsToElems extends PluginConfig {
  var moveGroupAttrsToElems: Boolean | js.Object
}

object PluginMoveGroupAttrsToElems {
  @scala.inline
  def apply(moveGroupAttrsToElems: Boolean | js.Object): PluginMoveGroupAttrsToElems = {
    val __obj = js.Dynamic.literal(moveGroupAttrsToElems = moveGroupAttrsToElems.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginMoveGroupAttrsToElems]
  }
}

