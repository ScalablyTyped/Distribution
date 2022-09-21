package typings.twilioVideo.typesMod

import typings.std.MediaStreamTrack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NoiseCancellation extends StObject {
  
  def disable(): js.Promise[Unit]
  
  def enable(): js.Promise[Unit]
  
  val isEnabled: Boolean
  
  val sourceTrack: MediaStreamTrack
  
  val vendor: NoiseCancellationVendor
}
object NoiseCancellation {
  
  inline def apply(
    disable: () => js.Promise[Unit],
    enable: () => js.Promise[Unit],
    isEnabled: Boolean,
    sourceTrack: MediaStreamTrack,
    vendor: NoiseCancellationVendor
  ): NoiseCancellation = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), isEnabled = isEnabled.asInstanceOf[js.Any], sourceTrack = sourceTrack.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoiseCancellation]
  }
  
  extension [Self <: NoiseCancellation](x: Self) {
    
    inline def setDisable(value: () => js.Promise[Unit]): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
    
    inline def setEnable(value: () => js.Promise[Unit]): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setSourceTrack(value: MediaStreamTrack): Self = StObject.set(x, "sourceTrack", value.asInstanceOf[js.Any])
    
    inline def setVendor(value: NoiseCancellationVendor): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
  }
}
