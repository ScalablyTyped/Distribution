package typings.wixUiCore

import typings.react.mod.AbstractView
import typings.react.mod.Component
import typings.react.mod.KeyboardEvent
import typings.react.mod.NativeKeyboardEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.EventTarget
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.HTMLSpanElement
import typings.std.MouseEvent
import typings.wixUiCore.anon.Focused
import typings.wixUiCore.anon.OnBlur
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsRadioButtonRadioButtonMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/radio-button/RadioButton", "RadioButton")
  @js.native
  class RadioButton protected ()
    extends Component[RadioButtonProps, RadioButtonState, js.Any] {
    def this(props: RadioButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: RadioButtonProps, context: js.Any) = this()
    
    /* private */ var focusedByMouse: js.Any = js.native
    
    def handleClick(event: typings.react.mod.MouseEvent[HTMLDivElement, MouseEvent]): Unit = js.native
    
    def handleInputChange(event: typings.react.mod.MouseEvent[HTMLDivElement, MouseEvent]): Unit = js.native
    
    def handleInputKeyDown(event: RadioButtonKeyDownEvent): Unit = js.native
    
    def onFocus(): Unit = js.native
    
    def onHover(event: typings.react.mod.MouseEvent[HTMLSpanElement, MouseEvent]): Unit = js.native
    
    def onInputBlur(): Unit = js.native
    
    /* private */ var radioRef: js.Any = js.native
    
    @JSName("state")
    var state_RadioButton: Focused = js.native
  }
  /* static members */
  object RadioButton {
    
    @JSImport("wix-ui-core/dist/standalone/src/components/radio-button/RadioButton", "RadioButton")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/standalone/src/components/radio-button/RadioButton", "RadioButton.bypassDefaultPropsTypecheck")
    @js.native
    def bypassDefaultPropsTypecheck: js.Any = js.native
    inline def bypassDefaultPropsTypecheck_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bypassDefaultPropsTypecheck")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/standalone/src/components/radio-button/RadioButton", "RadioButton.defaultProps")
    @js.native
    def defaultProps: OnBlur = js.native
    inline def defaultProps_=(x: OnBlur): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/standalone/src/components/radio-button/RadioButton", "RadioButton.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait RadioButtonChangeEvent
    extends StObject
       with typings.react.mod.MouseEvent[HTMLDivElement, NativeMouseEvent] {
    
    var value: String
  }
  object RadioButtonChangeEvent {
    
    inline def apply(
      altKey: Boolean,
      bubbles: Boolean,
      button: Double,
      buttons: Double,
      cancelable: Boolean,
      clientX: Double,
      clientY: Double,
      ctrlKey: Boolean,
      currentTarget: EventTarget & HTMLDivElement,
      defaultPrevented: Boolean,
      detail: Double,
      eventPhase: Double,
      getModifierState: String => Boolean,
      isDefaultPrevented: () => Boolean,
      isPropagationStopped: () => Boolean,
      isTrusted: Boolean,
      metaKey: Boolean,
      movementX: Double,
      movementY: Double,
      nativeEvent: NativeMouseEvent,
      pageX: Double,
      pageY: Double,
      persist: () => Unit,
      preventDefault: () => Unit,
      screenX: Double,
      screenY: Double,
      shiftKey: Boolean,
      stopPropagation: () => Unit,
      target: EventTarget,
      timeStamp: Double,
      `type`: String,
      value: String,
      view: AbstractView
    ): RadioButtonChangeEvent = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], movementX = movementX.asInstanceOf[js.Any], movementY = movementY.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), preventDefault = js.Any.fromFunction0(preventDefault), screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], relatedTarget = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioButtonChangeEvent]
    }
    
    extension [Self <: RadioButtonChangeEvent](x: Self) {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait RadioButtonClickEvent
    extends StObject
       with typings.react.mod.MouseEvent[HTMLDivElement, NativeMouseEvent] {
    
    var value: String
  }
  object RadioButtonClickEvent {
    
    inline def apply(
      altKey: Boolean,
      bubbles: Boolean,
      button: Double,
      buttons: Double,
      cancelable: Boolean,
      clientX: Double,
      clientY: Double,
      ctrlKey: Boolean,
      currentTarget: EventTarget & HTMLDivElement,
      defaultPrevented: Boolean,
      detail: Double,
      eventPhase: Double,
      getModifierState: String => Boolean,
      isDefaultPrevented: () => Boolean,
      isPropagationStopped: () => Boolean,
      isTrusted: Boolean,
      metaKey: Boolean,
      movementX: Double,
      movementY: Double,
      nativeEvent: NativeMouseEvent,
      pageX: Double,
      pageY: Double,
      persist: () => Unit,
      preventDefault: () => Unit,
      screenX: Double,
      screenY: Double,
      shiftKey: Boolean,
      stopPropagation: () => Unit,
      target: EventTarget,
      timeStamp: Double,
      `type`: String,
      value: String,
      view: AbstractView
    ): RadioButtonClickEvent = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], movementX = movementX.asInstanceOf[js.Any], movementY = movementY.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), preventDefault = js.Any.fromFunction0(preventDefault), screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], relatedTarget = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioButtonClickEvent]
    }
    
    extension [Self <: RadioButtonClickEvent](x: Self) {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait RadioButtonHoverEvent
    extends StObject
       with typings.react.mod.MouseEvent[HTMLSpanElement, NativeMouseEvent] {
    
    var value: String
  }
  object RadioButtonHoverEvent {
    
    inline def apply(
      altKey: Boolean,
      bubbles: Boolean,
      button: Double,
      buttons: Double,
      cancelable: Boolean,
      clientX: Double,
      clientY: Double,
      ctrlKey: Boolean,
      currentTarget: EventTarget & HTMLSpanElement,
      defaultPrevented: Boolean,
      detail: Double,
      eventPhase: Double,
      getModifierState: String => Boolean,
      isDefaultPrevented: () => Boolean,
      isPropagationStopped: () => Boolean,
      isTrusted: Boolean,
      metaKey: Boolean,
      movementX: Double,
      movementY: Double,
      nativeEvent: NativeMouseEvent,
      pageX: Double,
      pageY: Double,
      persist: () => Unit,
      preventDefault: () => Unit,
      screenX: Double,
      screenY: Double,
      shiftKey: Boolean,
      stopPropagation: () => Unit,
      target: EventTarget,
      timeStamp: Double,
      `type`: String,
      value: String,
      view: AbstractView
    ): RadioButtonHoverEvent = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], movementX = movementX.asInstanceOf[js.Any], movementY = movementY.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), preventDefault = js.Any.fromFunction0(preventDefault), screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], relatedTarget = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioButtonHoverEvent]
    }
    
    extension [Self <: RadioButtonHoverEvent](x: Self) {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait RadioButtonKeyDownEvent
    extends StObject
       with KeyboardEvent[HTMLInputElement] {
    
    var value: String
  }
  object RadioButtonKeyDownEvent {
    
    inline def apply(
      altKey: Boolean,
      bubbles: Boolean,
      cancelable: Boolean,
      charCode: Double,
      code: String,
      ctrlKey: Boolean,
      currentTarget: EventTarget & HTMLInputElement,
      defaultPrevented: Boolean,
      eventPhase: Double,
      getModifierState: String => Boolean,
      isDefaultPrevented: () => Boolean,
      isPropagationStopped: () => Boolean,
      isTrusted: Boolean,
      key: String,
      keyCode: Double,
      locale: String,
      location: Double,
      metaKey: Boolean,
      nativeEvent: NativeKeyboardEvent,
      persist: () => Unit,
      preventDefault: () => Unit,
      repeat: Boolean,
      shiftKey: Boolean,
      stopPropagation: () => Unit,
      target: EventTarget,
      timeStamp: Double,
      `type`: String,
      value: String,
      which: Double
    ): RadioButtonKeyDownEvent = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], charCode = charCode.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), preventDefault = js.Any.fromFunction0(preventDefault), repeat = repeat.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioButtonKeyDownEvent]
    }
    
    extension [Self <: RadioButtonKeyDownEvent](x: Self) {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait RadioButtonProps extends StObject {
    
    /** aria-label - Accessibility */
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    /** Sets checked status of the radio */
    var checked: js.UndefOr[Boolean] = js.undefined
    
    /** The checked icon */
    var checkedIcon: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /** hook for testing purposes */
    var `data-hook`: js.UndefOr[String] = js.undefined
    
    /** Sets the disabled status of the radio */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** The label */
    var label: js.UndefOr[ReactNode] = js.undefined
    
    /** The group name which the button belongs to */
    var name: js.UndefOr[String] = js.undefined
    
    /** A callback to invoke on change */
    var onChange: js.UndefOr[js.Function1[/* event */ RadioButtonChangeEvent | RadioButtonClickEvent, Unit]] = js.undefined
    
    /** A callback to invoke on hover */
    var onHover: js.UndefOr[js.Function1[/* event */ RadioButtonHoverEvent, Unit]] = js.undefined
    
    /** A callback to invoke on blur */
    var onIconBlur: js.UndefOr[
        js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLElement, NativeMouseEvent], Unit]
      ] = js.undefined
    
    /** A callback to invoke on keydown */
    var onKeyDown: js.UndefOr[js.Function1[/* event */ RadioButtonKeyDownEvent, Unit]] = js.undefined
    
    /** Sets the required status of the radio */
    var required: js.UndefOr[Boolean] = js.undefined
    
    /** Sets the tabindex to the input */
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    /** The unchecked icon */
    var uncheckedIcon: js.UndefOr[ReactNode] = js.undefined
    
    /** The value which the radio represents */
    var value: js.UndefOr[String] = js.undefined
  }
  object RadioButtonProps {
    
    inline def apply(): RadioButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioButtonProps]
    }
    
    extension [Self <: RadioButtonProps](x: Self) {
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedIcon(value: ReactNode): Self = StObject.set(x, "checkedIcon", value.asInstanceOf[js.Any])
      
      inline def setCheckedIconUndefined: Self = StObject.set(x, "checkedIcon", js.undefined)
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
      
      inline def `setData-hookUndefined`: Self = StObject.set(x, "data-hook", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnChange(value: /* event */ RadioButtonChangeEvent | RadioButtonClickEvent => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnHover(value: /* event */ RadioButtonHoverEvent => Unit): Self = StObject.set(x, "onHover", js.Any.fromFunction1(value))
      
      inline def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
      
      inline def setOnIconBlur(value: /* event */ typings.react.mod.MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onIconBlur", js.Any.fromFunction1(value))
      
      inline def setOnIconBlurUndefined: Self = StObject.set(x, "onIconBlur", js.undefined)
      
      inline def setOnKeyDown(value: /* event */ RadioButtonKeyDownEvent => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setUncheckedIcon(value: ReactNode): Self = StObject.set(x, "uncheckedIcon", value.asInstanceOf[js.Any])
      
      inline def setUncheckedIconUndefined: Self = StObject.set(x, "uncheckedIcon", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait RadioButtonState extends StObject {
    
    var focusVisible: Boolean
    
    var focused: Boolean
  }
  object RadioButtonState {
    
    inline def apply(focusVisible: Boolean, focused: Boolean): RadioButtonState = {
      val __obj = js.Dynamic.literal(focusVisible = focusVisible.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioButtonState]
    }
    
    extension [Self <: RadioButtonState](x: Self) {
      
      inline def setFocusVisible(value: Boolean): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    }
  }
}
