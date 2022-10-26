package typings.wixStyleReact.anon

import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.wixStyleReact.distTypesSidebarSubMenuNextMod.ExpandCollapseTrigger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataHookDisabled extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var dataHook: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var href: js.UndefOr[String] = js.undefined
  
  var itemKey: js.UndefOr[String] = js.undefined
  
  var onCollapse: js.UndefOr[js.Function1[/* trigger */ ExpandCollapseTrigger, Unit]] = js.undefined
  
  var onExpand: js.UndefOr[js.Function1[/* trigger */ ExpandCollapseTrigger, Unit]] = js.undefined
  
  var title: js.UndefOr[ComponentType[js.Object] | String] = js.undefined
}
object DataHookDisabled {
  
  inline def apply(): DataHookDisabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataHookDisabled]
  }
  
  extension [Self <: DataHookDisabled](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setItemKey(value: String): Self = StObject.set(x, "itemKey", value.asInstanceOf[js.Any])
    
    inline def setItemKeyUndefined: Self = StObject.set(x, "itemKey", js.undefined)
    
    inline def setOnCollapse(value: /* trigger */ ExpandCollapseTrigger => Unit): Self = StObject.set(x, "onCollapse", js.Any.fromFunction1(value))
    
    inline def setOnCollapseUndefined: Self = StObject.set(x, "onCollapse", js.undefined)
    
    inline def setOnExpand(value: /* trigger */ ExpandCollapseTrigger => Unit): Self = StObject.set(x, "onExpand", js.Any.fromFunction1(value))
    
    inline def setOnExpandUndefined: Self = StObject.set(x, "onExpand", js.undefined)
    
    inline def setTitle(value: ComponentType[js.Object] | String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
