package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginRemoveHiddenElems
  extends StObject
     with PluginConfig {
  
  var removeHiddenElems: Boolean | js.Object
}
object PluginRemoveHiddenElems {
  
  inline def apply(removeHiddenElems: Boolean | js.Object): PluginRemoveHiddenElems = {
    val __obj = js.Dynamic.literal(removeHiddenElems = removeHiddenElems.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveHiddenElems]
  }
  
  extension [Self <: PluginRemoveHiddenElems](x: Self) {
    
    inline def setRemoveHiddenElems(value: Boolean | js.Object): Self = StObject.set(x, "removeHiddenElems", value.asInstanceOf[js.Any])
  }
}
