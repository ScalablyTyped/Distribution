package typings.wixUiCore

import typings.react.mod.FunctionComponent
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLDivElement
import typings.wixUiCore.dropdownOptionOptionFactoryMod.Option
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsDropdownOptionDropdownOptionMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/dropdown-option/DropdownOption", "DropdownOption")
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
    
    @scala.inline
    def apply(className: String, isHovered: Boolean, isSelected: Boolean, option: Option): DropdownOptionProps = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], isHovered = isHovered.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropdownOptionProps]
    }
    
    @scala.inline
    implicit class DropdownOptionPropsMutableBuilder[Self <: DropdownOptionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIsHovered(value: Boolean): Self = StObject.set(x, "isHovered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClickHandler(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClickHandler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickHandlerUndefined: Self = StObject.set(x, "onClickHandler", js.undefined)
      
      @scala.inline
      def setOnMouseEnterHandler(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnterHandler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterHandlerUndefined: Self = StObject.set(x, "onMouseEnterHandler", js.undefined)
      
      @scala.inline
      def setOption(value: Option): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    }
  }
  
  type DropdownOptionType = FunctionComponent[DropdownOptionProps]
}
