package typings.winrtUwp.Windows.Devices.Midi

import typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the Microsoft GS wavetable software synthesizer, included in Windows. This synthesizer provides a Roland GS sound set, which includes and extends the General MIDI sound set. */
@JSGlobal("Windows.Devices.Midi.MidiSynthesizer")
@js.native
abstract class MidiSynthesizer () extends js.Object {
  /** Gets the audio output device being used by this instance of the Microsoft MIDI synthesizer. */
  var audioDevice: DeviceInformation = js.native
  /** Gets the device ID of the Microsoft MIDI synthesizer. Note that all instances of the synthesizer have the same ID. */
  var deviceId: String = js.native
  /** Gets or sets the output volume of this instance of the Microsoft MIDI synthesizer. */
  var volume: Double = js.native
  /** Closes this instance of the Microsoft MIDI synthesizer. It is a best practice for the caller to use this method to clear resources used by the MIDI object. */
  def close(): Unit = js.native
  /**
    * Sends an array of bytes through the synthesizer's out port . This enables you to send your data as a byte array instead of as a defined MIDI message.
    * @param midiData The array of bytes to send.
    */
  def sendBuffer(midiData: IBuffer): Unit = js.native
  /**
    * Sends a MIDI message through the Microsoft MIDI synthesizer's out port .
    * @param midiMessage The MIDI message to send.
    */
  def sendMessage(midiMessage: IMidiMessage): Unit = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Midi.MidiSynthesizer")
@js.native
object MidiSynthesizer extends js.Object {
  /**
    * Creates a new instance of the Microsoft MIDI synthesizer that uses the system's default audio output device.
    * @return An instance of the Windows MIDI synthesizer.
    */
  def createAsync(): IPromiseWithIAsyncOperation[MidiSynthesizer] = js.native
  /**
    * Creates a new instance of the Microsoft MIDI synthesizer with a specified audio output device.
    * @param audioDevice The audio output device.
    * @return An instance of the Microsoft MIDI synthesizer.
    */
  def createAsync(audioDevice: DeviceInformation): IPromiseWithIAsyncOperation[MidiSynthesizer] = js.native
  /**
    * Determines whether a particular device is an instance of the Microsoft MIDI synthesizer. When all MIDI out ports on the system are enumerated, this method can be used to identify which of them is the Microsoft MIDI synthesizer.
    * @param midiDevice An object that represents the device in question.
    * @return True if the device is the Microsoft MIDI synthesizer; otherwise, false.
    */
  def isSynthesizer(midiDevice: DeviceInformation): Boolean = js.native
}

