package typings.winrtUwp.global.Windows.Devices.Midi

import typings.winrtUwp.Windows.Devices.Midi.IMidiOutPort
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a port used to send MIDI messages to a MIDI device. */
@JSGlobal("Windows.Devices.Midi.MidiOutPort")
@js.native
abstract class MidiOutPort ()
  extends typings.winrtUwp.Windows.Devices.Midi.MidiOutPort
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
