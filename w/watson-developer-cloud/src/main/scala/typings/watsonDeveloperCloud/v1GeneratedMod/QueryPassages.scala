package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** QueryPassages. */
@js.native
trait QueryPassages extends js.Object {
  /** The unique identifier of the document from which the passage has been extracted. */
  var document_id: js.UndefOr[String] = js.native
  /** The position of the last character of the extracted passage in the originating field. */
  var end_offset: js.UndefOr[Double] = js.native
  /** The label of the field from which the passage has been extracted. */
  var field: js.UndefOr[String] = js.native
  /** The confidence score of the passages's analysis. A higher score indicates greater confidence. */
  var passage_score: js.UndefOr[Double] = js.native
  /** The content of the extracted passage. */
  var passage_text: js.UndefOr[String] = js.native
  /** The position of the first character of the extracted passage in the originating field. */
  var start_offset: js.UndefOr[Double] = js.native
}

object QueryPassages {
  @scala.inline
  def apply(): QueryPassages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryPassages]
  }
  @scala.inline
  implicit class QueryPassagesOps[Self <: QueryPassages] (val x: Self) extends AnyVal {
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
    def setDocument_id(value: String): Self = this.set("document_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocument_id: Self = this.set("document_id", js.undefined)
    @scala.inline
    def setEnd_offset(value: Double): Self = this.set("end_offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd_offset: Self = this.set("end_offset", js.undefined)
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setPassage_score(value: Double): Self = this.set("passage_score", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassage_score: Self = this.set("passage_score", js.undefined)
    @scala.inline
    def setPassage_text(value: String): Self = this.set("passage_text", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassage_text: Self = this.set("passage_text", js.undefined)
    @scala.inline
    def setStart_offset(value: Double): Self = this.set("start_offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart_offset: Self = this.set("start_offset", js.undefined)
  }
  
}

