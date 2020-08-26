package typings.winrtUwp.global.Windows.Devices.Midi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a MIDI message that specifies a MIDI note to turn on. */
@JSGlobal("Windows.Devices.Midi.MidiNoteOnMessage")
@js.native
class MidiNoteOnMessage protected ()
  extends typings.winrtUwp.Windows.Devices.Midi.MidiNoteOnMessage {
  /**
    * Creates a new MidiNoteOnMessage object.
    * @param channel The channel from 0-15 that this message applies to.
    * @param note The note which is specified as a value from 0-127.
    * @param velocity The velocity which is specified as a value from 0-127.
    */
  def this(channel: Double, note: Double, velocity: Double) = this()
}

