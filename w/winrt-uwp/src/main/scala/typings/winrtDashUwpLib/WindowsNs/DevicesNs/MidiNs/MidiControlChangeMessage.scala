package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.MidiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a MIDI message that specifies a control change. */
@JSGlobal("Windows.Devices.Midi.MidiControlChangeMessage")
@js.native
class MidiControlChangeMessage protected () extends js.Object {
  /**
                   * Creates a new MidiControlChangeMessage object.
                   * @param channel The channel from 0-15 that this message applies to.
                   * @param controller The controller from 0-127 to receive this message.
                   * @param controlValue The value from 0-127 to apply to the controller .
                   */
  def this(channel: scala.Double, controller: scala.Double, controlValue: scala.Double) = this()
  /** Gets the channel from 0-15 that this message applies to. */
  var channel: scala.Double = js.native
  /** Gets the value from 0-127 to apply to the controller . */
  var controlValue: scala.Double = js.native
  /** Gets controller from 0-127 to receive this message. */
  var controller: scala.Double = js.native
  /** Gets the array of bytes associated with the MIDI message, including status byte. */
  var rawData: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /** Gets the duration from when the MidiInPort was created to the time the message was received. For messages being sent to a MidiOutPort , this value has no meaning. */
  var timestamp: scala.Double = js.native
  /** Gets the type of this MIDI message. */
  var `type`: MidiMessageType = js.native
}

