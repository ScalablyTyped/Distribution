package typings.thunderbirdWebextBrowser.global.messenger

import typings.thunderbirdWebextBrowser.messenger.types.Setting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object privacy {
  
  object network {
    
    @JSGlobal("messenger.privacy.network.globalPrivacyControl")
    @js.native
    val globalPrivacyControl: Setting = js.native
    
    @JSGlobal("messenger.privacy.network.httpsOnlyMode")
    @js.native
    val httpsOnlyMode: Setting = js.native
    
    @JSGlobal("messenger.privacy.network.networkPredictionEnabled")
    @js.native
    val networkPredictionEnabled: Setting = js.native
    
    @JSGlobal("messenger.privacy.network.peerConnectionEnabled")
    @js.native
    val peerConnectionEnabled: Setting = js.native
    
    @JSGlobal("messenger.privacy.network.tlsVersionRestriction")
    @js.native
    val tlsVersionRestriction: Setting = js.native
    
    @JSGlobal("messenger.privacy.network.webRTCIPHandlingPolicy")
    @js.native
    val webRTCIPHandlingPolicy: Setting = js.native
  }
  
  object services {
    
    @JSGlobal("messenger.privacy.services.passwordSavingEnabled")
    @js.native
    val passwordSavingEnabled: Setting = js.native
  }
  
  object websites {
    
    @JSGlobal("messenger.privacy.websites.cookieConfig")
    @js.native
    val cookieConfig: Setting = js.native
    
    @JSGlobal("messenger.privacy.websites.firstPartyIsolate")
    @js.native
    val firstPartyIsolate: Setting = js.native
    
    @JSGlobal("messenger.privacy.websites.hyperlinkAuditingEnabled")
    @js.native
    val hyperlinkAuditingEnabled: Setting = js.native
    
    @JSGlobal("messenger.privacy.websites.protectedContentEnabled")
    @js.native
    val protectedContentEnabled: js.UndefOr[Setting] = js.native
    
    @JSGlobal("messenger.privacy.websites.referrersEnabled")
    @js.native
    val referrersEnabled: Setting = js.native
    
    @JSGlobal("messenger.privacy.websites.resistFingerprinting")
    @js.native
    val resistFingerprinting: Setting = js.native
    
    @JSGlobal("messenger.privacy.websites.thirdPartyCookiesAllowed")
    @js.native
    val thirdPartyCookiesAllowed: js.UndefOr[Setting] = js.native
    
    @JSGlobal("messenger.privacy.websites.trackingProtectionMode")
    @js.native
    val trackingProtectionMode: Setting = js.native
  }
}
