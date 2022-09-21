package typings.trimblemapsTrimblemapsJs.mod

import typings.trimblemapsTrimblemapsJs.anon.Dataset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Geocoder {
  
  @JSImport("@trimblemaps/trimblemaps-js", "Geocoder")
  @js.native
  val ^ : js.Any = js.native
  
  inline def geocode(geocodeOptions: typings.trimblemapsTrimblemapsJs.anon.Address): Cancelable = ^.asInstanceOf[js.Dynamic].applyDynamic("geocode")(geocodeOptions.asInstanceOf[js.Any]).asInstanceOf[Cancelable]
  
  inline def reverseGeocode(reverseGeocodeOptions: Dataset): Cancelable = ^.asInstanceOf[js.Dynamic].applyDynamic("reverseGeocode")(reverseGeocodeOptions.asInstanceOf[js.Any]).asInstanceOf[Cancelable]
}
