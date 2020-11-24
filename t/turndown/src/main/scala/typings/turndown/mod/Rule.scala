package typings.turndown.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rule extends js.Object {
  
  var filter: Filter = js.native
  
  var replacement: js.UndefOr[ReplacementFunction] = js.native
}
object Rule {
  
  @scala.inline
  def apply(filter: Filter): Rule = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
  
  @scala.inline
  implicit class RuleOps[Self <: Rule] (val x: Self) extends AnyVal {
    
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
    def setFilterFunction2(value: (/* node */ HTMLElement, /* options */ Options) => Boolean): Self = this.set("filter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilterVarargs(value: TagName*): Self = this.set("filter", js.Array(value :_*))
    
    @scala.inline
    def setFilter(value: Filter): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacement(value: (/* content */ String, /* node */ Node, /* options */ Options) => String): Self = this.set("replacement", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteReplacement: Self = this.set("replacement", js.undefined)
  }
}
