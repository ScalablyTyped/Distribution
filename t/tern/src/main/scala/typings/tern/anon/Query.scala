package typings.tern.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Query[Q /* <: typings.tern.ternMod.Query */] extends js.Object {
  
  var query: js.UndefOr[Q] = js.native
}
object Query {
  
  @scala.inline
  def apply[Q /* <: typings.tern.ternMod.Query */](): Query[Q] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Query[Q]]
  }
  
  @scala.inline
  implicit class QueryOps[Self <: Query[_], Q /* <: typings.tern.ternMod.Query */] (val x: Self with Query[Q]) extends AnyVal {
    
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
    def setQuery(value: Q): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
  }
}
