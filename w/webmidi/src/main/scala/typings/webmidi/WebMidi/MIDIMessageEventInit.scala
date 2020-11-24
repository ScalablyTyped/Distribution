package typings.webmidi.WebMidi

import typings.std.EventInit
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MIDIMessageEventInit extends EventInit {
  
  /**
    * A Uint8Array containing the MIDI data bytes of a single MIDI message.
    */
  var data: Uint8Array = js.native
  
  /**
    * A timestamp specifying when the event occurred.
    */
  var receivedTime: Double = js.native
}
object MIDIMessageEventInit {
  
  @scala.inline
  def apply(data: Uint8Array, receivedTime: Double): MIDIMessageEventInit = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], receivedTime = receivedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[MIDIMessageEventInit]
  }
  
  @scala.inline
  implicit class MIDIMessageEventInitOps[Self <: MIDIMessageEventInit] (val x: Self) extends AnyVal {
    
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
    def setData(value: Uint8Array): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedTime(value: Double): Self = this.set("receivedTime", value.asInstanceOf[js.Any])
  }
}
