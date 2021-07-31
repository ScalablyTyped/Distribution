package typings.wixUiCore

import typings.wixUiCore.anon.Location
import typings.wixUiCore.anon.Longname
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object google2addressFixturesMod {
  
  object googleResponse {
    
    @JSImport("wix-ui-core/dist/standalone/src/clients/GoogleMaps/google2address/fixtures", "googleResponse")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/standalone/src/clients/GoogleMaps/google2address/fixtures", "googleResponse.address_components")
    @js.native
    def addressComponents: js.Array[Longname] = js.native
    
    @scala.inline
    def addressComponents_=(x: js.Array[Longname]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("address_components")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/standalone/src/clients/GoogleMaps/google2address/fixtures", "googleResponse.formatted_address")
    @js.native
    def formattedAddress: String = js.native
    
    @scala.inline
    def formattedAddress_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatted_address")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/standalone/src/clients/GoogleMaps/google2address/fixtures", "googleResponse.geometry")
    @js.native
    def geometry: Location = js.native
    @scala.inline
    def geometry_=(x: Location): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("geometry")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/standalone/src/clients/GoogleMaps/google2address/fixtures", "googleResponse.place_id")
    @js.native
    def placeId: String = js.native
    
    @scala.inline
    def placeId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("place_id")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/standalone/src/clients/GoogleMaps/google2address/fixtures", "googleResponse.types")
    @js.native
    def types: js.Array[String] = js.native
    @scala.inline
    def types_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("types")(x.asInstanceOf[js.Any])
  }
  
  object partialGoogleResponse {
    
    @JSImport("wix-ui-core/dist/standalone/src/clients/GoogleMaps/google2address/fixtures", "partialGoogleResponse")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/standalone/src/clients/GoogleMaps/google2address/fixtures", "partialGoogleResponse.address_components")
    @js.native
    def addressComponents: js.Array[Longname] = js.native
    
    @scala.inline
    def addressComponents_=(x: js.Array[Longname]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("address_components")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/standalone/src/clients/GoogleMaps/google2address/fixtures", "partialGoogleResponse.formatted_address")
    @js.native
    def formattedAddress: String = js.native
    
    @scala.inline
    def formattedAddress_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatted_address")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/standalone/src/clients/GoogleMaps/google2address/fixtures", "partialGoogleResponse.geometry")
    @js.native
    def geometry: Location = js.native
    @scala.inline
    def geometry_=(x: Location): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("geometry")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/standalone/src/clients/GoogleMaps/google2address/fixtures", "partialGoogleResponse.place_id")
    @js.native
    def placeId: String = js.native
    
    @scala.inline
    def placeId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("place_id")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/standalone/src/clients/GoogleMaps/google2address/fixtures", "partialGoogleResponse.types")
    @js.native
    def types: js.Array[String] = js.native
    @scala.inline
    def types_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("types")(x.asInstanceOf[js.Any])
  }
}
