package typings.winrtUwp.Windows.Devices.Midi

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a MIDI message that specifies the channel pressure. */
trait MidiChannelPressureMessage extends StObject {
  
  /** Gets the channel from 0-15 that this message applies to. */
  var channel: Double
  
  /** Gets the pressure from 0-127. */
  var pressure: Double
  
  /** Gets the array of bytes associated with the MIDI message, including status byte. */
  var rawData: IBuffer
  
  /** Gets the duration from when the MidiInPort was created to the time the message was received. For messages being sent to a MidiOutPort , this value has no meaning. */
  var timestamp: Double
  
  /** Gets the type of this MIDI message. */
  var `type`: MidiMessageType
}
object MidiChannelPressureMessage {
  
  inline def apply(channel: Double, pressure: Double, rawData: IBuffer, timestamp: Double, `type`: MidiMessageType): MidiChannelPressureMessage = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], pressure = pressure.asInstanceOf[js.Any], rawData = rawData.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MidiChannelPressureMessage]
  }
  
  extension [Self <: MidiChannelPressureMessage](x: Self) {
    
    inline def setChannel(value: Double): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setPressure(value: Double): Self = StObject.set(x, "pressure", value.asInstanceOf[js.Any])
    
    inline def setRawData(value: IBuffer): Self = StObject.set(x, "rawData", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: MidiMessageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
