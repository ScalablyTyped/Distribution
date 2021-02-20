package typings.winrtUwp.Windows.Devices.Midi

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a MIDI message that specifies a program change. */
@js.native
trait MidiProgramChangeMessage extends StObject {
  
  /** Gets the channel from 0-15 that this message applies to. */
  var channel: Double = js.native
  
  /** Gets the program to change from 0-127. */
  var program: Double = js.native
  
  /** Gets the array of bytes associated with the MIDI message, including status byte. */
  var rawData: IBuffer = js.native
  
  /** Gets the duration from when the MidiInPort was created to the time the message was received. For messages being sent to a MidiOutPort , this value has no meaning. */
  var timestamp: Double = js.native
  
  /** Gets the type of this MIDI message. */
  var `type`: MidiMessageType = js.native
}
object MidiProgramChangeMessage {
  
  @scala.inline
  def apply(channel: Double, program: Double, rawData: IBuffer, timestamp: Double, `type`: MidiMessageType): MidiProgramChangeMessage = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any], rawData = rawData.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MidiProgramChangeMessage]
  }
  
  @scala.inline
  implicit class MidiProgramChangeMessageMutableBuilder[Self <: MidiProgramChangeMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: Double): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgram(value: Double): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawData(value: IBuffer): Self = StObject.set(x, "rawData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MidiMessageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
