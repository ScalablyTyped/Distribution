package typings.winrtUwp.Windows.Devices.Midi

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a port used to send MIDI messages to a MIDI device. */
trait MidiOutPort extends js.Object {
  /** Gets the id of the device that was used to initialize the MidiOutPort . */
  var deviceId: String
  /** Closes the MidiOutPort . */
  def close(): Unit
  /**
    * Send the specified data buffer to the device associated with this MidiOutPort .
    * @param midiData The data to send to the device.
    */
  def sendBuffer(midiData: IBuffer): Unit
  /**
    * Send the data in the specified MIDI message to the device associated with this MidiOutPort .
    * @param midiMessage The MIDI message to send to the device.
    */
  def sendMessage(midiMessage: IMidiMessage): Unit
}

object MidiOutPort {
  @scala.inline
  def apply(
    close: () => Unit,
    deviceId: String,
    sendBuffer: IBuffer => Unit,
    sendMessage: IMidiMessage => Unit
  ): MidiOutPort = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), deviceId = deviceId.asInstanceOf[js.Any], sendBuffer = js.Any.fromFunction1(sendBuffer), sendMessage = js.Any.fromFunction1(sendMessage))
    __obj.asInstanceOf[MidiOutPort]
  }
}

