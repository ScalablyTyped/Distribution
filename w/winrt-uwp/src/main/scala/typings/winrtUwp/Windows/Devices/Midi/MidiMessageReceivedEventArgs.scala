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
  
  @scala.inline
  def apply(message: IMidiMessage): MidiMessageReceivedEventArgs = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MidiMessageReceivedEventArgs]
  }
  
  @scala.inline
  implicit class MidiMessageReceivedEventArgsMutableBuilder[Self <: MidiMessageReceivedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: IMidiMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
