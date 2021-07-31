package typings.wixUiCore

import typings.std.HTMLIFrameElement
import typings.wixUiCore.anon.ApiKey
import typings.wixUiCore.anon.ClientId
import typings.wixUiCore.focusableFocusableHOCDriverMod.global.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object googleMapsIframesManagerIframesManagerMod {
  
  @JSImport("wix-ui-core/src/clients/GoogleMaps/IframesManager/IframesManager", "IframesManager")
  @js.native
  class IframesManager () extends StObject {
    
    val _iframeMap: js.Any = js.native
    
    def addIframe(hasApiKeyLangClientId: ApiKey): Window = js.native
    
    var createGoogleMapsScript: js.Any = js.native
    
    var createInitializationScript: js.Any = js.native
    
    def getIframe(key: String, lang: String): Window = js.native
    
    def hasIframe(key: String, lang: String): Boolean = js.native
    
    def populateIframe(iframe: HTMLIFrameElement, apiKey: String, lang: String, clientId: String): Unit = js.native
    
    def removeAllIframes(): Unit = js.native
  }
  /* static members */
  object IframesManager {
    
    @JSImport("wix-ui-core/src/clients/GoogleMaps/IframesManager/IframesManager", "IframesManager")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def generateUrl(hasApiKeyClientIdLang: ClientId): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateUrl")(hasApiKeyClientIdLang.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("wix-ui-core/src/clients/GoogleMaps/IframesManager/IframesManager", "IframesManager.getKey")
    @js.native
    def getKey: js.Any = js.native
    @scala.inline
    def getKey_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getKey")(x.asInstanceOf[js.Any])
  }
}
