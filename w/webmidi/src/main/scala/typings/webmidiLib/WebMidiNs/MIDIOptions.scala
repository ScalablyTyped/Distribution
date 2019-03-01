package typings
package webmidiLib.WebMidiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MIDIOptions extends js.Object {
  /**
    * This member informs the system whether the ability to send and receive system
    * exclusive messages is requested or allowed on a given MIDIAccess object.
    */
  var sysex: scala.Boolean
}

object MIDIOptions {
  @scala.inline
  def apply(sysex: scala.Boolean): MIDIOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sysex")(sysex)
    __obj.asInstanceOf[MIDIOptions]
  }
}

