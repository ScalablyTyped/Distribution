package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Each object in the **results** array corresponds to an individual document returned by the original query. */
@js.native
trait LogQueryResponseResultDocumentsResult extends js.Object {
  /** The **collection_id** of the document represented by this result. */
  var collection_id: js.UndefOr[String] = js.native
  /** The confidence score of the result's analysis. A higher score indicating greater confidence. */
  var confidence: js.UndefOr[Double] = js.native
  /** The **document_id** of the document that this result represents. */
  var document_id: js.UndefOr[String] = js.native
  /** The result rank of this document. A position of `1` indicates that it was the first returned result. */
  var position: js.UndefOr[Double] = js.native
  /** The raw score of this result. A higher score indicates a greater match to the query parameters. */
  var score: js.UndefOr[Double] = js.native
}

object LogQueryResponseResultDocumentsResult {
  @scala.inline
  def apply(): LogQueryResponseResultDocumentsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogQueryResponseResultDocumentsResult]
  }
  @scala.inline
  implicit class LogQueryResponseResultDocumentsResultOps[Self <: LogQueryResponseResultDocumentsResult] (val x: Self) extends AnyVal {
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
    def setCollection_id(value: String): Self = this.set("collection_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollection_id: Self = this.set("collection_id", js.undefined)
    @scala.inline
    def setConfidence(value: Double): Self = this.set("confidence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfidence: Self = this.set("confidence", js.undefined)
    @scala.inline
    def setDocument_id(value: String): Self = this.set("document_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocument_id: Self = this.set("document_id", js.undefined)
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setScore(value: Double): Self = this.set("score", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScore: Self = this.set("score", js.undefined)
  }
  
}

