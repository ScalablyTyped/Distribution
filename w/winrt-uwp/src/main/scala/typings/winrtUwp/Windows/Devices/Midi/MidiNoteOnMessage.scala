package typings.winrtUwp.Windows.Devices.Midi

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a MIDI message that specifies a MIDI note to turn on. */
trait MidiNoteOnMessage extends StObject {
  
  /** Gets the channel from 0-15 that this message applies to. */
  var channel: Double
  
  /** Gets the note to turn on which is specified as a value from 0-127. */
  var note: Double
  
  /** Gets the array of bytes associated with the MIDI message, including status byte. */
  var rawData: IBuffer
  
  /** Gets the duration from when the MidiInPort was created to the time the message was received. For messages being sent to a MidiOutPort , this value has no meaning. */
  var timestamp: Double
  
  /** Gets the type of this MIDI message. */
  var `type`: MidiMessageType
  
  /** Gets the value of the velocity from 0-127. */
  var velocity: Double
}
object MidiNoteOnMessage {
  
  @scala.inline
  def apply(
    channel: Double,
    note: Double,
    rawData: IBuffer,
    timestamp: Double,
    `type`: MidiMessageType,
    velocity: Double
  ): MidiNoteOnMessage = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], rawData = rawData.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MidiNoteOnMessage]
  }
  
  @scala.inline
  implicit class MidiNoteOnMessageMutableBuilder[Self <: MidiNoteOnMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: Double): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNote(value: Double): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawData(value: IBuffer): Self = StObject.set(x, "rawData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MidiMessageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
  }
}
