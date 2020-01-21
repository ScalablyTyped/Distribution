package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** QueryPassages. */
trait QueryPassages extends js.Object {
  /** The unique identifier of the document from which the passage has been extracted. */
  var document_id: js.UndefOr[String] = js.undefined
  /** The position of the last character of the extracted passage in the originating field. */
  var end_offset: js.UndefOr[Double] = js.undefined
  /** The label of the field from which the passage has been extracted. */
  var field: js.UndefOr[String] = js.undefined
  /** The confidence score of the passages's analysis. A higher score indicates greater confidence. */
  var passage_score: js.UndefOr[Double] = js.undefined
  /** The content of the extracted passage. */
  var passage_text: js.UndefOr[String] = js.undefined
  /** The position of the first character of the extracted passage in the originating field. */
  var start_offset: js.UndefOr[Double] = js.undefined
}

object QueryPassages {
  @scala.inline
  def apply(
    document_id: String = null,
    end_offset: Int | Double = null,
    field: String = null,
    passage_score: Int | Double = null,
    passage_text: String = null,
    start_offset: Int | Double = null
  ): QueryPassages = {
    val __obj = js.Dynamic.literal()
    if (document_id != null) __obj.updateDynamic("document_id")(document_id.asInstanceOf[js.Any])
    if (end_offset != null) __obj.updateDynamic("end_offset")(end_offset.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (passage_score != null) __obj.updateDynamic("passage_score")(passage_score.asInstanceOf[js.Any])
    if (passage_text != null) __obj.updateDynamic("passage_text")(passage_text.asInstanceOf[js.Any])
    if (start_offset != null) __obj.updateDynamic("start_offset")(start_offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPassages]
  }
}

