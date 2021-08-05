package typings.winrtUwp.Windows.Devices.Midi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the MessageReceived event. */
trait MidiMessageReceivedEventArgs extends StObject {
  
  /** The MIDI message. */
  var message: IMidiMessage
}
object MidiMessageReceivedEventArgs {
  
  inline def apply(message: IMidiMessage): MidiMessageReceivedEventArgs = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MidiMessageReceivedEventArgs]
  }
  
  extension [Self <: MidiMessageReceivedEventArgs](x: Self) {
    
    inline def setMessage(value: IMidiMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
