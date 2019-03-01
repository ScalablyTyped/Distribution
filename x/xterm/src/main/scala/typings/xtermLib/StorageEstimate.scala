package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageEstimate extends js.Object {
  var quota: js.UndefOr[scala.Double] = js.undefined
  var usage: js.UndefOr[scala.Double] = js.undefined
}

object StorageEstimate {
  @scala.inline
  def apply(quota: scala.Int | scala.Double = null, usage: scala.Int | scala.Double = null): StorageEstimate = {
    val __obj = js.Dynamic.literal()
    if (quota != null) __obj.updateDynamic("quota")(quota.asInstanceOf[js.Any])
    if (usage != null) __obj.updateDynamic("usage")(usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageEstimate]
  }
}

