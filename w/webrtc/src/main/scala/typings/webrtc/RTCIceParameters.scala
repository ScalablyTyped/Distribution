package typings.webrtc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://www.w3.org/TR/webrtc/#idl-def-rtciceparameters
trait RTCIceParameters extends StObject {
  
  var iceLite: js.UndefOr[Boolean] = js.undefined
  
  var password: js.UndefOr[String] = js.undefined
  
  var usernameFragment: js.UndefOr[String] = js.undefined
}
object RTCIceParameters {
  
  inline def apply(): RTCIceParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCIceParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RTCIceParameters] (val x: Self) extends AnyVal {
    
    inline def setIceLite(value: Boolean): Self = StObject.set(x, "iceLite", value.asInstanceOf[js.Any])
    
    inline def setIceLiteUndefined: Self = StObject.set(x, "iceLite", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setUsernameFragment(value: String): Self = StObject.set(x, "usernameFragment", value.asInstanceOf[js.Any])
    
    inline def setUsernameFragmentUndefined: Self = StObject.set(x, "usernameFragment", js.undefined)
  }
}
