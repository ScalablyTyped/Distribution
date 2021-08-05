package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginMoveElemsAttrsToGroup
  extends StObject
     with PluginConfig {
  
  var moveElemsAttrsToGroup: Boolean | js.Object
}
object PluginMoveElemsAttrsToGroup {
  
  inline def apply(moveElemsAttrsToGroup: Boolean | js.Object): PluginMoveElemsAttrsToGroup = {
    val __obj = js.Dynamic.literal(moveElemsAttrsToGroup = moveElemsAttrsToGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginMoveElemsAttrsToGroup]
  }
  
  extension [Self <: PluginMoveElemsAttrsToGroup](x: Self) {
    
    inline def setMoveElemsAttrsToGroup(value: Boolean | js.Object): Self = StObject.set(x, "moveElemsAttrsToGroup", value.asInstanceOf[js.Any])
  }
}
