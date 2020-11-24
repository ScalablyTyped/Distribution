package typings.winrtUwp.global.Windows.Devices.Midi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a MIDI message that specifies a time code. */
@JSGlobal("Windows.Devices.Midi.MidiTimeCodeMessage")
@js.native
class MidiTimeCodeMessage protected ()
  extends typings.winrtUwp.Windows.Devices.Midi.MidiTimeCodeMessage {
  /**
    * Creates a new MidiTimeCodeMessage object.
    * @param frameType The frame type from 0-7.
    * @param values The time code from 0-32.
    */
  def this(frameType: Double, values: Double) = this()
}
