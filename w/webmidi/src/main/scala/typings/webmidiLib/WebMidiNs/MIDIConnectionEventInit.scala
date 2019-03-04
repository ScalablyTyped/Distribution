package typings
package webmidiLib.WebMidiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MIDIConnectionEventInit
  extends stdLib.EventInit {
  /**
    * The port that has been connected or disconnected.
    */
  var port: MIDIPort
}

object MIDIConnectionEventInit {
  @scala.inline
  def apply(
    port: MIDIPort,
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined
  ): MIDIConnectionEventInit = {
    val __obj = js.Dynamic.literal(port = port)
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    __obj.asInstanceOf[MIDIConnectionEventInit]
  }
}

