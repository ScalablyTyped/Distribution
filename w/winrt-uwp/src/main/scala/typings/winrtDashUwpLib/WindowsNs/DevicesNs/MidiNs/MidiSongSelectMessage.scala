package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.MidiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a MIDI message that specifies the selected song. */
@JSGlobal("Windows.Devices.Midi.MidiSongSelectMessage")
@js.native
class MidiSongSelectMessage protected () extends js.Object {
  /**
                   * Creates a new MidiSongSelectMessage object.
                   * @param song The song to select from 0-127.
                   */
  def this(song: scala.Double) = this()
  /** Gets the array of bytes associated with the MIDI message, including status byte. */
  var rawData: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /** Gets the song to select from 0-127. */
  var song: scala.Double = js.native
  /** Gets the duration from when the MidiInPort was created to the time the message was received. For messages being sent to a MidiOutPort , this value has no meaning. */
  var timestamp: scala.Double = js.native
  /** Gets the type of this MIDI message. */
  var `type`: MidiMessageType = js.native
}

