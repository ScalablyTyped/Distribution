package typings.webmidi.WebMidi

import typings.std.Event_
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MIDIMessageEvent extends Event_ {
  /**
    * A Uint8Array containing the MIDI data bytes of a single MIDI message.
    */
  var data: Uint8Array = js.native
  /**
    * A timestamp specifying when the event occurred.
    */
  var receivedTime: Double = js.native
}

