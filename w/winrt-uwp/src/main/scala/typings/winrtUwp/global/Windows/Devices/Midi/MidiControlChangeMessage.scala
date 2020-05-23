package typings.winrtUwp.global.Windows.Devices.Midi

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a MIDI message that specifies a control change. */
@JSGlobal("Windows.Devices.Midi.MidiControlChangeMessage")
@js.native
class MidiControlChangeMessage protected ()
  extends typings.winrtUwp.Windows.Devices.Midi.MidiControlChangeMessage {
  /**
    * Creates a new MidiControlChangeMessage object.
    * @param channel The channel from 0-15 that this message applies to.
    * @param controller The controller from 0-127 to receive this message.
    * @param controlValue The value from 0-127 to apply to the controller .
    */
  def this(channel: Double, controller: Double, controlValue: Double) = this()
  /** Gets the channel from 0-15 that this message applies to. */
  /* CompleteClass */
  override var channel: Double = js.native
  /** Gets the value from 0-127 to apply to the controller . */
  /* CompleteClass */
  override var controlValue: Double = js.native
  /** Gets controller from 0-127 to receive this message. */
  /* CompleteClass */
  override var controller: Double = js.native
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

