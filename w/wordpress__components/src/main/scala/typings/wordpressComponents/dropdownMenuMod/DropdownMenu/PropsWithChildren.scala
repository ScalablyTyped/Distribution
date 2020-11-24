package typings.wordpressComponents.dropdownMenuMod.DropdownMenu

import typings.react.mod.global.JSX.Element
import typings.wordpressComponents.dropdownMod.Dropdown.RenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropsWithChildren
  extends BaseProps
     with Props {
  
  /**
    * A function render prop which should return an element or elements
    * valid for use in a `DropdownMenu`: `MenuItem`, `MenuItemsChoice`, or
    * `MenuGroup`.
    */
  def children(props: RenderProps): Element = js.native
  
  var controls: js.UndefOr[scala.Nothing] = js.native
}
object PropsWithChildren {
  
  @scala.inline
  def apply(children: RenderProps => Element, label: String): PropsWithChildren = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsWithChildren]
  }
  
  @scala.inline
  implicit class PropsWithChildrenOps[Self <: PropsWithChildren] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: RenderProps => Element): Self = this.set("children", js.Any.fromFunction1(value))
  }
}
