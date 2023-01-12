package typings.winrt.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMediaDeviceControlCapabilities extends StObject {
  
  var default: Double
  
  var autoModeSupported: Boolean
  
  var max: Double
  
  var min: Double
  
  var step: Double
  
  var supported: Boolean
}
object IMediaDeviceControlCapabilities {
  
  inline def apply(
    autoModeSupported: Boolean,
    default: Double,
    max: Double,
    min: Double,
    step: Double,
    supported: Boolean
  ): IMediaDeviceControlCapabilities = {
    val __obj = js.Dynamic.literal(autoModeSupported = autoModeSupported.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMediaDeviceControlCapabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMediaDeviceControlCapabilities] (val x: Self) extends AnyVal {
    
    inline def setAutoModeSupported(value: Boolean): Self = StObject.set(x, "autoModeSupported", value.asInstanceOf[js.Any])
    
    inline def setDefault(value: Double): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setSupported(value: Boolean): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
  }
}
