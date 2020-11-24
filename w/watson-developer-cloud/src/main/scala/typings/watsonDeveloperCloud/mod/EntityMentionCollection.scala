package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** EntityMentionCollection. */
@js.native
trait EntityMentionCollection extends js.Object {
  
  /** An array of objects describing the entity mentions defined for an entity. */
  var examples: js.Array[EntityMention] = js.native
  
  /** The pagination data for the returned objects. */
  var pagination: Pagination = js.native
}
object EntityMentionCollection {
  
  @scala.inline
  def apply(examples: js.Array[EntityMention], pagination: Pagination): EntityMentionCollection = {
    val __obj = js.Dynamic.literal(examples = examples.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityMentionCollection]
  }
  
  @scala.inline
  implicit class EntityMentionCollectionOps[Self <: EntityMentionCollection] (val x: Self) extends AnyVal {
    
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
    def setExamplesVarargs(value: EntityMention*): Self = this.set("examples", js.Array(value :_*))
    
    @scala.inline
    def setExamples(value: js.Array[EntityMention]): Self = this.set("examples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagination(value: Pagination): Self = this.set("pagination", value.asInstanceOf[js.Any])
  }
}
