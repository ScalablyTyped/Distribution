package typings.winrtUwp.Windows.Devices.Midi

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a MIDI messages that specifies a MIDI note to turn off. */
trait MidiNoteOffMessage extends js.Object {
  /** Gets the channel from 0-15 that this message applies to. */
  var channel: Double
  /** Gets the note to turn off which is specified as a value from 0-127. */
  var note: Double
  /** Gets the array of bytes associated with the MIDI message, including status byte. */
  var rawData: IBuffer
  /** Gets the duration from when the MidiInPort was created to the time the message was received. For messages being sent to a MidiOutPort , this value has no meaning. */
  var timestamp: Double
  /** Gets the type of this MIDI message. */
  var `type`: MidiMessageType
  /** Gets the value of the velocity from 0-127. */
  var velocity: Double
}

object MidiNoteOffMessage {
  @scala.inline
  def apply(
    channel: Double,
    note: Double,
    rawData: IBuffer,
    timestamp: Double,
    `type`: MidiMessageType,
    velocity: Double
  ): MidiNoteOffMessage = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], rawData = rawData.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MidiNoteOffMessage]
  }
}

