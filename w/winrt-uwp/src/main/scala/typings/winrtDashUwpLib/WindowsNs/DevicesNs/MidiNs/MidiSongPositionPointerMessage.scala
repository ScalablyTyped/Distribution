package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.MidiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a MIDI message that specifies a song position pointer. */
@JSGlobal("Windows.Devices.Midi.MidiSongPositionPointerMessage")
@js.native
class MidiSongPositionPointerMessage protected () extends js.Object {
  /**
                   * Creates a new MidiSongPositionPointerMessage object.
                   * @param beats The song position pointer encoded in a 14-bit value from 0-16383.
                   */
  def this(beats: scala.Double) = this()
  /** Gets the song position pointer encoded in a 14-bit value from 0-16383. */
  var beats: scala.Double = js.native
  /** Gets the array of bytes associated with the MIDI message, including status byte. */
  var rawData: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /** Gets the duration from when the MidiInPort was created to the time the message was received. For messages being sent to a MidiOutPort , this value has no meaning. */
  var timestamp: scala.Double = js.native
  /** Gets the type of this MIDI message. */
  var `type`: MidiMessageType = js.native
}

