package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.std.Date
import typings.wixStyleReact.anon.DistanceInWords
import typings.wixStyleReact.anon.From
import typings.wixStyleReact.wixStyleReactNumbers.`0`
import typings.wixStyleReact.wixStyleReactNumbers.`1`
import typings.wixStyleReact.wixStyleReactNumbers.`2`
import typings.wixStyleReact.wixStyleReactNumbers.`3`
import typings.wixStyleReact.wixStyleReactNumbers.`4`
import typings.wixStyleReact.wixStyleReactNumbers.`5`
import typings.wixStyleReact.wixStyleReactNumbers.`6`
import typings.wixStyleReact.wixStyleReactStrings.day
import typings.wixStyleReact.wixStyleReactStrings.range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calendarMod {
  
  @JSImport("wix-style-react/dist/es/src/Calendar", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[CalendarProps, js.Object, js.Any]
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/es/src/Calendar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def areValuesEqual(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("areValuesEqual")().asInstanceOf[Boolean]
    @scala.inline
    def areValuesEqual(value1: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("areValuesEqual")(value1.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def areValuesEqual(value1: js.Object, value2: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areValuesEqual")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def areValuesEqual(value1: Unit, value2: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areValuesEqual")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def getUpdatedMonth(nextPropsValue: js.Any, numOfMonths: Double, currentMonthDate: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getUpdatedMonth")(nextPropsValue.asInstanceOf[js.Any], numOfMonths.asInstanceOf[js.Any], currentMonthDate.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def isRangeValue(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRangeValue")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def isSingleDay(value: js.Any): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("isSingleDay")(value.asInstanceOf[js.Any]).asInstanceOf[Date]
    
    @scala.inline
    def optionalParse(dateOrString: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("optionalParse")(dateOrString.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def optionalParse(dateOrString: Date): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("optionalParse")(dateOrString.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def parseValue(value: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseValue")(value.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def renderDay(day: js.Any, modifiers: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderDay")(day.asInstanceOf[js.Any], modifiers.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  type Calendar = PureComponent[CalendarProps, js.Object, js.Any]
  
  trait CalendarProps extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var excludePastDates: js.UndefOr[Boolean] = js.undefined
    
    var filterDate: js.UndefOr[js.Function] = js.undefined
    
    var firstDayOfWeek: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
    
    var locale: js.UndefOr[String | DistanceInWords] = js.undefined
    
    var numOfMonths: js.UndefOr[`1` | `2`] = js.undefined
    
    var onChange: js.Function
    
    var onClose: js.UndefOr[js.Function] = js.undefined
    
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    var selectionMode: js.UndefOr[day | range] = js.undefined
    
    var shouldCloseOnSelect: js.UndefOr[Boolean] = js.undefined
    
    var showMonthDropdown: js.UndefOr[Boolean] = js.undefined
    
    var showYearDropdown: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[String | Date | From] = js.undefined
  }
  object CalendarProps {
    
    @scala.inline
    def apply(onChange: js.Function): CalendarProps = {
      val __obj = js.Dynamic.literal(onChange = onChange.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalendarProps]
    }
    
    @scala.inline
    implicit class CalendarPropsMutableBuilder[Self <: CalendarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setExcludePastDates(value: Boolean): Self = StObject.set(x, "excludePastDates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludePastDatesUndefined: Self = StObject.set(x, "excludePastDates", js.undefined)
      
      @scala.inline
      def setFilterDate(value: js.Function): Self = StObject.set(x, "filterDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterDateUndefined: Self = StObject.set(x, "filterDate", js.undefined)
      
      @scala.inline
      def setFirstDayOfWeek(value: `0` | `1` | `2` | `3` | `4` | `5` | `6`): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
      
      @scala.inline
      def setLocale(value: String | DistanceInWords): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setNumOfMonths(value: `1` | `2`): Self = StObject.set(x, "numOfMonths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumOfMonthsUndefined: Self = StObject.set(x, "numOfMonths", js.undefined)
      
      @scala.inline
      def setOnChange(value: js.Function): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClose(value: js.Function): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      @scala.inline
      def setSelectionMode(value: day | range): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
      
      @scala.inline
      def setShouldCloseOnSelect(value: Boolean): Self = StObject.set(x, "shouldCloseOnSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldCloseOnSelectUndefined: Self = StObject.set(x, "shouldCloseOnSelect", js.undefined)
      
      @scala.inline
      def setShowMonthDropdown(value: Boolean): Self = StObject.set(x, "showMonthDropdown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowMonthDropdownUndefined: Self = StObject.set(x, "showMonthDropdown", js.undefined)
      
      @scala.inline
      def setShowYearDropdown(value: Boolean): Self = StObject.set(x, "showYearDropdown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowYearDropdownUndefined: Self = StObject.set(x, "showYearDropdown", js.undefined)
      
      @scala.inline
      def setValue(value: String | Date | From): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
