package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    WebRTC Video Settings (aka Constraints)
  */
trait VideoSettings extends StObject {
  
  /**
    * The exact aspect ratio (width in pixels divided by height in pixels, represented as a double rounded to the tenth decimal place) or aspect ratio range
    */
  var aspectRatio: js.UndefOr[Double | js.Any] = js.undefined
  
  /**
    * The origin-unique identifier for the source of the MediaStreamTrack
    */
  var deviceId: js.UndefOr[String] = js.undefined
  
  /**
    * This string (or each string, when a list) should be one of the members of VideoFacingModeEnum
    */
  var facingMode: js.UndefOr[String | js.Any] = js.undefined
  
  /**
    * The exact frame rate (frames per second) or frame rate range
    */
  var frameRate: js.UndefOr[Double | js.Any] = js.undefined
  
  /**
    * The origin-unique group identifier for the source of the MediaStreamTrack. Two devices have the same group identifier if they belong to the same physical device
    */
  var groupId: js.UndefOr[String] = js.undefined
  
  /**
    * The height or height range, in pixels
    */
  var height: js.UndefOr[Double | js.Any] = js.undefined
  
  /**
    *    Mandatory constraints object
    */
  var mandatory: js.UndefOr[js.Object] = js.undefined
  
  /**
    *    Optional constraints object
    */
  var optional: js.UndefOr[js.Object] = js.undefined
  
  /**
    * The width or width range, in pixels
    */
  var width: js.UndefOr[Double | js.Any] = js.undefined
}
object VideoSettings {
  
  @scala.inline
  def apply(): VideoSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoSettings]
  }
  
  @scala.inline
  implicit class VideoSettingsMutableBuilder[Self <: VideoSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAspectRatio(value: Double | js.Any): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    @scala.inline
    def setFacingMode(value: String | js.Any): Self = StObject.set(x, "facingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacingModeUndefined: Self = StObject.set(x, "facingMode", js.undefined)
    
    @scala.inline
    def setFrameRate(value: Double | js.Any): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameRateUndefined: Self = StObject.set(x, "frameRate", js.undefined)
    
    @scala.inline
    def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | js.Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setMandatory(value: js.Object): Self = StObject.set(x, "mandatory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMandatoryUndefined: Self = StObject.set(x, "mandatory", js.undefined)
    
    @scala.inline
    def setOptional(value: js.Object): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | js.Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
