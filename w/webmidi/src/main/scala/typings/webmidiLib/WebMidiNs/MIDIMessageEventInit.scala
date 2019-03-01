package typings
package webmidiLib.WebMidiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MIDIMessageEventInit
  extends stdLib.EventInit {
  /**
    * A Uint8Array containing the MIDI data bytes of a single MIDI message.
    */
  var data: stdLib.Uint8Array
  /**
    * A timestamp specifying when the event occurred.
    */
  var receivedTime: scala.Double
}

object MIDIMessageEventInit {
  @scala.inline
  def apply(
    data: stdLib.Uint8Array,
    receivedTime: scala.Double,
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined
  ): MIDIMessageEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("receivedTime")(receivedTime)
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    __obj.asInstanceOf[MIDIMessageEventInit]
  }
}

