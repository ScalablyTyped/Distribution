package typings.winrtUwp.global.Windows.Devices.Midi

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a MIDI messages that specifies a MIDI note to turn off. */
@JSGlobal("Windows.Devices.Midi.MidiNoteOffMessage")
@js.native
class MidiNoteOffMessage protected ()
  extends typings.winrtUwp.Windows.Devices.Midi.MidiNoteOffMessage {
  /**
    * Creates a new MidiNoteOffMessage object.
    * @param channel The channel from 0-15 that this message applies to.
    * @param note The note which is specified as a value from 0-127.
    * @param velocity The velocity which is specified as a value from 0-127.
    */
  def this(channel: Double, note: Double, velocity: Double) = this()
  /** Gets the channel from 0-15 that this message applies to. */
  /* CompleteClass */
  override var channel: Double = js.native
  /** Gets the note to turn off which is specified as a value from 0-127. */
  /* CompleteClass */
  override var note: Double = js.native
  /** Gets the array of bytes associated with the MIDI message, including status byte. */
  /* CompleteClass */
  override var rawData: IBuffer = js.native
  /** Gets the duration from when the MidiInPort was created to the time the message was received. For messages being sent to a MidiOutPort , this value has no meaning. */
  /* CompleteClass */
  override var timestamp: Double = js.native
  /** Gets the type of this MIDI message. */
  /* CompleteClass */
  override var `type`: typings.winrtUwp.Windows.Devices.Midi.MidiMessageType = js.native
  /** Gets the value of the velocity from 0-127. */
  /* CompleteClass */
  override var velocity: Double = js.native
}

