package typings.winrtUwp.global.Windows.Devices.Midi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a MIDI message that specifies a control change. */
@JSGlobal("Windows.Devices.Midi.MidiControlChangeMessage")
@js.native
class MidiControlChangeMessage protected ()
  extends typings.winrtUwp.Windows.Devices.Midi.MidiControlChangeMessage {
  /**
    * Creates a new MidiControlChangeMessage object.
    * @param channel The channel from 0-15 that this message applies to.
    * @param controller The controller from 0-127 to receive this message.
    * @param controlValue The value from 0-127 to apply to the controller .
    */
  def this(channel: Double, controller: Double, controlValue: Double) = this()
}

