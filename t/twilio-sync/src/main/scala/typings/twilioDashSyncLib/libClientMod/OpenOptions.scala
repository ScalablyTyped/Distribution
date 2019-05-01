package typings
package twilioDashSyncLib.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenOptions extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var mode: js.UndefOr[OpenMode] = js.undefined
  var ttl: js.UndefOr[scala.Double] = js.undefined
}

object OpenOptions {
  @scala.inline
  def apply(id: java.lang.String = null, mode: OpenMode = null, ttl: scala.Int | scala.Double = null): OpenOptions = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenOptions]
  }
}

