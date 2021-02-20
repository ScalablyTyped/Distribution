package typings.titanium.Titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when changes are made to the authorization status for location services.
  */
@js.native
trait GeolocationAuthorizationEvent extends GeolocationBaseEvent {
  
  /**
    * New authorization status for the application.
    */
  var authorizationStatus: Double = js.native
}
object GeolocationAuthorizationEvent {
  
  @scala.inline
  def apply(authorizationStatus: Double, source: Geolocation): GeolocationAuthorizationEvent = {
    val __obj = js.Dynamic.literal(authorizationStatus = authorizationStatus.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolocationAuthorizationEvent]
  }
  
  @scala.inline
  implicit class GeolocationAuthorizationEventMutableBuilder[Self <: GeolocationAuthorizationEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizationStatus(value: Double): Self = StObject.set(x, "authorizationStatus", value.asInstanceOf[js.Any])
  }
}
