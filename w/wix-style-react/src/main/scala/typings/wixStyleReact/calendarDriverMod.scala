package typings.wixStyleReact

import typings.std.Date
import typings.std.HTMLElement
import typings.wixStyleReact.dropdownLayoutDriverMod.DropdownLayoutDriver
import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calendarDriverMod {
  
  trait CalendarDriver
    extends StObject
       with BaseDriver {
    
    def clickDay(date: Date): js.Any
    
    def clickOnMonthDropdown(): js.Any
    
    def clickOnNextMonthButton(): js.Any
    
    def clickOnNthDay(n: Double): js.Any
    
    def clickOnNthDayOfTheMonth(n: Double): js.Any
    
    def clickOnNthYear(n: Double): js.Any
    
    def clickOnPrevMonthButton(): js.Any
    
    def clickOnSelectedDay(): js.Any
    
    def clickOnYearDropdown(): js.Any
    
    def close(): js.Any
    
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
    
    def getWidth(): js.Function0[String | Null]
    
    def getYearDropdownDriver(): DropdownLayoutDriver
    
    def isDayActive(date: Date): Boolean
    
    def isFocusedDayVisuallyUnfocused(): Boolean
    
    def isHeaderVisible(): Boolean
    
    def isMonthCaptionExists(): Boolean
    
    def isMonthDropdownExists(): Boolean
    
    def isTwoMonthsLayout(): Boolean
    
    def isVisible(): Boolean
    
    def isYearCaptionExists(): Boolean
    
    def isYearDropdownExists(): Boolean
    
    def mouseClickOutside(): Boolean
    
    def pressLeftArrow(): js.Any
    
    def pressRightArrow(): js.Any
    
    def triggerKeyDown(): js.Any
  }
  object CalendarDriver {
    
    @scala.inline
    def apply(
      clickDay: Date => js.Any,
      clickOnMonthDropdown: () => js.Any,
      clickOnNextMonthButton: () => js.Any,
      clickOnNthDay: Double => js.Any,
      clickOnNthDayOfTheMonth: Double => js.Any,
      clickOnNthYear: Double => js.Any,
      clickOnPrevMonthButton: () => js.Any,
      clickOnSelectedDay: () => js.Any,
      clickOnYearDropdown: () => js.Any,
      close: () => js.Any,
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
      getWidth: () => js.Function0[String | Null],
      getYearDropdownDriver: () => DropdownLayoutDriver,
      isDayActive: Date => Boolean,
      isFocusedDayVisuallyUnfocused: () => Boolean,
      isHeaderVisible: () => Boolean,
      isMonthCaptionExists: () => Boolean,
      isMonthDropdownExists: () => Boolean,
      isTwoMonthsLayout: () => Boolean,
      isVisible: () => Boolean,
      isYearCaptionExists: () => Boolean,
      isYearDropdownExists: () => Boolean,
      mouseClickOutside: () => Boolean,
      pressLeftArrow: () => js.Any,
      pressRightArrow: () => js.Any,
      triggerKeyDown: () => js.Any
    ): CalendarDriver = {
      val __obj = js.Dynamic.literal(clickDay = js.Any.fromFunction1(clickDay), clickOnMonthDropdown = js.Any.fromFunction0(clickOnMonthDropdown), clickOnNextMonthButton = js.Any.fromFunction0(clickOnNextMonthButton), clickOnNthDay = js.Any.fromFunction1(clickOnNthDay), clickOnNthDayOfTheMonth = js.Any.fromFunction1(clickOnNthDayOfTheMonth), clickOnNthYear = js.Any.fromFunction1(clickOnNthYear), clickOnPrevMonthButton = js.Any.fromFunction0(clickOnPrevMonthButton), clickOnSelectedDay = js.Any.fromFunction0(clickOnSelectedDay), clickOnYearDropdown = js.Any.fromFunction0(clickOnYearDropdown), close = js.Any.fromFunction0(close), exists = js.Any.fromFunction0(exists), getCurrentMonthWithYear = js.Any.fromFunction0(getCurrentMonthWithYear), getFocusedDay = js.Any.fromFunction0(getFocusedDay), getFocusedDayElement = js.Any.fromFunction0(getFocusedDayElement), getMonthAndYear = js.Any.fromFunction0(getMonthAndYear), getMonthCaption = js.Any.fromFunction0(getMonthCaption), getMonthDropdownDriver = js.Any.fromFunction0(getMonthDropdownDriver), getMonthDropdownLabel = js.Any.fromFunction0(getMonthDropdownLabel), getNthWeekDayName = js.Any.fromFunction1(getNthWeekDayName), getNumOfSelectedDays = js.Any.fromFunction0(getNumOfSelectedDays), getNumOfVisibleMonths = js.Any.fromFunction0(getNumOfVisibleMonths), getSelectedDay = js.Any.fromFunction0(getSelectedDay), getSelectedDays = js.Any.fromFunction0(getSelectedDays), getSelectedYear = js.Any.fromFunction0(getSelectedYear), getWidth = js.Any.fromFunction0(getWidth), getYearDropdownDriver = js.Any.fromFunction0(getYearDropdownDriver), isDayActive = js.Any.fromFunction1(isDayActive), isFocusedDayVisuallyUnfocused = js.Any.fromFunction0(isFocusedDayVisuallyUnfocused), isHeaderVisible = js.Any.fromFunction0(isHeaderVisible), isMonthCaptionExists = js.Any.fromFunction0(isMonthCaptionExists), isMonthDropdownExists = js.Any.fromFunction0(isMonthDropdownExists), isTwoMonthsLayout = js.Any.fromFunction0(isTwoMonthsLayout), isVisible = js.Any.fromFunction0(isVisible), isYearCaptionExists = js.Any.fromFunction0(isYearCaptionExists), isYearDropdownExists = js.Any.fromFunction0(isYearDropdownExists), mouseClickOutside = js.Any.fromFunction0(mouseClickOutside), pressLeftArrow = js.Any.fromFunction0(pressLeftArrow), pressRightArrow = js.Any.fromFunction0(pressRightArrow), triggerKeyDown = js.Any.fromFunction0(triggerKeyDown))
      __obj.asInstanceOf[CalendarDriver]
    }
    
    @scala.inline
    implicit class CalendarDriverMutableBuilder[Self <: CalendarDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClickDay(value: Date => js.Any): Self = StObject.set(x, "clickDay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClickOnMonthDropdown(value: () => js.Any): Self = StObject.set(x, "clickOnMonthDropdown", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClickOnNextMonthButton(value: () => js.Any): Self = StObject.set(x, "clickOnNextMonthButton", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClickOnNthDay(value: Double => js.Any): Self = StObject.set(x, "clickOnNthDay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClickOnNthDayOfTheMonth(value: Double => js.Any): Self = StObject.set(x, "clickOnNthDayOfTheMonth", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClickOnNthYear(value: Double => js.Any): Self = StObject.set(x, "clickOnNthYear", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClickOnPrevMonthButton(value: () => js.Any): Self = StObject.set(x, "clickOnPrevMonthButton", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClickOnSelectedDay(value: () => js.Any): Self = StObject.set(x, "clickOnSelectedDay", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClickOnYearDropdown(value: () => js.Any): Self = StObject.set(x, "clickOnYearDropdown", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClose(value: () => js.Any): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCurrentMonthWithYear(value: () => String | Null): Self = StObject.set(x, "getCurrentMonthWithYear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFocusedDay(value: () => String | Null): Self = StObject.set(x, "getFocusedDay", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFocusedDayElement(value: () => HTMLElement): Self = StObject.set(x, "getFocusedDayElement", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMonthAndYear(value: () => js.Array[String | Null]): Self = StObject.set(x, "getMonthAndYear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMonthCaption(value: () => String | Null): Self = StObject.set(x, "getMonthCaption", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMonthDropdownDriver(value: () => DropdownLayoutDriver): Self = StObject.set(x, "getMonthDropdownDriver", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMonthDropdownLabel(value: () => String | Null): Self = StObject.set(x, "getMonthDropdownLabel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetNthWeekDayName(value: Double => HTMLElement): Self = StObject.set(x, "getNthWeekDayName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetNumOfSelectedDays(value: () => Double): Self = StObject.set(x, "getNumOfSelectedDays", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetNumOfVisibleMonths(value: () => Double): Self = StObject.set(x, "getNumOfVisibleMonths", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSelectedDay(value: () => String | Null): Self = StObject.set(x, "getSelectedDay", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSelectedDays(value: () => Double): Self = StObject.set(x, "getSelectedDays", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSelectedYear(value: () => String | Null): Self = StObject.set(x, "getSelectedYear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetWidth(value: () => js.Function0[String | Null]): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetYearDropdownDriver(value: () => DropdownLayoutDriver): Self = StObject.set(x, "getYearDropdownDriver", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsDayActive(value: Date => Boolean): Self = StObject.set(x, "isDayActive", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsFocusedDayVisuallyUnfocused(value: () => Boolean): Self = StObject.set(x, "isFocusedDayVisuallyUnfocused", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsHeaderVisible(value: () => Boolean): Self = StObject.set(x, "isHeaderVisible", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsMonthCaptionExists(value: () => Boolean): Self = StObject.set(x, "isMonthCaptionExists", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsMonthDropdownExists(value: () => Boolean): Self = StObject.set(x, "isMonthDropdownExists", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsTwoMonthsLayout(value: () => Boolean): Self = StObject.set(x, "isTwoMonthsLayout", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsVisible(value: () => Boolean): Self = StObject.set(x, "isVisible", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsYearCaptionExists(value: () => Boolean): Self = StObject.set(x, "isYearCaptionExists", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsYearDropdownExists(value: () => Boolean): Self = StObject.set(x, "isYearDropdownExists", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMouseClickOutside(value: () => Boolean): Self = StObject.set(x, "mouseClickOutside", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPressLeftArrow(value: () => js.Any): Self = StObject.set(x, "pressLeftArrow", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPressRightArrow(value: () => js.Any): Self = StObject.set(x, "pressRightArrow", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTriggerKeyDown(value: () => js.Any): Self = StObject.set(x, "triggerKeyDown", js.Any.fromFunction0(value))
    }
  }
}
