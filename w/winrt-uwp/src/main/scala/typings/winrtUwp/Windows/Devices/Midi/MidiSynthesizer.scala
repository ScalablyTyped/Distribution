package typings.winrtUwp.Windows.Devices.Midi

import typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the Microsoft GS wavetable software synthesizer, included in Windows. This synthesizer provides a Roland GS sound set, which includes and extends the General MIDI sound set. */
trait MidiSynthesizer extends StObject {
  
  /** Gets the audio output device being used by this instance of the Microsoft MIDI synthesizer. */
  var audioDevice: DeviceInformation
  
  /** Closes this instance of the Microsoft MIDI synthesizer. It is a best practice for the caller to use this method to clear resources used by the MIDI object. */
  def close(): Unit
  
  /** Gets the device ID of the Microsoft MIDI synthesizer. Note that all instances of the synthesizer have the same ID. */
  var deviceId: String
  
  /**
    * Sends an array of bytes through the synthesizer's out port . This enables you to send your data as a byte array instead of as a defined MIDI message.
    * @param midiData The array of bytes to send.
    */
  def sendBuffer(midiData: IBuffer): Unit
  
  /**
    * Sends a MIDI message through the Microsoft MIDI synthesizer's out port .
    * @param midiMessage The MIDI message to send.
    */
  def sendMessage(midiMessage: IMidiMessage): Unit
  
  /** Gets or sets the output volume of this instance of the Microsoft MIDI synthesizer. */
  var volume: Double
}
object MidiSynthesizer {
  
  inline def apply(
    audioDevice: DeviceInformation,
    close: () => Unit,
    deviceId: String,
    sendBuffer: IBuffer => Unit,
    sendMessage: IMidiMessage => Unit,
    volume: Double
  ): MidiSynthesizer = {
    val __obj = js.Dynamic.literal(audioDevice = audioDevice.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), deviceId = deviceId.asInstanceOf[js.Any], sendBuffer = js.Any.fromFunction1(sendBuffer), sendMessage = js.Any.fromFunction1(sendMessage), volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[MidiSynthesizer]
  }
  
  extension [Self <: MidiSynthesizer](x: Self) {
    
    inline def setAudioDevice(value: DeviceInformation): Self = StObject.set(x, "audioDevice", value.asInstanceOf[js.Any])
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setSendBuffer(value: IBuffer => Unit): Self = StObject.set(x, "sendBuffer", js.Any.fromFunction1(value))
    
    inline def setSendMessage(value: IMidiMessage => Unit): Self = StObject.set(x, "sendMessage", js.Any.fromFunction1(value))
    
    inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
  }
}
