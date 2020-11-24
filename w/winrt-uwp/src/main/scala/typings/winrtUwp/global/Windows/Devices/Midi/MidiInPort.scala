package typings.winrtUwp.global.Windows.Devices.Midi

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a port used to receive MIDI messages from a MIDI device. */
@JSGlobal("Windows.Devices.Midi.MidiInPort")
@js.native
abstract class MidiInPort ()
  extends typings.winrtUwp.Windows.Devices.Midi.MidiInPort
/* static members */
@JSGlobal("Windows.Devices.Midi.MidiInPort")
@js.native
object MidiInPort extends js.Object {
  
  /**
    * Creates a MidiInPort object for the specified device.
    * @param deviceId The device ID, which can be obtained by enumerating the devices on the system Windows.Devices.Enumeration.DeviceInformation.FindAllAsync .
    * @return The asynchronous operation. Upon completion, IAsyncOperation.GetResults returns a MidiInPort object.
    */
  def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Midi.MidiInPort] = js.native
  
  /**
    * Gets a query string that can be used to enumerate all MidiInPort objects on the system.
    * @return The query string used to enumerate the MidiInPort objects on the system.
    */
  def getDeviceSelector(): String = js.native
}
