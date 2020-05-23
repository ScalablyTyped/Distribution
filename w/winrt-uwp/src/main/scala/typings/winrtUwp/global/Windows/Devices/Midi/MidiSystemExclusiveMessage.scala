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
  /** Gets the array of bytes associated with the MIDI message, including status byte. */
  /* CompleteClass */
  override var rawData: IBuffer = js.native
  /** Gets the duration from when the MidiInPort was created to the time the message was received. For messages being sent to a MidiOutPort , this value has no meaning. */
  /* CompleteClass */
  override var timestamp: Double = js.native
  /** Gets the type of this MIDI message. */
  /* CompleteClass */
  override var `type`: typings.winrtUwp.Windows.Devices.Midi.MidiMessageType = js.native
}

