package typings.winrtUwp.global.Windows.Devices.Midi

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a MIDI message that specifies a pitch bend change. */
@JSGlobal("Windows.Devices.Midi.MidiPitchBendChangeMessage")
@js.native
class MidiPitchBendChangeMessage protected ()
  extends typings.winrtUwp.Windows.Devices.Midi.MidiPitchBendChangeMessage {
  /**
    * Creates a new MidiPitchBendChangeMessage object.
    * @param channel The channel from 0-15 that this message applies to.
    * @param bend The pitch bend value which is specified as a 14-bit value from 0-16383.
    */
  def this(channel: Double, bend: Double) = this()
  /** Gets the pitch bend value which is specified as a 14-bit value from 0-16383. */
  /* CompleteClass */
  override var bend: Double = js.native
  /** Gets the channel from 0-15 that this message applies to. */
  /* CompleteClass */
  override var channel: Double = js.native
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

