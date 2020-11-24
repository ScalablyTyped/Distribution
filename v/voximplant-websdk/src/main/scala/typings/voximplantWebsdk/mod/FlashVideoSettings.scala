package typings.voximplantWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Flash Video Settings
  */
@js.native
trait FlashVideoSettings extends js.Object {
  
  /**
    *    The maximum amount of bandwidth the current outgoing video feed can use, in bytes
    */
  var bandwidth: js.UndefOr[Double] = js.native
  
  /**
    *    The maximum rate at which the camera can capture data, in frames per second
    */
  var fps: js.UndefOr[Double] = js.native
  
  /**
    *    Height in pixels (should be set together with width)
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    *    Keyframe interval (seconds)
    */
  var keyframeInterval: js.UndefOr[Double] = js.native
  
  /**
    *    H.264 video codec level
    */
  var level: js.UndefOr[String] = js.native
  
  /**
    *    H.264 video codec profile
    */
  var profile: js.UndefOr[String] = js.native
  
  /**
    *    The required level of picture quality, as determined by the amount of compression being applied to each video frame. Acceptable quality values range from 1 (lowest quality, maximum compression) to 100 (highest quality, no compression). The default value is 0, which means that picture quality can vary as needed to avoid exceeding available bandwidth
    */
  var quality: js.UndefOr[Double] = js.native
  
  /**
    *    Width in pixels (should be set together with height)
    */
  var width: js.UndefOr[Double] = js.native
}
object FlashVideoSettings {
  
  @scala.inline
  def apply(): FlashVideoSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlashVideoSettings]
  }
  
  @scala.inline
  implicit class FlashVideoSettingsOps[Self <: FlashVideoSettings] (val x: Self) extends AnyVal {
    
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
    def setBandwidth(value: Double): Self = this.set("bandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBandwidth: Self = this.set("bandwidth", js.undefined)
    
    @scala.inline
    def setFps(value: Double): Self = this.set("fps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFps: Self = this.set("fps", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setKeyframeInterval(value: Double): Self = this.set("keyframeInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyframeInterval: Self = this.set("keyframeInterval", js.undefined)
    
    @scala.inline
    def setLevel(value: String): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setProfile(value: String): Self = this.set("profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
    
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
