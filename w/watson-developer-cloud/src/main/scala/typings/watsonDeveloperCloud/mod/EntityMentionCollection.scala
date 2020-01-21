package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** EntityMentionCollection. */
trait EntityMentionCollection extends js.Object {
  /** An array of objects describing the entity mentions defined for an entity. */
  var examples: js.Array[EntityMention]
  /** The pagination data for the returned objects. */
  var pagination: Pagination
}

object EntityMentionCollection {
  @scala.inline
  def apply(examples: js.Array[EntityMention], pagination: Pagination): EntityMentionCollection = {
    val __obj = js.Dynamic.literal(examples = examples.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EntityMentionCollection]
  }
}

