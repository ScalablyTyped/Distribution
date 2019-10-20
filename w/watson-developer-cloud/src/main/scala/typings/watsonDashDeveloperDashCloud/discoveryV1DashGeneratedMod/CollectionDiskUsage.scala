package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

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
  def apply(used_bytes: Int | Double = null): CollectionDiskUsage = {
    val __obj = js.Dynamic.literal()
    if (used_bytes != null) __obj.updateDynamic("used_bytes")(used_bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionDiskUsage]
  }
}

