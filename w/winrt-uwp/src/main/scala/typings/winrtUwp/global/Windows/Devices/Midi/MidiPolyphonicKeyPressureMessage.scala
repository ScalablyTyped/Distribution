package typings.winrtUwp.global.Windows.Devices.Midi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a MIDI message that specifies the polyphonic key pressure. */
@JSGlobal("Windows.Devices.Midi.MidiPolyphonicKeyPressureMessage")
@js.native
class MidiPolyphonicKeyPressureMessage protected ()
  extends typings.winrtUwp.Windows.Devices.Midi.MidiPolyphonicKeyPressureMessage {
  /**
    * Creates a new MidiPolyphonicKeyPressureMessage object.
    * @param channel The channel from 0-15 that this message applies to.
    * @param note The note which is specified as a value from 0-127.
    * @param pressure The polyphonic key pressure which is specified as a value from 0-127.
    */
  def this(channel: Double, note: Double, pressure: Double) = this()
}

