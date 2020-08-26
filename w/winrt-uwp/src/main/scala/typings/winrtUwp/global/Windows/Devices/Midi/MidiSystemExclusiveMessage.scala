package typings.winrtUwp.global.Windows.Devices.Midi

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a MIDI message that specifies a system exclusive message. */
@JSGlobal("Windows.Devices.Midi.MidiSystemExclusiveMessage")
@js.native
class MidiSystemExclusiveMessage protected ()
  extends typings.winrtUwp.Windows.Devices.Midi.MidiSystemExclusiveMessage {
  /**
    * Creates a new MidiSystemExclusiveMessage object.
    * @param rawData The system exclusive data.
    */
  def this(rawData: IBuffer) = this()
}

