package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** QueryRelationsRelationship. */
trait QueryRelationsRelationship extends js.Object {
  /** Information about the relationship. */
  var arguments: js.UndefOr[js.Array[QueryRelationsArgument]] = js.undefined
  /** List of different evidentiary items to support the result. */
  var evidence: js.UndefOr[js.Array[QueryEvidence]] = js.undefined
  /** The number of times the relationship is mentioned. */
  var frequency: js.UndefOr[Double] = js.undefined
  /** The identified relationship type. */
  var `type`: js.UndefOr[String] = js.undefined
}

object QueryRelationsRelationship {
  @scala.inline
  def apply(
    arguments: js.Array[QueryRelationsArgument] = null,
    evidence: js.Array[QueryEvidence] = null,
    frequency: Int | Double = null,
    `type`: String = null
  ): QueryRelationsRelationship = {
    val __obj = js.Dynamic.literal()
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (evidence != null) __obj.updateDynamic("evidence")(evidence.asInstanceOf[js.Any])
    if (frequency != null) __obj.updateDynamic("frequency")(frequency.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryRelationsRelationship]
  }
}

