package typings.webscopeioReactTextareaAutocomplete.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemComponentProps[TItem] extends js.Object {
  
  var entity: TItem = js.native
  
  var selected: Boolean = js.native
}
object ItemComponentProps {
  
  @scala.inline
  def apply[TItem](entity: TItem, selected: Boolean): ItemComponentProps[TItem] = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemComponentProps[TItem]]
  }
  
  @scala.inline
  implicit class ItemComponentPropsOps[Self <: ItemComponentProps[_], TItem] (val x: Self with ItemComponentProps[TItem]) extends AnyVal {
    
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
    def setEntity(value: TItem): Self = this.set("entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
  }
}
