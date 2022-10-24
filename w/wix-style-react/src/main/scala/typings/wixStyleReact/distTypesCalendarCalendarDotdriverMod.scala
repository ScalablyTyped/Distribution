package typings.wixStyleReact

import typings.std.HTMLElement
import typings.wixStyleReact.distTypesDropdownLayoutDropdownLayoutDotdriverMod.DropdownLayoutDriver
import typings.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCalendarCalendarDotdriverMod {
  
  trait CalendarDriver
    extends StObject
       with BaseDriver {
    
    def clickDay(date: js.Date): Any
    
    def clickOnMonthDropdown(): Any
    
    def clickOnNextMonthButton(): Any
    
    def clickOnNthDay(n: Double): Any
    
    def clickOnNthDayOfTheMonth(n: Double): Any
    
    def clickOnNthYear(n: Double): Any
    
    def clickOnPrevMonthButton(): Any
    
    def clickOnSelectedDay(): Any
    
    def clickOnYearDropdown(): Any
    
    def close(): Any
    
    def getCurrentMonthWithYear(): String | Null
    
    def getFocusedDay(): String | Null
    
    def getFocusedDayElement(): HTMLElement
    
    def getMonthAndYear(): js.Array[String | Null]
    
    def getMonthCaption(): String | Null
    
    def getMonthDropdownDriver(): DropdownLayoutDriver
    
    def getMonthDropdownLabel(): String | Null
    
    def getNthWeekDayName(n: Double): HTMLElement
    
    def getNumOfSelectedDays(): Double
    
    def getNumOfVisibleMonths(): Double
    
    def getSelectedDay(): String | Null
    
    def getSelectedDays(): Double
    
    def getSelectedYear(): String | Null
    
    /** Returns size property value currently set on component
      * @returns {string}
      */
    def getSize(): String
    
    def getYearDropdownDriver(): DropdownLayoutDriver
    
    def isDayActive(date: js.Date): Boolean
    
    def isFocusedDayVisuallyUnfocused(): Boolean
    
    def isHeaderExists(): Boolean
    
    def isMonthCaptionExists(): Boolean
    
    def isMonthDropdownExists(): Boolean
    
    def isTwoMonthsLayout(): Boolean
    
    def isYearCaptionExists(): Boolean
    
    def isYearDropdownExists(): Boolean
    
    def keyboardNextYear(): Unit
    
    def keyboardPrevYear(): Unit
    
    def pressLeftArrow(): Any
    
    def pressRightArrow(): Any
    
    def triggerKeyDown(): Any
  }
  object CalendarDriver {
    
    inline def apply(
      clickDay: js.Date => Any,
      clickOnMonthDropdown: () => Any,
      clickOnNextMonthButton: () => Any,
      clickOnNthDay: Double => Any,
      clickOnNthDayOfTheMonth: Double => Any,
      clickOnNthYear: Double => Any,
      clickOnPrevMonthButton: () => Any,
      clickOnSelectedDay: () => Any,
      clickOnYearDropdown: () => Any,
      close: () => Any,
      exists: () => Boolean,
      getCurrentMonthWithYear: () => String | Null,
      getFocusedDay: () => String | Null,
      getFocusedDayElement: () => HTMLElement,
      getMonthAndYear: () => js.Array[String | Null],
      getMonthCaption: () => String | Null,
      getMonthDropdownDriver: () => DropdownLayoutDriver,
      getMonthDropdownLabel: () => String | Null,
      getNthWeekDayName: Double => HTMLElement,
      getNumOfSelectedDays: () => Double,
      getNumOfVisibleMonths: () => Double,
      getSelectedDay: () => String | Null,
      getSelectedDays: () => Double,
      getSelectedYear: () => String | Null,
      getSize: () => String,
      getYearDropdownDriver: () => DropdownLayoutDriver,
      isDayActive: js.Date => Boolean,
      isFocusedDayVisuallyUnfocused: () => Boolean,
      isHeaderExists: () => Boolean,
      isMonthCaptionExists: () => Boolean,
      isMonthDropdownExists: () => Boolean,
      isTwoMonthsLayout: () => Boolean,
      isYearCaptionExists: () => Boolean,
      isYearDropdownExists: () => Boolean,
      keyboardNextYear: () => Unit,
      keyboardPrevYear: () => Unit,
      pressLeftArrow: () => Any,
      pressRightArrow: () => Any,
      triggerKeyDown: () => Any
    ): CalendarDriver = {
      val __obj = js.Dynamic.literal(clickDay = js.Any.fromFunction1(clickDay), clickOnMonthDropdown = js.Any.fromFunction0(clickOnMonthDropdown), clickOnNextMonthButton = js.Any.fromFunction0(clickOnNextMonthButton), clickOnNthDay = js.Any.fromFunction1(clickOnNthDay), clickOnNthDayOfTheMonth = js.Any.fromFunction1(clickOnNthDayOfTheMonth), clickOnNthYear = js.Any.fromFunction1(clickOnNthYear), clickOnPrevMonthButton = js.Any.fromFunction0(clickOnPrevMonthButton), clickOnSelectedDay = js.Any.fromFunction0(clickOnSelectedDay), clickOnYearDropdown = js.Any.fromFunction0(clickOnYearDropdown), close = js.Any.fromFunction0(close), exists = js.Any.fromFunction0(exists), getCurrentMonthWithYear = js.Any.fromFunction0(getCurrentMonthWithYear), getFocusedDay = js.Any.fromFunction0(getFocusedDay), getFocusedDayElement = js.Any.fromFunction0(getFocusedDayElement), getMonthAndYear = js.Any.fromFunction0(getMonthAndYear), getMonthCaption = js.Any.fromFunction0(getMonthCaption), getMonthDropdownDriver = js.Any.fromFunction0(getMonthDropdownDriver), getMonthDropdownLabel = js.Any.fromFunction0(getMonthDropdownLabel), getNthWeekDayName = js.Any.fromFunction1(getNthWeekDayName), getNumOfSelectedDays = js.Any.fromFunction0(getNumOfSelectedDays), getNumOfVisibleMonths = js.Any.fromFunction0(getNumOfVisibleMonths), getSelectedDay = js.Any.fromFunction0(getSelectedDay), getSelectedDays = js.Any.fromFunction0(getSelectedDays), getSelectedYear = js.Any.fromFunction0(getSelectedYear), getSize = js.Any.fromFunction0(getSize), getYearDropdownDriver = js.Any.fromFunction0(getYearDropdownDriver), isDayActive = js.Any.fromFunction1(isDayActive), isFocusedDayVisuallyUnfocused = js.Any.fromFunction0(isFocusedDayVisuallyUnfocused), isHeaderExists = js.Any.fromFunction0(isHeaderExists), isMonthCaptionExists = js.Any.fromFunction0(isMonthCaptionExists), isMonthDropdownExists = js.Any.fromFunction0(isMonthDropdownExists), isTwoMonthsLayout = js.Any.fromFunction0(isTwoMonthsLayout), isYearCaptionExists = js.Any.fromFunction0(isYearCaptionExists), isYearDropdownExists = js.Any.fromFunction0(isYearDropdownExists), keyboardNextYear = js.Any.fromFunction0(keyboardNextYear), keyboardPrevYear = js.Any.fromFunction0(keyboardPrevYear), pressLeftArrow = js.Any.fromFunction0(pressLeftArrow), pressRightArrow = js.Any.fromFunction0(pressRightArrow), triggerKeyDown = js.Any.fromFunction0(triggerKeyDown))
      __obj.asInstanceOf[CalendarDriver]
    }
    
    extension [Self <: CalendarDriver](x: Self) {
      
      inline def setClickDay(value: js.Date => Any): Self = StObject.set(x, "clickDay", js.Any.fromFunction1(value))
      
      inline def setClickOnMonthDropdown(value: () => Any): Self = StObject.set(x, "clickOnMonthDropdown", js.Any.fromFunction0(value))
      
      inline def setClickOnNextMonthButton(value: () => Any): Self = StObject.set(x, "clickOnNextMonthButton", js.Any.fromFunction0(value))
      
      inline def setClickOnNthDay(value: Double => Any): Self = StObject.set(x, "clickOnNthDay", js.Any.fromFunction1(value))
      
      inline def setClickOnNthDayOfTheMonth(value: Double => Any): Self = StObject.set(x, "clickOnNthDayOfTheMonth", js.Any.fromFunction1(value))
      
      inline def setClickOnNthYear(value: Double => Any): Self = StObject.set(x, "clickOnNthYear", js.Any.fromFunction1(value))
      
      inline def setClickOnPrevMonthButton(value: () => Any): Self = StObject.set(x, "clickOnPrevMonthButton", js.Any.fromFunction0(value))
      
      inline def setClickOnSelectedDay(value: () => Any): Self = StObject.set(x, "clickOnSelectedDay", js.Any.fromFunction0(value))
      
      inline def setClickOnYearDropdown(value: () => Any): Self = StObject.set(x, "clickOnYearDropdown", js.Any.fromFunction0(value))
      
      inline def setClose(value: () => Any): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setGetCurrentMonthWithYear(value: () => String | Null): Self = StObject.set(x, "getCurrentMonthWithYear", js.Any.fromFunction0(value))
      
      inline def setGetFocusedDay(value: () => String | Null): Self = StObject.set(x, "getFocusedDay", js.Any.fromFunction0(value))
      
      inline def setGetFocusedDayElement(value: () => HTMLElement): Self = StObject.set(x, "getFocusedDayElement", js.Any.fromFunction0(value))
      
      inline def setGetMonthAndYear(value: () => js.Array[String | Null]): Self = StObject.set(x, "getMonthAndYear", js.Any.fromFunction0(value))
      
      inline def setGetMonthCaption(value: () => String | Null): Self = StObject.set(x, "getMonthCaption", js.Any.fromFunction0(value))
      
      inline def setGetMonthDropdownDriver(value: () => DropdownLayoutDriver): Self = StObject.set(x, "getMonthDropdownDriver", js.Any.fromFunction0(value))
      
      inline def setGetMonthDropdownLabel(value: () => String | Null): Self = StObject.set(x, "getMonthDropdownLabel", js.Any.fromFunction0(value))
      
      inline def setGetNthWeekDayName(value: Double => HTMLElement): Self = StObject.set(x, "getNthWeekDayName", js.Any.fromFunction1(value))
      
      inline def setGetNumOfSelectedDays(value: () => Double): Self = StObject.set(x, "getNumOfSelectedDays", js.Any.fromFunction0(value))
      
      inline def setGetNumOfVisibleMonths(value: () => Double): Self = StObject.set(x, "getNumOfVisibleMonths", js.Any.fromFunction0(value))
      
      inline def setGetSelectedDay(value: () => String | Null): Self = StObject.set(x, "getSelectedDay", js.Any.fromFunction0(value))
      
      inline def setGetSelectedDays(value: () => Double): Self = StObject.set(x, "getSelectedDays", js.Any.fromFunction0(value))
      
      inline def setGetSelectedYear(value: () => String | Null): Self = StObject.set(x, "getSelectedYear", js.Any.fromFunction0(value))
      
      inline def setGetSize(value: () => String): Self = StObject.set(x, "getSize", js.Any.fromFunction0(value))
      
      inline def setGetYearDropdownDriver(value: () => DropdownLayoutDriver): Self = StObject.set(x, "getYearDropdownDriver", js.Any.fromFunction0(value))
      
      inline def setIsDayActive(value: js.Date => Boolean): Self = StObject.set(x, "isDayActive", js.Any.fromFunction1(value))
      
      inline def setIsFocusedDayVisuallyUnfocused(value: () => Boolean): Self = StObject.set(x, "isFocusedDayVisuallyUnfocused", js.Any.fromFunction0(value))
      
      inline def setIsHeaderExists(value: () => Boolean): Self = StObject.set(x, "isHeaderExists", js.Any.fromFunction0(value))
      
      inline def setIsMonthCaptionExists(value: () => Boolean): Self = StObject.set(x, "isMonthCaptionExists", js.Any.fromFunction0(value))
      
      inline def setIsMonthDropdownExists(value: () => Boolean): Self = StObject.set(x, "isMonthDropdownExists", js.Any.fromFunction0(value))
      
      inline def setIsTwoMonthsLayout(value: () => Boolean): Self = StObject.set(x, "isTwoMonthsLayout", js.Any.fromFunction0(value))
      
      inline def setIsYearCaptionExists(value: () => Boolean): Self = StObject.set(x, "isYearCaptionExists", js.Any.fromFunction0(value))
      
      inline def setIsYearDropdownExists(value: () => Boolean): Self = StObject.set(x, "isYearDropdownExists", js.Any.fromFunction0(value))
      
      inline def setKeyboardNextYear(value: () => Unit): Self = StObject.set(x, "keyboardNextYear", js.Any.fromFunction0(value))
      
      inline def setKeyboardPrevYear(value: () => Unit): Self = StObject.set(x, "keyboardPrevYear", js.Any.fromFunction0(value))
      
      inline def setPressLeftArrow(value: () => Any): Self = StObject.set(x, "pressLeftArrow", js.Any.fromFunction0(value))
      
      inline def setPressRightArrow(value: () => Any): Self = StObject.set(x, "pressRightArrow", js.Any.fromFunction0(value))
      
      inline def setTriggerKeyDown(value: () => Any): Self = StObject.set(x, "triggerKeyDown", js.Any.fromFunction0(value))
    }
  }
}
