package typings.winrtUwp.global.Windows.Devices.Midi

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a MIDI message that specifies the selected song. */
@JSGlobal("Windows.Devices.Midi.MidiSongSelectMessage")
@js.native
class MidiSongSelectMessage protected ()
  extends typings.winrtUwp.Windows.Devices.Midi.MidiSongSelectMessage {
  /**
    * Creates a new MidiSongSelectMessage object.
    * @param song The song to select from 0-127.
    */
  def this(song: Double) = this()
  /** Gets the array of bytes associated with the MIDI message, including status byte. */
  /* CompleteClass */
  override var rawData: IBuffer = js.native
  /** Gets the song to select from 0-127. */
  /* CompleteClass */
  override var song: Double = js.native
  /** Gets the duration from when the MidiInPort was created to the time the message was received. For messages being sent to a MidiOutPort , this value has no meaning. */
  /* CompleteClass */
  override var timestamp: Double = js.native
  /** Gets the type of this MIDI message. */
  /* CompleteClass */
  override var `type`: typings.winrtUwp.Windows.Devices.Midi.MidiMessageType = js.native
}

