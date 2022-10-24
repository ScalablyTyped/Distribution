package typings.wixStyleReact

import org.scalablytyped.runtime.Shortcut
import typings.csstype.mod.Property.Width
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.std.Element
import typings.std.HTMLInputElement
import typings.wixDesignSystemsLocaleUtils.distTypesDateTimeFormatConstantsMod.SupportedWixLocales_
import typings.wixStyleReact.anon.`14`
import typings.wixStyleReact.distTypesCommonMod.PopoverCommonProps
import typings.wixStyleReact.distTypesInputMod.InputSize
import typings.wixStyleReact.distTypesInputMod.InputStatus
import typings.wixStyleReact.wixStyleReactStrings.bottomLine
import typings.wixStyleReact.wixStyleReactStrings.long
import typings.wixStyleReact.wixStyleReactStrings.none_
import typings.wixStyleReact.wixStyleReactStrings.round
import typings.wixStyleReact.wixStyleReactStrings.short
import typings.wixStyleReact.wixStyleReactStrings.standard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTimeInputMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/types/TimeInput", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[TimeInputProps & RefAttributes[TimeInputImperativeActions]] = js.native
  
  trait TimeInputImperativeActions extends StObject {
    
    def blur(): Unit
    
    def focus(): Unit
  }
  object TimeInputImperativeActions {
    
    inline def apply(blur: () => Unit, focus: () => Unit): TimeInputImperativeActions = {
      val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), focus = js.Any.fromFunction0(focus))
      __obj.asInstanceOf[TimeInputImperativeActions]
    }
    
    extension [Self <: TimeInputImperativeActions](x: Self) {
      
      inline def setBlur(value: () => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
      
      inline def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    }
  }
  
  trait TimeInputProps extends StObject {
    
    var border: js.UndefOr[standard | round | bottomLine | none_] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var excludePastTimes: js.UndefOr[Boolean] = js.undefined
    
    var filterTime: js.UndefOr[js.Function1[/* time */ js.Date, Boolean]] = js.undefined
    
    var invalidMessage: js.UndefOr[String] = js.undefined
    
    var locale: js.UndefOr[SupportedWixLocales_] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* param0 */ `14`, Unit]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* e */ js.UndefOr[FocusEvent[HTMLInputElement, Element]], Unit]] = js.undefined
    
    var onInvalid: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var popoverProps: js.UndefOr[PopoverCommonProps] = js.undefined
    
    var prefix: js.UndefOr[ReactNode] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[InputSize] = js.undefined
    
    var status: js.UndefOr[InputStatus] = js.undefined
    
    var statusMessage: js.UndefOr[ReactNode] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
    
    var suffix: js.UndefOr[ReactNode] = js.undefined
    
    var timeStyle: js.UndefOr[long | short] = js.undefined
    
    var value: js.UndefOr[js.Date | Null] = js.undefined
    
    var width: js.UndefOr[Width[String | Double]] = js.undefined
  }
  object TimeInputProps {
    
    inline def apply(): TimeInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimeInputProps]
    }
    
    extension [Self <: TimeInputProps](x: Self) {
      
      inline def setBorder(value: standard | round | bottomLine | none_): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setExcludePastTimes(value: Boolean): Self = StObject.set(x, "excludePastTimes", value.asInstanceOf[js.Any])
      
      inline def setExcludePastTimesUndefined: Self = StObject.set(x, "excludePastTimes", js.undefined)
      
      inline def setFilterTime(value: /* time */ js.Date => Boolean): Self = StObject.set(x, "filterTime", js.Any.fromFunction1(value))
      
      inline def setFilterTimeUndefined: Self = StObject.set(x, "filterTime", js.undefined)
      
      inline def setInvalidMessage(value: String): Self = StObject.set(x, "invalidMessage", value.asInstanceOf[js.Any])
      
      inline def setInvalidMessageUndefined: Self = StObject.set(x, "invalidMessage", js.undefined)
      
      inline def setLocale(value: SupportedWixLocales_): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[HTMLInputElement, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* param0 */ `14` => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(value: /* e */ js.UndefOr[FocusEvent[HTMLInputElement, Element]] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnInvalid(value: () => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction0(value))
      
      inline def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPopoverProps(value: PopoverCommonProps): Self = StObject.set(x, "popoverProps", value.asInstanceOf[js.Any])
      
      inline def setPopoverPropsUndefined: Self = StObject.set(x, "popoverProps", js.undefined)
      
      inline def setPrefix(value: ReactNode): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setSize(value: InputSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStatus(value: InputStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusMessage(value: ReactNode): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
      
      inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setSuffix(value: ReactNode): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      inline def setTimeStyle(value: long | short): Self = StObject.set(x, "timeStyle", value.asInstanceOf[js.Any])
      
      inline def setTimeStyleUndefined: Self = StObject.set(x, "timeStyle", js.undefined)
      
      inline def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWidth(value: Width[String | Double]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[TimeInputProps & RefAttributes[TimeInputImperativeActions]]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesTimeInputMod.foo` */
  override def _to: ForwardRefExoticComponent[TimeInputProps & RefAttributes[TimeInputImperativeActions]] = default
}
