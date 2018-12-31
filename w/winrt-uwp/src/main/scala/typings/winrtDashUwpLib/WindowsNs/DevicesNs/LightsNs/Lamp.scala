package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.LightsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a lamp device. */
@JSGlobal("Windows.Devices.Lights.Lamp")
@js.native
abstract class Lamp () extends js.Object {
  /** Gets or sets a value indicating the current brightness level of the lamp, where 0.0 is completely off and 1.0 is maximum brightness. */
  var brightnessLevel: scala.Double = js.native
  /** Gets or sets the color of the lamp. */
  var color: winrtDashUwpLib.WindowsNs.UINs.Color = js.native
  /** Gets the DeviceInformation Id for a lamp device. */
  var deviceId: java.lang.String = js.native
  /** Gets a value indicating whether you can set the Color property of the lamp device. */
  var isColorSettable: scala.Boolean = js.native
  /** Gets a value indicating whether the lamp device is enabled. */
  var isEnabled: scala.Boolean = js.native
  /** Occurs when the availability of the lamp device changes. */
  @JSName("onavailabilitychanged")
  var onavailabilitychanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Lamp, LampAvailabilityChangedEventArgs] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_availabilitychanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.availabilitychanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Lamp, LampAvailabilityChangedEventArgs]
  ): scala.Unit = js.native
  /** Releases the lamp device. */
  def close(): scala.Unit = js.native
  /** Occurs when the availability of the lamp device changes. */
  def onavailabilitychanged(ev: LampAvailabilityChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[Lamp]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_availabilitychanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.availabilitychanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[Lamp, LampAvailabilityChangedEventArgs]
  ): scala.Unit = js.native
}

/** Represents a lamp device. */
@JSGlobal("Windows.Devices.Lights.Lamp")
@js.native
object Lamp extends js.Object {
  /**
    * Gets a Lamp object representing the lamp device with the specified ID.
    * @param deviceId The ID of the requested lamp device.
    * @return An asynchronous operation that returns a Lamp object upon successful completion.
    */
  def fromIdAsync(deviceId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DevicesNs.LightsNs.Lamp] = js.native
  /**
    * Gets a Lamp object representing the default lamp for the device.
    * @return An asynchronous operation that returns a Lamp object upon successful completion.
    */
  def getDefaultAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DevicesNs.LightsNs.Lamp] = js.native
  /**
    * Returns the class selection string that you can use to enumerate lamp devices.
    * @return The class selection string for lamp devices.
    */
  def getDeviceSelector(): java.lang.String = js.native
}

