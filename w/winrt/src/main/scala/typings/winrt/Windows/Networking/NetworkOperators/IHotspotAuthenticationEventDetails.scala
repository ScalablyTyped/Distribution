package typings.winrt.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHotspotAuthenticationEventDetails extends StObject {
  
  var eventToken: String = js.native
}
object IHotspotAuthenticationEventDetails {
  
  @scala.inline
  def apply(eventToken: String): IHotspotAuthenticationEventDetails = {
    val __obj = js.Dynamic.literal(eventToken = eventToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHotspotAuthenticationEventDetails]
  }
  
  @scala.inline
  implicit class IHotspotAuthenticationEventDetailsMutableBuilder[Self <: IHotspotAuthenticationEventDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventToken(value: String): Self = StObject.set(x, "eventToken", value.asInstanceOf[js.Any])
  }
}
