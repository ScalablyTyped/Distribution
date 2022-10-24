package typings.wixStyleReact.anon

import typings.react.mod.ReactNode
import typings.wixStyleReact.distTypesSelectorListContentMod.SelectorListItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderList extends StObject {
  
  def renderList(): ReactNode
  
  def renderToggleAllCheckbox(): ReactNode
  
  var selectedItems: js.Array[SelectorListItem]
}
object RenderList {
  
  inline def apply(
    renderList: () => ReactNode,
    renderToggleAllCheckbox: () => ReactNode,
    selectedItems: js.Array[SelectorListItem]
  ): RenderList = {
    val __obj = js.Dynamic.literal(renderList = js.Any.fromFunction0(renderList), renderToggleAllCheckbox = js.Any.fromFunction0(renderToggleAllCheckbox), selectedItems = selectedItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderList]
  }
  
  extension [Self <: RenderList](x: Self) {
    
    inline def setRenderList(value: () => ReactNode): Self = StObject.set(x, "renderList", js.Any.fromFunction0(value))
    
    inline def setRenderToggleAllCheckbox(value: () => ReactNode): Self = StObject.set(x, "renderToggleAllCheckbox", js.Any.fromFunction0(value))
    
    inline def setSelectedItems(value: js.Array[SelectorListItem]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemsVarargs(value: SelectorListItem*): Self = StObject.set(x, "selectedItems", js.Array(value*))
  }
}
