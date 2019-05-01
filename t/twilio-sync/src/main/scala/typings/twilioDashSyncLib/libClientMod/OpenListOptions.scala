package typings
package twilioDashSyncLib.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenListOptions extends OpenOptions {
  var context: js.UndefOr[json] = js.undefined
  var includeItems: js.UndefOr[scala.Boolean] = js.undefined
  var purpose: js.UndefOr[java.lang.String] = js.undefined
}

object OpenListOptions {
  @scala.inline
  def apply(
    context: json = null,
    id: java.lang.String = null,
    includeItems: js.UndefOr[scala.Boolean] = js.undefined,
    mode: OpenMode = null,
    purpose: java.lang.String = null,
    ttl: scala.Int | scala.Double = null
  ): OpenListOptions = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(includeItems)) __obj.updateDynamic("includeItems")(includeItems)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (purpose != null) __obj.updateDynamic("purpose")(purpose)
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenListOptions]
  }
}

