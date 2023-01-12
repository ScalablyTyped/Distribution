package typings.winrt.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHotspotAuthenticationEventDetails extends StObject {
  
  var eventToken: String
}
object IHotspotAuthenticationEventDetails {
  
  inline def apply(eventToken: String): IHotspotAuthenticationEventDetails = {
    val __obj = js.Dynamic.literal(eventToken = eventToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHotspotAuthenticationEventDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IHotspotAuthenticationEventDetails] (val x: Self) extends AnyVal {
    
    inline def setEventToken(value: String): Self = StObject.set(x, "eventToken", value.asInstanceOf[js.Any])
  }
}
