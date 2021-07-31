package typings.winrtUwp.Windows.Devices.Usb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Derives information from the first 9 bytes of a USB configuration descriptor. The information includes the power capabilities of the device when the configuration is active and the number of interfaces included in that configuration. For an explanation of a configuration descriptor, Section 9.6.3 Universal Serial Bus Specification. For information about descriptor fields, see: */
trait UsbConfigurationDescriptor extends StObject {
  
  /** Gets the bConfigurationValue field of a USB configuration descriptor. The value is the number that identifies the configuration. */
  var configurationValue: Double
  
  /** Gets the bMaxPower field of a USB configuration descriptor. The value indicates the maximum power (in milliamp units) that the device can draw from the bus, when the device is bus-powered. */
  var maxPowerMilliamps: Double
  
  /** Gets the D5 bit value of the bmAttributes field in the USB configuration descriptor. The value indicates whether the device can send a resume signal to wake up itself or the host system from a low power state. */
  var remoteWakeup: Boolean
  
  /** Gets the D6 bit of the bmAttributes field in the USB configuration. This value indicates whether the device is drawing power from a local source or the bus. */
  var selfPowered: Boolean
}
object UsbConfigurationDescriptor {
  
  @scala.inline
  def apply(configurationValue: Double, maxPowerMilliamps: Double, remoteWakeup: Boolean, selfPowered: Boolean): UsbConfigurationDescriptor = {
    val __obj = js.Dynamic.literal(configurationValue = configurationValue.asInstanceOf[js.Any], maxPowerMilliamps = maxPowerMilliamps.asInstanceOf[js.Any], remoteWakeup = remoteWakeup.asInstanceOf[js.Any], selfPowered = selfPowered.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsbConfigurationDescriptor]
  }
  
  @scala.inline
  implicit class UsbConfigurationDescriptorMutableBuilder[Self <: UsbConfigurationDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationValue(value: Double): Self = StObject.set(x, "configurationValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPowerMilliamps(value: Double): Self = StObject.set(x, "maxPowerMilliamps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteWakeup(value: Boolean): Self = StObject.set(x, "remoteWakeup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfPowered(value: Boolean): Self = StObject.set(x, "selfPowered", value.asInstanceOf[js.Any])
  }
}
