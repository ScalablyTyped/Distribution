package typings.twilioSync.synclistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemMetadata extends js.Object {
  var ttl: js.UndefOr[Double] = js.undefined
}

object ItemMetadata {
  @scala.inline
  def apply(ttl: js.UndefOr[Double] = js.undefined): ItemMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ttl)) __obj.updateDynamic("ttl")(ttl.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemMetadata]
  }
}

