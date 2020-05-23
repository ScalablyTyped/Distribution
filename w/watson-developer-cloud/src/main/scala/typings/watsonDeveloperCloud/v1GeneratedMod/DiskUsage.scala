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
  def apply(
    maximum_allowed_bytes: js.UndefOr[Double] = js.undefined,
    used_bytes: js.UndefOr[Double] = js.undefined
  ): DiskUsage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maximum_allowed_bytes)) __obj.updateDynamic("maximum_allowed_bytes")(maximum_allowed_bytes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(used_bytes)) __obj.updateDynamic("used_bytes")(used_bytes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiskUsage]
  }
}

