package typings.winrtUwp.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Gets the capabilities of a camera setting. */
trait MediaDeviceControlCapabilities extends StObject {
  
  /** Gets the default value of the camera setting. */
  var default: Double
  
  /** Queries whether the camera supports automatic adjustment of the setting. */
  var autoModeSupported: Boolean
  
  /** Sets the maximum value of the camera setting. */
  var max: Double
  
  /** Gets the minimum value of the camera setting. */
  var min: Double
  
  /** Ges the step size for the setting. The step size is the smallest increment by which the property can change. */
  var step: Double
  
  /** Indicates whether the camera supports this camera setting. */
  var supported: Boolean
}
object MediaDeviceControlCapabilities {
  
  inline def apply(
    autoModeSupported: Boolean,
    default: Double,
    max: Double,
    min: Double,
    step: Double,
    supported: Boolean
  ): MediaDeviceControlCapabilities = {
    val __obj = js.Dynamic.literal(autoModeSupported = autoModeSupported.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaDeviceControlCapabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaDeviceControlCapabilities] (val x: Self) extends AnyVal {
    
    inline def setAutoModeSupported(value: Boolean): Self = StObject.set(x, "autoModeSupported", value.asInstanceOf[js.Any])
    
    inline def setDefault(value: Double): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setSupported(value: Boolean): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
  }
}
