package typings.winrtDashUwp.Windows.Devices.Midi

import typings.winrtDashUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a MIDI message that specifies active sensing. */
@JSGlobal("Windows.Devices.Midi.MidiActiveSensingMessage")
@js.native
/** Creates a new MidiActiveSensingMessage object. */
class MidiActiveSensingMessage () extends js.Object {
  /** Gets the array of bytes associated with the MIDI message, including status byte. */
  var rawData: IBuffer = js.native
  /** Gets the duration from when the MidiInPort was created to the time the message was received. For messages being sent to a MidiOutPort , this value has no meaning. */
  var timestamp: Double = js.native
  /** Gets the type of this MIDI message. */
  var `type`: MidiMessageType = js.native
}

