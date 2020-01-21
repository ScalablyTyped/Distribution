package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An array of objects describing the entities for the workspace. */
trait EntityCollection extends js.Object {
  /** An array of objects describing the entities defined for the workspace. */
  var entities: js.Array[Entity]
  /** The pagination data for the returned objects. */
  var pagination: Pagination
}

object EntityCollection {
  @scala.inline
  def apply(entities: js.Array[Entity], pagination: Pagination): EntityCollection = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EntityCollection]
  }
}

