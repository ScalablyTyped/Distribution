package typings.wixUiCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapsClient extends StObject {
  
  def autocomplete(apiKey: String, lang: String, request: js.Any): js.Promise[js.Array[Address]]
  
  def geocode(apiKey: String, lang: String, request: js.Any): js.Promise[js.Array[Geocode]]
  
  def placeDetails(apiKey: String, lang: String, request: js.Any): js.Promise[PlaceDetails]
  
  def useClientId(): Unit
}
object MapsClient {
  
  @scala.inline
  def apply(
    autocomplete: (String, String, js.Any) => js.Promise[js.Array[Address]],
    geocode: (String, String, js.Any) => js.Promise[js.Array[Geocode]],
    placeDetails: (String, String, js.Any) => js.Promise[PlaceDetails],
    useClientId: () => Unit
  ): MapsClient = {
    val __obj = js.Dynamic.literal(autocomplete = js.Any.fromFunction3(autocomplete), geocode = js.Any.fromFunction3(geocode), placeDetails = js.Any.fromFunction3(placeDetails), useClientId = js.Any.fromFunction0(useClientId))
    __obj.asInstanceOf[MapsClient]
  }
  
  @scala.inline
  implicit class MapsClientMutableBuilder[Self <: MapsClient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutocomplete(value: (String, String, js.Any) => js.Promise[js.Array[Address]]): Self = StObject.set(x, "autocomplete", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGeocode(value: (String, String, js.Any) => js.Promise[js.Array[Geocode]]): Self = StObject.set(x, "geocode", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPlaceDetails(value: (String, String, js.Any) => js.Promise[PlaceDetails]): Self = StObject.set(x, "placeDetails", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUseClientId(value: () => Unit): Self = StObject.set(x, "useClientId", js.Any.fromFunction0(value))
  }
}
