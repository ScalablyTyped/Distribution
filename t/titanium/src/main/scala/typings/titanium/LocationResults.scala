package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Argument passed to the [getCurrentPosition](Titanium.Geolocation.getCurrentPosition) callback.
  */
@js.native
trait LocationResults extends ErrorResponse {
  
  /**
    * If `success` is true, actual location data for this update.
    */
  var coords: js.UndefOr[LocationCoordinates] = js.native
  
  /**
    * If `success` is true, object describing the location provider generating this update.
    */
  var provider: js.UndefOr[LocationProviderDict] = js.native
}
object LocationResults {
  
  @scala.inline
  def apply(): LocationResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationResults]
  }
  
  @scala.inline
  implicit class LocationResultsMutableBuilder[Self <: LocationResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoords(value: LocationCoordinates): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordsUndefined: Self = StObject.set(x, "coords", js.undefined)
    
    @scala.inline
    def setProvider(value: LocationProviderDict): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
  }
}
