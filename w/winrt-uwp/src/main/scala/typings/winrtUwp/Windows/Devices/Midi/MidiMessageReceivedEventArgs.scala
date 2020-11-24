package typings.winrtUwp.Windows.Devices.Midi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the MessageReceived event. */
@js.native
trait MidiMessageReceivedEventArgs extends js.Object {
  
  /** The MIDI message. */
  var message: IMidiMessage = js.native
}
object MidiMessageReceivedEventArgs {
  
  @scala.inline
  def apply(message: IMidiMessage): MidiMessageReceivedEventArgs = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MidiMessageReceivedEventArgs]
  }
  
  @scala.inline
  implicit class MidiMessageReceivedEventArgsOps[Self <: MidiMessageReceivedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: IMidiMessage): Self = this.set("message", value.asInstanceOf[js.Any])
  }
}
