package typings.winrtUwp.Windows.Devices.Midi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the MessageReceived event. */
trait MidiMessageReceivedEventArgs extends js.Object {
  /** The MIDI message. */
  var message: IMidiMessage
}

object MidiMessageReceivedEventArgs {
  @scala.inline
  def apply(message: IMidiMessage): MidiMessageReceivedEventArgs = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MidiMessageReceivedEventArgs]
  }
}

