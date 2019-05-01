package typings
package twilioDashSyncLib.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenMapOptions extends OpenOptions {
  var includeItems: js.UndefOr[scala.Boolean] = js.undefined
}

object OpenMapOptions {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    includeItems: js.UndefOr[scala.Boolean] = js.undefined,
    mode: OpenMode = null,
    ttl: scala.Int | scala.Double = null
  ): OpenMapOptions = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(includeItems)) __obj.updateDynamic("includeItems")(includeItems)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenMapOptions]
  }
}

