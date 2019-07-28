package typings.twilioDashSync.libSyncmapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemMetadata extends js.Object {
  var ttl: js.UndefOr[Double] = js.undefined
}

object ItemMetadata {
  @scala.inline
  def apply(ttl: Int | Double = null): ItemMetadata = {
    val __obj = js.Dynamic.literal()
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemMetadata]
  }
}

