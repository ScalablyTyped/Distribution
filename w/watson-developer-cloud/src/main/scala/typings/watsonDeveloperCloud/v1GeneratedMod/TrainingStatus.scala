package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** TrainingStatus. */
@js.native
trait TrainingStatus extends js.Object {
  /** When `true`, the collection has been successfully trained. */
  var available: js.UndefOr[Boolean] = js.native
  /** The timestamp of when the data was uploaded. */
  var data_updated: js.UndefOr[String] = js.native
  /** When `true`, the collection has a sufficent amount of examples added for training to occur. */
  var minimum_examples_added: js.UndefOr[Boolean] = js.native
  /** When `true`, the collection has a sufficent amount of queries added for training to occur. */
  var minimum_queries_added: js.UndefOr[Boolean] = js.native
  /** The number of notices associated with this data set. */
  var notices: js.UndefOr[Double] = js.native
  /** When `true`, the collection is currently processing training. */
  var processing: js.UndefOr[Boolean] = js.native
  /** The timestamp of when the collection was successfully trained. */
  var successfully_trained: js.UndefOr[String] = js.native
  /** When `true`, the collection has a sufficent amount of diversity in labeled results for training to occur. */
  var sufficient_label_diversity: js.UndefOr[Boolean] = js.native
  /** The total number of training examples uploaded to this collection. */
  var total_examples: js.UndefOr[Double] = js.native
}

object TrainingStatus {
  @scala.inline
  def apply(): TrainingStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrainingStatus]
  }
  @scala.inline
  implicit class TrainingStatusOps[Self <: TrainingStatus] (val x: Self) extends AnyVal {
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
    def setAvailable(value: Boolean): Self = this.set("available", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailable: Self = this.set("available", js.undefined)
    @scala.inline
    def setData_updated(value: String): Self = this.set("data_updated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData_updated: Self = this.set("data_updated", js.undefined)
    @scala.inline
    def setMinimum_examples_added(value: Boolean): Self = this.set("minimum_examples_added", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimum_examples_added: Self = this.set("minimum_examples_added", js.undefined)
    @scala.inline
    def setMinimum_queries_added(value: Boolean): Self = this.set("minimum_queries_added", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimum_queries_added: Self = this.set("minimum_queries_added", js.undefined)
    @scala.inline
    def setNotices(value: Double): Self = this.set("notices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotices: Self = this.set("notices", js.undefined)
    @scala.inline
    def setProcessing(value: Boolean): Self = this.set("processing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessing: Self = this.set("processing", js.undefined)
    @scala.inline
    def setSuccessfully_trained(value: String): Self = this.set("successfully_trained", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccessfully_trained: Self = this.set("successfully_trained", js.undefined)
    @scala.inline
    def setSufficient_label_diversity(value: Boolean): Self = this.set("sufficient_label_diversity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSufficient_label_diversity: Self = this.set("sufficient_label_diversity", js.undefined)
    @scala.inline
    def setTotal_examples(value: Double): Self = this.set("total_examples", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal_examples: Self = this.set("total_examples", js.undefined)
  }
  
}

