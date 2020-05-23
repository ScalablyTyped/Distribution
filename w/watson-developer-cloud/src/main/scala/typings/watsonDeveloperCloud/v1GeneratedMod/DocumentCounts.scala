package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** DocumentCounts. */
trait DocumentCounts extends js.Object {
  /** The total number of available documents in the collection. */
  var available: js.UndefOr[Double] = js.undefined
  /** The number of documents in the collection that failed to be ingested. */
  var failed: js.UndefOr[Double] = js.undefined
  /** The number of documents that have been uploaded to the collection, but have not yet started processing. */
  var pending: js.UndefOr[Double] = js.undefined
  /** The number of documents in the collection that are currently being processed. */
  var processing: js.UndefOr[Double] = js.undefined
}

object DocumentCounts {
  @scala.inline
  def apply(
    available: js.UndefOr[Double] = js.undefined,
    failed: js.UndefOr[Double] = js.undefined,
    pending: js.UndefOr[Double] = js.undefined,
    processing: js.UndefOr[Double] = js.undefined
  ): DocumentCounts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(available)) __obj.updateDynamic("available")(available.get.asInstanceOf[js.Any])
    if (!js.isUndefined(failed)) __obj.updateDynamic("failed")(failed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pending)) __obj.updateDynamic("pending")(pending.get.asInstanceOf[js.Any])
    if (!js.isUndefined(processing)) __obj.updateDynamic("processing")(processing.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentCounts]
  }
}

