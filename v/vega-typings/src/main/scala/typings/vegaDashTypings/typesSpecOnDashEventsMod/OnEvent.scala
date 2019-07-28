package typings.vegaDashTypings.typesSpecOnDashEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnEvent extends js.Object {
  var encode: js.UndefOr[String] = js.undefined
  var events: Events | js.Array[EventListener]
  var force: js.UndefOr[Boolean] = js.undefined
  var update: js.UndefOr[Update] = js.undefined
}

object OnEvent {
  @scala.inline
  def apply(
    events: Events | js.Array[EventListener],
    encode: String = null,
    force: js.UndefOr[Boolean] = js.undefined,
    update: Update = null
  ): OnEvent = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    if (encode != null) __obj.updateDynamic("encode")(encode)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnEvent]
  }
}

