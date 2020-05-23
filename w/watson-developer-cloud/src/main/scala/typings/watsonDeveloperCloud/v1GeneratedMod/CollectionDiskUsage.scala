package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Summary of the disk usage statistics for this collection. */
trait CollectionDiskUsage extends js.Object {
  /** Number of bytes used by the collection. */
  var used_bytes: js.UndefOr[Double] = js.undefined
}

object CollectionDiskUsage {
  @scala.inline
  def apply(used_bytes: js.UndefOr[Double] = js.undefined): CollectionDiskUsage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(used_bytes)) __obj.updateDynamic("used_bytes")(used_bytes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionDiskUsage]
  }
}

