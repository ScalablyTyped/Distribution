package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginMoveElemsAttrsToGroup extends PluginConfig {
  
  var moveElemsAttrsToGroup: Boolean | js.Object = js.native
}
object PluginMoveElemsAttrsToGroup {
  
  @scala.inline
  def apply(moveElemsAttrsToGroup: Boolean | js.Object): PluginMoveElemsAttrsToGroup = {
    val __obj = js.Dynamic.literal(moveElemsAttrsToGroup = moveElemsAttrsToGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginMoveElemsAttrsToGroup]
  }
  
  @scala.inline
  implicit class PluginMoveElemsAttrsToGroupMutableBuilder[Self <: PluginMoveElemsAttrsToGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMoveElemsAttrsToGroup(value: Boolean | js.Object): Self = StObject.set(x, "moveElemsAttrsToGroup", value.asInstanceOf[js.Any])
  }
}
