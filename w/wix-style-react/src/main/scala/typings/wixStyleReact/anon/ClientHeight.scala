package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientHeight extends StObject {
  
  var clientHeight: Any
  
  var scrollHeight: Any
  
  var scrollTop: Any
}
object ClientHeight {
  
  inline def apply(clientHeight: Any, scrollHeight: Any, scrollTop: Any): ClientHeight = {
    val __obj = js.Dynamic.literal(clientHeight = clientHeight.asInstanceOf[js.Any], scrollHeight = scrollHeight.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientHeight]
  }
  
  extension [Self <: ClientHeight](x: Self) {
    
    inline def setClientHeight(value: Any): Self = StObject.set(x, "clientHeight", value.asInstanceOf[js.Any])
    
    inline def setScrollHeight(value: Any): Self = StObject.set(x, "scrollHeight", value.asInstanceOf[js.Any])
    
    inline def setScrollTop(value: Any): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
  }
}
