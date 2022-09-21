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
  var aspectRatio: js.UndefOr[Double | Any] = js.undefined
  
  /**
    * The origin-unique identifier for the source of the MediaStreamTrack
    */
  var deviceId: js.UndefOr[String] = js.undefined
  
  /**
    * This string (or each string, when a list) should be one of the members of VideoFacingModeEnum
    */
  var facingMode: js.UndefOr[String | Any] = js.undefined
  
  /**
    * The exact frame rate (frames per second) or frame rate range
    */
  var frameRate: js.UndefOr[Double | Any] = js.undefined
  
  /**
    * The origin-unique group identifier for the source of the MediaStreamTrack. Two devices have the same group identifier if they belong to the same physical device
    */
  var groupId: js.UndefOr[String] = js.undefined
  
  /**
    * The height or height range, in pixels
    */
  var height: js.UndefOr[Double | Any] = js.undefined
  
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
  var width: js.UndefOr[Double | Any] = js.undefined
}
object VideoSettings {
  
  inline def apply(): VideoSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoSettings]
  }
  
  extension [Self <: VideoSettings](x: Self) {
    
    inline def setAspectRatio(value: Double | Any): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setFacingMode(value: String | Any): Self = StObject.set(x, "facingMode", value.asInstanceOf[js.Any])
    
    inline def setFacingModeUndefined: Self = StObject.set(x, "facingMode", js.undefined)
    
    inline def setFrameRate(value: Double | Any): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
    
    inline def setFrameRateUndefined: Self = StObject.set(x, "frameRate", js.undefined)
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setHeight(value: Double | Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setMandatory(value: js.Object): Self = StObject.set(x, "mandatory", value.asInstanceOf[js.Any])
    
    inline def setMandatoryUndefined: Self = StObject.set(x, "mandatory", js.undefined)
    
    inline def setOptional(value: js.Object): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    inline def setWidth(value: Double | Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
