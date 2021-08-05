package typings.wixUiCore

import typings.wixUiCore.anon.Reject
import typings.wixUiCore.typesMod.Address
import typings.wixUiCore.typesMod.Geocode
import typings.wixUiCore.typesMod.MapsClient
import typings.wixUiCore.typesMod.PlaceDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object googleMapsClientStubMod {
  
  @JSImport("wix-ui-core/dist/src/components/address-input/GoogleMapsClientStub", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-ui-core/dist/src/components/address-input/GoogleMapsClientStub", "GoogleMapsClientStub")
  @js.native
  class GoogleMapsClientStub ()
    extends StObject
       with MapsClient {
    
    def autocomplete(apiKey: String, lang: String, request: String): js.Promise[js.Array[Address]] = js.native
    /* CompleteClass */
    override def autocomplete(apiKey: String, lang: String, request: js.Any): js.Promise[js.Array[Address]] = js.native
    
    def geocode(apiKey: String, lang: String, request: String): js.Promise[js.Array[Geocode]] = js.native
    /* CompleteClass */
    override def geocode(apiKey: String, lang: String, request: js.Any): js.Promise[js.Array[Geocode]] = js.native
    
    def placeDetails(apiKey: String, lang: String, request: String): js.Promise[PlaceDetails] = js.native
    /* CompleteClass */
    override def placeDetails(apiKey: String, lang: String, request: js.Any): js.Promise[PlaceDetails] = js.native
    
    /* CompleteClass */
    override def useClientId(): Unit = js.native
  }
  /* static members */
  object GoogleMapsClientStub {
    
    @JSImport("wix-ui-core/dist/src/components/address-input/GoogleMapsClientStub", "GoogleMapsClientStub")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/src/components/address-input/GoogleMapsClientStub", "GoogleMapsClientStub.addresses")
    @js.native
    def addresses: js.Array[Address] = js.native
    
    @JSImport("wix-ui-core/dist/src/components/address-input/GoogleMapsClientStub", "GoogleMapsClientStub.addressesDelay")
    @js.native
    def addressesDelay: Double = js.native
    inline def addressesDelay_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addressesDelay")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/src/components/address-input/GoogleMapsClientStub", "GoogleMapsClientStub.addressesPromise")
    @js.native
    def addressesPromise: js.Promise[js.Any] = js.native
    inline def addressesPromise_=(x: js.Promise[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addressesPromise")(x.asInstanceOf[js.Any])
    
    inline def addresses_=(x: js.Array[Address]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addresses")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/src/components/address-input/GoogleMapsClientStub", "GoogleMapsClientStub.geocode")
    @js.native
    def geocode: js.Array[Geocode] = js.native
    
    @JSImport("wix-ui-core/dist/src/components/address-input/GoogleMapsClientStub", "GoogleMapsClientStub.geocodeDelay")
    @js.native
    def geocodeDelay: Double = js.native
    inline def geocodeDelay_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("geocodeDelay")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/src/components/address-input/GoogleMapsClientStub", "GoogleMapsClientStub.geocodePromise")
    @js.native
    def geocodePromise: js.Promise[js.Any] = js.native
    inline def geocodePromise_=(x: js.Promise[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("geocodePromise")(x.asInstanceOf[js.Any])
    
    inline def geocode_=(x: js.Array[Geocode]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("geocode")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/src/components/address-input/GoogleMapsClientStub", "GoogleMapsClientStub.placeDetails")
    @js.native
    def placeDetails: PlaceDetails = js.native
    
    @JSImport("wix-ui-core/dist/src/components/address-input/GoogleMapsClientStub", "GoogleMapsClientStub.placeDetailsDelay")
    @js.native
    def placeDetailsDelay: Double = js.native
    inline def placeDetailsDelay_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placeDetailsDelay")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/src/components/address-input/GoogleMapsClientStub", "GoogleMapsClientStub.placeDetailsPromise")
    @js.native
    def placeDetailsPromise: js.Promise[js.Any] = js.native
    inline def placeDetailsPromise_=(x: js.Promise[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placeDetailsPromise")(x.asInstanceOf[js.Any])
    
    inline def placeDetails_=(x: PlaceDetails): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placeDetails")(x.asInstanceOf[js.Any])
    
    inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
    
    inline def setAddresses(addresses: js.Array[Address]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAddresses")(addresses.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setAddresses(addresses: js.Array[Address], addressesDelay: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAddresses")(addresses.asInstanceOf[js.Any], addressesDelay.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setAddressesPromise(addresses: js.Array[Address]): Reject = ^.asInstanceOf[js.Dynamic].applyDynamic("setAddressesPromise")(addresses.asInstanceOf[js.Any]).asInstanceOf[Reject]
    
    inline def setGeocode(geocode: Geocode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGeocode")(geocode.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setGeocode(geocode: Geocode, geocodeDelay: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setGeocode")(geocode.asInstanceOf[js.Any], geocodeDelay.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setGeocodePromise(geocode: Geocode): Reject = ^.asInstanceOf[js.Dynamic].applyDynamic("setGeocodePromise")(geocode.asInstanceOf[js.Any]).asInstanceOf[Reject]
    
    inline def setPlaceDetails(placeDetails: PlaceDetails): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPlaceDetails")(placeDetails.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setPlaceDetails(placeDetails: PlaceDetails, placeDetailsDelay: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPlaceDetails")(placeDetails.asInstanceOf[js.Any], placeDetailsDelay.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setPlaceDetailsPromise(placeDetails: PlaceDetails): Reject = ^.asInstanceOf[js.Dynamic].applyDynamic("setPlaceDetailsPromise")(placeDetails.asInstanceOf[js.Any]).asInstanceOf[Reject]
  }
  
  inline def createAddress(description: String): Address = ^.asInstanceOf[js.Dynamic].applyDynamic("createAddress")(description.asInstanceOf[js.Any]).asInstanceOf[Address]
  inline def createAddress(description: String, types: js.Array[String]): Address = (^.asInstanceOf[js.Dynamic].applyDynamic("createAddress")(description.asInstanceOf[js.Any], types.asInstanceOf[js.Any])).asInstanceOf[Address]
  
  inline def createGeocode(placeId: String, formattedAddress: String): Geocode = (^.asInstanceOf[js.Dynamic].applyDynamic("createGeocode")(placeId.asInstanceOf[js.Any], formattedAddress.asInstanceOf[js.Any])).asInstanceOf[Geocode]
  
  inline def createPlaceDetails(placeId: String, formattedAddress: String): PlaceDetails = (^.asInstanceOf[js.Dynamic].applyDynamic("createPlaceDetails")(placeId.asInstanceOf[js.Any], formattedAddress.asInstanceOf[js.Any])).asInstanceOf[PlaceDetails]
}
