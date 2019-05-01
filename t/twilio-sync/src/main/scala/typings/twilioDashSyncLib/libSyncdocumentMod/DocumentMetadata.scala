package typings
package twilioDashSyncLib.libSyncdocumentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentMetadata extends js.Object {
  var ttl: js.UndefOr[scala.Double] = js.undefined
}

object DocumentMetadata {
  @scala.inline
  def apply(ttl: scala.Int | scala.Double = null): DocumentMetadata = {
    val __obj = js.Dynamic.literal()
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentMetadata]
  }
}

