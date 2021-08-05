package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginMoveGroupAttrsToElems
  extends StObject
     with PluginConfig {
  
  var moveGroupAttrsToElems: Boolean | js.Object
}
object PluginMoveGroupAttrsToElems {
  
  inline def apply(moveGroupAttrsToElems: Boolean | js.Object): PluginMoveGroupAttrsToElems = {
    val __obj = js.Dynamic.literal(moveGroupAttrsToElems = moveGroupAttrsToElems.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginMoveGroupAttrsToElems]
  }
  
  extension [Self <: PluginMoveGroupAttrsToElems](x: Self) {
    
    inline def setMoveGroupAttrsToElems(value: Boolean | js.Object): Self = StObject.set(x, "moveGroupAttrsToElems", value.asInstanceOf[js.Any])
  }
}
