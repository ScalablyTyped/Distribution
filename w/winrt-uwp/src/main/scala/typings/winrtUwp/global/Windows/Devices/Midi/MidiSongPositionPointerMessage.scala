package typings.winrtUwp.global.Windows.Devices.Midi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a MIDI message that specifies a song position pointer. */
@JSGlobal("Windows.Devices.Midi.MidiSongPositionPointerMessage")
@js.native
class MidiSongPositionPointerMessage protected ()
  extends typings.winrtUwp.Windows.Devices.Midi.MidiSongPositionPointerMessage {
  /**
    * Creates a new MidiSongPositionPointerMessage object.
    * @param beats The song position pointer encoded in a 14-bit value from 0-16383.
    */
  def this(beats: Double) = this()
}
