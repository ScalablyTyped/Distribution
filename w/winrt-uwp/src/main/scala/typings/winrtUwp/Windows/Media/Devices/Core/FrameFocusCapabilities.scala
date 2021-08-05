package typings.winrtUwp.Windows.Media.Devices.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the focus capabilities of the capture device for frames in a variable photo sequences. */
trait FrameFocusCapabilities extends StObject {
  
  /** Gets the maximum focus length supported by the capture device for a frame in a variable photo sequence, specified in millimeters. */
  var max: Double
  
  /** Gets the minimum focus length supported by the capture device for a frame in a variable photo sequence, specified in millimeters. */
  var min: Double
  
  /** Gets the smallest focus increment supported by the capture device for a frame in a variable photo sequence, specified in millimeters. */
  var step: Double
  
  /** Gets a value that indicates if the capture device supports the focus control for frames in a variable photo sequence. */
  var supported: Boolean
}
object FrameFocusCapabilities {
  
  inline def apply(max: Double, min: Double, step: Double, supported: Boolean): FrameFocusCapabilities = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameFocusCapabilities]
  }
  
  extension [Self <: FrameFocusCapabilities](x: Self) {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setSupported(value: Boolean): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
  }
}
