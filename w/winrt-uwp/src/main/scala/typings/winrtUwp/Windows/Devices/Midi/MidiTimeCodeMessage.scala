package typings.winrtUwp.Windows.Devices.Midi

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a MIDI message that specifies a time code. */
trait MidiTimeCodeMessage extends StObject {
  
  /** Gets the value of the frame type from 0-7. */
  var frameType: Double
  
  /** Gets the array of bytes associated with the MIDI message, including status byte. */
  var rawData: IBuffer
  
  /** Gets the duration from when the MidiInPort was created to the time the message was received. For messages being sent to a MidiOutPort , this value has no meaning. */
  var timestamp: Double
  
  /** Gets the type of this MIDI message. */
  var `type`: MidiMessageType
  
  /** Gets the time code value from 0-32. */
  var values: Double
}
object MidiTimeCodeMessage {
  
  inline def apply(frameType: Double, rawData: IBuffer, timestamp: Double, `type`: MidiMessageType, values: Double): MidiTimeCodeMessage = {
    val __obj = js.Dynamic.literal(frameType = frameType.asInstanceOf[js.Any], rawData = rawData.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MidiTimeCodeMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MidiTimeCodeMessage] (val x: Self) extends AnyVal {
    
    inline def setFrameType(value: Double): Self = StObject.set(x, "frameType", value.asInstanceOf[js.Any])
    
    inline def setRawData(value: IBuffer): Self = StObject.set(x, "rawData", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: MidiMessageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValues(value: Double): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
