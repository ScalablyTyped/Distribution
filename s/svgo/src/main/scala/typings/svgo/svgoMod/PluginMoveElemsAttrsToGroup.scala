package typings.svgo.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginMoveElemsAttrsToGroup extends PluginConfig {
  var moveElemsAttrsToGroup: Boolean | js.Object
}

object PluginMoveElemsAttrsToGroup {
  @scala.inline
  def apply(moveElemsAttrsToGroup: Boolean | js.Object): PluginMoveElemsAttrsToGroup = {
    val __obj = js.Dynamic.literal(moveElemsAttrsToGroup = moveElemsAttrsToGroup.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginMoveElemsAttrsToGroup]
  }
}

