package typings.uuidApikey.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<uuid-apikey.uuid-apikey.UUIDOptions> */
trait PartialUUIDOptions extends js.Object {
  var noDashes: js.UndefOr[Boolean] = js.undefined
}

object PartialUUIDOptions {
  @scala.inline
  def apply(noDashes: js.UndefOr[Boolean] = js.undefined): PartialUUIDOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(noDashes)) __obj.updateDynamic("noDashes")(noDashes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialUUIDOptions]
  }
}

