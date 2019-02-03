package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.MidiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a port used to receive MIDI messages from a MIDI device. */
@JSGlobal("Windows.Devices.Midi.MidiInPort")
@js.native
abstract class MidiInPort () extends js.Object {
  /** Gets the id of the device that was used to initialize the MidiInPort . */
  var deviceId: java.lang.String = js.native
  /** Occurs when the MidiInPort receives data. */
  @JSName("onmessagereceived")
  var onmessagereceived_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MidiInPort, MidiMessageReceivedEventArgs] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messagereceived(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.messagereceived,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MidiInPort, MidiMessageReceivedEventArgs]
  ): scala.Unit = js.native
  /** Closes the MidiInPort . */
  def close(): scala.Unit = js.native
  /** Occurs when the MidiInPort receives data. */
  def onmessagereceived(ev: MidiMessageReceivedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[MidiInPort]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messagereceived(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.messagereceived,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MidiInPort, MidiMessageReceivedEventArgs]
  ): scala.Unit = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Midi.MidiInPort")
@js.native
object MidiInPort extends js.Object {
  /**
    * Creates a MidiInPort object for the specified device.
    * @param deviceId The device ID, which can be obtained by enumerating the devices on the system Windows.Devices.Enumeration.DeviceInformation.FindAllAsync .
    * @return The asynchronous operation. Upon completion, IAsyncOperation.GetResults returns a MidiInPort object.
    */
  def fromIdAsync(deviceId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DevicesNs.MidiNs.MidiInPort] = js.native
  /**
    * Gets a query string that can be used to enumerate all MidiInPort objects on the system.
    * @return The query string used to enumerate the MidiInPort objects on the system.
    */
  def getDeviceSelector(): java.lang.String = js.native
}

