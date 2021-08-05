package typings.stylefire

import typings.stylefire.typesMod.ResolvedState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customStyleHandlersMod {
  
  trait CustomStyleHandler extends StObject {
    
    var get: js.UndefOr[String] = js.undefined
    
    def set(output: ResolvedState, value: js.Any): Unit
  }
  object CustomStyleHandler {
    
    inline def apply(set: (ResolvedState, js.Any) => Unit): CustomStyleHandler = {
      val __obj = js.Dynamic.literal(set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[CustomStyleHandler]
    }
    
    extension [Self <: CustomStyleHandler](x: Self) {
      
      inline def setGet(value: String): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
      
      inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
      
      inline def setSet(value: (ResolvedState, js.Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
}
