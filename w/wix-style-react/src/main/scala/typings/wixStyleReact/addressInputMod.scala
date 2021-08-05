package typings.wixStyleReact

import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.react.mod.PureComponent
import typings.std.HTMLInputElement
import typings.wixStyleReact.dropdownLayoutMod.DropdownLayoutOption
import typings.wixStyleReact.dropdownLayoutMod.DropdownLayoutValueOption
import typings.wixStyleReact.wixStyleReactStrings.`double-line`
import typings.wixStyleReact.wixStyleReactStrings.`single-line`
import typings.wixStyleReact.wixStyleReactStrings.error
import typings.wixStyleReact.wixStyleReactStrings.large
import typings.wixStyleReact.wixStyleReactStrings.loading
import typings.wixStyleReact.wixStyleReactStrings.medium
import typings.wixStyleReact.wixStyleReactStrings.small
import typings.wixStyleReact.wixStyleReactStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addressInputMod {
  
  @JSImport("wix-style-react/dist/es/src/AddressInput", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[AddressInputProps, js.Object, js.Any]
  
  type AddressInput = PureComponent[AddressInputProps, js.Object, js.Any]
  
  trait AddressInputProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var clearButton: js.UndefOr[Boolean] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var debounceDuration: js.UndefOr[Double] = js.undefined
    
    var initialValue: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
    
    var onClear: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSelect: js.UndefOr[js.Function1[/* value */ DropdownLayoutValueOption, Unit]] = js.undefined
    
    var options: js.UndefOr[js.Array[DropdownLayoutOption]] = js.undefined
    
    var optionsLayout: js.UndefOr[`single-line` | `double-line`] = js.undefined
    
    var roundInput: js.UndefOr[Boolean] = js.undefined
    
    var showOptionsIcons: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[small | medium | large] = js.undefined
    
    var status: js.UndefOr[loading | error | warning] = js.undefined
  }
  object AddressInputProps {
    
    inline def apply(): AddressInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddressInputProps]
    }
    
    extension [Self <: AddressInputProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClearButton(value: Boolean): Self = StObject.set(x, "clearButton", value.asInstanceOf[js.Any])
      
      inline def setClearButtonUndefined: Self = StObject.set(x, "clearButton", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDebounceDuration(value: Double): Self = StObject.set(x, "debounceDuration", value.asInstanceOf[js.Any])
      
      inline def setDebounceDurationUndefined: Self = StObject.set(x, "debounceDuration", js.undefined)
      
      inline def setInitialValue(value: String): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
      
      inline def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
      
      inline def setOnChange(value: ChangeEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClear(value: () => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction0(value))
      
      inline def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      inline def setOnSelect(value: /* value */ DropdownLayoutValueOption => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOptions(value: js.Array[DropdownLayoutOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsLayout(value: `single-line` | `double-line`): Self = StObject.set(x, "optionsLayout", value.asInstanceOf[js.Any])
      
      inline def setOptionsLayoutUndefined: Self = StObject.set(x, "optionsLayout", js.undefined)
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: DropdownLayoutOption*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      inline def setRoundInput(value: Boolean): Self = StObject.set(x, "roundInput", value.asInstanceOf[js.Any])
      
      inline def setRoundInputUndefined: Self = StObject.set(x, "roundInput", js.undefined)
      
      inline def setShowOptionsIcons(value: Boolean): Self = StObject.set(x, "showOptionsIcons", value.asInstanceOf[js.Any])
      
      inline def setShowOptionsIconsUndefined: Self = StObject.set(x, "showOptionsIcons", js.undefined)
      
      inline def setSize(value: small | medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStatus(value: loading | error | warning): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
}
