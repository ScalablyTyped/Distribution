package typings.winrtUwp.Windows.Media.Devices.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the ISO speed capabilities of the capture device for frames in a variable photo sequences. */
@js.native
trait FrameIsoSpeedCapabilities extends StObject {
  
  /** Gets the maximum ISO speed supported by the capture device for a frame in a variable photo sequence. */
  var max: Double = js.native
  
  /** The minimum ISO speed supported by the capture device for a frame in a variable photo sequence. */
  var min: Double = js.native
  
  /** Gets the smallest ISO speed increment supported by the capture device for a frame in a variable photo sequence, specified in millimeters. */
  var step: Double = js.native
  
  /** Gets a value that indicates if the capture device supports the ISO speed control for frames in a variable photo sequence. */
  var supported: Boolean = js.native
}
object FrameIsoSpeedCapabilities {
  
  @scala.inline
  def apply(max: Double, min: Double, step: Double, supported: Boolean): FrameIsoSpeedCapabilities = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameIsoSpeedCapabilities]
  }
  
  @scala.inline
  implicit class FrameIsoSpeedCapabilitiesMutableBuilder[Self <: FrameIsoSpeedCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupported(value: Boolean): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
  }
}
