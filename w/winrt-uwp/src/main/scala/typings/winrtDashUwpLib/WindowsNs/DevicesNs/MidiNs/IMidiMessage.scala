package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.MidiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a MIDI message which is implemented by all MIDI message classes. */
trait IMidiMessage extends js.Object {
  /** Gets the array of bytes associated with the MIDI message, including status byte. */
  var rawData: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  /** Gets the duration from when the MidiInPort was created to the time the message was received. For messages being sent to a MidiOutPort , this value has no meaning. */
  var timestamp: scala.Double
  /** Gets the type of this MIDI message. */
  var `type`: MidiMessageType
}

object IMidiMessage {
  @scala.inline
  def apply(
    rawData: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    timestamp: scala.Double,
    `type`: MidiMessageType
  ): IMidiMessage = {
    val __obj = js.Dynamic.literal(rawData = rawData, timestamp = timestamp)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IMidiMessage]
  }
}

