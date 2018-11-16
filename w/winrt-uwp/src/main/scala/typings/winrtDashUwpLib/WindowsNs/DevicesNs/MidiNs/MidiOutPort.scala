package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.MidiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a port used to send MIDI messages to a MIDI device. */
@JSGlobal("Windows.Devices.Midi.MidiOutPort")
@js.native
abstract class MidiOutPort () extends js.Object {
  /** Gets the id of the device that was used to initialize the MidiOutPort . */
  var deviceId: java.lang.String = js.native
  /** Closes the MidiOutPort . */
  def close(): scala.Unit = js.native
  /**
                   * Send the specified data buffer to the device associated with this MidiOutPort .
                   * @param midiData The data to send to the device.
                   */
  def sendBuffer(midiData: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer): scala.Unit = js.native
  /**
                   * Send the data in the specified MIDI message to the device associated with this MidiOutPort .
                   * @param midiMessage The MIDI message to send to the device.
                   */
  def sendMessage(midiMessage: IMidiMessage): scala.Unit = js.native
}

/** Represents a port used to send MIDI messages to a MIDI device. */
@JSGlobal("Windows.Devices.Midi.MidiOutPort")
@js.native
object MidiOutPort extends js.Object {
  /**
                   * Creates a MidiOutPort object for the specified device.
                   * @param deviceId The device ID, which can be obtained by enumerating the devices on the system Windows.Devices.Enumeration.DeviceInformation.FindAllAsync .
                   * @return The asynchronous operation. Upon completion, IAsyncOperation.GetResults returns a MidiOutPort object.
                   */
  def fromIdAsync(deviceId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DevicesNs.MidiNs.IMidiOutPort] = js.native
  /**
                   * Gets a query string that can be used to enumerate all MidiOutPort objects on the system.
                   * @return The query string used to enumerate the MidiOutPort objects on the system.
                   */
  def getDeviceSelector(): java.lang.String = js.native
}

