package typings.timepicker

import typings.timepicker.anon.AM
import typings.timepicker.anon.ClassName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryTimepickerOptions extends StObject {
  
  // Override where the dropdown is appended.
  // Takes either a string to use as a selector, a function that gets passed the clicked input element as argument or a jquery object to use directly.
  // default: "body"
  var appendTo: js.UndefOr[String | (js.Function1[/* clickedElement */ JQuery, JQuery]) | JQuery] = js.undefined
  
  // A class name to apply to the HTML element that contains the timepicker dropdown.
  // default: null
  var className: js.UndefOr[String] = js.undefined
  
  // Close the timepicker when the window is scrolled. (Replicates <select> behavior.)
  // default: false
  var closeOnWindowScroll: js.UndefOr[Boolean] = js.undefined
  
  // Disable typing in the timepicker input box; force users to select from list. More information here.
  // default: false
  var disableTextInput: js.UndefOr[Boolean] = js.undefined
  
  // Disable selection of certain time ranges.
  // Input is an array of time pairs, like [['3:00am', '4:30am'], ['5:00pm', '8:00pm']].
  // The start of the interval will be disabled but the end won't. default: []
  var disableTimeRanges: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  
  // Disable the onscreen keyboard for touch devices.
  // There can be instances where Firefox or Chrome have touch events enabled (such as on Surface tablets but not actually be a touch device.
  // In this case disableTouchKeyboard will prevent the timepicker input field from being focused. More information here.
  // default: false
  var disableTouchKeyboard: js.UndefOr[Boolean] = js.undefined
  
  // The time against which showDuration will compute relative times. If this is a function, its result will be used.
  // default: minTime
  var durationTime: js.UndefOr[String] = js.undefined
  
  // Force update the time to step settings as soon as it loses focus.
  // default: false
  var forceRoundTime: js.UndefOr[Boolean] = js.undefined
  
  // Language constants used in the timepicker.
  // Can override the defaults by passing an object with one or more of the following properties: decimal, mins, hr, hrs.
  // default: { am: 'am', pm: 'pm', AM: 'AM', PM: 'PM', decimal: '.', mins: 'mins', hr: 'hr', hrs: 'hrs' }
  var lang: js.UndefOr[AM] = js.undefined
  
  // Set this to override CSS styling and set the list width to match the input element's width.
  // Set to 1 to match input width, 2 to double input width, .5 to halve input width, etc. Set to null to let CSS determine the list width.
  // default: null (CSS styling)
  var listWidth: js.UndefOr[Double] = js.undefined
  
  // The time that should appear last in the dropdown list. Can be used to limit the range of time options.
  // default: 24 hours after minTime
  var maxTime: js.UndefOr[String] = js.undefined
  
  // The time that should appear first in the dropdown list.
  // default: 12:00am
  var minTime: js.UndefOr[String] = js.undefined
  
  // Adds one or more custom options to the top of the dropdown. Can accept several different value types:
  // Boolean (true): Adds a "None" option that results in an empty input value
  // String: Adds an option with a custom label that results in an empty input value
  // Object: Similar to string, but allows customizing the element's class name and the resulting input value.
  // Can contain label, value, and className properties. value must be a string type.
  // Array: An array of strings or objects to add multiple non-time options
  // default: false
  var noneOption: js.UndefOr[Boolean | String | ClassName | (js.Array[String | ClassName])] = js.undefined
  
  // By default the timepicker dropdown will be aligned to the bottom right of the input element, or aligned to the top left if there isn't enough room below the input.
  // Force alignment with l (left), r (right), c (horizontal center), t (top), and b (bottom). Examples: tl, rb. default: 'l'
  var orientation: js.UndefOr[String] = js.undefined
  
  // Function used to compute rounded times. The function will receive time in seconds and a settings object as arguments.
  // The function should handle a null value for seconds. default: round to nearest step
  var roundingFunction: js.UndefOr[js.Function2[/* seconds */ Double | Null, /* settings */ this.type, Double]] = js.undefined
  
  // If no time value is selected, set the dropdown scroll position to show the time provided, e.g. "09:00".
  // A time string, Date object, or integer (seconds past midnight) is acceptible, as well as the string 'now'.
  // default: null
  var scrollDefault: js.UndefOr[String | js.Date | Double] = js.undefined
  
  // Update the input with the currently highlighted time value when the timepicker loses focus.
  // default: false
  var selectOnBlur: js.UndefOr[Boolean] = js.undefined
  
  // Show "24:00" as an option when using 24-hour time format. You must also set timeFormat for this option to work.
  // default: false
  var show2400: js.UndefOr[Boolean] = js.undefined
  
  // Shows the relative time for each item in the dropdown. minTime or durationTime must be set.
  // default: false
  var showDuration: js.UndefOr[Boolean] = js.undefined
  
  // Display a timepicker dropdown when the input fires a particular event. Set to null or an empty array to disable automatic display. Setting should be an array of strings. default: ['focus']
  var showOn: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  // DEPRECATED: Display a timepicker dropdown when the input gains focus.
  // default: true
  var showOnFocus: js.UndefOr[Boolean] = js.undefined
  
  // The amount of time, in minutes, between each item in the dropdown.
  // Alternately, you can specify a function to generate steps dynamically.
  // The function will receive a count integer (0, 1, 2...) and is expected to return a step integer.
  // default: 30
  var step: js.UndefOr[Double] = js.undefined
  
  // When scrolling on the edge of the picker, it prevent parent containers () to scroll. default: false
  var stopScrollPropagation: js.UndefOr[Boolean] = js.undefined
  
  // How times should be displayed in the list and input element. Uses PHP's date() formatting syntax.
  // Characters can be escaped with a preceeding double slash (e.g. H\\hi).
  // Alternatively, you can specify a function instead of a string, to use completely custom time formatting.
  // In this case, the format function receives a Date object and is expected to return a formatted time as a string. default: 'g:ia'
  var timeFormat: js.UndefOr[String | (js.Function1[/* date */ js.Date, String])] = js.undefined
  
  // Highlight the nearest corresponding time option as a value is typed into the form input.
  // default: true
  var typeaheadHighlight: js.UndefOr[Boolean] = js.undefined
  
  // Convert the input to an HTML <SELECT> control.
  // This is ideal for small screen devices, or if you want to prevent the user from entering arbitrary values.
  // This option is not compatible with the following options: appendTo, closeOnWindowScroll, disableTouchKeyboard, forceRoundTime, scrollDefault, selectOnBlur, typeAheadHighlight.
  // default: false
  var useSelect: js.UndefOr[Boolean] = js.undefined
  
  // If a time greater than 24 hours (27:30, for example) is entered, apply modolo 24 to create a valid time.
  // Setting this to false will cause an input of 27:30 to result in a timeFormatError event.
  // default: true
  var wrapHours: js.UndefOr[Boolean] = js.undefined
}
object JQueryTimepickerOptions {
  
