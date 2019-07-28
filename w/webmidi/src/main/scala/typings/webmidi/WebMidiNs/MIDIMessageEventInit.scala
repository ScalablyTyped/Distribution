package typings.webmidi.WebMidiNs

import typings.std.EventInit
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MIDIMessageEventInit extends EventInit {
  /**
    * A Uint8Array containing the MIDI data bytes of a single MIDI message.
    */
  var data: Uint8Array
  /**
    * A timestamp specifying when the event occurred.
    */
  var receivedTime: Double
}

object MIDIMessageEventInit {
  @scala.inline
  def apply(
    data: Uint8Array,
    receivedTime: Double,
    bubbles: js.UndefOr[Boolean] = js.undefined,
    cancelable: js.UndefOr[Boolean] = js.undefined,
    composed: js.UndefOr[Boolean] = js.undefined
  ): MIDIMessageEventInit = {
    val __obj = js.Dynamic.literal(data = data, receivedTime = receivedTime)
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    __obj.asInstanceOf[MIDIMessageEventInit]
  }
}

