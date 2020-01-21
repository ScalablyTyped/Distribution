package typings.twilioSync.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenMapOptions extends OpenOptions {
  var includeItems: js.UndefOr[Boolean] = js.undefined
}

object OpenMapOptions {
  @scala.inline
  def apply(
    id: String = null,
    includeItems: js.UndefOr[Boolean] = js.undefined,
    mode: OpenMode = null,
    ttl: Int | Double = null
  ): OpenMapOptions = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(includeItems)) __obj.updateDynamic("includeItems")(includeItems.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenMapOptions]
  }
}

