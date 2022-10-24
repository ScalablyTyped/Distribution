package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WrapperAny extends StObject {
  
  var wrapper: Any
}
object WrapperAny {
  
  inline def apply(wrapper: Any): WrapperAny = {
    val __obj = js.Dynamic.literal(wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrapperAny]
  }
  
  extension [Self <: WrapperAny](x: Self) {
    
    inline def setWrapper(value: Any): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
  }
}
