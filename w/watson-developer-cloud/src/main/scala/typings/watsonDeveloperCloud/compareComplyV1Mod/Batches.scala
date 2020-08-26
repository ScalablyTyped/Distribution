package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The results of a successful `GET /v1/batches` request. */
@js.native
trait Batches extends js.Object {
  /** A list of the status of all batch requests. */
  var batches: js.UndefOr[js.Array[BatchStatus]] = js.native
}

object Batches {
  @scala.inline
  def apply(): Batches = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Batches]
  }
  @scala.inline
  implicit class BatchesOps[Self <: Batches] (val x: Self) extends AnyVal {
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
    def setBatchesVarargs(value: BatchStatus*): Self = this.set("batches", js.Array(value :_*))
    @scala.inline
    def setBatches(value: js.Array[BatchStatus]): Self = this.set("batches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatches: Self = this.set("batches", js.undefined)
  }
  
}

