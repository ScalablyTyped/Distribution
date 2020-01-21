package typings.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile

import org.scalablytyped.runtime.TopLevel
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
  
  /* 1 */ @JSName("notify")
  val notify_ : notify with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GattClientCharacteristicConfigurationDescriptorValue with Double] = js.native
  /* 2 */ @js.native
  object indicate extends TopLevel[indicate with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

