package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ValueCollection. */
@js.native
trait ValueCollection extends js.Object {
  
  /** The pagination data for the returned objects. */
  var pagination: Pagination = js.native
  
  /** An array of entity values. */
  var values: js.Array[Value] = js.native
}
object ValueCollection {
  
  @scala.inline
  def apply(pagination: Pagination, values: js.Array[Value]): ValueCollection = {
    val __obj = js.Dynamic.literal(pagination = pagination.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueCollection]
  }
  
  @scala.inline
  implicit class ValueCollectionOps[Self <: ValueCollection] (val x: Self) extends AnyVal {
    
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
    def setPagination(value: Pagination): Self = this.set("pagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: Value*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[Value]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
}