  inline def apply(): JQueryTimepickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryTimepickerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQueryTimepickerOptions] (val x: Self) extends AnyVal {
    
    inline def setAppendTo(value: String | (js.Function1[/* clickedElement */ JQuery, JQuery]) | JQuery): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
    
    inline def setAppendToFunction1(value: /* clickedElement */ JQuery => JQuery): Self = StObject.set(x, "appendTo", js.Any.fromFunction1(value))
    
    inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCloseOnWindowScroll(value: Boolean): Self = StObject.set(x, "closeOnWindowScroll", value.asInstanceOf[js.Any])
    
    inline def setCloseOnWindowScrollUndefined: Self = StObject.set(x, "closeOnWindowScroll", js.undefined)
    
    inline def setDisableTextInput(value: Boolean): Self = StObject.set(x, "disableTextInput", value.asInstanceOf[js.Any])
    
    inline def setDisableTextInputUndefined: Self = StObject.set(x, "disableTextInput", js.undefined)
    
    inline def setDisableTimeRanges(value: js.Array[js.Array[String]]): Self = StObject.set(x, "disableTimeRanges", value.asInstanceOf[js.Any])
    
    inline def setDisableTimeRangesUndefined: Self = StObject.set(x, "disableTimeRanges", js.undefined)
    
    inline def setDisableTimeRangesVarargs(value: js.Array[String]*): Self = StObject.set(x, "disableTimeRanges", js.Array(value*))
    
    inline def setDisableTouchKeyboard(value: Boolean): Self = StObject.set(x, "disableTouchKeyboard", value.asInstanceOf[js.Any])
    
    inline def setDisableTouchKeyboardUndefined: Self = StObject.set(x, "disableTouchKeyboard", js.undefined)
    
    inline def setDurationTime(value: String): Self = StObject.set(x, "durationTime", value.asInstanceOf[js.Any])
    
    inline def setDurationTimeUndefined: Self = StObject.set(x, "durationTime", js.undefined)
    
    inline def setForceRoundTime(value: Boolean): Self = StObject.set(x, "forceRoundTime", value.asInstanceOf[js.Any])
    
    inline def setForceRoundTimeUndefined: Self = StObject.set(x, "forceRoundTime", js.undefined)
    
    inline def setLang(value: AM): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setListWidth(value: Double): Self = StObject.set(x, "listWidth", value.asInstanceOf[js.Any])
    
    inline def setListWidthUndefined: Self = StObject.set(x, "listWidth", js.undefined)
    
    inline def setMaxTime(value: String): Self = StObject.set(x, "maxTime", value.asInstanceOf[js.Any])
    
    inline def setMaxTimeUndefined: Self = StObject.set(x, "maxTime", js.undefined)
    
    inline def setMinTime(value: String): Self = StObject.set(x, "minTime", value.asInstanceOf[js.Any])
    
    inline def setMinTimeUndefined: Self = StObject.set(x, "minTime", js.undefined)
    
    inline def setNoneOption(value: Boolean | String | ClassName | (js.Array[String | ClassName])): Self = StObject.set(x, "noneOption", value.asInstanceOf[js.Any])
    
    inline def setNoneOptionUndefined: Self = StObject.set(x, "noneOption", js.undefined)
    
    inline def setNoneOptionVarargs(value: (String | ClassName)*): Self = StObject.set(x, "noneOption", js.Array(value*))
    
    inline def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setRoundingFunction(value: (/* seconds */ Double | Null, JQueryTimepickerOptions) => Double): Self = StObject.set(x, "roundingFunction", js.Any.fromFunction2(value))
    
    inline def setRoundingFunctionUndefined: Self = StObject.set(x, "roundingFunction", js.undefined)
    
    inline def setScrollDefault(value: String | js.Date | Double): Self = StObject.set(x, "scrollDefault", value.asInstanceOf[js.Any])
    
    inline def setScrollDefaultUndefined: Self = StObject.set(x, "scrollDefault", js.undefined)
    
    inline def setSelectOnBlur(value: Boolean): Self = StObject.set(x, "selectOnBlur", value.asInstanceOf[js.Any])
    
    inline def setSelectOnBlurUndefined: Self = StObject.set(x, "selectOnBlur", js.undefined)
    
    inline def setShow2400(value: Boolean): Self = StObject.set(x, "show2400", value.asInstanceOf[js.Any])
    
    inline def setShow2400Undefined: Self = StObject.set(x, "show2400", js.undefined)
    
    inline def setShowDuration(value: Boolean): Self = StObject.set(x, "showDuration", value.asInstanceOf[js.Any])
    
    inline def setShowDurationUndefined: Self = StObject.set(x, "showDuration", js.undefined)
    
    inline def setShowOn(value: js.Array[String]): Self = StObject.set(x, "showOn", value.asInstanceOf[js.Any])
    
    inline def setShowOnFocus(value: Boolean): Self = StObject.set(x, "showOnFocus", value.asInstanceOf[js.Any])
    
    inline def setShowOnFocusUndefined: Self = StObject.set(x, "showOnFocus", js.undefined)
    
    inline def setShowOnNull: Self = StObject.set(x, "showOn", null)
    
    inline def setShowOnUndefined: Self = StObject.set(x, "showOn", js.undefined)
    
    inline def setShowOnVarargs(value: String*): Self = StObject.set(x, "showOn", js.Array(value*))
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setStopScrollPropagation(value: Boolean): Self = StObject.set(x, "stopScrollPropagation", value.asInstanceOf[js.Any])
    
    inline def setStopScrollPropagationUndefined: Self = StObject.set(x, "stopScrollPropagation", js.undefined)
    
    inline def setTimeFormat(value: String | (js.Function1[/* date */ js.Date, String])): Self = StObject.set(x, "timeFormat", value.asInstanceOf[js.Any])
    
    inline def setTimeFormatFunction1(value: /* date */ js.Date => String): Self = StObject.set(x, "timeFormat", js.Any.fromFunction1(value))
    
    inline def setTimeFormatUndefined: Self = StObject.set(x, "timeFormat", js.undefined)
    
    inline def setTypeaheadHighlight(value: Boolean): Self = StObject.set(x, "typeaheadHighlight", value.asInstanceOf[js.Any])
    
    inline def setTypeaheadHighlightUndefined: Self = StObject.set(x, "typeaheadHighlight", js.undefined)
    
    inline def setUseSelect(value: Boolean): Self = StObject.set(x, "useSelect", value.asInstanceOf[js.Any])
    
    inline def setUseSelectUndefined: Self = StObject.set(x, "useSelect", js.undefined)
    
    inline def setWrapHours(value: Boolean): Self = StObject.set(x, "wrapHours", value.asInstanceOf[js.Any])
    
    inline def setWrapHoursUndefined: Self = StObject.set(x, "wrapHours", js.undefined)
  }
}
