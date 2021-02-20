package typings.winrtUwp.Windows.Devices.Midi

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a MIDI message that specifies the selected song. */
@js.native
trait MidiSongSelectMessage extends StObject {
  
  /** Gets the array of bytes associated with the MIDI message, including status byte. */
  var rawData: IBuffer = js.native
  
  /** Gets the song to select from 0-127. */
  var song: Double = js.native
  
  /** Gets the duration from when the MidiInPort was created to the time the message was received. For messages being sent to a MidiOutPort , this value has no meaning. */
  var timestamp: Double = js.native
  
  /** Gets the type of this MIDI message. */
  var `type`: MidiMessageType = js.native
}
object MidiSongSelectMessage {
  
  @scala.inline
  def apply(rawData: IBuffer, song: Double, timestamp: Double, `type`: MidiMessageType): MidiSongSelectMessage = {
    val __obj = js.Dynamic.literal(rawData = rawData.asInstanceOf[js.Any], song = song.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MidiSongSelectMessage]
  }
  
  @scala.inline
  implicit class MidiSongSelectMessageMutableBuilder[Self <: MidiSongSelectMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRawData(value: IBuffer): Self = StObject.set(x, "rawData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSong(value: Double): Self = StObject.set(x, "song", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MidiMessageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
