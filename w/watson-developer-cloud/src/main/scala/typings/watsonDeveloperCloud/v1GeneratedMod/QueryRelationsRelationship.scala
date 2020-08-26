package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** QueryRelationsRelationship. */
@js.native
trait QueryRelationsRelationship extends js.Object {
  /** Information about the relationship. */
  var arguments: js.UndefOr[js.Array[QueryRelationsArgument]] = js.native
  /** List of different evidentiary items to support the result. */
  var evidence: js.UndefOr[js.Array[QueryEvidence]] = js.native
  /** The number of times the relationship is mentioned. */
  var frequency: js.UndefOr[Double] = js.native
  /** The identified relationship type. */
  var `type`: js.UndefOr[String] = js.native
}

object QueryRelationsRelationship {
  @scala.inline
  def apply(): QueryRelationsRelationship = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryRelationsRelationship]
  }
  @scala.inline
  implicit class QueryRelationsRelationshipOps[Self <: QueryRelationsRelationship] (val x: Self) extends AnyVal {
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
    def setArgumentsVarargs(value: QueryRelationsArgument*): Self = this.set("arguments", js.Array(value :_*))
    @scala.inline
    def setArguments(value: js.Array[QueryRelationsArgument]): Self = this.set("arguments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArguments: Self = this.set("arguments", js.undefined)
    @scala.inline
    def setEvidenceVarargs(value: QueryEvidence*): Self = this.set("evidence", js.Array(value :_*))
    @scala.inline
    def setEvidence(value: js.Array[QueryEvidence]): Self = this.set("evidence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvidence: Self = this.set("evidence", js.undefined)
    @scala.inline
    def setFrequency(value: Double): Self = this.set("frequency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrequency: Self = this.set("frequency", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

