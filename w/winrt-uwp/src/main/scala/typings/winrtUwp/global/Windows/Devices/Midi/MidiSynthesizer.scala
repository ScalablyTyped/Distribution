package typings.winrtUwp.global.Windows.Devices.Midi

import typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the Microsoft GS wavetable software synthesizer, included in Windows. This synthesizer provides a Roland GS sound set, which includes and extends the General MIDI sound set. */
@JSGlobal("Windows.Devices.Midi.MidiSynthesizer")
@js.native
abstract class MidiSynthesizer ()
  extends typings.winrtUwp.Windows.Devices.Midi.MidiSynthesizer
/* static members */
@JSGlobal("Windows.Devices.Midi.MidiSynthesizer")
@js.native
object MidiSynthesizer extends js.Object {
  
  /**
    * Creates a new instance of the Microsoft MIDI synthesizer that uses the system's default audio output device.
    * @return An instance of the Windows MIDI synthesizer.
    */
  def createAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Midi.MidiSynthesizer] = js.native
  /**
    * Creates a new instance of the Microsoft MIDI synthesizer with a specified audio output device.
    * @param audioDevice The audio output device.
    * @return An instance of the Microsoft MIDI synthesizer.
    */
  def createAsync(audioDevice: DeviceInformation): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Midi.MidiSynthesizer] = js.native
  
  /**
    * Determines whether a particular device is an instance of the Microsoft MIDI synthesizer. When all MIDI out ports on the system are enumerated, this method can be used to identify which of them is the Microsoft MIDI synthesizer.
    * @param midiDevice An object that represents the device in question.
    * @return True if the device is the Microsoft MIDI synthesizer; otherwise, false.
    */
  def isSynthesizer(midiDevice: DeviceInformation): Boolean = js.native
}
