package typings.wixUiCore

import typings.std.Map
import typings.std.MessageEvent
import typings.wixUiCore.focusableFocusableHOCDriverMod.global.Window
import typings.wixUiCore.iframesManagerMod.IframesManager
import typings.wixUiCore.typesMod.Address
import typings.wixUiCore.typesMod.Geocode
import typings.wixUiCore.typesMod.MapsClient
import typings.wixUiCore.typesMod.PlaceDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object googleMapsIframeClientMod {
  
  @JSImport("wix-ui-core/dist/src/clients/GoogleMaps/GoogleMapsIframeClient", "GoogleMapsIframeClient")
  @js.native
  class GoogleMapsIframeClient ()
    extends StObject
       with MapsClient {
    
    var _iframesManager: IframesManager = js.native
    
    var _promisesMap: Map[js.Any, js.Any] = js.native
    
    var _useClientId: Boolean = js.native
    
    /* CompleteClass */
    override def autocomplete(apiKey: String, lang: String, request: js.Any): js.Promise[js.Array[Address]] = js.native
    def autocomplete(key: String, lang: String, request: String): js.Promise[js.Any] = js.native
    
    /* CompleteClass */
    override def geocode(apiKey: String, lang: String, request: js.Any): js.Promise[js.Array[Geocode]] = js.native
    def geocode(key: String, lang: String, request: String): js.Promise[js.Any] = js.native
    
    def getOrAddIframe(key: String, lang: String): Window = js.native
    
    def handleMessage(event: MessageEvent[js.Any]): Unit = js.native
    
    /* CompleteClass */
    override def placeDetails(apiKey: String, lang: String, request: js.Any): js.Promise[PlaceDetails] = js.native
    def placeDetails(key: String, lang: String, request: String): js.Promise[js.Any] = js.native
    
    /* CompleteClass */
    override def useClientId(): Unit = js.native
  }
}
