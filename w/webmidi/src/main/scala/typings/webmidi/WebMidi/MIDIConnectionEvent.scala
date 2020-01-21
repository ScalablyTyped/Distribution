package typings.webmidi.WebMidi

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MIDIConnectionEvent extends Event_ {
  /**
    * The port that has been connected or disconnected.
    */
  var port: MIDIPort = js.native
}

