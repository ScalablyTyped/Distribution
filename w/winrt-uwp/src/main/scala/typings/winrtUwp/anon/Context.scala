package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Networking.NetworkOperators.HotspotAuthenticationContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Context extends StObject {
  
  /** The network operator hotspot authentication context. */ var context: HotspotAuthenticationContext
  
  /** If true, the authentication context was retrieved. The authentication context can only be retrieved if the calling application matches the application ID specified in the hotspot profile of the underlying WLAN connection and if the authentication hasn’t be completed by the corresponding context already or timed out. */ var returnValue: Boolean
}
object Context {
  
  @scala.inline
  def apply(context: HotspotAuthenticationContext, returnValue: Boolean): Context = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  
  @scala.inline
  implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: HotspotAuthenticationContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
