package typings.twilioDashSync.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenDocumentOptions extends OpenOptions {
  var value: js.UndefOr[json] = js.undefined
}

object OpenDocumentOptions {
  @scala.inline
  def apply(id: String = null, mode: OpenMode = null, ttl: Int | Double = null, value: json = null): OpenDocumentOptions = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[OpenDocumentOptions]
  }
}

