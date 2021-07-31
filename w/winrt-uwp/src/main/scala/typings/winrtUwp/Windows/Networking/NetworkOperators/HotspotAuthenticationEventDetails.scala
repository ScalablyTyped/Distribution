package typings.winrtUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the content of the event that is raised for background task handlers for the hotspot authentication event. */
trait HotspotAuthenticationEventDetails extends StObject {
  
  /** Gets a GUID that uniquely identifies the authentication attempt for which this event was raised. */
  var eventToken: String
}
object HotspotAuthenticationEventDetails {
  
  @scala.inline
  def apply(eventToken: String): HotspotAuthenticationEventDetails = {
    val __obj = js.Dynamic.literal(eventToken = eventToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[HotspotAuthenticationEventDetails]
  }
  
  @scala.inline
  implicit class HotspotAuthenticationEventDetailsMutableBuilder[Self <: HotspotAuthenticationEventDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventToken(value: String): Self = StObject.set(x, "eventToken", value.asInstanceOf[js.Any])
  }
}
