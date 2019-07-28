package typings.twilioDashSync.libSyncdocumentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentMetadata extends js.Object {
  var ttl: js.UndefOr[Double] = js.undefined
}

object DocumentMetadata {
  @scala.inline
  def apply(ttl: Int | Double = null): DocumentMetadata = {
    val __obj = js.Dynamic.literal()
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentMetadata]
  }
}

