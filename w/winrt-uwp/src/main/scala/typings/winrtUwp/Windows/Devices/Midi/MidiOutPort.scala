package typings.winrtUwp.Windows.Devices.Midi

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a port used to send MIDI messages to a MIDI device. */
trait MidiOutPort extends StObject {
  
  /** Closes the MidiOutPort . */
  def close(): Unit
  
  /** Gets the id of the device that was used to initialize the MidiOutPort . */
  var deviceId: String
  
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
  
  inline def apply(
    close: () => Unit,
    deviceId: String,
    sendBuffer: IBuffer => Unit,
    sendMessage: IMidiMessage => Unit
  ): MidiOutPort = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), deviceId = deviceId.asInstanceOf[js.Any], sendBuffer = js.Any.fromFunction1(sendBuffer), sendMessage = js.Any.fromFunction1(sendMessage))
    __obj.asInstanceOf[MidiOutPort]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MidiOutPort] (val x: Self) extends AnyVal {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setSendBuffer(value: IBuffer => Unit): Self = StObject.set(x, "sendBuffer", js.Any.fromFunction1(value))
    
    inline def setSendMessage(value: IMidiMessage => Unit): Self = StObject.set(x, "sendMessage", js.Any.fromFunction1(value))
  }
}
