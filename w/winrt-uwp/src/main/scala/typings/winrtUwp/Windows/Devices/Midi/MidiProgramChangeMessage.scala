package typings.winrtUwp.Windows.Devices.Midi

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a MIDI message that specifies a program change. */
trait MidiProgramChangeMessage extends js.Object {
  /** Gets the channel from 0-15 that this message applies to. */
  var channel: Double
  /** Gets the program to change from 0-127. */
  var program: Double
  /** Gets the array of bytes associated with the MIDI message, including status byte. */
  var rawData: IBuffer
  /** Gets the duration from when the MidiInPort was created to the time the message was received. For messages being sent to a MidiOutPort , this value has no meaning. */
  var timestamp: Double
  /** Gets the type of this MIDI message. */
  var `type`: MidiMessageType
}

object MidiProgramChangeMessage {
  @scala.inline
  def apply(channel: Double, program: Double, rawData: IBuffer, timestamp: Double, `type`: MidiMessageType): MidiProgramChangeMessage = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any], rawData = rawData.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MidiProgramChangeMessage]
  }
}

