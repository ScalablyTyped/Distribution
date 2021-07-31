package typings.winrt.anon

import typings.winrt.Windows.Networking.NetworkOperators.HotspotAuthenticationContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Context extends StObject {
  
  var context: HotspotAuthenticationContext
  
  var isValid: Boolean
}
object Context {
  
  @scala.inline
  def apply(context: HotspotAuthenticationContext, isValid: Boolean): Context = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  
  @scala.inline
  implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: HotspotAuthenticationContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
  }
}
