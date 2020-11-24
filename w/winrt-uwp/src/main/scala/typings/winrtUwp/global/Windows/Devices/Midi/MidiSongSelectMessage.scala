package typings.winrtUwp.global.Windows.Devices.Midi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a MIDI message that specifies the selected song. */
@JSGlobal("Windows.Devices.Midi.MidiSongSelectMessage")
@js.native
class MidiSongSelectMessage protected ()
  extends typings.winrtUwp.Windows.Devices.Midi.MidiSongSelectMessage {
  /**
    * Creates a new MidiSongSelectMessage object.
    * @param song The song to select from 0-127.
    */
  def this(song: Double) = this()
}
