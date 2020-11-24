package typings.tern.anon

import typings.tern.ternMod.RenameQuery
import typings.tern.ternMod.RenameQueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryRenameQuery extends js.Object {
  
  var query: RenameQuery = js.native
  
  var result: RenameQueryResult = js.native
}
object QueryRenameQuery {
  
  @scala.inline
  def apply(query: RenameQuery, result: RenameQueryResult): QueryRenameQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryRenameQuery]
  }
  
  @scala.inline
  implicit class QueryRenameQueryOps[Self <: QueryRenameQuery] (val x: Self) extends AnyVal {
    
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
    def setQuery(value: RenameQuery): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: RenameQueryResult): Self = this.set("result", value.asInstanceOf[js.Any])
  }
}
