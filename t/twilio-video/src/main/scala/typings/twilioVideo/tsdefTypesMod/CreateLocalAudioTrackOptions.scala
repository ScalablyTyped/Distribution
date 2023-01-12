package typings.twilioVideo.tsdefTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLocalAudioTrackOptions
  extends StObject
     with CreateLocalTrackOptions {
  
  var defaultDeviceCaptureMode: js.UndefOr[DefaultDeviceCaptureMode] = js.undefined
  
  var noiseCancellationOptions: js.UndefOr[NoiseCancellationOptions] = js.undefined
}
object CreateLocalAudioTrackOptions {
  
  inline def apply(): CreateLocalAudioTrackOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLocalAudioTrackOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateLocalAudioTrackOptions] (val x: Self) extends AnyVal {
    
    inline def setDefaultDeviceCaptureMode(value: DefaultDeviceCaptureMode): Self = StObject.set(x, "defaultDeviceCaptureMode", value.asInstanceOf[js.Any])
    
    inline def setDefaultDeviceCaptureModeUndefined: Self = StObject.set(x, "defaultDeviceCaptureMode", js.undefined)
    
    inline def setNoiseCancellationOptions(value: NoiseCancellationOptions): Self = StObject.set(x, "noiseCancellationOptions", value.asInstanceOf[js.Any])
    
    inline def setNoiseCancellationOptionsUndefined: Self = StObject.set(x, "noiseCancellationOptions", js.undefined)
  }
}
