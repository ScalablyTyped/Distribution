package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** QueryRelationsResponse. */
@js.native
trait QueryRelationsResponse extends js.Object {
  /** Array of relationships for the relations query. */
  var relations: js.UndefOr[js.Array[QueryRelationsRelationship]] = js.native
}

object QueryRelationsResponse {
  @scala.inline
  def apply(): QueryRelationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryRelationsResponse]
  }
  @scala.inline
  implicit class QueryRelationsResponseOps[Self <: QueryRelationsResponse] (val x: Self) extends AnyVal {
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
    def setRelationsVarargs(value: QueryRelationsRelationship*): Self = this.set("relations", js.Array(value :_*))
    @scala.inline
    def setRelations(value: js.Array[QueryRelationsRelationship]): Self = this.set("relations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelations: Self = this.set("relations", js.undefined)
  }
  
}

