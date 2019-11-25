package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Entity description and location within evidence field. */
trait QueryEvidenceEntity extends js.Object {
  /** The end location of the entity text in the identified field. This value is exclusive. */
  var end_offset: js.UndefOr[Double] = js.undefined
  /** The start location of the entity text in the identified field. This value is inclusive. */
  var start_offset: js.UndefOr[Double] = js.undefined
  /** The original text of this entity as found in the evidence field. */
  var text: js.UndefOr[String] = js.undefined
  /** The entity type for this entity. Possible types vary based on model used. */
  var `type`: js.UndefOr[String] = js.undefined
}

object QueryEvidenceEntity {
  @scala.inline
  def apply(
    end_offset: Int | Double = null,
    start_offset: Int | Double = null,
    text: String = null,
    `type`: String = null
  ): QueryEvidenceEntity = {
    val __obj = js.Dynamic.literal()
    if (end_offset != null) __obj.updateDynamic("end_offset")(end_offset.asInstanceOf[js.Any])
    if (start_offset != null) __obj.updateDynamic("start_offset")(start_offset.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryEvidenceEntity]
  }
}

