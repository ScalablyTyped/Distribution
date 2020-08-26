package typings.winrtUwp.global.Windows.Devices.Midi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a MIDI message that specifies a program change. */
@JSGlobal("Windows.Devices.Midi.MidiProgramChangeMessage")
@js.native
class MidiProgramChangeMessage protected ()
  extends typings.winrtUwp.Windows.Devices.Midi.MidiProgramChangeMessage {
  /**
    * Creates a new MidiProgramChangeMessage object.
    * @param channel The channel from 0-15 that this message applies to.
    * @param program The program to change from 0-127.
    */
  def this(channel: Double, program: Double) = this()
}

