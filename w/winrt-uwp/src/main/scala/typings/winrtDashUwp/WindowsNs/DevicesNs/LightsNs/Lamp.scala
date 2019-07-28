package typings.winrtDashUwp.WindowsNs.DevicesNs.LightsNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.EventHandler
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.WindowsNs.FoundationNs.TypedEventHandler
import typings.winrtDashUwp.WindowsNs.UINs.Color
import typings.winrtDashUwp.WindowsNs.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.availabilitychanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a lamp device. */
@JSGlobal("Windows.Devices.Lights.Lamp")
@js.native
abstract class Lamp () extends js.Object {
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

/* static members */
@JSGlobal("Windows.Devices.Lights.Lamp")
@js.native
object Lamp extends js.Object {
  /**
    * Gets a Lamp object representing the lamp device with the specified ID.
    * @param deviceId The ID of the requested lamp device.
    * @return An asynchronous operation that returns a Lamp object upon successful completion.
    */
  def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[Lamp] = js.native
  /**
    * Gets a Lamp object representing the default lamp for the device.
    * @return An asynchronous operation that returns a Lamp object upon successful completion.
    */
  def getDefaultAsync(): IPromiseWithIAsyncOperation[Lamp] = js.native
  /**
    * Returns the class selection string that you can use to enumerate lamp devices.
    * @return The class selection string for lamp devices.
    */
  def getDeviceSelector(): String = js.native
}

