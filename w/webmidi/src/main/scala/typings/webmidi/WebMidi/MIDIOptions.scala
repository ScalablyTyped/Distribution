package typings.webmidi.WebMidi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MIDIOptions extends js.Object {
  /**
    * This member informs the system whether the ability to send and receive system
    * exclusive messages is requested or allowed on a given MIDIAccess object.
    */
  var sysex: Boolean
}

object MIDIOptions {
  @scala.inline
  def apply(sysex: Boolean): MIDIOptions = {
    val __obj = js.Dynamic.literal(sysex = sysex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MIDIOptions]
  }
}

