package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.MidiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a MIDI messages that specifies a MIDI note to turn off. */
@JSGlobal("Windows.Devices.Midi.MidiNoteOffMessage")
@js.native
class MidiNoteOffMessage protected () extends js.Object {
  /**
                   * Creates a new MidiNoteOffMessage object.
                   * @param channel The channel from 0-15 that this message applies to.
                   * @param note The note which is specified as a value from 0-127.
                   * @param velocity The velocity which is specified as a value from 0-127.
                   */
  def this(channel: scala.Double, note: scala.Double, velocity: scala.Double) = this()
  /** Gets the channel from 0-15 that this message applies to. */
  var channel: scala.Double = js.native
  /** Gets the note to turn off which is specified as a value from 0-127. */
  var note: scala.Double = js.native
  /** Gets the array of bytes associated with the MIDI message, including status byte. */
  var rawData: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /** Gets the duration from when the MidiInPort was created to the time the message was received. For messages being sent to a MidiOutPort , this value has no meaning. */
  var timestamp: scala.Double = js.native
  /** Gets the type of this MIDI message. */
  var `type`: MidiMessageType = js.native
  /** Gets the value of the velocity from 0-127. */
  var velocity: scala.Double = js.native
}

