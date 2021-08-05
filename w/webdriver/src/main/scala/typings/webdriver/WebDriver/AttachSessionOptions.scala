package typings.webdriver.WebDriver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachSessionOptions
  extends StObject
     with Options {
  
  var isW3C: js.UndefOr[Boolean] = js.undefined
  
  var sessionId: String
}
object AttachSessionOptions {
  
  inline def apply(sessionId: String): AttachSessionOptions = {
    val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachSessionOptions]
  }
  
  extension [Self <: AttachSessionOptions](x: Self) {
    
    inline def setIsW3C(value: Boolean): Self = StObject.set(x, "isW3C", value.asInstanceOf[js.Any])
    
    inline def setIsW3CUndefined: Self = StObject.set(x, "isW3C", js.undefined)
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
  }
}
