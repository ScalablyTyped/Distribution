package typings.winrtUwp.Windows.Devices.Midi

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a MIDI message that specifies a time code. */
trait MidiTimeCodeMessage extends js.Object {
  /** Gets the value of the frame type from 0-7. */
  var frameType: Double
  /** Gets the array of bytes associated with the MIDI message, including status byte. */
  var rawData: IBuffer
  /** Gets the duration from when the MidiInPort was created to the time the message was received. For messages being sent to a MidiOutPort , this value has no meaning. */
  var timestamp: Double
  /** Gets the type of this MIDI message. */
  var `type`: MidiMessageType
  /** Gets the time code value from 0-32. */
  var values: Double
}

object MidiTimeCodeMessage {
  @scala.inline
  def apply(frameType: Double, rawData: IBuffer, timestamp: Double, `type`: MidiMessageType, values: Double): MidiTimeCodeMessage = {
    val __obj = js.Dynamic.literal(frameType = frameType.asInstanceOf[js.Any], rawData = rawData.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MidiTimeCodeMessage]
  }
}

