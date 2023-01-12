package typings.vanillajsDatepicker

import typings.std.HTMLElement
import typings.vanillajsDatepicker.anon.Clear
import typings.vanillajsDatepicker.vanillajsDatepickerStrings.auto
import typings.vanillajsDatepicker.vanillajsDatepickerStrings.input
import typings.vanillajsDatepicker.vanillajsDatepickerStrings.picker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datepickerMod {
  
  @JSImport("vanillajs-datepicker/Datepicker", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Datepicker {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: DatepickerOptions) = this()
    def this(
      element: HTMLElement,
      options: Unit,
      rangepicker: typings.vanillajsDatepicker.dateRangePickerMod.default
    ) = this()
    def this(
      element: HTMLElement,
      options: DatepickerOptions,
      rangepicker: typings.vanillajsDatepicker.dateRangePickerMod.default
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("vanillajs-datepicker/Datepicker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def formatDate(date: js.Date, format: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def formatDate(date: js.Date, format: String, lang: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], lang.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def formatDate(date: Double, format: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def formatDate(date: Double, format: String, lang: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], lang.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def parseDate(dateStr: String, format: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDate")(dateStr.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def parseDate(dateStr: String, format: String, lang: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDate")(dateStr.asInstanceOf[js.Any], format.asInstanceOf[js.Any], lang.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def parseDate(dateStr: js.Date, format: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDate")(dateStr.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def parseDate(dateStr: js.Date, format: String, lang: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDate")(dateStr.asInstanceOf[js.Any], format.asInstanceOf[js.Any], lang.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def parseDate(dateStr: Double, format: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDate")(dateStr.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def parseDate(dateStr: Double, format: String, lang: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDate")(dateStr.asInstanceOf[js.Any], format.asInstanceOf[js.Any], lang.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  @js.native
  trait Datepicker extends StObject {
    
    var _options: js.Object = js.native
    
    var _showing: Boolean = js.native
    
    def active: Boolean = js.native
    
    var config: DatepickerOptions = js.native
    
    var dates: Any = js.native
    
    def destroy(): Datepicker = js.native
    
    var editMode: Boolean = js.native
    
    var element: HTMLElement = js.native
    
    def enterEditMode(): Unit = js.native
    
    def exitEditMode(): Unit = js.native
    def exitEditMode(options: js.Object): Unit = js.native
    
    def getDate(): js.Date | String | (js.Array[js.Date | String]) = js.native
    def getDate(format: String): js.Date | String | (js.Array[js.Date | String]) = js.native
    
    def hide(): Unit = js.native
    
    var `inline`: Boolean = js.native
    
    var inputField: Any = js.native
    
    var picker: Any = js.native
    
    def pickerElement: js.UndefOr[HTMLElement] = js.native
    
    def refresh(): Unit = js.native
    def refresh(forceRender: Boolean): Unit = js.native
    def refresh(target: picker | input): Unit = js.native
    def refresh(target: picker | input, forceRender: Boolean): Unit = js.native
    def refresh(target: Unit, forceRender: Boolean): Unit = js.native
    
    def setDate(args: Any*): Unit = js.native
    
    def setOptions(options: js.Object): Unit = js.native
    
    def show(): Unit = js.native
    
    def update(): Unit = js.native
    def update(options: Clear): Unit = js.native
  }
  
  trait DatepickerOptions extends StObject {
    
    var autohide: js.UndefOr[Boolean] = js.undefined
    
    var beforeShowDay: js.UndefOr[js.Function1[/* date */ js.Date, js.Object | String | Boolean]] = js.undefined
    
    var beforeShowDecade: js.UndefOr[js.Function1[/* date */ js.Date, js.Object | String | Boolean]] = js.undefined
    
    var beforeShowMonth: js.UndefOr[js.Function1[/* date */ js.Date, js.Object | String | Boolean]] = js.undefined
    
    var beforeShowYear: js.UndefOr[js.Function1[/* date */ js.Date, js.Object | String | Boolean]] = js.undefined
    
    var buttonClass: js.UndefOr[String] = js.undefined
    
    var calendarWeeks: js.UndefOr[Boolean] = js.undefined
    
    var clearBtn: js.UndefOr[Boolean] = js.undefined
    
    var container: js.UndefOr[String | HTMLElement] = js.undefined
    
    var dateDelimiter: js.UndefOr[String] = js.undefined
    
    var datesDisabled: js.UndefOr[js.Array[String]] = js.undefined
    
    var daysOfWeekDisabled: js.UndefOr[js.Array[Double]] = js.undefined
    
    var daysOfWeekHighlighted: js.UndefOr[js.Array[Double]] = js.undefined
    
    var defaultViewDate: js.UndefOr[String | js.Date | Double] = js.undefined
    
    var format: js.UndefOr[String | DatepickerOptionsFormat] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var maxDate: js.UndefOr[String | js.Date | Double] = js.undefined
    
    var maxNumberOfDates: js.UndefOr[Double] = js.undefined
    
    var maxView: js.UndefOr[Double] = js.undefined
    
    var minDate: js.UndefOr[String | js.Date | Double] = js.undefined
    
    var nextArrow: js.UndefOr[String] = js.undefined
    
    var orientation: js.UndefOr[DatepickerOptionsOrientation] = js.undefined
    
    var pickLevel: js.UndefOr[Double] = js.undefined
    
    var prevArray: js.UndefOr[String] = js.undefined
    
    var prevArrow: js.UndefOr[String] = js.undefined
    
    var showDaysOfWeek: js.UndefOr[Boolean] = js.undefined
    
    var showOnClick: js.UndefOr[Boolean] = js.undefined
    
    var showOnFocus: js.UndefOr[Boolean] = js.undefined
    
    var startView: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var todayBtn: js.UndefOr[Boolean] = js.undefined
    
    var todayBtnMode: js.UndefOr[Double] = js.undefined
    
    var todayHighlight: js.UndefOr[Boolean] = js.undefined
    
    var updateOnBlur: js.UndefOr[Boolean] = js.undefined
    
    var weekStart: js.UndefOr[Double] = js.undefined
  }
  object DatepickerOptions {
    
    inline def apply(): DatepickerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatepickerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DatepickerOptions] (val x: Self) extends AnyVal {
      
      inline def setAutohide(value: Boolean): Self = StObject.set(x, "autohide", value.asInstanceOf[js.Any])
      
      inline def setAutohideUndefined: Self = StObject.set(x, "autohide", js.undefined)
      
      inline def setBeforeShowDay(value: /* date */ js.Date => js.Object | String | Boolean): Self = StObject.set(x, "beforeShowDay", js.Any.fromFunction1(value))
      
      inline def setBeforeShowDayUndefined: Self = StObject.set(x, "beforeShowDay", js.undefined)
      
      inline def setBeforeShowDecade(value: /* date */ js.Date => js.Object | String | Boolean): Self = StObject.set(x, "beforeShowDecade", js.Any.fromFunction1(value))
      
      inline def setBeforeShowDecadeUndefined: Self = StObject.set(x, "beforeShowDecade", js.undefined)
      
      inline def setBeforeShowMonth(value: /* date */ js.Date => js.Object | String | Boolean): Self = StObject.set(x, "beforeShowMonth", js.Any.fromFunction1(value))
      
      inline def setBeforeShowMonthUndefined: Self = StObject.set(x, "beforeShowMonth", js.undefined)
      
      inline def setBeforeShowYear(value: /* date */ js.Date => js.Object | String | Boolean): Self = StObject.set(x, "beforeShowYear", js.Any.fromFunction1(value))
      
      inline def setBeforeShowYearUndefined: Self = StObject.set(x, "beforeShowYear", js.undefined)
      
      inline def setButtonClass(value: String): Self = StObject.set(x, "buttonClass", value.asInstanceOf[js.Any])
      
      inline def setButtonClassUndefined: Self = StObject.set(x, "buttonClass", js.undefined)
      
      inline def setCalendarWeeks(value: Boolean): Self = StObject.set(x, "calendarWeeks", value.asInstanceOf[js.Any])
      
      inline def setCalendarWeeksUndefined: Self = StObject.set(x, "calendarWeeks", js.undefined)
      
      inline def setClearBtn(value: Boolean): Self = StObject.set(x, "clearBtn", value.asInstanceOf[js.Any])
      
      inline def setClearBtnUndefined: Self = StObject.set(x, "clearBtn", js.undefined)
      
      inline def setContainer(value: String | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setDateDelimiter(value: String): Self = StObject.set(x, "dateDelimiter", value.asInstanceOf[js.Any])
      
      inline def setDateDelimiterUndefined: Self = StObject.set(x, "dateDelimiter", js.undefined)
      
      inline def setDatesDisabled(value: js.Array[String]): Self = StObject.set(x, "datesDisabled", value.asInstanceOf[js.Any])
      
      inline def setDatesDisabledUndefined: Self = StObject.set(x, "datesDisabled", js.undefined)
      
      inline def setDatesDisabledVarargs(value: String*): Self = StObject.set(x, "datesDisabled", js.Array(value*))
      
      inline def setDaysOfWeekDisabled(value: js.Array[Double]): Self = StObject.set(x, "daysOfWeekDisabled", value.asInstanceOf[js.Any])
      
      inline def setDaysOfWeekDisabledUndefined: Self = StObject.set(x, "daysOfWeekDisabled", js.undefined)
      
      inline def setDaysOfWeekDisabledVarargs(value: Double*): Self = StObject.set(x, "daysOfWeekDisabled", js.Array(value*))
      
      inline def setDaysOfWeekHighlighted(value: js.Array[Double]): Self = StObject.set(x, "daysOfWeekHighlighted", value.asInstanceOf[js.Any])
      
      inline def setDaysOfWeekHighlightedUndefined: Self = StObject.set(x, "daysOfWeekHighlighted", js.undefined)
      
      inline def setDaysOfWeekHighlightedVarargs(value: Double*): Self = StObject.set(x, "daysOfWeekHighlighted", js.Array(value*))
      
      inline def setDefaultViewDate(value: String | js.Date | Double): Self = StObject.set(x, "defaultViewDate", value.asInstanceOf[js.Any])
      
      inline def setDefaultViewDateUndefined: Self = StObject.set(x, "defaultViewDate", js.undefined)
      
      inline def setFormat(value: String | DatepickerOptionsFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setMaxDate(value: String | js.Date | Double): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMaxNumberOfDates(value: Double): Self = StObject.set(x, "maxNumberOfDates", value.asInstanceOf[js.Any])
      
      inline def setMaxNumberOfDatesUndefined: Self = StObject.set(x, "maxNumberOfDates", js.undefined)
      
      inline def setMaxView(value: Double): Self = StObject.set(x, "maxView", value.asInstanceOf[js.Any])
      
      inline def setMaxViewUndefined: Self = StObject.set(x, "maxView", js.undefined)
      
      inline def setMinDate(value: String | js.Date | Double): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setNextArrow(value: String): Self = StObject.set(x, "nextArrow", value.asInstanceOf[js.Any])
      
      inline def setNextArrowUndefined: Self = StObject.set(x, "nextArrow", js.undefined)
      
      inline def setOrientation(value: DatepickerOptionsOrientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setPickLevel(value: Double): Self = StObject.set(x, "pickLevel", value.asInstanceOf[js.Any])
      
      inline def setPickLevelUndefined: Self = StObject.set(x, "pickLevel", js.undefined)
      
      inline def setPrevArray(value: String): Self = StObject.set(x, "prevArray", value.asInstanceOf[js.Any])
      
      inline def setPrevArrayUndefined: Self = StObject.set(x, "prevArray", js.undefined)
      
      inline def setPrevArrow(value: String): Self = StObject.set(x, "prevArrow", value.asInstanceOf[js.Any])
      
      inline def setPrevArrowUndefined: Self = StObject.set(x, "prevArrow", js.undefined)
      
      inline def setShowDaysOfWeek(value: Boolean): Self = StObject.set(x, "showDaysOfWeek", value.asInstanceOf[js.Any])
      
      inline def setShowDaysOfWeekUndefined: Self = StObject.set(x, "showDaysOfWeek", js.undefined)
      
      inline def setShowOnClick(value: Boolean): Self = StObject.set(x, "showOnClick", value.asInstanceOf[js.Any])
      
      inline def setShowOnClickUndefined: Self = StObject.set(x, "showOnClick", js.undefined)
      
      inline def setShowOnFocus(value: Boolean): Self = StObject.set(x, "showOnFocus", value.asInstanceOf[js.Any])
      
      inline def setShowOnFocusUndefined: Self = StObject.set(x, "showOnFocus", js.undefined)
      
      inline def setStartView(value: Double): Self = StObject.set(x, "startView", value.asInstanceOf[js.Any])
      
      inline def setStartViewUndefined: Self = StObject.set(x, "startView", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTodayBtn(value: Boolean): Self = StObject.set(x, "todayBtn", value.asInstanceOf[js.Any])
      
      inline def setTodayBtnMode(value: Double): Self = StObject.set(x, "todayBtnMode", value.asInstanceOf[js.Any])
      
      inline def setTodayBtnModeUndefined: Self = StObject.set(x, "todayBtnMode", js.undefined)
      
      inline def setTodayBtnUndefined: Self = StObject.set(x, "todayBtn", js.undefined)
      
      inline def setTodayHighlight(value: Boolean): Self = StObject.set(x, "todayHighlight", value.asInstanceOf[js.Any])
      
      inline def setTodayHighlightUndefined: Self = StObject.set(x, "todayHighlight", js.undefined)
      
      inline def setUpdateOnBlur(value: Boolean): Self = StObject.set(x, "updateOnBlur", value.asInstanceOf[js.Any])
      
      inline def setUpdateOnBlurUndefined: Self = StObject.set(x, "updateOnBlur", js.undefined)
      
      inline def setWeekStart(value: Double): Self = StObject.set(x, "weekStart", value.asInstanceOf[js.Any])
      
      inline def setWeekStartUndefined: Self = StObject.set(x, "weekStart", js.undefined)
    }
  }
  
  trait DatepickerOptionsFormat extends StObject {
    
    def toDisplay(date: js.Date, format: js.Object, locale: js.Object): String
    
    def toValue(date: js.Date, format: js.Object, locale: js.Object): String
  }
  object DatepickerOptionsFormat {
    
    inline def apply(
      toDisplay: (js.Date, js.Object, js.Object) => String,
      toValue: (js.Date, js.Object, js.Object) => String
    ): DatepickerOptionsFormat = {
      val __obj = js.Dynamic.literal(toDisplay = js.Any.fromFunction3(toDisplay), toValue = js.Any.fromFunction3(toValue))
      __obj.asInstanceOf[DatepickerOptionsFormat]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DatepickerOptionsFormat] (val x: Self) extends AnyVal {
      
      inline def setToDisplay(value: (js.Date, js.Object, js.Object) => String): Self = StObject.set(x, "toDisplay", js.Any.fromFunction3(value))
      
      inline def setToValue(value: (js.Date, js.Object, js.Object) => String): Self = StObject.set(x, "toValue", js.Any.fromFunction3(value))
    }
  }
  
  type DatepickerOptionsOrientation = (/* template literal string: ${DatepickerOptionsOrientationVertical} ${DatepickerOptionsOrientationHorizontal} */ String) | auto
  
  /* Rewritten from type alias, can be one of: 
    - typings.vanillajsDatepicker.vanillajsDatepickerStrings.left
    - typings.vanillajsDatepicker.vanillajsDatepickerStrings.center
    - typings.vanillajsDatepicker.vanillajsDatepickerStrings.right
    - typings.vanillajsDatepicker.vanillajsDatepickerStrings.auto
  */
  trait DatepickerOptionsOrientationHorizontal extends StObject
  object DatepickerOptionsOrientationHorizontal {
    
    inline def auto: typings.vanillajsDatepicker.vanillajsDatepickerStrings.auto = "auto".asInstanceOf[typings.vanillajsDatepicker.vanillajsDatepickerStrings.auto]
    
    inline def center: typings.vanillajsDatepicker.vanillajsDatepickerStrings.center = "center".asInstanceOf[typings.vanillajsDatepicker.vanillajsDatepickerStrings.center]
    
    inline def left: typings.vanillajsDatepicker.vanillajsDatepickerStrings.left = "left".asInstanceOf[typings.vanillajsDatepicker.vanillajsDatepickerStrings.left]
    
    inline def right: typings.vanillajsDatepicker.vanillajsDatepickerStrings.right = "right".asInstanceOf[typings.vanillajsDatepicker.vanillajsDatepickerStrings.right]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vanillajsDatepicker.vanillajsDatepickerStrings.top
    - typings.vanillajsDatepicker.vanillajsDatepickerStrings.middle
    - typings.vanillajsDatepicker.vanillajsDatepickerStrings.bottom
    - typings.vanillajsDatepicker.vanillajsDatepickerStrings.auto
  */
  trait DatepickerOptionsOrientationVertical extends StObject
  object DatepickerOptionsOrientationVertical {
    
    inline def auto: typings.vanillajsDatepicker.vanillajsDatepickerStrings.auto = "auto".asInstanceOf[typings.vanillajsDatepicker.vanillajsDatepickerStrings.auto]
    
    inline def bottom: typings.vanillajsDatepicker.vanillajsDatepickerStrings.bottom = "bottom".asInstanceOf[typings.vanillajsDatepicker.vanillajsDatepickerStrings.bottom]
    
    inline def middle: typings.vanillajsDatepicker.vanillajsDatepickerStrings.middle = "middle".asInstanceOf[typings.vanillajsDatepicker.vanillajsDatepickerStrings.middle]
    
    inline def top: typings.vanillajsDatepicker.vanillajsDatepickerStrings.top = "top".asInstanceOf[typings.vanillajsDatepicker.vanillajsDatepickerStrings.top]
  }
}
