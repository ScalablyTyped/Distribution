package typings.winrtUwp.Windows.Media.Devices.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the flash capabilities of the capture device for frames in a variable photo sequences. */
trait FrameFlashCapabilities extends StObject {
  
  /** Gets a value indicating whether flash power is supported for frames in a variable photo sequences. */
  var powerSupported: Boolean
  
  /** Gets a value indicating whether red eye reduction is supported for frames in a variable photo sequences. */
  var redEyeReductionSupported: Boolean
  
  /** Gets a value that indicates if the capture device supports the flash control for frames in a variable photo sequence. */
  var supported: Boolean
}
object FrameFlashCapabilities {
  
  inline def apply(powerSupported: Boolean, redEyeReductionSupported: Boolean, supported: Boolean): FrameFlashCapabilities = {
    val __obj = js.Dynamic.literal(powerSupported = powerSupported.asInstanceOf[js.Any], redEyeReductionSupported = redEyeReductionSupported.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameFlashCapabilities]
  }
  
  extension [Self <: FrameFlashCapabilities](x: Self) {
    
    inline def setPowerSupported(value: Boolean): Self = StObject.set(x, "powerSupported", value.asInstanceOf[js.Any])
    
    inline def setRedEyeReductionSupported(value: Boolean): Self = StObject.set(x, "redEyeReductionSupported", value.asInstanceOf[js.Any])
    
    inline def setSupported(value: Boolean): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
  }
}
