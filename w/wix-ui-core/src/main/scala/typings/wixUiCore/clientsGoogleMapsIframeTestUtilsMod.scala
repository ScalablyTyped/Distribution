package typings.wixUiCore

import typings.std.HTMLIFrameElement
import typings.std.NodeListOf
import typings.wixUiCore.anon.Maps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientsGoogleMapsIframeTestUtilsMod {
  
  @JSImport("wix-ui-core/src/clients/GoogleMaps/IframeTestUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-ui-core/src/clients/GoogleMaps/IframeTestUtils", "EventEmitterMock")
  @js.native
  class EventEmitterMock () extends StObject {
    
    def addEventListener(eventName: js.Any, callback: js.Any): Unit = js.native
    
    var eventListeners: js.Array[js.Any] = js.native
    
    def triggerMessage(event: js.Any): Unit = js.native
  }
  
  inline def GoogleMapsMock(): Maps = ^.asInstanceOf[js.Dynamic].applyDynamic("GoogleMapsMock")().asInstanceOf[Maps]
  inline def GoogleMapsMock(autocompleteInstance: js.Any): Maps = ^.asInstanceOf[js.Dynamic].applyDynamic("GoogleMapsMock")(autocompleteInstance.asInstanceOf[js.Any]).asInstanceOf[Maps]
  inline def GoogleMapsMock(autocompleteInstance: js.Any, geocoderInstance: js.Any): Maps = (^.asInstanceOf[js.Dynamic].applyDynamic("GoogleMapsMock")(autocompleteInstance.asInstanceOf[js.Any], geocoderInstance.asInstanceOf[js.Any])).asInstanceOf[Maps]
  inline def GoogleMapsMock(autocompleteInstance: js.Any, geocoderInstance: js.Any, placesServiceInstance: js.Any): Maps = (^.asInstanceOf[js.Dynamic].applyDynamic("GoogleMapsMock")(autocompleteInstance.asInstanceOf[js.Any], geocoderInstance.asInstanceOf[js.Any], placesServiceInstance.asInstanceOf[js.Any])).asInstanceOf[Maps]
  inline def GoogleMapsMock(autocompleteInstance: js.Any, geocoderInstance: Unit, placesServiceInstance: js.Any): Maps = (^.asInstanceOf[js.Dynamic].applyDynamic("GoogleMapsMock")(autocompleteInstance.asInstanceOf[js.Any], geocoderInstance.asInstanceOf[js.Any], placesServiceInstance.asInstanceOf[js.Any])).asInstanceOf[Maps]
  inline def GoogleMapsMock(autocompleteInstance: Unit, geocoderInstance: js.Any): Maps = (^.asInstanceOf[js.Dynamic].applyDynamic("GoogleMapsMock")(autocompleteInstance.asInstanceOf[js.Any], geocoderInstance.asInstanceOf[js.Any])).asInstanceOf[Maps]
  inline def GoogleMapsMock(autocompleteInstance: Unit, geocoderInstance: js.Any, placesServiceInstance: js.Any): Maps = (^.asInstanceOf[js.Dynamic].applyDynamic("GoogleMapsMock")(autocompleteInstance.asInstanceOf[js.Any], geocoderInstance.asInstanceOf[js.Any], placesServiceInstance.asInstanceOf[js.Any])).asInstanceOf[Maps]
  inline def GoogleMapsMock(autocompleteInstance: Unit, geocoderInstance: Unit, placesServiceInstance: js.Any): Maps = (^.asInstanceOf[js.Dynamic].applyDynamic("GoogleMapsMock")(autocompleteInstance.asInstanceOf[js.Any], geocoderInstance.asInstanceOf[js.Any], placesServiceInstance.asInstanceOf[js.Any])).asInstanceOf[Maps]
  
  inline def IframesManagerMock(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("IframesManagerMock")().asInstanceOf[Unit]
  
  inline def getIframeWithLangAndApiKey(lang: js.Any, apiKey: js.Any): HTMLIFrameElement = (^.asInstanceOf[js.Dynamic].applyDynamic("getIframeWithLangAndApiKey")(lang.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[HTMLIFrameElement]
  
  inline def getIframes(): NodeListOf[HTMLIFrameElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIframes")().asInstanceOf[NodeListOf[HTMLIFrameElement]]
  
  inline def isIframeVisible(iframe: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIframeVisible")(iframe.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def triggerIframeInitAutocomplete(mockedGoogleInstance: js.Any, lang: js.Any, apiKey: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerIframeInitAutocomplete")(mockedGoogleInstance.asInstanceOf[js.Any], lang.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
