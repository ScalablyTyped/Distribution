package typings.wixStyleReact.anon

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.wixStyleReact.listItemSelectMod.ListItemSelectSizes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<wix-style-react.wix-style-react/dist/es/src/ListItemSelect.ListItemSelectProps> */
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
  
  @scala.inline
  def apply(): PartialListItemSelectProp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialListItemSelectProp]
  }
  
  @scala.inline
  implicit class PartialListItemSelectPropMutableBuilder[Self <: PartialListItemSelectProp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckbox(value: Boolean): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckboxUndefined: Self = StObject.set(x, "checkbox", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setEllipsis(value: Boolean): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
    
    @scala.inline
    def setHighlighted(value: Boolean): Self = StObject.set(x, "highlighted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightedUndefined: Self = StObject.set(x, "highlighted", js.undefined)
    
    @scala.inline
    def setOnClick(value: MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setPrefix(value: ReactNode): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setSize(value: ListItemSelectSizes): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSubtitle(value: ReactNode): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    @scala.inline
    def setSuffix(value: ReactNode): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    
    @scala.inline
    def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
