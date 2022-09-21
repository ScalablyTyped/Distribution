package typings.videojsErrors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Code extends StObject {
    
    val code: String | Double
    
    val dismiss: js.UndefOr[Boolean] = js.undefined
  }
  object Code {
    
    inline def apply(code: String | Double): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    extension [Self <: Code](x: Self) {
      
      inline def setCode(value: String | Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDismiss(value: Boolean): Self = StObject.set(x, "dismiss", value.asInstanceOf[js.Any])
      
      inline def setDismissUndefined: Self = StObject.set(x, "dismiss", js.undefined)
    }
  }
}
