package typings.twilioVideo.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLocalAudioTrackOptions
  extends StObject
     with CreateLocalTrackOptions {
  
  var noiseCancellationOptions: js.UndefOr[NoiseCancellationOptions] = js.undefined
}
object CreateLocalAudioTrackOptions {
  
  inline def apply(): CreateLocalAudioTrackOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLocalAudioTrackOptions]
  }
  
  extension [Self <: CreateLocalAudioTrackOptions](x: Self) {
    
    inline def setNoiseCancellationOptions(value: NoiseCancellationOptions): Self = StObject.set(x, "noiseCancellationOptions", value.asInstanceOf[js.Any])
    
    inline def setNoiseCancellationOptionsUndefined: Self = StObject.set(x, "noiseCancellationOptions", js.undefined)
  }
}
