package typings.wixUiCore

import typings.wixUiCore.clientsGoogleMapsTypesMod.Address
import typings.wixUiCore.clientsGoogleMapsTypesMod.Geocode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientsGoogleMapsGoogleMapsBasicClientMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped wix-ui-core.wix-ui-core/src/clients/GoogleMaps/types.MapsClient extends any ? std.Pick<wix-ui-core.wix-ui-core/src/clients/GoogleMaps/types.MapsClient, std.Exclude<keyof wix-ui-core.wix-ui-core/src/clients/GoogleMaps/types.MapsClient, 'placeDetails'>> : never */ @JSImport("wix-ui-core/src/clients/GoogleMaps/GoogleMapsBasicClient", "GoogleMapsBasicClient")
  @js.native
  class GoogleMapsBasicClient () extends StObject {
    
    /* private */ var _autocomplete: js.Any = js.native
    
    /* private */ var _geocoder: js.Any = js.native
    
    def _initServices(): Unit = js.native
    
    /* private */ var _loadScriptPromise: js.Any = js.native
    
    /* private */ var _useClientId: js.Any = js.native
    
    def autocomplete(clientId: String, lang: String, request: js.Any): js.Promise[js.Array[Address]] = js.native
    
    def geocode(clientId: String, lang: String, request: js.Any): js.Promise[js.Array[Geocode]] = js.native
    
    def loadScript(clientId: js.Any, lang: js.Any): js.Any = js.native
    
    def useClientId(): Unit = js.native
  }
}
