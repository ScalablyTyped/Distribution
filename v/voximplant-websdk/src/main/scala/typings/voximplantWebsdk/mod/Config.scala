package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    VoxImplant SDK Configuration
  */
trait Config extends StObject {
  
  /**
    *    XSS protection for inbound instant messages that can contain HTML content
    */
  var imXSSprotection: js.UndefOr[Boolean] = js.undefined
  
  /**
    *    If set to true microphone access dialog will be shown and all functions will become available only after user allowed access
    */
  var micRequired: js.UndefOr[Boolean] = js.undefined
  
  /**
    *    Automatically plays progress tone by means of SDK according to specified progressToneCountry
    */
  var progressTone: js.UndefOr[Boolean] = js.undefined
  
  /**
    *    Country code for progress tone generated automatically if progressTone set to true
    */
  var progressToneCountry: js.UndefOr[String] = js.undefined
  
  /**
    *    Show debug info in console
    */
  var showDebugInfo: js.UndefOr[Boolean] = js.undefined
  
  /**
    *    Show Flash Settings panel instead of standard Allow/Deny dialog (in Flash mode)
    */
  var showFlashSettings: js.UndefOr[Boolean] = js.undefined
  
  /**
    *    Id of HTMLElement that will be used as container for Flash component of SDK (Mic/cam access dialog will appear in the container). If micRequired set to true element should have size not less than 215x138 (px) for access dialog to be shown
    */
  var swfContainer: js.UndefOr[String] = js.undefined
  
  /**
    *    Force VoxImplant to use Flash (WebRTC is used if available by default)
    */
  var useFlashOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    *    Force VoxImplant to use WebRTC (WebRTC is used if available by default). Error will be thrown if WebRTC in unavailable
    */
  var useRTCOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    *    Default constraints that will be applied while the next attachRecordingDevice function call or if micRequired set to true
    */
  var videoConstraints: js.UndefOr[VideoSettings | Boolean] = js.undefined
  
  /**
    *    Video support
    */
  var videoSupport: js.UndefOr[Boolean] = js.undefined
}
object Config {
  
  inline def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  
  extension [Self <: Config](x: Self) {
    
    inline def setImXSSprotection(value: Boolean): Self = StObject.set(x, "imXSSprotection", value.asInstanceOf[js.Any])
    
    inline def setImXSSprotectionUndefined: Self = StObject.set(x, "imXSSprotection", js.undefined)
    
    inline def setMicRequired(value: Boolean): Self = StObject.set(x, "micRequired", value.asInstanceOf[js.Any])
    
    inline def setMicRequiredUndefined: Self = StObject.set(x, "micRequired", js.undefined)
    
    inline def setProgressTone(value: Boolean): Self = StObject.set(x, "progressTone", value.asInstanceOf[js.Any])
    
    inline def setProgressToneCountry(value: String): Self = StObject.set(x, "progressToneCountry", value.asInstanceOf[js.Any])
    
    inline def setProgressToneCountryUndefined: Self = StObject.set(x, "progressToneCountry", js.undefined)
    
    inline def setProgressToneUndefined: Self = StObject.set(x, "progressTone", js.undefined)
    
    inline def setShowDebugInfo(value: Boolean): Self = StObject.set(x, "showDebugInfo", value.asInstanceOf[js.Any])
    
    inline def setShowDebugInfoUndefined: Self = StObject.set(x, "showDebugInfo", js.undefined)
    
    inline def setShowFlashSettings(value: Boolean): Self = StObject.set(x, "showFlashSettings", value.asInstanceOf[js.Any])
    
    inline def setShowFlashSettingsUndefined: Self = StObject.set(x, "showFlashSettings", js.undefined)
    
    inline def setSwfContainer(value: String): Self = StObject.set(x, "swfContainer", value.asInstanceOf[js.Any])
    
    inline def setSwfContainerUndefined: Self = StObject.set(x, "swfContainer", js.undefined)
    
    inline def setUseFlashOnly(value: Boolean): Self = StObject.set(x, "useFlashOnly", value.asInstanceOf[js.Any])
    
    inline def setUseFlashOnlyUndefined: Self = StObject.set(x, "useFlashOnly", js.undefined)
    
    inline def setUseRTCOnly(value: Boolean): Self = StObject.set(x, "useRTCOnly", value.asInstanceOf[js.Any])
    
    inline def setUseRTCOnlyUndefined: Self = StObject.set(x, "useRTCOnly", js.undefined)
    
    inline def setVideoConstraints(value: VideoSettings | Boolean): Self = StObject.set(x, "videoConstraints", value.asInstanceOf[js.Any])
    
    inline def setVideoConstraintsUndefined: Self = StObject.set(x, "videoConstraints", js.undefined)
    
    inline def setVideoSupport(value: Boolean): Self = StObject.set(x, "videoSupport", value.asInstanceOf[js.Any])
    
    inline def setVideoSupportUndefined: Self = StObject.set(x, "videoSupport", js.undefined)
  }
}
