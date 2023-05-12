package typings.thunderbirdWebextBrowser.global.browser

import typings.thunderbirdWebextBrowser.browser.types.Setting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object privacy {
  
  object network {
    
    @JSGlobal("browser.privacy.network.globalPrivacyControl")
    @js.native
    val globalPrivacyControl: Setting = js.native
    
    @JSGlobal("browser.privacy.network.httpsOnlyMode")
    @js.native
    val httpsOnlyMode: Setting = js.native
    
    @JSGlobal("browser.privacy.network.networkPredictionEnabled")
    @js.native
    val networkPredictionEnabled: Setting = js.native
    
    @JSGlobal("browser.privacy.network.peerConnectionEnabled")
    @js.native
    val peerConnectionEnabled: Setting = js.native
    
    @JSGlobal("browser.privacy.network.tlsVersionRestriction")
    @js.native
    val tlsVersionRestriction: Setting = js.native
    
    @JSGlobal("browser.privacy.network.webRTCIPHandlingPolicy")
    @js.native
    val webRTCIPHandlingPolicy: Setting = js.native
  }
  
  object services {
    
    @JSGlobal("browser.privacy.services.passwordSavingEnabled")
    @js.native
    val passwordSavingEnabled: Setting = js.native
  }
  
  object websites {
    
    @JSGlobal("browser.privacy.websites.cookieConfig")
    @js.native
    val cookieConfig: Setting = js.native
    
    @JSGlobal("browser.privacy.websites.firstPartyIsolate")
    @js.native
    val firstPartyIsolate: Setting = js.native
    
    @JSGlobal("browser.privacy.websites.hyperlinkAuditingEnabled")
    @js.native
    val hyperlinkAuditingEnabled: Setting = js.native
    
    @JSGlobal("browser.privacy.websites.protectedContentEnabled")
    @js.native
    val protectedContentEnabled: js.UndefOr[Setting] = js.native
    
    @JSGlobal("browser.privacy.websites.referrersEnabled")
    @js.native
    val referrersEnabled: Setting = js.native
    
    @JSGlobal("browser.privacy.websites.resistFingerprinting")
    @js.native
    val resistFingerprinting: Setting = js.native
    
    @JSGlobal("browser.privacy.websites.thirdPartyCookiesAllowed")
    @js.native
    val thirdPartyCookiesAllowed: js.UndefOr[Setting] = js.native
    
    @JSGlobal("browser.privacy.websites.trackingProtectionMode")
    @js.native
    val trackingProtectionMode: Setting = js.native
  }
}
