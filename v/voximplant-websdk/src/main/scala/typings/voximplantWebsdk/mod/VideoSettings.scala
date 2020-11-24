package typings.voximplantWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    WebRTC Video Settings (aka Constraints)
  */
@js.native
trait VideoSettings extends js.Object {
  
  /**
    * The exact aspect ratio (width in pixels divided by height in pixels, represented as a double rounded to the tenth decimal place) or aspect ratio range
    */
  var aspectRatio: js.UndefOr[Double | js.Any] = js.native
  
  /**
    * The origin-unique identifier for the source of the MediaStreamTrack
    */
  var deviceId: js.UndefOr[String] = js.native
  
  /**
    * This string (or each string, when a list) should be one of the members of VideoFacingModeEnum
    */
  var facingMode: js.UndefOr[String | js.Any] = js.native
  
  /**
    * The exact frame rate (frames per second) or frame rate range
    */
  var frameRate: js.UndefOr[Double | js.Any] = js.native
  
  /**
    * The origin-unique group identifier for the source of the MediaStreamTrack. Two devices have the same group identifier if they belong to the same physical device
    */
  var groupId: js.UndefOr[String] = js.native
  
  /**
    * The height or height range, in pixels
    */
  var height: js.UndefOr[Double | js.Any] = js.native
  
  /**
    *    Mandatory constraints object
    */
  var mandatory: js.UndefOr[js.Object] = js.native
  
  /**
    *    Optional constraints object
    */
  var optional: js.UndefOr[js.Object] = js.native
  
  /**
    * The width or width range, in pixels
    */
  var width: js.UndefOr[Double | js.Any] = js.native
}
object VideoSettings {
  
  @scala.inline
  def apply(): VideoSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoSettings]
  }
  
  @scala.inline
  implicit class VideoSettingsOps[Self <: VideoSettings] (val x: Self) extends AnyVal {
    
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
    def setAspectRatio(value: Double | js.Any): Self = this.set("aspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAspectRatio: Self = this.set("aspectRatio", js.undefined)
    
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceId: Self = this.set("deviceId", js.undefined)
    
    @scala.inline
    def setFacingMode(value: String | js.Any): Self = this.set("facingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacingMode: Self = this.set("facingMode", js.undefined)
    
    @scala.inline
    def setFrameRate(value: Double | js.Any): Self = this.set("frameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameRate: Self = this.set("frameRate", js.undefined)
    
    @scala.inline
    def setGroupId(value: String): Self = this.set("groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupId: Self = this.set("groupId", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | js.Any): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setMandatory(value: js.Object): Self = this.set("mandatory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMandatory: Self = this.set("mandatory", js.undefined)
    
    @scala.inline
    def setOptional(value: js.Object): Self = this.set("optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptional: Self = this.set("optional", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | js.Any): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
