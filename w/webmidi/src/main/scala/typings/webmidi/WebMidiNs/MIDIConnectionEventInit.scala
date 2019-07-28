package typings.webmidi.WebMidiNs

import typings.std.EventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MIDIConnectionEventInit extends EventInit {
  /**
    * The port that has been connected or disconnected.
    */
  var port: MIDIPort
}

object MIDIConnectionEventInit {
  @scala.inline
  def apply(
    port: MIDIPort,
    bubbles: js.UndefOr[Boolean] = js.undefined,
    cancelable: js.UndefOr[Boolean] = js.undefined,
    composed: js.UndefOr[Boolean] = js.undefined
  ): MIDIConnectionEventInit = {
    val __obj = js.Dynamic.literal(port = port)
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    __obj.asInstanceOf[MIDIConnectionEventInit]
  }
}

