package typings.titanium.Titanium

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeolocationEventMap extends ProxyEventMap {
  
  var authorization: GeolocationAuthorizationEvent = js.native
  
  var calibration: GeolocationCalibrationEvent = js.native
  
  var heading: GeolocationHeadingEvent = js.native
  
  var location: GeolocationLocationEvent = js.native
  
  var locationupdatepaused: GeolocationLocationupdatepausedEvent = js.native
  
  var locationupdateresumed: GeolocationLocationupdateresumedEvent = js.native
}
object GeolocationEventMap {
  
  @scala.inline
  def apply(
    authorization: GeolocationAuthorizationEvent,
    calibration: GeolocationCalibrationEvent,
    heading: GeolocationHeadingEvent,
    location: GeolocationLocationEvent,
    locationupdatepaused: GeolocationLocationupdatepausedEvent,
    locationupdateresumed: GeolocationLocationupdateresumedEvent
  ): GeolocationEventMap = {
    val __obj = js.Dynamic.literal(authorization = authorization.asInstanceOf[js.Any], calibration = calibration.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], locationupdatepaused = locationupdatepaused.asInstanceOf[js.Any], locationupdateresumed = locationupdateresumed.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolocationEventMap]
  }
  
  @scala.inline
  implicit class GeolocationEventMapMutableBuilder[Self <: GeolocationEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorization(value: GeolocationAuthorizationEvent): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalibration(value: GeolocationCalibrationEvent): Self = StObject.set(x, "calibration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeading(value: GeolocationHeadingEvent): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: GeolocationLocationEvent): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationupdatepaused(value: GeolocationLocationupdatepausedEvent): Self = StObject.set(x, "locationupdatepaused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationupdateresumed(value: GeolocationLocationupdateresumedEvent): Self = StObject.set(x, "locationupdateresumed", value.asInstanceOf[js.Any])
  }
}
