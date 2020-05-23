package typings.winrtUwp.Windows.Devices.Midi

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a MIDI message that specifies a control change. */
trait MidiControlChangeMessage extends js.Object {
  /** Gets the channel from 0-15 that this message applies to. */
  var channel: Double
  /** Gets the value from 0-127 to apply to the controller . */
  var controlValue: Double
  /** Gets controller from 0-127 to receive this message. */
  var controller: Double
  /** Gets the array of bytes associated with the MIDI message, including status byte. */
  var rawData: IBuffer
  /** Gets the duration from when the MidiInPort was created to the time the message was received. For messages being sent to a MidiOutPort , this value has no meaning. */
  var timestamp: Double
  /** Gets the type of this MIDI message. */
  var `type`: MidiMessageType
}

object MidiControlChangeMessage {
  @scala.inline
  def apply(
    channel: Double,
    controlValue: Double,
    controller: Double,
    rawData: IBuffer,
    timestamp: Double,
    `type`: MidiMessageType
  ): MidiControlChangeMessage = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], controlValue = controlValue.asInstanceOf[js.Any], controller = controller.asInstanceOf[js.Any], rawData = rawData.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MidiControlChangeMessage]
  }
}

