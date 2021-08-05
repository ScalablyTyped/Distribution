package typings.wixStyleReact

import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.std.HTMLInputElement
import typings.wixStyleReact.wixStyleReactStrings.center
import typings.wixStyleReact.wixStyleReactStrings.left
import typings.wixStyleReact.wixStyleReactStrings.medium
import typings.wixStyleReact.wixStyleReactStrings.right
import typings.wixStyleReact.wixStyleReactStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableListItemMod {
  
  @JSImport("wix-style-react/dist/es/src/TableListItem", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[TableListItemProps, js.Object, js.Any]
  
  type TableListItem = PureComponent[TableListItemProps, js.Object, js.Any]
  
  trait TableListItemColumn extends StObject {
    
    var align: js.UndefOr[left | center | right] = js.undefined
    
    var value: ReactNode
    
    var width: js.UndefOr[String | Double] = js.undefined
  }
  object TableListItemColumn {
    
    inline def apply(): TableListItemColumn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableListItemColumn]
    }
    
    extension [Self <: TableListItemColumn](x: Self) {
      
      inline def setAlign(value: left | center | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setValue(value: ReactNode): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait TableListItemProps extends StObject {
    
    var checkbox: js.UndefOr[Boolean] = js.undefined
    
    var checkboxDisabled: js.UndefOr[Boolean] = js.undefined
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var dragDisabled: js.UndefOr[Boolean] = js.undefined
    
    var draggable: js.UndefOr[Boolean] = js.undefined
    
    var onCheckboxChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
    
    var onClick: js.UndefOr[js.Function] = js.undefined
    
    var options: js.Array[TableListItemColumn]
    
    var showDivider: js.UndefOr[Boolean] = js.undefined
    
    var verticalPadding: js.UndefOr[small | medium] = js.undefined
  }
  object TableListItemProps {
    
    inline def apply(options: js.Array[TableListItemColumn]): TableListItemProps = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableListItemProps]
    }
    
    extension [Self <: TableListItemProps](x: Self) {
      
      inline def setCheckbox(value: Boolean): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
      
      inline def setCheckboxDisabled(value: Boolean): Self = StObject.set(x, "checkboxDisabled", value.asInstanceOf[js.Any])
      
      inline def setCheckboxDisabledUndefined: Self = StObject.set(x, "checkboxDisabled", js.undefined)
      
      inline def setCheckboxUndefined: Self = StObject.set(x, "checkbox", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDragDisabled(value: Boolean): Self = StObject.set(x, "dragDisabled", value.asInstanceOf[js.Any])
      
      inline def setDragDisabledUndefined: Self = StObject.set(x, "dragDisabled", js.undefined)
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setOnCheckboxChange(value: ChangeEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onCheckboxChange", js.Any.fromFunction1(value))
      
      inline def setOnCheckboxChangeUndefined: Self = StObject.set(x, "onCheckboxChange", js.undefined)
      
      inline def setOnClick(value: js.Function): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOptions(value: js.Array[TableListItemColumn]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: TableListItemColumn*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      inline def setShowDivider(value: Boolean): Self = StObject.set(x, "showDivider", value.asInstanceOf[js.Any])
      
      inline def setShowDividerUndefined: Self = StObject.set(x, "showDivider", js.undefined)
      
      inline def setVerticalPadding(value: small | medium): Self = StObject.set(x, "verticalPadding", value.asInstanceOf[js.Any])
      
      inline def setVerticalPaddingUndefined: Self = StObject.set(x, "verticalPadding", js.undefined)
    }
  }
}
