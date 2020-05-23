package typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GattClientCharacteristicConfigurationDescriptorValue extends js.Object

/** Represents the value of the GATT ClientCharacteristicConfigurationDescriptor. */
@JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattClientCharacteristicConfigurationDescriptorValue")
@js.native
object GattClientCharacteristicConfigurationDescriptorValue extends js.Object {
  /** Characteristic indications are enabled. */
  @js.native
  sealed trait indicate extends GattClientCharacteristicConfigurationDescriptorValue
  
  /** Neither notification nor indications are enabled. */
  @js.native
  sealed trait none extends GattClientCharacteristicConfigurationDescriptorValue
  
  /** Characteristic notifications are enabled. */
  @js.native
  sealed trait notify extends GattClientCharacteristicConfigurationDescriptorValue
  
}

