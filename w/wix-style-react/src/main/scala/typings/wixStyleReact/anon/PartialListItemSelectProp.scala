package typings.wixStyleReact.anon

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.wixStyleReact.distTypesListItemSelectMod.ListItemSelectSizes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<wix-style-react.wix-style-react/dist/types/ListItemSelect.ListItemSelectProps> */
trait PartialListItemSelectProp extends StObject {
  
  var checkbox: js.UndefOr[Boolean] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var dataHook: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var ellipsis: js.UndefOr[Boolean] = js.undefined
  
  var highlighted: js.UndefOr[Boolean] = js.undefined
  
  var onClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  
  var prefix: js.UndefOr[ReactNode] = js.undefined
  
  var selected: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[ListItemSelectSizes] = js.undefined
  
  var subtitle: js.UndefOr[ReactNode] = js.undefined
  
  var suffix: js.UndefOr[ReactNode] = js.undefined
  
  var title: js.UndefOr[ReactNode] = js.undefined
}
object PartialListItemSelectProp {
  
  inline def apply(): PartialListItemSelectProp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialListItemSelectProp]
  }
  
  extension [Self <: PartialListItemSelectProp](x: Self) {
    
    inline def setCheckbox(value: Boolean): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
    
    inline def setCheckboxUndefined: Self = StObject.set(x, "checkbox", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setEllipsis(value: Boolean): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
    
    inline def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
    
    inline def setHighlighted(value: Boolean): Self = StObject.set(x, "highlighted", value.asInstanceOf[js.Any])
    
    inline def setHighlightedUndefined: Self = StObject.set(x, "highlighted", js.undefined)
    
    inline def setOnClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setPrefix(value: ReactNode): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setSize(value: ListItemSelectSizes): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSubtitle(value: ReactNode): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setSuffix(value: ReactNode): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    
    inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
