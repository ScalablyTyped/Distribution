package typings.winrtUwp.Windows.Devices.Lights

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.UI.Color
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.availabilitychanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a lamp device. */
@js.native
trait Lamp extends js.Object {
  /** Gets or sets a value indicating the current brightness level of the lamp, where 0.0 is completely off and 1.0 is maximum brightness. */
  var brightnessLevel: Double = js.native
  /** Gets or sets the color of the lamp. */
  var color: Color = js.native
  /** Gets the DeviceInformation Id for a lamp device. */
  var deviceId: String = js.native
  /** Gets a value indicating whether you can set the Color property of the lamp device. */
  var isColorSettable: Boolean = js.native
  /** Gets a value indicating whether the lamp device is enabled. */
  var isEnabled: Boolean = js.native
  /** Occurs when the availability of the lamp device changes. */
  @JSName("onavailabilitychanged")
  var onavailabilitychanged_Original: TypedEventHandler[Lamp, LampAvailabilityChangedEventArgs] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_availabilitychanged(`type`: availabilitychanged, listener: TypedEventHandler[Lamp, LampAvailabilityChangedEventArgs]): Unit = js.native
  /** Releases the lamp device. */
  def close(): Unit = js.native
  /** Occurs when the availability of the lamp device changes. */
  def onavailabilitychanged(ev: LampAvailabilityChangedEventArgs with WinRTEvent[Lamp]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_availabilitychanged(`type`: availabilitychanged, listener: TypedEventHandler[Lamp, LampAvailabilityChangedEventArgs]): Unit = js.native
}

