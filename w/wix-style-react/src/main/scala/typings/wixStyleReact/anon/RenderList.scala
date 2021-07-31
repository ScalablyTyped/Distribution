package typings.wixStyleReact.anon

import typings.react.mod.ReactNode
import typings.wixStyleReact.selectorListContentMod.SelectorListItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderList extends StObject {
  
  def renderList(): ReactNode
  
  def renderToggleAllCheckBox(): ReactNode
  
  var selectedItems: js.Array[SelectorListItem]
}
object RenderList {
  
  @scala.inline
  def apply(
    renderList: () => ReactNode,
    renderToggleAllCheckBox: () => ReactNode,
    selectedItems: js.Array[SelectorListItem]
  ): RenderList = {
    val __obj = js.Dynamic.literal(renderList = js.Any.fromFunction0(renderList), renderToggleAllCheckBox = js.Any.fromFunction0(renderToggleAllCheckBox), selectedItems = selectedItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderList]
  }
  
  @scala.inline
  implicit class RenderListMutableBuilder[Self <: RenderList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRenderList(value: () => ReactNode): Self = StObject.set(x, "renderList", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderToggleAllCheckBox(value: () => ReactNode): Self = StObject.set(x, "renderToggleAllCheckBox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelectedItems(value: js.Array[SelectorListItem]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedItemsVarargs(value: SelectorListItem*): Self = StObject.set(x, "selectedItems", js.Array(value :_*))
  }
}
