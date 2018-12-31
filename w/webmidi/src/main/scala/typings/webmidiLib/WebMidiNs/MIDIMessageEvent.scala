package typings
package webmidiLib.WebMidiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MIDIMessageEvent
  extends stdLib.Event {
  /**
    * A Uint8Array containing the MIDI data bytes of a single MIDI message.
    */
  var data: stdLib.Uint8Array = js.native
  /**
    * A timestamp specifying when the event occurred.
    */
  var receivedTime: scala.Double = js.native
}

