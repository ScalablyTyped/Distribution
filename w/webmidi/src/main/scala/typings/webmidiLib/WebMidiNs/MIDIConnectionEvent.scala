package typings
package webmidiLib.WebMidiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MIDIConnectionEvent
  extends stdLib.Event {
  /**
       * The port that has been connected or disconnected.
       */
  var port: MIDIPort = js.native
}

