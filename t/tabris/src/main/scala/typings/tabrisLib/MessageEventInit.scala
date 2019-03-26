package typings
package tabrisLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageEventInit extends EventInit {
  var channel: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var lastEventId: js.UndefOr[java.lang.String] = js.undefined
  var origin: js.UndefOr[java.lang.String] = js.undefined
  var ports: js.UndefOr[js.Array[MessagePort]] = js.undefined
  var source: js.UndefOr[js.Any] = js.undefined
}

object MessageEventInit {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    channel: java.lang.String = null,
    data: js.Any = null,
    lastEventId: java.lang.String = null,
    origin: java.lang.String = null,
    ports: js.Array[MessagePort] = null,
    source: js.Any = null
  ): MessageEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (channel != null) __obj.updateDynamic("channel")(channel)
    if (data != null) __obj.updateDynamic("data")(data)
    if (lastEventId != null) __obj.updateDynamic("lastEventId")(lastEventId)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (ports != null) __obj.updateDynamic("ports")(ports)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[MessageEventInit]
  }
}

