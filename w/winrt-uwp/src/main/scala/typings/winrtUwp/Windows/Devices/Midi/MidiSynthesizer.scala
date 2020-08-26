package typings.winrtUwp.Windows.Devices.Midi

import typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the Microsoft GS wavetable software synthesizer, included in Windows. This synthesizer provides a Roland GS sound set, which includes and extends the General MIDI sound set. */
@js.native
trait MidiSynthesizer extends js.Object {
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

object MidiSynthesizer {
  @scala.inline
  def apply(
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
  @scala.inline
  implicit class MidiSynthesizerOps[Self <: MidiSynthesizer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAudioDevice(value: DeviceInformation): Self = this.set("audioDevice", value.asInstanceOf[js.Any])
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSendBuffer(value: IBuffer => Unit): Self = this.set("sendBuffer", js.Any.fromFunction1(value))
    @scala.inline
    def setSendMessage(value: IMidiMessage => Unit): Self = this.set("sendMessage", js.Any.fromFunction1(value))
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
  }
  
}

