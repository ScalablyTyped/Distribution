package typings.webrtc

import typings.webrtc.W3C.ConstrainBoolean
import typings.webrtc.W3C.ConstrainDouble
import typings.webrtc.W3C.ConstrainLong
import typings.webrtc.W3C.ConstrainString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaTrackConstraintSet extends StObject {
  
  var aspectRatio: js.UndefOr[ConstrainDouble] = js.undefined
  
  var deviceId: js.UndefOr[ConstrainString] = js.undefined
  
  var echoCancellation: js.UndefOr[ConstrainBoolean] = js.undefined
  
  var facingMode: js.UndefOr[ConstrainString] = js.undefined
  
  var frameRate: js.UndefOr[ConstrainDouble] = js.undefined
  
  var groupId: js.UndefOr[ConstrainString] = js.undefined
  
  var height: js.UndefOr[ConstrainLong] = js.undefined
  
  var latency: js.UndefOr[ConstrainDouble] = js.undefined
  
  var sampleRate: js.UndefOr[ConstrainLong] = js.undefined
  
  var sampleSize: js.UndefOr[ConstrainLong] = js.undefined
  
  var volume: js.UndefOr[ConstrainDouble] = js.undefined
  
  var width: js.UndefOr[ConstrainLong] = js.undefined
}
object MediaTrackConstraintSet {
  
  inline def apply(): MediaTrackConstraintSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaTrackConstraintSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaTrackConstraintSet] (val x: Self) extends AnyVal {
    
    inline def setAspectRatio(value: ConstrainDouble): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
    
    inline def setDeviceId(value: ConstrainString): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setDeviceIdVarargs(value: String*): Self = StObject.set(x, "deviceId", js.Array(value*))
    
    inline def setEchoCancellation(value: ConstrainBoolean): Self = StObject.set(x, "echoCancellation", value.asInstanceOf[js.Any])
    
    inline def setEchoCancellationUndefined: Self = StObject.set(x, "echoCancellation", js.undefined)
    
    inline def setFacingMode(value: ConstrainString): Self = StObject.set(x, "facingMode", value.asInstanceOf[js.Any])
    
    inline def setFacingModeUndefined: Self = StObject.set(x, "facingMode", js.undefined)
    
    inline def setFacingModeVarargs(value: String*): Self = StObject.set(x, "facingMode", js.Array(value*))
    
    inline def setFrameRate(value: ConstrainDouble): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
    
    inline def setFrameRateUndefined: Self = StObject.set(x, "frameRate", js.undefined)
    
    inline def setGroupId(value: ConstrainString): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setGroupIdVarargs(value: String*): Self = StObject.set(x, "groupId", js.Array(value*))
    
    inline def setHeight(value: ConstrainLong): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLatency(value: ConstrainDouble): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
    
    inline def setLatencyUndefined: Self = StObject.set(x, "latency", js.undefined)
    
    inline def setSampleRate(value: ConstrainLong): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
    
    inline def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
    
    inline def setSampleSize(value: ConstrainLong): Self = StObject.set(x, "sampleSize", value.asInstanceOf[js.Any])
    
    inline def setSampleSizeUndefined: Self = StObject.set(x, "sampleSize", js.undefined)
    
    inline def setVolume(value: ConstrainDouble): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
    
    inline def setWidth(value: ConstrainLong): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
