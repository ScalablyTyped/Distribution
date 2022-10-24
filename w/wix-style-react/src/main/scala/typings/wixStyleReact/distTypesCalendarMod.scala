package typings.wixStyleReact

import typings.react.mod.FC
import typings.react.mod.PureComponent
import typings.wixDesignSystemsLocaleUtils.distTypesDateTimeFormatConstantsMod.SupportedWixLocales_
import typings.wixStyleReact.anon.FromTo
import typings.wixStyleReact.wixStyleReactInts.`0`
import typings.wixStyleReact.wixStyleReactInts.`1`
import typings.wixStyleReact.wixStyleReactInts.`2`
import typings.wixStyleReact.wixStyleReactInts.`3`
import typings.wixStyleReact.wixStyleReactInts.`4`
import typings.wixStyleReact.wixStyleReactInts.`5`
import typings.wixStyleReact.wixStyleReactInts.`6`
import typings.wixStyleReact.wixStyleReactStrings.day
import typings.wixStyleReact.wixStyleReactStrings.medium
import typings.wixStyleReact.wixStyleReactStrings.range
import typings.wixStyleReact.wixStyleReactStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCalendarMod {
  
  @JSImport("wix-style-react/dist/types/Calendar", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[CalendarProps, js.Object, Any]
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/types/Calendar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def areValuesEqual(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("areValuesEqual")().asInstanceOf[Boolean]
    inline def areValuesEqual(value1: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("areValuesEqual")(value1.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def areValuesEqual(value1: js.Object, value2: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areValuesEqual")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def areValuesEqual(value1: Unit, value2: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areValuesEqual")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def getUpdatedMonth(nextPropsValue: Any, numOfMonths: Double, currentMonthDate: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getUpdatedMonth")(nextPropsValue.asInstanceOf[js.Any], numOfMonths.asInstanceOf[js.Any], currentMonthDate.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def isRangeValue(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRangeValue")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isSingleDay(value: Any): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("isSingleDay")(value.asInstanceOf[js.Any]).asInstanceOf[js.Date]
    
    inline def optionalParse(dateOrString: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("optionalParse")(dateOrString.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def optionalParse(dateOrString: js.Date): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("optionalParse")(dateOrString.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def parseValue(value: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseValue")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def renderDay(day: Any, modifiers: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderDay")(day.asInstanceOf[js.Any], modifiers.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  type Calendar = PureComponent[CalendarProps, js.Object, Any]
  
  trait CalendarProps extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var dateIndication: js.UndefOr[FC[dateIndicationProps]] = js.undefined
    
    var excludePastDates: js.UndefOr[Boolean] = js.undefined
    
    var filterDate: js.UndefOr[js.Function] = js.undefined
    
    var firstDayOfWeek: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
    
    var leftArrowAriaLabel: js.UndefOr[String] = js.undefined
    
    var leftArrowAriaLabelledBy: js.UndefOr[String] = js.undefined
    
    var locale: js.UndefOr[SupportedWixLocales_] = js.undefined
    
    var monthDropdownAriaLabel: js.UndefOr[String] = js.undefined
    
    var monthDropdownAriaLabelledBy: js.UndefOr[String] = js.undefined
    
    var numOfMonths: js.UndefOr[`1` | `2`] = js.undefined
    
    var onChange: js.Function
    
    var onClose: js.UndefOr[js.Function] = js.undefined
    
    var onMonthChange: js.UndefOr[js.Function1[/* monthStart */ js.Date, Unit]] = js.undefined
    
    var rightArrowAriaLabel: js.UndefOr[String] = js.undefined
    
    var rightArrowAriaLabelledBy: js.UndefOr[String] = js.undefined
    
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    var selectionMode: js.UndefOr[day | range] = js.undefined
    
    var shouldCloseOnSelect: js.UndefOr[Boolean] = js.undefined
    
    var showMonthDropdown: js.UndefOr[Boolean] = js.undefined
    
    var showYearDropdown: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[small | medium] = js.undefined
    
    var today: js.UndefOr[js.Date] = js.undefined
    
    var value: js.UndefOr[js.Date | FromTo] = js.undefined
    
    var yearDropdownAriaLabel: js.UndefOr[String] = js.undefined
    
    var yearDropdownAriaLabelledBy: js.UndefOr[String] = js.undefined
  }
  object CalendarProps {
    
    inline def apply(onChange: js.Function): CalendarProps = {
      val __obj = js.Dynamic.literal(onChange = onChange.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalendarProps]
    }
    
    extension [Self <: CalendarProps](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDateIndication(value: FC[dateIndicationProps]): Self = StObject.set(x, "dateIndication", value.asInstanceOf[js.Any])
      
      inline def setDateIndicationUndefined: Self = StObject.set(x, "dateIndication", js.undefined)
      
      inline def setExcludePastDates(value: Boolean): Self = StObject.set(x, "excludePastDates", value.asInstanceOf[js.Any])
      
      inline def setExcludePastDatesUndefined: Self = StObject.set(x, "excludePastDates", js.undefined)
      
      inline def setFilterDate(value: js.Function): Self = StObject.set(x, "filterDate", value.asInstanceOf[js.Any])
      
      inline def setFilterDateUndefined: Self = StObject.set(x, "filterDate", js.undefined)
      
      inline def setFirstDayOfWeek(value: `0` | `1` | `2` | `3` | `4` | `5` | `6`): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      inline def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
      
      inline def setLeftArrowAriaLabel(value: String): Self = StObject.set(x, "leftArrowAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setLeftArrowAriaLabelUndefined: Self = StObject.set(x, "leftArrowAriaLabel", js.undefined)
      
      inline def setLeftArrowAriaLabelledBy(value: String): Self = StObject.set(x, "leftArrowAriaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setLeftArrowAriaLabelledByUndefined: Self = StObject.set(x, "leftArrowAriaLabelledBy", js.undefined)
      
      inline def setLocale(value: SupportedWixLocales_): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMonthDropdownAriaLabel(value: String): Self = StObject.set(x, "monthDropdownAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setMonthDropdownAriaLabelUndefined: Self = StObject.set(x, "monthDropdownAriaLabel", js.undefined)
      
      inline def setMonthDropdownAriaLabelledBy(value: String): Self = StObject.set(x, "monthDropdownAriaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setMonthDropdownAriaLabelledByUndefined: Self = StObject.set(x, "monthDropdownAriaLabelledBy", js.undefined)
      
      inline def setNumOfMonths(value: `1` | `2`): Self = StObject.set(x, "numOfMonths", value.asInstanceOf[js.Any])
      
      inline def setNumOfMonthsUndefined: Self = StObject.set(x, "numOfMonths", js.undefined)
      
      inline def setOnChange(value: js.Function): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      inline def setOnClose(value: js.Function): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnMonthChange(value: /* monthStart */ js.Date => Unit): Self = StObject.set(x, "onMonthChange", js.Any.fromFunction1(value))
      
      inline def setOnMonthChangeUndefined: Self = StObject.set(x, "onMonthChange", js.undefined)
      
      inline def setRightArrowAriaLabel(value: String): Self = StObject.set(x, "rightArrowAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setRightArrowAriaLabelUndefined: Self = StObject.set(x, "rightArrowAriaLabel", js.undefined)
      
      inline def setRightArrowAriaLabelledBy(value: String): Self = StObject.set(x, "rightArrowAriaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setRightArrowAriaLabelledByUndefined: Self = StObject.set(x, "rightArrowAriaLabelledBy", js.undefined)
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      inline def setSelectionMode(value: day | range): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
      
      inline def setShouldCloseOnSelect(value: Boolean): Self = StObject.set(x, "shouldCloseOnSelect", value.asInstanceOf[js.Any])
      
      inline def setShouldCloseOnSelectUndefined: Self = StObject.set(x, "shouldCloseOnSelect", js.undefined)
      
      inline def setShowMonthDropdown(value: Boolean): Self = StObject.set(x, "showMonthDropdown", value.asInstanceOf[js.Any])
      
      inline def setShowMonthDropdownUndefined: Self = StObject.set(x, "showMonthDropdown", js.undefined)
      
      inline def setShowYearDropdown(value: Boolean): Self = StObject.set(x, "showYearDropdown", value.asInstanceOf[js.Any])
      
      inline def setShowYearDropdownUndefined: Self = StObject.set(x, "showYearDropdown", js.undefined)
      
      inline def setSize(value: small | medium): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setToday(value: js.Date): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
      
      inline def setTodayUndefined: Self = StObject.set(x, "today", js.undefined)
      
      inline def setValue(value: js.Date | FromTo): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setYearDropdownAriaLabel(value: String): Self = StObject.set(x, "yearDropdownAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setYearDropdownAriaLabelUndefined: Self = StObject.set(x, "yearDropdownAriaLabel", js.undefined)
      
      inline def setYearDropdownAriaLabelledBy(value: String): Self = StObject.set(x, "yearDropdownAriaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setYearDropdownAriaLabelledByUndefined: Self = StObject.set(x, "yearDropdownAriaLabelledBy", js.undefined)
    }
  }
  
  type LanguageType = SupportedWixLocales_
  
  trait dateIndicationProps extends StObject {
    
    var date: js.Date
    
    var isSelected: Boolean
  }
  object dateIndicationProps {
    
    inline def apply(date: js.Date, isSelected: Boolean): dateIndicationProps = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any])
      __obj.asInstanceOf[dateIndicationProps]
    }
    
    extension [Self <: dateIndicationProps](x: Self) {
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
    }
  }
}
