package typings.twilioSync.syncdocumentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentMetadata extends js.Object {
  var ttl: js.UndefOr[Double] = js.undefined
}

object DocumentMetadata {
  @scala.inline
  def apply(ttl: js.UndefOr[Double] = js.undefined): DocumentMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ttl)) __obj.updateDynamic("ttl")(ttl.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentMetadata]
  }
}

