package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object containing Entity query response information. */
trait QueryEntitiesResponseItem extends js.Object {
  /** List of different evidentiary items to support the result. */
  var evidence: js.UndefOr[js.Array[QueryEvidence]] = js.undefined
  /** Entity text content. */
  var text: js.UndefOr[String] = js.undefined
  /** The type of the result entity. */
  var `type`: js.UndefOr[String] = js.undefined
}

object QueryEntitiesResponseItem {
  @scala.inline
  def apply(evidence: js.Array[QueryEvidence] = null, text: String = null, `type`: String = null): QueryEntitiesResponseItem = {
    val __obj = js.Dynamic.literal()
    if (evidence != null) __obj.updateDynamic("evidence")(evidence.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryEntitiesResponseItem]
  }
}

