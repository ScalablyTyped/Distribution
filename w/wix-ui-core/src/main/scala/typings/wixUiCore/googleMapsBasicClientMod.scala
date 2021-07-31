package typings.wixUiCore

import typings.wixUiCore.typesMod.Address
import typings.wixUiCore.typesMod.Geocode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object googleMapsBasicClientMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped wix-ui-core.wix-ui-core/dist/src/clients/GoogleMaps/types.MapsClient extends any ? std.Pick<wix-ui-core.wix-ui-core/dist/src/clients/GoogleMaps/types.MapsClient, std.Exclude<keyof wix-ui-core.wix-ui-core/dist/src/clients/GoogleMaps/types.MapsClient, 'placeDetails'>> : never */ @JSImport("wix-ui-core/dist/src/clients/GoogleMaps/GoogleMapsBasicClient", "GoogleMapsBasicClient")
  @js.native
  class GoogleMapsBasicClient () extends StObject {
    
    var _autocomplete: js.Any = js.native
    
    var _geocoder: js.Any = js.native
    
    def _initServices(): Unit = js.native
    
    var _loadScriptPromise: js.Any = js.native
    
    var _useClientId: js.Any = js.native
    
    def autocomplete(clientId: String, lang: String, request: js.Any): js.Promise[js.Array[Address]] = js.native
    
    def geocode(clientId: String, lang: String, request: js.Any): js.Promise[js.Array[Geocode]] = js.native
    
    def loadScript(clientId: js.Any, lang: js.Any): js.Any = js.native
    
    def useClientId(): Unit = js.native
  }
}
