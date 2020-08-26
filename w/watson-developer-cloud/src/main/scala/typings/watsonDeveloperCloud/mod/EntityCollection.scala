package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An array of objects describing the entities for the workspace. */
@js.native
trait EntityCollection extends js.Object {
  /** An array of objects describing the entities defined for the workspace. */
  var entities: js.Array[Entity] = js.native
  /** The pagination data for the returned objects. */
  var pagination: Pagination = js.native
}

object EntityCollection {
  @scala.inline
  def apply(entities: js.Array[Entity], pagination: Pagination): EntityCollection = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityCollection]
  }
  @scala.inline
  implicit class EntityCollectionOps[Self <: EntityCollection] (val x: Self) extends AnyVal {
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
    def setEntitiesVarargs(value: Entity*): Self = this.set("entities", js.Array(value :_*))
    @scala.inline
    def setEntities(value: js.Array[Entity]): Self = this.set("entities", value.asInstanceOf[js.Any])
    @scala.inline
    def setPagination(value: Pagination): Self = this.set("pagination", value.asInstanceOf[js.Any])
  }
  
}

