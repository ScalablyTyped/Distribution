package typings
package svgoLib.svgoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginMoveElemsAttrsToGroup extends js.Object {
  var moveElemsAttrsToGroup: scala.Boolean | js.Object
}

object PluginMoveElemsAttrsToGroup {
  @scala.inline
  def apply(moveElemsAttrsToGroup: scala.Boolean | js.Object): PluginMoveElemsAttrsToGroup = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("moveElemsAttrsToGroup")(moveElemsAttrsToGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginMoveElemsAttrsToGroup]
  }
}

