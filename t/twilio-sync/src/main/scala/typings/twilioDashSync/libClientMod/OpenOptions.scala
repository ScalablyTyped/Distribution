package typings.twilioDashSync.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenOptions extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var mode: js.UndefOr[OpenMode] = js.undefined
  var ttl: js.UndefOr[Double] = js.undefined
}

object OpenOptions {
  @scala.inline
  def apply(id: String = null, mode: OpenMode = null, ttl: Int | Double = null): OpenOptions = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenOptions]
  }
}

