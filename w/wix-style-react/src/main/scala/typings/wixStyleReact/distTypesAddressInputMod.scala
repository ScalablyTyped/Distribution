package typings.wixStyleReact

import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.std.Element
import typings.std.HTMLInputElement
import typings.wixStyleReact.distTypesCommonMod.PopoverCommonProps
import typings.wixStyleReact.distTypesDropdownLayoutMod.DropdownLayoutOption
import typings.wixStyleReact.distTypesDropdownLayoutMod.DropdownLayoutValueOption
import typings.wixStyleReact.distTypesInputWithOptionsMod.ManualInputFnSignature
import typings.wixStyleReact.wixStyleReactStrings.bottomLine
import typings.wixStyleReact.wixStyleReactStrings.error
import typings.wixStyleReact.wixStyleReactStrings.large
import typings.wixStyleReact.wixStyleReactStrings.loading
import typings.wixStyleReact.wixStyleReactStrings.medium
import typings.wixStyleReact.wixStyleReactStrings.none_
import typings.wixStyleReact.wixStyleReactStrings.round
import typings.wixStyleReact.wixStyleReactStrings.small
import typings.wixStyleReact.wixStyleReactStrings.standard
import typings.wixStyleReact.wixStyleReactStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAddressInputMod {
  
  @JSImport("wix-style-react/dist/types/AddressInput", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[AddressInputProps, js.Object, Any]
  
  type AddressInput = PureComponent[AddressInputProps, js.Object, Any]
  
  trait AddressInputProps extends StObject {
    
    var border: js.UndefOr[standard | round | bottomLine | none_] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var clearButton: js.UndefOr[Boolean] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var initialValue: js.UndefOr[String] = js.undefined
    
    var noResultsText: js.UndefOr[ReactNode] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
    
    var onClear: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* e */ js.UndefOr[FocusEvent[HTMLInputElement, Element]], Unit]] = js.undefined
    
    var onManuallyInput: js.UndefOr[ManualInputFnSignature] = js.undefined
    
    var onSelect: js.UndefOr[js.Function1[/* option */ DropdownLayoutValueOption, Unit]] = js.undefined
    
    var options: js.UndefOr[js.Array[DropdownLayoutOption]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var popoverProps: js.UndefOr[PopoverCommonProps] = js.undefined
    
    var size: js.UndefOr[small | medium | large] = js.undefined
    
    var status: js.UndefOr[loading | error | warning] = js.undefined
    
    var statusMessage: js.UndefOr[ReactNode] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object AddressInputProps {
    
    inline def apply(): AddressInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddressInputProps]
    }
    
    extension [Self <: AddressInputProps](x: Self) {
      
      inline def setBorder(value: standard | round | bottomLine | none_): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClearButton(value: Boolean): Self = StObject.set(x, "clearButton", value.asInstanceOf[js.Any])
      
      inline def setClearButtonUndefined: Self = StObject.set(x, "clearButton", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setInitialValue(value: String): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
      
      inline def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
      
      inline def setNoResultsText(value: ReactNode): Self = StObject.set(x, "noResultsText", value.asInstanceOf[js.Any])
      
      inline def setNoResultsTextUndefined: Self = StObject.set(x, "noResultsText", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[HTMLInputElement, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: ChangeEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClear(value: () => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction0(value))
      
      inline def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      inline def setOnFocus(value: /* e */ js.UndefOr[FocusEvent[HTMLInputElement, Element]] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnManuallyInput(value: (/* inputValue */ String, /* suggestedOption */ DropdownLayoutValueOption) => Unit): Self = StObject.set(x, "onManuallyInput", js.Any.fromFunction2(value))
      
      inline def setOnManuallyInputUndefined: Self = StObject.set(x, "onManuallyInput", js.undefined)
      
      inline def setOnSelect(value: /* option */ DropdownLayoutValueOption => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOptions(value: js.Array[DropdownLayoutOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: DropdownLayoutOption*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPopoverProps(value: PopoverCommonProps): Self = StObject.set(x, "popoverProps", value.asInstanceOf[js.Any])
      
      inline def setPopoverPropsUndefined: Self = StObject.set(x, "popoverProps", js.undefined)
      
      inline def setSize(value: small | medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStatus(value: loading | error | warning): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusMessage(value: ReactNode): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
      
      inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
