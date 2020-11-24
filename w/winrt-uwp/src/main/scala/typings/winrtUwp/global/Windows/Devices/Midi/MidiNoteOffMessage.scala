package typings.winrtUwp.global.Windows.Devices.Midi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a MIDI messages that specifies a MIDI note to turn off. */
@JSGlobal("Windows.Devices.Midi.MidiNoteOffMessage")
@js.native
class MidiNoteOffMessage protected ()
  extends typings.winrtUwp.Windows.Devices.Midi.MidiNoteOffMessage {
  /**
    * Creates a new MidiNoteOffMessage object.
    * @param channel The channel from 0-15 that this message applies to.
    * @param note The note which is specified as a value from 0-127.
    * @param velocity The velocity which is specified as a value from 0-127.
    */
  def this(channel: Double, note: Double, velocity: Double) = this()
}
