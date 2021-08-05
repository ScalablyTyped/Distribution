package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginRemoveAttributesBySelector
  extends StObject
     with PluginConfig {
  
  var removeAttributesBySelector: Boolean | js.Object
}
object PluginRemoveAttributesBySelector {
  
  inline def apply(removeAttributesBySelector: Boolean | js.Object): PluginRemoveAttributesBySelector = {
    val __obj = js.Dynamic.literal(removeAttributesBySelector = removeAttributesBySelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveAttributesBySelector]
  }
  
  extension [Self <: PluginRemoveAttributesBySelector](x: Self) {
    
    inline def setRemoveAttributesBySelector(value: Boolean | js.Object): Self = StObject.set(x, "removeAttributesBySelector", value.asInstanceOf[js.Any])
  }
}
