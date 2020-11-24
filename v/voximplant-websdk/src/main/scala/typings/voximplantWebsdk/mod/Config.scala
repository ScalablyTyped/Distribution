package typings.voximplantWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    VoxImplant SDK Configuration
  */
@js.native
trait Config extends js.Object {
  
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
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setImXSSprotection(value: Boolean): Self = this.set("imXSSprotection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImXSSprotection: Self = this.set("imXSSprotection", js.undefined)
    
    @scala.inline
    def setMicRequired(value: Boolean): Self = this.set("micRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMicRequired: Self = this.set("micRequired", js.undefined)
    
    @scala.inline
    def setProgressTone(value: Boolean): Self = this.set("progressTone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressTone: Self = this.set("progressTone", js.undefined)
    
    @scala.inline
    def setProgressToneCountry(value: String): Self = this.set("progressToneCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressToneCountry: Self = this.set("progressToneCountry", js.undefined)
    
    @scala.inline
    def setShowDebugInfo(value: Boolean): Self = this.set("showDebugInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDebugInfo: Self = this.set("showDebugInfo", js.undefined)
    
    @scala.inline
    def setShowFlashSettings(value: Boolean): Self = this.set("showFlashSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFlashSettings: Self = this.set("showFlashSettings", js.undefined)
    
    @scala.inline
    def setSwfContainer(value: String): Self = this.set("swfContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwfContainer: Self = this.set("swfContainer", js.undefined)
    
    @scala.inline
    def setUseFlashOnly(value: Boolean): Self = this.set("useFlashOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseFlashOnly: Self = this.set("useFlashOnly", js.undefined)
    
    @scala.inline
    def setUseRTCOnly(value: Boolean): Self = this.set("useRTCOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseRTCOnly: Self = this.set("useRTCOnly", js.undefined)
    
    @scala.inline
    def setVideoConstraints(value: VideoSettings | Boolean): Self = this.set("videoConstraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoConstraints: Self = this.set("videoConstraints", js.undefined)
    
    @scala.inline
    def setVideoSupport(value: Boolean): Self = this.set("videoSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoSupport: Self = this.set("videoSupport", js.undefined)
  }
}
