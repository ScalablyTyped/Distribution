package typings.winrtUwp.Windows.Devices.Midi

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a MIDI message that specifies a control change. */
@js.native
trait MidiControlChangeMessage extends js.Object {
  
  /** Gets the channel from 0-15 that this message applies to. */
  var channel: Double = js.native
  
  /** Gets the value from 0-127 to apply to the controller . */
  var controlValue: Double = js.native
  
  /** Gets controller from 0-127 to receive this message. */
  var controller: Double = js.native
  
  /** Gets the array of bytes associated with the MIDI message, including status byte. */
  var rawData: IBuffer = js.native
  
  /** Gets the duration from when the MidiInPort was created to the time the message was received. For messages being sent to a MidiOutPort , this value has no meaning. */
  var timestamp: Double = js.native
  
  /** Gets the type of this MIDI message. */
  var `type`: MidiMessageType = js.native
}
object MidiControlChangeMessage {
  
  @scala.inline
  def apply(
    channel: Double,
    controlValue: Double,
    controller: Double,
    rawData: IBuffer,
    timestamp: Double,
    `type`: MidiMessageType
  ): MidiControlChangeMessage = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], controlValue = controlValue.asInstanceOf[js.Any], controller = controller.asInstanceOf[js.Any], rawData = rawData.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MidiControlChangeMessage]
  }
  
  @scala.inline
  implicit class MidiControlChangeMessageOps[Self <: MidiControlChangeMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChannel(value: Double): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlValue(value: Double): Self = this.set("controlValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setController(value: Double): Self = this.set("controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawData(value: IBuffer): Self = this.set("rawData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MidiMessageType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
