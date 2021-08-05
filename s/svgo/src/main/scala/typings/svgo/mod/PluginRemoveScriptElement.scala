package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginRemoveScriptElement
  extends StObject
     with PluginConfig {
  
  var removeScriptElement: Boolean | js.Object
}
object PluginRemoveScriptElement {
  
  inline def apply(removeScriptElement: Boolean | js.Object): PluginRemoveScriptElement = {
    val __obj = js.Dynamic.literal(removeScriptElement = removeScriptElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveScriptElement]
  }
  
  extension [Self <: PluginRemoveScriptElement](x: Self) {
    
    inline def setRemoveScriptElement(value: Boolean | js.Object): Self = StObject.set(x, "removeScriptElement", value.asInstanceOf[js.Any])
  }
}
