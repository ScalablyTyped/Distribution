package typings.winrtUwp.Windows.Devices.Midi

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a MIDI message that specifies a song position pointer. */
trait MidiSongPositionPointerMessage extends js.Object {
  /** Gets the song position pointer encoded in a 14-bit value from 0-16383. */
  var beats: Double
  /** Gets the array of bytes associated with the MIDI message, including status byte. */
  var rawData: IBuffer
  /** Gets the duration from when the MidiInPort was created to the time the message was received. For messages being sent to a MidiOutPort , this value has no meaning. */
  var timestamp: Double
  /** Gets the type of this MIDI message. */
  var `type`: MidiMessageType
}

object MidiSongPositionPointerMessage {
  @scala.inline
  def apply(beats: Double, rawData: IBuffer, timestamp: Double, `type`: MidiMessageType): MidiSongPositionPointerMessage = {
    val __obj = js.Dynamic.literal(beats = beats.asInstanceOf[js.Any], rawData = rawData.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MidiSongPositionPointerMessage]
  }
}

