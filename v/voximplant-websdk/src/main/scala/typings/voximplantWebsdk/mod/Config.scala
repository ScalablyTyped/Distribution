package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    VoxImplant SDK Configuration
  */
@js.native
trait Config extends StObject {
  
  /**
    *    XSS protection for inbound instant messages that can contain HTML content
    */
  var imXSSprotection: js.UndefOr[Boolean] = js.native
  
  /**
    *    If set to true microphone access dialog will be shown and all functions will become available only after user allowed access
    */
  var micRequired: js.UndefOr[Boolean] = js.native
  
  /**
    *    Automatically plays progress tone by means of SDK according to specified progressToneCountry
    */
  var progressTone: js.UndefOr[Boolean] = js.native
  
  /**
    *    Country code for progress tone generated automatically if progressTone set to true
    */
  var progressToneCountry: js.UndefOr[String] = js.native
  
  /**
    *    Show debug info in console
    */
  var showDebugInfo: js.UndefOr[Boolean] = js.native
  
  /**
    *    Show Flash Settings panel instead of standard Allow/Deny dialog (in Flash mode)
    */
  var showFlashSettings: js.UndefOr[Boolean] = js.native
  
  /**
    *    Id of HTMLElement that will be used as container for Flash component of SDK (Mic/cam access dialog will appear in the container). If micRequired set to true element should have size not less than 215x138 (px) for access dialog to be shown
    */
  var swfContainer: js.UndefOr[String] = js.native
  
  /**
    *    Force VoxImplant to use Flash (WebRTC is used if available by default)
    */
  var useFlashOnly: js.UndefOr[Boolean] = js.native
  
  /**
    *    Force VoxImplant to use WebRTC (WebRTC is used if available by default). Error will be thrown if WebRTC in unavailable
    */
  var useRTCOnly: js.UndefOr[Boolean] = js.native
  
  /**
    *    Default constraints that will be applied while the next attachRecordingDevice function call or if micRequired set to true
    */
  var videoConstraints: js.UndefOr[VideoSettings | Boolean] = js.native
  
  /**
    *    Video support
    */
  var videoSupport: js.UndefOr[Boolean] = js.native
}
object Config {
  
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImXSSprotection(value: Boolean): Self = StObject.set(x, "imXSSprotection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImXSSprotectionUndefined: Self = StObject.set(x, "imXSSprotection", js.undefined)
    
    @scala.inline
    def setMicRequired(value: Boolean): Self = StObject.set(x, "micRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMicRequiredUndefined: Self = StObject.set(x, "micRequired", js.undefined)
    
    @scala.inline
    def setProgressTone(value: Boolean): Self = StObject.set(x, "progressTone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressToneCountry(value: String): Self = StObject.set(x, "progressToneCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressToneCountryUndefined: Self = StObject.set(x, "progressToneCountry", js.undefined)
    
    @scala.inline
    def setProgressToneUndefined: Self = StObject.set(x, "progressTone", js.undefined)
    
    @scala.inline
    def setShowDebugInfo(value: Boolean): Self = StObject.set(x, "showDebugInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDebugInfoUndefined: Self = StObject.set(x, "showDebugInfo", js.undefined)
    
    @scala.inline
    def setShowFlashSettings(value: Boolean): Self = StObject.set(x, "showFlashSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFlashSettingsUndefined: Self = StObject.set(x, "showFlashSettings", js.undefined)
    
    @scala.inline
    def setSwfContainer(value: String): Self = StObject.set(x, "swfContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwfContainerUndefined: Self = StObject.set(x, "swfContainer", js.undefined)
    
    @scala.inline
    def setUseFlashOnly(value: Boolean): Self = StObject.set(x, "useFlashOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseFlashOnlyUndefined: Self = StObject.set(x, "useFlashOnly", js.undefined)
    
    @scala.inline
    def setUseRTCOnly(value: Boolean): Self = StObject.set(x, "useRTCOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseRTCOnlyUndefined: Self = StObject.set(x, "useRTCOnly", js.undefined)
    
    @scala.inline
    def setVideoConstraints(value: VideoSettings | Boolean): Self = StObject.set(x, "videoConstraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoConstraintsUndefined: Self = StObject.set(x, "videoConstraints", js.undefined)
    
    @scala.inline
    def setVideoSupport(value: Boolean): Self = StObject.set(x, "videoSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoSupportUndefined: Self = StObject.set(x, "videoSupport", js.undefined)
  }
}
