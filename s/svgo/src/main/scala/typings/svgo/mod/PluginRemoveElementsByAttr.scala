package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginRemoveElementsByAttr
  extends StObject
     with PluginConfig {
  
  var removeElementsByAttr: Boolean | js.Object
}
object PluginRemoveElementsByAttr {
  
  inline def apply(removeElementsByAttr: Boolean | js.Object): PluginRemoveElementsByAttr = {
    val __obj = js.Dynamic.literal(removeElementsByAttr = removeElementsByAttr.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveElementsByAttr]
  }
  
  extension [Self <: PluginRemoveElementsByAttr](x: Self) {
    
    inline def setRemoveElementsByAttr(value: Boolean | js.Object): Self = StObject.set(x, "removeElementsByAttr", value.asInstanceOf[js.Any])
  }
}
