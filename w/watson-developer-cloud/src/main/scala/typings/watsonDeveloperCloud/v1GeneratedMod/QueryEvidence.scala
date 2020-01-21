package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Description of evidence location supporting Knoweldge Graph query result. */
trait QueryEvidence extends js.Object {
  /** The docuemnt ID (as indexed in Discovery) of the evidence location. */
  var document_id: js.UndefOr[String] = js.undefined
  /** The end location of the evidence in the identified field. This value is inclusive. */
  var end_offset: js.UndefOr[Double] = js.undefined
  /** An array of entity objects that show evidence of the result. */
  var entities: js.UndefOr[js.Array[QueryEvidenceEntity]] = js.undefined
  /** The field of the document where the supporting evidence was identified. */
  var field: js.UndefOr[String] = js.undefined
  /** The start location of the evidence in the identified field. This value is inclusive. */
  var start_offset: js.UndefOr[Double] = js.undefined
}

object QueryEvidence {
  @scala.inline
  def apply(
    document_id: String = null,
    end_offset: Int | Double = null,
    entities: js.Array[QueryEvidenceEntity] = null,
    field: String = null,
    start_offset: Int | Double = null
  ): QueryEvidence = {
    val __obj = js.Dynamic.literal()
    if (document_id != null) __obj.updateDynamic("document_id")(document_id.asInstanceOf[js.Any])
    if (end_offset != null) __obj.updateDynamic("end_offset")(end_offset.asInstanceOf[js.Any])
    if (entities != null) __obj.updateDynamic("entities")(entities.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (start_offset != null) __obj.updateDynamic("start_offset")(start_offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryEvidence]
  }
}

