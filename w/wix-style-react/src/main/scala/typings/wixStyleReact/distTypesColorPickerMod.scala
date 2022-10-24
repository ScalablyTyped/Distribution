package typings.wixStyleReact

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.std.ReturnType
import typings.wixStyleReact.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesColorPickerMod {
  
  @JSImport("wix-style-react/dist/types/ColorPicker", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ColorPickerProps, js.Object, Any]
  
  type ColorInstance = ReturnType[FnCall]
  
  type ColorPicker = Component[ColorPickerProps, js.Object, Any]
  
  trait ColorPickerProps extends StObject {
    
    var addTooltipContent: js.UndefOr[ReactNode] = js.undefined
    
    var allowEmpty: js.UndefOr[Boolean] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var emptyPlaceholder: js.UndefOr[String] = js.undefined
    
    var onAdd: js.UndefOr[js.Function1[/* color */ String | ColorInstance, Unit]] = js.undefined
    
    var onCancel: js.UndefOr[js.Function1[/* color */ String | ColorInstance, Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* color */ String | ColorInstance, Unit]] = js.undefined
    
    var onConfirm: js.UndefOr[js.Function1[/* color */ String | ColorInstance, Unit]] = js.undefined
    
    var showConverter: js.UndefOr[Boolean] = js.undefined
    
    var showHistory: js.UndefOr[Boolean] = js.undefined
    
    var showInput: js.UndefOr[Boolean] = js.undefined
    
    var value: String | ColorInstance
  }
  object ColorPickerProps {
    
    inline def apply(value: String | ColorInstance): ColorPickerProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorPickerProps]
    }
    
    extension [Self <: ColorPickerProps](x: Self) {
      
      inline def setAddTooltipContent(value: ReactNode): Self = StObject.set(x, "addTooltipContent", value.asInstanceOf[js.Any])
      
      inline def setAddTooltipContentUndefined: Self = StObject.set(x, "addTooltipContent", js.undefined)
      
      inline def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
      
      inline def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setEmptyPlaceholder(value: String): Self = StObject.set(x, "emptyPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setEmptyPlaceholderUndefined: Self = StObject.set(x, "emptyPlaceholder", js.undefined)
      
      inline def setOnAdd(value: /* color */ String | ColorInstance => Unit): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
      
      inline def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
      
      inline def setOnCancel(value: /* color */ String | ColorInstance => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction1(value))
      
      inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      inline def setOnChange(value: /* color */ String | ColorInstance => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnConfirm(value: /* color */ String | ColorInstance => Unit): Self = StObject.set(x, "onConfirm", js.Any.fromFunction1(value))
      
      inline def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
      
      inline def setShowConverter(value: Boolean): Self = StObject.set(x, "showConverter", value.asInstanceOf[js.Any])
      
      inline def setShowConverterUndefined: Self = StObject.set(x, "showConverter", js.undefined)
      
      inline def setShowHistory(value: Boolean): Self = StObject.set(x, "showHistory", value.asInstanceOf[js.Any])
      
      inline def setShowHistoryUndefined: Self = StObject.set(x, "showHistory", js.undefined)
      
      inline def setShowInput(value: Boolean): Self = StObject.set(x, "showInput", value.asInstanceOf[js.Any])
      
      inline def setShowInputUndefined: Self = StObject.set(x, "showInput", js.undefined)
      
      inline def setValue(value: String | ColorInstance): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
