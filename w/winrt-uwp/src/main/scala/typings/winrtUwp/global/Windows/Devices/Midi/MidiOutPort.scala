package typings.winrtUwp.global.Windows.Devices.Midi

import typings.winrtUwp.Windows.Devices.Midi.IMidiMessage
import typings.winrtUwp.Windows.Devices.Midi.IMidiOutPort
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a port used to send MIDI messages to a MIDI device. */
@JSGlobal("Windows.Devices.Midi.MidiOutPort")
@js.native
abstract class MidiOutPort ()
  extends typings.winrtUwp.Windows.Devices.Midi.MidiOutPort {
  /** Gets the id of the device that was used to initialize the MidiOutPort . */
  /* CompleteClass */
  override var deviceId: String = js.native
  /** Closes the MidiOutPort . */
  /* CompleteClass */
  override def close(): Unit = js.native
  /**
    * Send the specified data buffer to the device associated with this MidiOutPort .
    * @param midiData The data to send to the device.
    */
  /* CompleteClass */
  override def sendBuffer(midiData: IBuffer): Unit = js.native
  /**
    * Send the data in the specified MIDI message to the device associated with this MidiOutPort .
    * @param midiMessage The MIDI message to send to the device.
    */
  /* CompleteClass */
  override def sendMessage(midiMessage: IMidiMessage): Unit = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Midi.MidiOutPort")
@js.native
object MidiOutPort extends js.Object {
  /**
    * Creates a MidiOutPort object for the specified device.
    * @param deviceId The device ID, which can be obtained by enumerating the devices on the system Windows.Devices.Enumeration.DeviceInformation.FindAllAsync .
    * @return The asynchronous operation. Upon completion, IAsyncOperation.GetResults returns a MidiOutPort object.
    */
  def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[IMidiOutPort] = js.native
  /**
    * Gets a query string that can be used to enumerate all MidiOutPort objects on the system.
    * @return The query string used to enumerate the MidiOutPort objects on the system.
    */
  def getDeviceSelector(): String = js.native
}

