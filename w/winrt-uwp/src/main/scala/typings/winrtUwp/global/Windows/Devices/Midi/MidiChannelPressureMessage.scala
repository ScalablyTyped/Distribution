package typings.winrtUwp.global.Windows.Devices.Midi

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a MIDI message that specifies the channel pressure. */
@JSGlobal("Windows.Devices.Midi.MidiChannelPressureMessage")
@js.native
class MidiChannelPressureMessage protected ()
  extends typings.winrtUwp.Windows.Devices.Midi.MidiChannelPressureMessage {
  /**
    * Creates a new MidiChannelPressureMessage object.
    * @param channel The channel from 0-15 that this message applies to.
    * @param pressure The pressure from 0-127.
    */
  def this(channel: Double, pressure: Double) = this()
  /** Gets the channel from 0-15 that this message applies to. */
  /* CompleteClass */
  override var channel: Double = js.native
  /** Gets the pressure from 0-127. */
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

