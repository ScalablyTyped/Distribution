package typings.wixStyleReact

import typings.wixStyleReact.anon.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClientsGoogleMapsClientMod {
  
  @JSImport("wix-style-react/dist/types/clients/GoogleMapsClient", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with GoogleMapsClient {
    
    /* CompleteClass */
    var _autocomplete: Any = js.native
    
    /* CompleteClass */
    var _geocoder: Any = js.native
    
    /* CompleteClass */
    var _placesServices: Any = js.native
    
    /* CompleteClass */
    var _sessionToken: Any = js.native
    
    /* CompleteClass */
    override def autocomplete(param0: Request): js.Promise[Any] = js.native
    
    /* CompleteClass */
    override def geocode(param0: Request): js.Promise[Any] = js.native
    
    /* CompleteClass */
    override def placeDetails(param0: Request): js.Promise[Any] = js.native
  }
  
  trait GoogleMapsClient extends StObject {
    
    var _autocomplete: Any
    
    var _geocoder: Any
    
    var _placesServices: Any
    
    var _sessionToken: Any
    
    def autocomplete(param0: Request): js.Promise[Any]
    
    def geocode(param0: Request): js.Promise[Any]
    
    def placeDetails(param0: Request): js.Promise[Any]
  }
  object GoogleMapsClient {
    
    inline def apply(
      _autocomplete: Any,
      _geocoder: Any,
      _placesServices: Any,
      _sessionToken: Any,
      autocomplete: Request => js.Promise[Any],
      geocode: Request => js.Promise[Any],
      placeDetails: Request => js.Promise[Any]
    ): GoogleMapsClient = {
      val __obj = js.Dynamic.literal(_autocomplete = _autocomplete.asInstanceOf[js.Any], _geocoder = _geocoder.asInstanceOf[js.Any], _placesServices = _placesServices.asInstanceOf[js.Any], _sessionToken = _sessionToken.asInstanceOf[js.Any], autocomplete = js.Any.fromFunction1(autocomplete), geocode = js.Any.fromFunction1(geocode), placeDetails = js.Any.fromFunction1(placeDetails))
      __obj.asInstanceOf[GoogleMapsClient]
    }
    
    extension [Self <: GoogleMapsClient](x: Self) {
      
      inline def setAutocomplete(value: Request => js.Promise[Any]): Self = StObject.set(x, "autocomplete", js.Any.fromFunction1(value))
      
      inline def setGeocode(value: Request => js.Promise[Any]): Self = StObject.set(x, "geocode", js.Any.fromFunction1(value))
      
      inline def setPlaceDetails(value: Request => js.Promise[Any]): Self = StObject.set(x, "placeDetails", js.Any.fromFunction1(value))
      
      inline def set_autocomplete(value: Any): Self = StObject.set(x, "_autocomplete", value.asInstanceOf[js.Any])
      
      inline def set_geocoder(value: Any): Self = StObject.set(x, "_geocoder", value.asInstanceOf[js.Any])
      
      inline def set_placesServices(value: Any): Self = StObject.set(x, "_placesServices", value.asInstanceOf[js.Any])
      
      inline def set_sessionToken(value: Any): Self = StObject.set(x, "_sessionToken", value.asInstanceOf[js.Any])
    }
  }
}
