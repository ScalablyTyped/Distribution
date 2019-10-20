package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

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
    available: Int | Double = null,
    failed: Int | Double = null,
    pending: Int | Double = null,
    processing: Int | Double = null
  ): DocumentCounts = {
    val __obj = js.Dynamic.literal()
    if (available != null) __obj.updateDynamic("available")(available.asInstanceOf[js.Any])
    if (failed != null) __obj.updateDynamic("failed")(failed.asInstanceOf[js.Any])
    if (pending != null) __obj.updateDynamic("pending")(pending.asInstanceOf[js.Any])
    if (processing != null) __obj.updateDynamic("processing")(processing.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentCounts]
  }
}

