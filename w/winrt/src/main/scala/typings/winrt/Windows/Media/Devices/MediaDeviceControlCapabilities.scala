package typings.winrt.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaDeviceControlCapabilities
  extends StObject
     with IMediaDeviceControlCapabilities
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
}
