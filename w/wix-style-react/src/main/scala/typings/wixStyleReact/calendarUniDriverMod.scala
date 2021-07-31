package typings.wixStyleReact

import typings.std.Date
import typings.unidriverCore.mod.UniDriver
import typings.wixStyleReact.dropdownLayoutUniDriverMod.DropdownLayoutUniDriver
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calendarUniDriverMod {
  
  trait CalendarUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickDay(date: Date): js.Promise[js.Any]
    
    def clickOnMonthDropdown(): js.Promise[js.Any]
    
    def clickOnNextMonthButton(): js.Promise[js.Any]
    
    def clickOnNthDay(n: Double): js.Promise[js.Any]
    
    def clickOnNthDayOfTheMonth(n: Double): js.Promise[js.Any]
    
    def clickOnNthYear(n: Double): js.Promise[js.Any]
    
    def clickOnPrevMonthButton(): js.Promise[js.Any]
    
    def clickOnSelectedDay(): js.Promise[js.Any]
    
    def clickOnYearDropdown(): js.Promise[js.Any]
    
    def close(): js.Promise[js.Any]
    
    def getCurrentMonthWithYear(): js.Promise[String]
    
    def getFocusedDay(): js.Promise[String | Null]
    
    def getFocusedDayElement(): UniDriver[js.Any]
    
    def getMonthAndYear(): js.Promise[js.Array[String]]
    
    def getMonthCaption(): js.Promise[String]
    
    def getMonthDropdownDriver(): DropdownLayoutUniDriver
    
    def getMonthDropdownLabel(): js.Promise[String]
    
    def getNthWeekDayName(n: Double): UniDriver[js.Any]
    
    def getNumOfSelectedDays(): js.Promise[Double]
    
    def getNumOfVisibleMonths(): js.Promise[Double]
    
    def getSelectedDay(): js.Promise[String]
    
    def getSelectedDays(): js.Promise[Double]
    
    def getSelectedYear(): js.Promise[String]
    
    def getWidth(): js.Function0[js.Promise[String | Null]]
    
    def getYearDropdownDriver(): DropdownLayoutUniDriver
    
    def isDayActive(date: Date): js.Promise[Boolean]
    
    def isFocusedDayVisuallyUnfocused(): js.Promise[Boolean]
    
    def isHeaderVisible(): js.Promise[Boolean]
    
    def isMonthCaptionExists(): js.Promise[Boolean]
    
    def isMonthDropdownExists(): js.Promise[Boolean]
    
    def isTwoMonthsLayout(): js.Promise[Boolean]
    
    def isVisible(): js.Promise[Boolean]
    
    def isYearCaptionExists(): js.Promise[Boolean]
    
    def isYearDropdownExists(): js.Promise[Boolean]
    
    def mouseClickOutside(): js.Promise[Boolean]
    
    def pressLeftArrow(): js.Promise[js.Any]
    
    def pressRightArrow(): js.Promise[js.Any]
    
    def triggerKeyDown(): js.Promise[js.Any]
  }
  object CalendarUniDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      clickDay: Date => js.Promise[js.Any],
      clickOnMonthDropdown: () => js.Promise[js.Any],
      clickOnNextMonthButton: () => js.Promise[js.Any],
      clickOnNthDay: Double => js.Promise[js.Any],
      clickOnNthDayOfTheMonth: Double => js.Promise[js.Any],
      clickOnNthYear: Double => js.Promise[js.Any],
      clickOnPrevMonthButton: () => js.Promise[js.Any],
      clickOnSelectedDay: () => js.Promise[js.Any],
      clickOnYearDropdown: () => js.Promise[js.Any],
      close: () => js.Promise[js.Any],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getCurrentMonthWithYear: () => js.Promise[String],
      getFocusedDay: () => js.Promise[String | Null],
      getFocusedDayElement: () => UniDriver[js.Any],
      getMonthAndYear: () => js.Promise[js.Array[String]],
      getMonthCaption: () => js.Promise[String],
      getMonthDropdownDriver: () => DropdownLayoutUniDriver,
      getMonthDropdownLabel: () => js.Promise[String],
      getNthWeekDayName: Double => UniDriver[js.Any],
      getNumOfSelectedDays: () => js.Promise[Double],
      getNumOfVisibleMonths: () => js.Promise[Double],
      getSelectedDay: () => js.Promise[String],
      getSelectedDays: () => js.Promise[Double],
      getSelectedYear: () => js.Promise[String],
      getWidth: () => js.Function0[js.Promise[String | Null]],
      getYearDropdownDriver: () => DropdownLayoutUniDriver,
      isDayActive: Date => js.Promise[Boolean],
      isFocusedDayVisuallyUnfocused: () => js.Promise[Boolean],
      isHeaderVisible: () => js.Promise[Boolean],
      isMonthCaptionExists: () => js.Promise[Boolean],
      isMonthDropdownExists: () => js.Promise[Boolean],
      isTwoMonthsLayout: () => js.Promise[Boolean],
      isVisible: () => js.Promise[Boolean],
      isYearCaptionExists: () => js.Promise[Boolean],
      isYearDropdownExists: () => js.Promise[Boolean],
      mouseClickOutside: () => js.Promise[Boolean],
      pressLeftArrow: () => js.Promise[js.Any],
      pressRightArrow: () => js.Promise[js.Any],
      triggerKeyDown: () => js.Promise[js.Any]
    ): CalendarUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickDay = js.Any.fromFunction1(clickDay), clickOnMonthDropdown = js.Any.fromFunction0(clickOnMonthDropdown), clickOnNextMonthButton = js.Any.fromFunction0(clickOnNextMonthButton), clickOnNthDay = js.Any.fromFunction1(clickOnNthDay), clickOnNthDayOfTheMonth = js.Any.fromFunction1(clickOnNthDayOfTheMonth), clickOnNthYear = js.Any.fromFunction1(clickOnNthYear), clickOnPrevMonthButton = js.Any.fromFunction0(clickOnPrevMonthButton), clickOnSelectedDay = js.Any.fromFunction0(clickOnSelectedDay), clickOnYearDropdown = js.Any.fromFunction0(clickOnYearDropdown), close = js.Any.fromFunction0(close), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getCurrentMonthWithYear = js.Any.fromFunction0(getCurrentMonthWithYear), getFocusedDay = js.Any.fromFunction0(getFocusedDay), getFocusedDayElement = js.Any.fromFunction0(getFocusedDayElement), getMonthAndYear = js.Any.fromFunction0(getMonthAndYear), getMonthCaption = js.Any.fromFunction0(getMonthCaption), getMonthDropdownDriver = js.Any.fromFunction0(getMonthDropdownDriver), getMonthDropdownLabel = js.Any.fromFunction0(getMonthDropdownLabel), getNthWeekDayName = js.Any.fromFunction1(getNthWeekDayName), getNumOfSelectedDays = js.Any.fromFunction0(getNumOfSelectedDays), getNumOfVisibleMonths = js.Any.fromFunction0(getNumOfVisibleMonths), getSelectedDay = js.Any.fromFunction0(getSelectedDay), getSelectedDays = js.Any.fromFunction0(getSelectedDays), getSelectedYear = js.Any.fromFunction0(getSelectedYear), getWidth = js.Any.fromFunction0(getWidth), getYearDropdownDriver = js.Any.fromFunction0(getYearDropdownDriver), isDayActive = js.Any.fromFunction1(isDayActive), isFocusedDayVisuallyUnfocused = js.Any.fromFunction0(isFocusedDayVisuallyUnfocused), isHeaderVisible = js.Any.fromFunction0(isHeaderVisible), isMonthCaptionExists = js.Any.fromFunction0(isMonthCaptionExists), isMonthDropdownExists = js.Any.fromFunction0(isMonthDropdownExists), isTwoMonthsLayout = js.Any.fromFunction0(isTwoMonthsLayout), isVisible = js.Any.fromFunction0(isVisible), isYearCaptionExists = js.Any.fromFunction0(isYearCaptionExists), isYearDropdownExists = js.Any.fromFunction0(isYearDropdownExists), mouseClickOutside = js.Any.fromFunction0(mouseClickOutside), pressLeftArrow = js.Any.fromFunction0(pressLeftArrow), pressRightArrow = js.Any.fromFunction0(pressRightArrow), triggerKeyDown = js.Any.fromFunction0(triggerKeyDown))
      __obj.asInstanceOf[CalendarUniDriver]
    }
    
    @scala.inline
    implicit class CalendarUniDriverMutableBuilder[Self <: CalendarUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClickDay(value: Date => js.Promise[js.Any]): Self = StObject.set(x, "clickDay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClickOnMonthDropdown(value: () => js.Promise[js.Any]): Self = StObject.set(x, "clickOnMonthDropdown", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClickOnNextMonthButton(value: () => js.Promise[js.Any]): Self = StObject.set(x, "clickOnNextMonthButton", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClickOnNthDay(value: Double => js.Promise[js.Any]): Self = StObject.set(x, "clickOnNthDay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClickOnNthDayOfTheMonth(value: Double => js.Promise[js.Any]): Self = StObject.set(x, "clickOnNthDayOfTheMonth", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClickOnNthYear(value: Double => js.Promise[js.Any]): Self = StObject.set(x, "clickOnNthYear", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClickOnPrevMonthButton(value: () => js.Promise[js.Any]): Self = StObject.set(x, "clickOnPrevMonthButton", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClickOnSelectedDay(value: () => js.Promise[js.Any]): Self = StObject.set(x, "clickOnSelectedDay", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClickOnYearDropdown(value: () => js.Promise[js.Any]): Self = StObject.set(x, "clickOnYearDropdown", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClose(value: () => js.Promise[js.Any]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCurrentMonthWithYear(value: () => js.Promise[String]): Self = StObject.set(x, "getCurrentMonthWithYear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFocusedDay(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getFocusedDay", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFocusedDayElement(value: () => UniDriver[js.Any]): Self = StObject.set(x, "getFocusedDayElement", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMonthAndYear(value: () => js.Promise[js.Array[String]]): Self = StObject.set(x, "getMonthAndYear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMonthCaption(value: () => js.Promise[String]): Self = StObject.set(x, "getMonthCaption", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMonthDropdownDriver(value: () => DropdownLayoutUniDriver): Self = StObject.set(x, "getMonthDropdownDriver", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMonthDropdownLabel(value: () => js.Promise[String]): Self = StObject.set(x, "getMonthDropdownLabel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetNthWeekDayName(value: Double => UniDriver[js.Any]): Self = StObject.set(x, "getNthWeekDayName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetNumOfSelectedDays(value: () => js.Promise[Double]): Self = StObject.set(x, "getNumOfSelectedDays", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetNumOfVisibleMonths(value: () => js.Promise[Double]): Self = StObject.set(x, "getNumOfVisibleMonths", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSelectedDay(value: () => js.Promise[String]): Self = StObject.set(x, "getSelectedDay", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSelectedDays(value: () => js.Promise[Double]): Self = StObject.set(x, "getSelectedDays", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSelectedYear(value: () => js.Promise[String]): Self = StObject.set(x, "getSelectedYear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetWidth(value: () => js.Function0[js.Promise[String | Null]]): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetYearDropdownDriver(value: () => DropdownLayoutUniDriver): Self = StObject.set(x, "getYearDropdownDriver", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsDayActive(value: Date => js.Promise[Boolean]): Self = StObject.set(x, "isDayActive", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsFocusedDayVisuallyUnfocused(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isFocusedDayVisuallyUnfocused", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsHeaderVisible(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isHeaderVisible", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsMonthCaptionExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isMonthCaptionExists", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsMonthDropdownExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isMonthDropdownExists", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsTwoMonthsLayout(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isTwoMonthsLayout", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsVisible(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isVisible", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsYearCaptionExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isYearCaptionExists", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsYearDropdownExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isYearDropdownExists", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMouseClickOutside(value: () => js.Promise[Boolean]): Self = StObject.set(x, "mouseClickOutside", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPressLeftArrow(value: () => js.Promise[js.Any]): Self = StObject.set(x, "pressLeftArrow", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPressRightArrow(value: () => js.Promise[js.Any]): Self = StObject.set(x, "pressRightArrow", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTriggerKeyDown(value: () => js.Promise[js.Any]): Self = StObject.set(x, "triggerKeyDown", js.Any.fromFunction0(value))
    }
  }
}
