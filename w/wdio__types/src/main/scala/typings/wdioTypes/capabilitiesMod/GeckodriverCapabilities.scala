package typings.wdioTypes.capabilitiesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeckodriverCapabilities extends StObject {
  
  var addCustomRequestHeaders: js.UndefOr[Boolean] = js.undefined
  
  var captureNetworkTraffic: js.UndefOr[Boolean] = js.undefined
  
  var changeMaxConnections: js.UndefOr[Boolean] = js.undefined
  
  var firefoxProfileTemplate: js.UndefOr[String] = js.undefined
  
  var firefox_binary: js.UndefOr[String] = js.undefined
  
  var pageLoadingStrategy: js.UndefOr[String] = js.undefined
  
  var profile: js.UndefOr[String] = js.undefined
  
  var trustAllSSLCertificates: js.UndefOr[Boolean] = js.undefined
}
object GeckodriverCapabilities {
  
  inline def apply(): GeckodriverCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeckodriverCapabilities]
  }
  
  extension [Self <: GeckodriverCapabilities](x: Self) {
    
    inline def setAddCustomRequestHeaders(value: Boolean): Self = StObject.set(x, "addCustomRequestHeaders", value.asInstanceOf[js.Any])
    
    inline def setAddCustomRequestHeadersUndefined: Self = StObject.set(x, "addCustomRequestHeaders", js.undefined)
    
    inline def setCaptureNetworkTraffic(value: Boolean): Self = StObject.set(x, "captureNetworkTraffic", value.asInstanceOf[js.Any])
    
    inline def setCaptureNetworkTrafficUndefined: Self = StObject.set(x, "captureNetworkTraffic", js.undefined)
    
    inline def setChangeMaxConnections(value: Boolean): Self = StObject.set(x, "changeMaxConnections", value.asInstanceOf[js.Any])
    
    inline def setChangeMaxConnectionsUndefined: Self = StObject.set(x, "changeMaxConnections", js.undefined)
    
    inline def setFirefoxProfileTemplate(value: String): Self = StObject.set(x, "firefoxProfileTemplate", value.asInstanceOf[js.Any])
    
    inline def setFirefoxProfileTemplateUndefined: Self = StObject.set(x, "firefoxProfileTemplate", js.undefined)
    
    inline def setFirefox_binary(value: String): Self = StObject.set(x, "firefox_binary", value.asInstanceOf[js.Any])
    
    inline def setFirefox_binaryUndefined: Self = StObject.set(x, "firefox_binary", js.undefined)
    
    inline def setPageLoadingStrategy(value: String): Self = StObject.set(x, "pageLoadingStrategy", value.asInstanceOf[js.Any])
    
    inline def setPageLoadingStrategyUndefined: Self = StObject.set(x, "pageLoadingStrategy", js.undefined)
    
    inline def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setTrustAllSSLCertificates(value: Boolean): Self = StObject.set(x, "trustAllSSLCertificates", value.asInstanceOf[js.Any])
    
    inline def setTrustAllSSLCertificatesUndefined: Self = StObject.set(x, "trustAllSSLCertificates", js.undefined)
  }
}
