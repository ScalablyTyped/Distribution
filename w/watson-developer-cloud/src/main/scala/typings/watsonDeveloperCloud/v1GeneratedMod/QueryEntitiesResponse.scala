package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object that contains an array of entities resulting from the query. */
@js.native
trait QueryEntitiesResponse extends js.Object {
  /** Array of entities that results from the query. */
  var entities: js.UndefOr[js.Array[QueryEntitiesResponseItem]] = js.native
}

object QueryEntitiesResponse {
  @scala.inline
  def apply(): QueryEntitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryEntitiesResponse]
  }
  @scala.inline
  implicit class QueryEntitiesResponseOps[Self <: QueryEntitiesResponse] (val x: Self) extends AnyVal {
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
    def setEntitiesVarargs(value: QueryEntitiesResponseItem*): Self = this.set("entities", js.Array(value :_*))
    @scala.inline
    def setEntities(value: js.Array[QueryEntitiesResponseItem]): Self = this.set("entities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntities: Self = this.set("entities", js.undefined)
  }
  
}

