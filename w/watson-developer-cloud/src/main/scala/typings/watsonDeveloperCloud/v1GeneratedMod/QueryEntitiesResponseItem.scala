package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object containing Entity query response information. */
@js.native
trait QueryEntitiesResponseItem extends js.Object {
  /** List of different evidentiary items to support the result. */
  var evidence: js.UndefOr[js.Array[QueryEvidence]] = js.native
  /** Entity text content. */
  var text: js.UndefOr[String] = js.native
  /** The type of the result entity. */
  var `type`: js.UndefOr[String] = js.native
}

object QueryEntitiesResponseItem {
  @scala.inline
  def apply(): QueryEntitiesResponseItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryEntitiesResponseItem]
  }
  @scala.inline
  implicit class QueryEntitiesResponseItemOps[Self <: QueryEntitiesResponseItem] (val x: Self) extends AnyVal {
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
    def setEvidenceVarargs(value: QueryEvidence*): Self = this.set("evidence", js.Array(value :_*))
    @scala.inline
    def setEvidence(value: js.Array[QueryEvidence]): Self = this.set("evidence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvidence: Self = this.set("evidence", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

