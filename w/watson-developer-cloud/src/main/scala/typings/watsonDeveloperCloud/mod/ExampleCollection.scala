package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ExampleCollection. */
@js.native
trait ExampleCollection extends js.Object {
  
  /** An array of objects describing the examples defined for the intent. */
  var examples: js.Array[Example] = js.native
  
  /** The pagination data for the returned objects. */
  var pagination: Pagination = js.native
}
object ExampleCollection {
  
  @scala.inline
  def apply(examples: js.Array[Example], pagination: Pagination): ExampleCollection = {
    val __obj = js.Dynamic.literal(examples = examples.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExampleCollection]
  }
  
  @scala.inline
  implicit class ExampleCollectionOps[Self <: ExampleCollection] (val x: Self) extends AnyVal {
    
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
    def setExamplesVarargs(value: Example*): Self = this.set("examples", js.Array(value :_*))
    
    @scala.inline
    def setExamples(value: js.Array[Example]): Self = this.set("examples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagination(value: Pagination): Self = this.set("pagination", value.asInstanceOf[js.Any])
  }
}
