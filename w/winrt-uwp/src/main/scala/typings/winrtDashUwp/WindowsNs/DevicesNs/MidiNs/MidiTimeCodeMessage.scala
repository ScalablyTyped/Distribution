package typings.winrtDashUwp.WindowsNs.DevicesNs.MidiNs

import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a MIDI message that specifies a time code. */
@JSGlobal("Windows.Devices.Midi.MidiTimeCodeMessage")
@js.native
class MidiTimeCodeMessage protected () extends js.Object {
  /**
    * Creates a new MidiTimeCodeMessage object.
    * @param frameType The frame type from 0-7.
    * @param values The time code from 0-32.
    */
  def this(frameType: Double, values: Double) = this()
  /** Gets the value of the frame type from 0-7. */
  var frameType: Double = js.native
  /** Gets the array of bytes associated with the MIDI message, including status byte. */
  var rawData: IBuffer = js.native
  /** Gets the duration from when the MidiInPort was created to the time the message was received. For messages being sent to a MidiOutPort , this value has no meaning. */
  var timestamp: Double = js.native
  /** Gets the type of this MIDI message. */
  var `type`: MidiMessageType = js.native
  /** Gets the time code value from 0-32. */
  var values: Double = js.native
}

