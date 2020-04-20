package typings.tabris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageEventInit extends EventInit {
  var channel: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var lastEventId: js.UndefOr[String] = js.undefined
  var origin: js.UndefOr[String] = js.undefined
  var ports: js.UndefOr[js.Array[MessagePort]] = js.undefined
  var source: js.UndefOr[js.Any] = js.undefined
}

object MessageEventInit {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[Boolean] = js.undefined,
    cancelable: js.UndefOr[Boolean] = js.undefined,
    channel: String = null,
    data: js.Any = null,
    lastEventId: String = null,
    origin: String = null,
    ports: js.Array[MessagePort] = null,
    source: js.Any = null
  ): MessageEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (lastEventId != null) __obj.updateDynamic("lastEventId")(lastEventId.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (ports != null) __obj.updateDynamic("ports")(ports.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageEventInit]
  }
}

