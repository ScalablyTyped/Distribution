package typings.webrtc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaTrackSupportedConstraints extends StObject {
  
  var aspectRatio: js.UndefOr[Boolean] = js.undefined
  
  var deviceId: js.UndefOr[Boolean] = js.undefined
  
  var echoCancellation: js.UndefOr[Boolean] = js.undefined
  
  var facingMode: js.UndefOr[Boolean] = js.undefined
  
  var frameRate: js.UndefOr[Boolean] = js.undefined
  
  var groupId: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Boolean] = js.undefined
  
  var latency: js.UndefOr[Boolean] = js.undefined
  
  var sampleRate: js.UndefOr[Boolean] = js.undefined
  
  var sampleSize: js.UndefOr[Boolean] = js.undefined
  
  var volume: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[Boolean] = js.undefined
}
object MediaTrackSupportedConstraints {
  
  inline def apply(): MediaTrackSupportedConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaTrackSupportedConstraints]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaTrackSupportedConstraints] (val x: Self) extends AnyVal {
    
    inline def setAspectRatio(value: Boolean): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
    
    inline def setDeviceId(value: Boolean): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setEchoCancellation(value: Boolean): Self = StObject.set(x, "echoCancellation", value.asInstanceOf[js.Any])
    
    inline def setEchoCancellationUndefined: Self = StObject.set(x, "echoCancellation", js.undefined)
    
    inline def setFacingMode(value: Boolean): Self = StObject.set(x, "facingMode", value.asInstanceOf[js.Any])
    
    inline def setFacingModeUndefined: Self = StObject.set(x, "facingMode", js.undefined)
    
    inline def setFrameRate(value: Boolean): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
    
    inline def setFrameRateUndefined: Self = StObject.set(x, "frameRate", js.undefined)
    
    inline def setGroupId(value: Boolean): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setHeight(value: Boolean): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLatency(value: Boolean): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
    
    inline def setLatencyUndefined: Self = StObject.set(x, "latency", js.undefined)
    
    inline def setSampleRate(value: Boolean): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
    
    inline def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
    
    inline def setSampleSize(value: Boolean): Self = StObject.set(x, "sampleSize", value.asInstanceOf[js.Any])
    
    inline def setSampleSizeUndefined: Self = StObject.set(x, "sampleSize", js.undefined)
    
    inline def setVolume(value: Boolean): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
    
    inline def setWidth(value: Boolean): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
