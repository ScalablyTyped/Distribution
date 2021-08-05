package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Flash Video Settings
  */
trait FlashVideoSettings extends StObject {
  
  /**
    *    The maximum amount of bandwidth the current outgoing video feed can use, in bytes
    */
  var bandwidth: js.UndefOr[Double] = js.undefined
  
  /**
    *    The maximum rate at which the camera can capture data, in frames per second
    */
  var fps: js.UndefOr[Double] = js.undefined
  
  /**
    *    Height in pixels (should be set together with width)
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    *    Keyframe interval (seconds)
    */
  var keyframeInterval: js.UndefOr[Double] = js.undefined
  
  /**
    *    H.264 video codec level
    */
  var level: js.UndefOr[String] = js.undefined
  
  /**
    *    H.264 video codec profile
    */
  var profile: js.UndefOr[String] = js.undefined
  
  /**
    *    The required level of picture quality, as determined by the amount of compression being applied to each video frame. Acceptable quality values range from 1 (lowest quality, maximum compression) to 100 (highest quality, no compression). The default value is 0, which means that picture quality can vary as needed to avoid exceeding available bandwidth
    */
  var quality: js.UndefOr[Double] = js.undefined
  
  /**
    *    Width in pixels (should be set together with height)
    */
  var width: js.UndefOr[Double] = js.undefined
}
object FlashVideoSettings {
  
  inline def apply(): FlashVideoSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlashVideoSettings]
  }
  
  extension [Self <: FlashVideoSettings](x: Self) {
    
    inline def setBandwidth(value: Double): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
    
    inline def setBandwidthUndefined: Self = StObject.set(x, "bandwidth", js.undefined)
    
    inline def setFps(value: Double): Self = StObject.set(x, "fps", value.asInstanceOf[js.Any])
    
    inline def setFpsUndefined: Self = StObject.set(x, "fps", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setKeyframeInterval(value: Double): Self = StObject.set(x, "keyframeInterval", value.asInstanceOf[js.Any])
    
    inline def setKeyframeIntervalUndefined: Self = StObject.set(x, "keyframeInterval", js.undefined)
    
    inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
