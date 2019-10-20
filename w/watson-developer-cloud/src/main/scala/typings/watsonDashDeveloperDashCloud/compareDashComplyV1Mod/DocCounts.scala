package typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Document counts. */
trait DocCounts extends js.Object {
  /** Number of documents not successfully processed. */
  var failed: js.UndefOr[Double] = js.undefined
  /** Number of pending documents. */
  var pending: js.UndefOr[Double] = js.undefined
  /** Number of documents successfully processed. */
  var successful: js.UndefOr[Double] = js.undefined
  /** Total number of documents. */
  var total: js.UndefOr[Double] = js.undefined
}

object DocCounts {
  @scala.inline
  def apply(
    failed: Int | Double = null,
    pending: Int | Double = null,
    successful: Int | Double = null,
    total: Int | Double = null
  ): DocCounts = {
    val __obj = js.Dynamic.literal()
    if (failed != null) __obj.updateDynamic("failed")(failed.asInstanceOf[js.Any])
    if (pending != null) __obj.updateDynamic("pending")(pending.asInstanceOf[js.Any])
    if (successful != null) __obj.updateDynamic("successful")(successful.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocCounts]
  }
}

