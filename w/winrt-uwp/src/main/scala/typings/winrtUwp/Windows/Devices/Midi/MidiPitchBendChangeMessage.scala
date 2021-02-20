package typings.winrtUwp.Windows.Devices.Midi

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a MIDI message that specifies a pitch bend change. */
@js.native
trait MidiPitchBendChangeMessage extends StObject {
  
  /** Gets the pitch bend value which is specified as a 14-bit value from 0-16383. */
  var bend: Double = js.native
  
  /** Gets the channel from 0-15 that this message applies to. */
  var channel: Double = js.native
  
  /** Gets the array of bytes associated with the MIDI message, including status byte. */
  var rawData: IBuffer = js.native
  
  /** Gets the duration from when the MidiInPort was created to the time the message was received. For messages being sent to a MidiOutPort , this value has no meaning. */
  var timestamp: Double = js.native
  
  /** Gets the type of this MIDI message. */
  var `type`: MidiMessageType = js.native
}
object MidiPitchBendChangeMessage {
  
  @scala.inline
  def apply(bend: Double, channel: Double, rawData: IBuffer, timestamp: Double, `type`: MidiMessageType): MidiPitchBendChangeMessage = {
    val __obj = js.Dynamic.literal(bend = bend.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], rawData = rawData.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MidiPitchBendChangeMessage]
  }
  
  @scala.inline
  implicit class MidiPitchBendChangeMessageMutableBuilder[Self <: MidiPitchBendChangeMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBend(value: Double): Self = StObject.set(x, "bend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannel(value: Double): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawData(value: IBuffer): Self = StObject.set(x, "rawData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MidiMessageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
