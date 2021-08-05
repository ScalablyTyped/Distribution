package typings.wixUiCore

import typings.react.mod.FunctionComponent
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLDivElement
import typings.wixUiCore.componentsDropdownOptionOptionFactoryMod.Option
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsDropdownOptionDropdownOptionMod {
  
  @JSImport("wix-ui-core/src/components/dropdown-option/DropdownOption", "DropdownOption")
  @js.native
  val DropdownOption: DropdownOptionType = js.native
  
  trait DropdownOptionProps extends StObject {
    
    var className: String
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var isHovered: Boolean
    
    var isSelected: Boolean
    
    var onClickHandler: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseEnterHandler: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var option: Option
  }
  object DropdownOptionProps {
    
    inline def apply(className: String, isHovered: Boolean, isSelected: Boolean, option: Option): DropdownOptionProps = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], isHovered = isHovered.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropdownOptionProps]
    }
    
    extension [Self <: DropdownOptionProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIsHovered(value: Boolean): Self = StObject.set(x, "isHovered", value.asInstanceOf[js.Any])
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setOnClickHandler(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClickHandler", js.Any.fromFunction1(value))
      
      inline def setOnClickHandlerUndefined: Self = StObject.set(x, "onClickHandler", js.undefined)
      
      inline def setOnMouseEnterHandler(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnterHandler", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterHandlerUndefined: Self = StObject.set(x, "onMouseEnterHandler", js.undefined)
      
      inline def setOption(value: Option): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    }
  }
  
  type DropdownOptionType = FunctionComponent[DropdownOptionProps]
}
