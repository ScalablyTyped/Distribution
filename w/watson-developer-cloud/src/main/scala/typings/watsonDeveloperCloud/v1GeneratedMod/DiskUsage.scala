package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Summary of the disk usage statistics for the environment. */
trait DiskUsage extends js.Object {
  /** Total number of bytes available in the environment's disk capacity. */
  var maximum_allowed_bytes: js.UndefOr[Double] = js.undefined
  /** Number of bytes within the environment's disk capacity that are currently used to store data. */
  var used_bytes: js.UndefOr[Double] = js.undefined
}

object DiskUsage {
  @scala.inline
  def apply(maximum_allowed_bytes: Int | Double = null, used_bytes: Int | Double = null): DiskUsage = {
    val __obj = js.Dynamic.literal()
    if (maximum_allowed_bytes != null) __obj.updateDynamic("maximum_allowed_bytes")(maximum_allowed_bytes.asInstanceOf[js.Any])
    if (used_bytes != null) __obj.updateDynamic("used_bytes")(used_bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiskUsage]
  }
}

