package typings.winrtUwp.global.Windows.Devices.Midi

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a MIDI message that specifies the polyphonic key pressure. */
@JSGlobal("Windows.Devices.Midi.MidiPolyphonicKeyPressureMessage")
@js.native
class MidiPolyphonicKeyPressureMessage protected ()
  extends typings.winrtUwp.Windows.Devices.Midi.MidiPolyphonicKeyPressureMessage {
  /**
    * Creates a new MidiPolyphonicKeyPressureMessage object.
    * @param channel The channel from 0-15 that this message applies to.
    * @param note The note which is specified as a value from 0-127.
    * @param pressure The polyphonic key pressure which is specified as a value from 0-127.
    */
  def this(channel: Double, note: Double, pressure: Double) = this()
  /** Gets the channel from 0-15 that this message applies to. */
  /* CompleteClass */
  override var channel: Double = js.native
  /** Gets the note which is specified as a value from 0-127. */
  /* CompleteClass */
  override var note: Double = js.native
  /** Gets the polyphonic key pressure which is specified as a value from 0-127. */
  /* CompleteClass */
  override var pressure: Double = js.native
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

