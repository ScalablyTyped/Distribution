package typings.vegaTypings.runtimeMod

import typings.vegaTypings.vegaTypingsStrings.mark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefineMark[T /* <: String */, I, R /* <: String */] extends js.Object {
  
  var group: js.Any = js.native
  
  var items: js.Array[Item[I]] = js.native
  
  var marktype: T = js.native
  
  var role: mark | R = js.native
}
object DefineMark {
  
  @scala.inline
  def apply[T /* <: String */, I, R /* <: String */](group: js.Any, items: js.Array[Item[I]], marktype: T, role: mark | R): DefineMark[T, I, R] = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], marktype = marktype.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineMark[T, I, R]]
  }
  
  @scala.inline
  implicit class DefineMarkOps[Self <: DefineMark[_, _, _], T /* <: String */, I, R /* <: String */] (val x: Self with (DefineMark[T, I, R])) extends AnyVal {
    
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
    def setGroup(value: js.Any): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: Item[I]*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[Item[I]]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarktype(value: T): Self = this.set("marktype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: mark | R): Self = this.set("role", value.asInstanceOf[js.Any])
  }
}
