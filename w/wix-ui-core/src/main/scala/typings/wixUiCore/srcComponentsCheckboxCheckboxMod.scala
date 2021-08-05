package typings.wixUiCore

import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.react.mod.EventHandler
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.global.JSX.Element
import typings.std.Event
import typings.std.EventTarget
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.wixUiCore.anon.FocusVisible
import typings.wixUiCore.anon.PartialCheckboxPropsAccept
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsCheckboxCheckboxMod {
  
  @JSImport("wix-ui-core/src/components/checkbox/Checkbox", "Checkbox")
  @js.native
  class Checkbox protected ()
    extends Component[CheckboxProps, CheckboxState, js.Any] {
    def this(props: CheckboxProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CheckboxProps, context: js.Any) = this()
    
    /* private */ var checkbox: js.Any = js.native
    
    /* private */ var focusedByMouse: js.Any = js.native
    
    /* private */ val handleChange: js.Any = js.native
    
    /* private */ val handleInputBlur: js.Any = js.native
    
    /* private */ val handleInputFocus: js.Any = js.native
    
    /* private */ val handleInputKeyDown: js.Any = js.native
    
    /* private */ val handleMouseDown: js.Any = js.native
    
    @JSName("state")
    var state_Checkbox: FocusVisible = js.native
  }
  /* static members */
  object Checkbox {
    
    @JSImport("wix-ui-core/src/components/checkbox/Checkbox", "Checkbox")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/src/components/checkbox/Checkbox", "Checkbox.defaultProps")
    @js.native
    def defaultProps: PartialCheckboxPropsAccept = js.native
    inline def defaultProps_=(x: PartialCheckboxPropsAccept): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/src/components/checkbox/Checkbox", "Checkbox.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait CheckboxProps
    extends StObject
       with InputHTMLAttributes[HTMLElement] {
    
    /** An element to be displayed when the checkbox is checked */
    var checkedIcon: js.UndefOr[Element] = js.undefined
    
    /** hook for testing purposes */
    var `data-hook`: js.UndefOr[String] = js.undefined
    
    /** Whether checkbox should be in error state */
    var error: js.UndefOr[Boolean] = js.undefined
    
    /** Whether the checkbox is indeterminate */
    var indeterminate: js.UndefOr[Boolean] = js.undefined
    
    /** An element to be displayed when the checkbox is in indeterminate state */
    var indeterminateIcon: js.UndefOr[Element] = js.undefined
    
    /** The onChange function will be called with a new checked value */
    @JSName("onChange")
    var onChange_CheckboxProps: js.UndefOr[EventHandler[OnChangeEvent]] = js.undefined
    
    /** An element to be displayed when the checkbox is unchecked */
    var uncheckedIcon: js.UndefOr[Element] = js.undefined
  }
  object CheckboxProps {
    
    inline def apply(): CheckboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboxProps]
    }
    
    extension [Self <: CheckboxProps](x: Self) {
      
      inline def setCheckedIcon(value: Element): Self = StObject.set(x, "checkedIcon", value.asInstanceOf[js.Any])
      
      inline def setCheckedIconUndefined: Self = StObject.set(x, "checkedIcon", js.undefined)
      
      inline def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
      
      inline def `setData-hookUndefined`: Self = StObject.set(x, "data-hook", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
      
      inline def setIndeterminateIcon(value: Element): Self = StObject.set(x, "indeterminateIcon", value.asInstanceOf[js.Any])
      
      inline def setIndeterminateIconUndefined: Self = StObject.set(x, "indeterminateIcon", js.undefined)
      
      inline def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
      
      inline def setOnChange(value: OnChangeEvent => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setUncheckedIcon(value: Element): Self = StObject.set(x, "uncheckedIcon", value.asInstanceOf[js.Any])
      
      inline def setUncheckedIconUndefined: Self = StObject.set(x, "uncheckedIcon", js.undefined)
    }
  }
  
  trait CheckboxState extends StObject {
    
    var focusVisible: Boolean
    
    var isFocused: Boolean
  }
  object CheckboxState {
    
    inline def apply(focusVisible: Boolean, isFocused: Boolean): CheckboxState = {
      val __obj = js.Dynamic.literal(focusVisible = focusVisible.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckboxState]
    }
    
    extension [Self <: CheckboxState](x: Self) {
      
      inline def setFocusVisible(value: Boolean): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      inline def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnChangeEvent
    extends StObject
       with ChangeEvent[HTMLInputElement] {
    
    var checked: Boolean
  }
  object OnChangeEvent {
    
    inline def apply(
      bubbles: Boolean,
      cancelable: Boolean,
      checked: Boolean,
      currentTarget: EventTarget & HTMLInputElement,
      defaultPrevented: Boolean,
      eventPhase: Double,
      isDefaultPrevented: () => Boolean,
      isPropagationStopped: () => Boolean,
      isTrusted: Boolean,
      nativeEvent: Event,
      persist: () => Unit,
      preventDefault: () => Unit,
      stopPropagation: () => Unit,
      target: EventTarget & HTMLInputElement,
      timeStamp: Double,
      `type`: String
    ): OnChangeEvent = {
      val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], checked = checked.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnChangeEvent]
    }
    
    extension [Self <: OnChangeEvent](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    }
  }
}
