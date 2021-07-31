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
  
  @scala.inline
  def apply(sessionId: String): AttachSessionOptions = {
    val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachSessionOptions]
  }
  
  @scala.inline
  implicit class AttachSessionOptionsMutableBuilder[Self <: AttachSessionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsW3C(value: Boolean): Self = StObject.set(x, "isW3C", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsW3CUndefined: Self = StObject.set(x, "isW3C", js.undefined)
    
    @scala.inline
    def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
  }
}
