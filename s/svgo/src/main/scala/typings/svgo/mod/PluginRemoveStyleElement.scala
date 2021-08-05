package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginRemoveStyleElement
  extends StObject
     with PluginConfig {
  
  var removeStyleElement: Boolean | js.Object
}
object PluginRemoveStyleElement {
  
  inline def apply(removeStyleElement: Boolean | js.Object): PluginRemoveStyleElement = {
    val __obj = js.Dynamic.literal(removeStyleElement = removeStyleElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveStyleElement]
  }
  
  extension [Self <: PluginRemoveStyleElement](x: Self) {
    
    inline def setRemoveStyleElement(value: Boolean | js.Object): Self = StObject.set(x, "removeStyleElement", value.asInstanceOf[js.Any])
  }
}
