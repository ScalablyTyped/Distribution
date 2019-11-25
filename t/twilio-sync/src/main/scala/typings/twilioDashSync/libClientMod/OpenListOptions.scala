package typings.twilioDashSync.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenListOptions extends OpenOptions {
  var context: js.UndefOr[json] = js.undefined
  var includeItems: js.UndefOr[Boolean] = js.undefined
  var purpose: js.UndefOr[String] = js.undefined
}

object OpenListOptions {
  @scala.inline
  def apply(
    context: json = null,
    id: String = null,
    includeItems: js.UndefOr[Boolean] = js.undefined,
    mode: OpenMode = null,
    purpose: String = null,
    ttl: Int | Double = null
  ): OpenListOptions = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(includeItems)) __obj.updateDynamic("includeItems")(includeItems.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (purpose != null) __obj.updateDynamic("purpose")(purpose.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenListOptions]
  }
}

