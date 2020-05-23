package typings.watsonDeveloperCloud.compareComplyV1Mod

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
    failed: js.UndefOr[Double] = js.undefined,
    pending: js.UndefOr[Double] = js.undefined,
    successful: js.UndefOr[Double] = js.undefined,
    total: js.UndefOr[Double] = js.undefined
  ): DocCounts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(failed)) __obj.updateDynamic("failed")(failed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pending)) __obj.updateDynamic("pending")(pending.get.asInstanceOf[js.Any])
    if (!js.isUndefined(successful)) __obj.updateDynamic("successful")(successful.get.asInstanceOf[js.Any])
    if (!js.isUndefined(total)) __obj.updateDynamic("total")(total.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocCounts]
  }
}

