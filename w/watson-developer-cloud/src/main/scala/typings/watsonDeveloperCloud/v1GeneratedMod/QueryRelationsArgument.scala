package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** QueryRelationsArgument. */
@js.native
trait QueryRelationsArgument extends js.Object {
  /** Array of query entities. */
  var entities: js.UndefOr[js.Array[QueryEntitiesEntity]] = js.native
}

object QueryRelationsArgument {
  @scala.inline
  def apply(): QueryRelationsArgument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryRelationsArgument]
  }
  @scala.inline
  implicit class QueryRelationsArgumentOps[Self <: QueryRelationsArgument] (val x: Self) extends AnyVal {
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
    def setEntitiesVarargs(value: QueryEntitiesEntity*): Self = this.set("entities", js.Array(value :_*))
    @scala.inline
    def setEntities(value: js.Array[QueryEntitiesEntity]): Self = this.set("entities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntities: Self = this.set("entities", js.undefined)
  }
  
}

