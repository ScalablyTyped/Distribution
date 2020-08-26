package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** DocumentCounts. */
@js.native
trait DocumentCounts extends js.Object {
  /** The total number of available documents in the collection. */
  var available: js.UndefOr[Double] = js.native
  /** The number of documents in the collection that failed to be ingested. */
  var failed: js.UndefOr[Double] = js.native
  /** The number of documents that have been uploaded to the collection, but have not yet started processing. */
  var pending: js.UndefOr[Double] = js.native
  /** The number of documents in the collection that are currently being processed. */
  var processing: js.UndefOr[Double] = js.native
}

object DocumentCounts {
  @scala.inline
  def apply(): DocumentCounts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentCounts]
  }
  @scala.inline
  implicit class DocumentCountsOps[Self <: DocumentCounts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAvailable(value: Double): Self = this.set("available", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailable: Self = this.set("available", js.undefined)
    @scala.inline
    def setFailed(value: Double): Self = this.set("failed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailed: Self = this.set("failed", js.undefined)
    @scala.inline
    def setPending(value: Double): Self = this.set("pending", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePending: Self = this.set("pending", js.undefined)
    @scala.inline
    def setProcessing(value: Double): Self = this.set("processing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessing: Self = this.set("processing", js.undefined)
  }
  
}

