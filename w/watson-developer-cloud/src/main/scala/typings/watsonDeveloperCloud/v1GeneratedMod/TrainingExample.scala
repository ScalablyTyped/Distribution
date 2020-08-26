package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** TrainingExample. */
@js.native
trait TrainingExample extends js.Object {
  /** The cross reference associated with this training example. */
  var cross_reference: js.UndefOr[String] = js.native
  /** The document ID associated with this training example. */
  var document_id: js.UndefOr[String] = js.native
  /** The relevance of the training example. */
  var relevance: js.UndefOr[Double] = js.native
}

object TrainingExample {
  @scala.inline
  def apply(): TrainingExample = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrainingExample]
  }
  @scala.inline
  implicit class TrainingExampleOps[Self <: TrainingExample] (val x: Self) extends AnyVal {
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
    def setCross_reference(value: String): Self = this.set("cross_reference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCross_reference: Self = this.set("cross_reference", js.undefined)
    @scala.inline
    def setDocument_id(value: String): Self = this.set("document_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocument_id: Self = this.set("document_id", js.undefined)
    @scala.inline
    def setRelevance(value: Double): Self = this.set("relevance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelevance: Self = this.set("relevance", js.undefined)
  }
  
}

