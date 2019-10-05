package typings.webmidi.WebMidi

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MIDIConnectionEvent extends Event {
  /**
    * The port that has been connected or disconnected.
    */
  var port: MIDIPort = js.native
}

