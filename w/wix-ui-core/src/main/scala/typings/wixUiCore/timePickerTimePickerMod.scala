package typings.wixUiCore

import typings.react.mod.CSSProperties
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.wixUiCore.anon.FocusValue
import typings.wixUiCore.anon.Step
import typings.wixUiCore.inputMod.Input
import typings.wixUiCore.timePickerConstantsMod.AmPmOptions
import typings.wixUiCore.timePickerConstantsMod.FIELD
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timePickerTimePickerMod {
  
  @JSImport("wix-ui-core/dist/src/components/time-picker/TimePicker", "TimePicker")
  @js.native
  class TimePicker protected ()
    extends PureComponent[TimePickerProps, TimePickerState, js.Any] {
    def this(props: js.Any) = this()
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MTimePicker(nextProps: js.Any): Unit = js.native
    
    /**
      * Tracks when the user started typing in a numerical field, to switch
      * behavior on first type and on subsequent types
      */
    var _hasStartedTyping: Boolean = js.native
    
    def _highlightField(input: HTMLInputElement, field: FIELD): Unit = js.native
    def _highlightField(input: Input, field: FIELD): Unit = js.native
    
    /** Reference to the input component */
    var _inputRef: Input = js.native
    
    /** To keep track of where to increment / decrement externally (ticker) */
    var _lastFocusedField: FIELD = js.native
    
    /** For disabling select and drag */
    var _mouseDown: Boolean = js.native
    
    def _onBlur(e: js.Any): Unit = js.native
    
    def _onClick(e: js.Any): Unit = js.native
    
    def _onFocus(e: js.Any): Unit = js.native
    
    def _onKeyDown(e: js.Any): Unit = js.native
    
    def _onMouseDown(): Unit = js.native
    
    def _onMouseMove(e: js.Any): Unit = js.native
    
    def _onMouseUp(): Unit = js.native
    
    /**
      * Tracks when focus is lost from the element or from the entire page -
      * We don't want focus to move if we left the page
      */
    var _shouldHighlightOnFocus: Boolean = js.native
    
    def _tick(action: js.Function): Unit = js.native
    
    def blur(): Unit = js.native
    
    def focus(): Unit = js.native
    
    @JSName("state")
    var state_TimePicker: FocusValue = js.native
  }
  /* static members */
  object TimePicker {
    
    @JSImport("wix-ui-core/dist/src/components/time-picker/TimePicker", "TimePicker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/src/components/time-picker/TimePicker", "TimePicker.defaultProps")
    @js.native
    def defaultProps: Step = js.native
    @scala.inline
    def defaultProps_=(x: Step): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/src/components/time-picker/TimePicker", "TimePicker.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined std.Pick<wix-ui-core.wix-ui-core/dist/src/components/input.InputProps, 'disabled' | 'readOnly' | 'aria-label'> & {  onChange :(value : string): void | undefined,   onFocus :react.react.FocusEventHandler<std.HTMLElement> | undefined,   onBlur :react.react.FocusEventHandler<std.HTMLElement> | undefined,   useNativeInteraction :boolean | undefined,   useAmPm :wix-ui-core.wix-ui-core/dist/src/components/time-picker/constants.AmPmOptions | undefined,   step :number | undefined,   value :string | undefined,   tickerUpIcon :react.react.ReactNode | undefined,   tickerDownIcon :react.react.ReactNode | undefined,   error :boolean | undefined,   style :react.react.CSSProperties | undefined,   className :string | undefined,   data-hook :string | undefined} */
  trait TimePickerProps extends StObject {
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /** hook for testing purposes */
    var `data-hook`: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** Is it an error state */
    var error: js.UndefOr[Boolean] = js.undefined
    
    /** Standard input onBlur callback */
    var onBlur: js.UndefOr[FocusEventHandler[HTMLElement]] = js.undefined
    
    /**
      *  Callback function when user changes the value of the component.
      *  Will be called only with valid values (this component is semi-controlled)
      */
    var onChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    /** Standard input onFocus callback */
    var onFocus: js.UndefOr[FocusEventHandler[HTMLElement]] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    /** Interval in minutes to increase / decrease the time when on minutes or external */
    var step: js.UndefOr[Double] = js.undefined
    
    /** custom width of component. Goes into inline style so any css distance value allowed */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /** What to display for the down ticker. Will only be shown if tickerUpIcon is also provided */
    var tickerDownIcon: js.UndefOr[ReactNode] = js.undefined
    
    /** What to display for the up ticker. Will only be shown if tickerDownIcon is also provided */
    var tickerUpIcon: js.UndefOr[ReactNode] = js.undefined
    
    /** Display and interact as AM/PM instead of 24 hour */
    var useAmPm: js.UndefOr[AmPmOptions] = js.undefined
    
    /** Use native (input type = 'time') interaction */
    var useNativeInteraction: js.UndefOr[Boolean] = js.undefined
    
    /** Time in 24hour format according to the spec 23:59(:59(.999)) (https://html.spec.whatwg.org/multipage/common-microsyntaxes.html#times). Can be null */
    var value: js.UndefOr[String] = js.undefined
  }
  object TimePickerProps {
    
    @scala.inline
    def apply(): TimePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimePickerProps]
    }
    
    @scala.inline
    implicit class TimePickerPropsMutableBuilder[Self <: TimePickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setData-hookUndefined`: Self = StObject.set(x, "data-hook", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setOnBlur(value: FocusEvent[HTMLElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnFocus(value: FocusEvent[HTMLElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTickerDownIcon(value: ReactNode): Self = StObject.set(x, "tickerDownIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickerDownIconUndefined: Self = StObject.set(x, "tickerDownIcon", js.undefined)
      
      @scala.inline
      def setTickerUpIcon(value: ReactNode): Self = StObject.set(x, "tickerUpIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickerUpIconUndefined: Self = StObject.set(x, "tickerUpIcon", js.undefined)
      
      @scala.inline
      def setUseAmPm(value: AmPmOptions): Self = StObject.set(x, "useAmPm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseAmPmUndefined: Self = StObject.set(x, "useAmPm", js.undefined)
      
      @scala.inline
      def setUseNativeInteraction(value: Boolean): Self = StObject.set(x, "useNativeInteraction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseNativeInteractionUndefined: Self = StObject.set(x, "useNativeInteraction", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait TimePickerState extends StObject {
    
    var focus: Boolean
    
    var value: String
  }
  object TimePickerState {
    
    @scala.inline
    def apply(focus: Boolean, value: String): TimePickerState = {
      val __obj = js.Dynamic.literal(focus = focus.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimePickerState]
    }
    
    @scala.inline
    implicit class TimePickerStateMutableBuilder[Self <: TimePickerState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
