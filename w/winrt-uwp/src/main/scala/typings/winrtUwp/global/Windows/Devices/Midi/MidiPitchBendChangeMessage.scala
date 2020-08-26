package typings.winrtUwp.global.Windows.Devices.Midi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a MIDI message that specifies a pitch bend change. */
@JSGlobal("Windows.Devices.Midi.MidiPitchBendChangeMessage")
@js.native
class MidiPitchBendChangeMessage protected ()
  extends typings.winrtUwp.Windows.Devices.Midi.MidiPitchBendChangeMessage {
  /**
    * Creates a new MidiPitchBendChangeMessage object.
    * @param channel The channel from 0-15 that this message applies to.
    * @param bend The pitch bend value which is specified as a 14-bit value from 0-16383.
    */
  def this(channel: Double, bend: Double) = this()
}

