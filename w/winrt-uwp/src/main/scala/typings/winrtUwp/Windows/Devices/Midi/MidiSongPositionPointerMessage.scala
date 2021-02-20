package typings.winrtUwp.Windows.Devices.Midi

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a MIDI message that specifies a song position pointer. */
@js.native
trait MidiSongPositionPointerMessage extends StObject {
  
  /** Gets the song position pointer encoded in a 14-bit value from 0-16383. */
  var beats: Double = js.native
  
  /** Gets the array of bytes associated with the MIDI message, including status byte. */
  var rawData: IBuffer = js.native
  
  /** Gets the duration from when the MidiInPort was created to the time the message was received. For messages being sent to a MidiOutPort , this value has no meaning. */
  var timestamp: Double = js.native
  
  /** Gets the type of this MIDI message. */
  var `type`: MidiMessageType = js.native
}
object MidiSongPositionPointerMessage {
  
  @scala.inline
  def apply(beats: Double, rawData: IBuffer, timestamp: Double, `type`: MidiMessageType): MidiSongPositionPointerMessage = {
    val __obj = js.Dynamic.literal(beats = beats.asInstanceOf[js.Any], rawData = rawData.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MidiSongPositionPointerMessage]
  }
  
  @scala.inline
  implicit class MidiSongPositionPointerMessageMutableBuilder[Self <: MidiSongPositionPointerMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeats(value: Double): Self = StObject.set(x, "beats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawData(value: IBuffer): Self = StObject.set(x, "rawData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MidiMessageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
