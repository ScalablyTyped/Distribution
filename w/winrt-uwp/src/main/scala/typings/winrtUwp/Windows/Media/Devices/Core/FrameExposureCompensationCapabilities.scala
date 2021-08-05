package typings.winrtUwp.Windows.Media.Devices.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the exposure compensation capabilities of the capture device for frames in a variable photo sequences. */
trait FrameExposureCompensationCapabilities extends StObject {
  
  /** Gets the maximum exposure compensation supported by the capture device. */
  var max: Double
  
  /** Gets the minimum exposure compensation supported by the capture device. */
  var min: Double
  
  /** Gets the smallest exposure time compensation increment supported by the capture device. */
  var step: Double
  
  /** Gets a value that indicates if the capture device supports the frame exposure compensation control for frames in a variable photo sequence. */
  var supported: Boolean
}
object FrameExposureCompensationCapabilities {
  
  inline def apply(max: Double, min: Double, step: Double, supported: Boolean): FrameExposureCompensationCapabilities = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameExposureCompensationCapabilities]
  }
  
  extension [Self <: FrameExposureCompensationCapabilities](x: Self) {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setSupported(value: Boolean): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
  }
}
