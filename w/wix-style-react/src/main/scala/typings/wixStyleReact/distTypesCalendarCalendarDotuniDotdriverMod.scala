package typings.wixStyleReact

import typings.unidriverCore.mod.UniDriver
import typings.wixStyleReact.distTypesDropdownLayoutDropdownLayoutDotuniDotdriverMod.DropdownLayoutUniDriver
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCalendarCalendarDotuniDotdriverMod {
  
  trait CalendarUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickDay(date: js.Date): js.Promise[Any]
    
    def clickOnMonthDropdown(): js.Promise[Any]
    
    def clickOnNextMonthButton(): js.Promise[Any]
    
    def clickOnNthDay(n: Double): js.Promise[Any]
    
    def clickOnNthDayOfTheMonth(n: Double): js.Promise[Any]
    
    def clickOnNthYear(n: Double): js.Promise[Any]
    
    def clickOnPrevMonthButton(): js.Promise[Any]
    
    def clickOnSelectedDay(): js.Promise[Any]
    
    def clickOnYearDropdown(): js.Promise[Any]
    
    def close(): js.Promise[Any]
    
    def getCurrentMonthWithYear(): js.Promise[String]
    
    def getFocusedDay(): js.Promise[String | Null]
    
    def getFocusedDayElement(): UniDriver[Any]
    
    def getMonthAndYear(): js.Promise[js.Array[String]]
    
    def getMonthCaption(): js.Promise[String]
    
    def getMonthDropdownDriver(): DropdownLayoutUniDriver
    
    def getMonthDropdownLabel(): js.Promise[String]
    
    def getNthWeekDayName(n: Double): UniDriver[Any]
    
    def getNumOfSelectedDays(): js.Promise[Double]
    
    def getNumOfVisibleMonths(): js.Promise[Double]
    
    def getSelectedDay(): js.Promise[String]
    
    def getSelectedDays(): js.Promise[Double]
    
    def getSelectedYear(): js.Promise[String]
    
    def getSize(): js.Promise[String]
    
    def getYearDropdownDriver(): DropdownLayoutUniDriver
    
    def isDayActive(date: js.Date): js.Promise[Boolean]
    
    def isFocusedDayVisuallyUnfocused(): js.Promise[Boolean]
    
    def isHeaderExists(): js.Promise[Boolean]
    
    def isMonthCaptionExists(): js.Promise[Boolean]
    
    def isMonthDropdownExists(): js.Promise[Boolean]
    
    def isTwoMonthsLayout(): js.Promise[Boolean]
    
    def isYearCaptionExists(): js.Promise[Boolean]
    
    def isYearDropdownExists(): js.Promise[Boolean]
    
    def keyboardNextYear(): js.Promise[Unit]
    
    def keyboardPrevYear(): js.Promise[Unit]
    
    def pressLeftArrow(): js.Promise[Any]
    
    def pressRightArrow(): js.Promise[Any]
    
    def triggerKeyDown(): js.Promise[Any]
  }
  object CalendarUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      clickDay: js.Date => js.Promise[Any],
      clickOnMonthDropdown: () => js.Promise[Any],
      clickOnNextMonthButton: () => js.Promise[Any],
      clickOnNthDay: Double => js.Promise[Any],
      clickOnNthDayOfTheMonth: Double => js.Promise[Any],
      clickOnNthYear: Double => js.Promise[Any],
      clickOnPrevMonthButton: () => js.Promise[Any],
      clickOnSelectedDay: () => js.Promise[Any],
      clickOnYearDropdown: () => js.Promise[Any],
      close: () => js.Promise[Any],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getCurrentMonthWithYear: () => js.Promise[String],
      getFocusedDay: () => js.Promise[String | Null],
      getFocusedDayElement: () => UniDriver[Any],
      getMonthAndYear: () => js.Promise[js.Array[String]],
      getMonthCaption: () => js.Promise[String],
      getMonthDropdownDriver: () => DropdownLayoutUniDriver,
      getMonthDropdownLabel: () => js.Promise[String],
      getNthWeekDayName: Double => UniDriver[Any],
      getNumOfSelectedDays: () => js.Promise[Double],
      getNumOfVisibleMonths: () => js.Promise[Double],
      getSelectedDay: () => js.Promise[String],
      getSelectedDays: () => js.Promise[Double],
      getSelectedYear: () => js.Promise[String],
      getSize: () => js.Promise[String],
      getYearDropdownDriver: () => DropdownLayoutUniDriver,
      isDayActive: js.Date => js.Promise[Boolean],
      isFocusedDayVisuallyUnfocused: () => js.Promise[Boolean],
      isHeaderExists: () => js.Promise[Boolean],
      isMonthCaptionExists: () => js.Promise[Boolean],
      isMonthDropdownExists: () => js.Promise[Boolean],
      isTwoMonthsLayout: () => js.Promise[Boolean],
      isYearCaptionExists: () => js.Promise[Boolean],
      isYearDropdownExists: () => js.Promise[Boolean],
      keyboardNextYear: () => js.Promise[Unit],
      keyboardPrevYear: () => js.Promise[Unit],
      pressLeftArrow: () => js.Promise[Any],
      pressRightArrow: () => js.Promise[Any],
      triggerKeyDown: () => js.Promise[Any]
    ): CalendarUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickDay = js.Any.fromFunction1(clickDay), clickOnMonthDropdown = js.Any.fromFunction0(clickOnMonthDropdown), clickOnNextMonthButton = js.Any.fromFunction0(clickOnNextMonthButton), clickOnNthDay = js.Any.fromFunction1(clickOnNthDay), clickOnNthDayOfTheMonth = js.Any.fromFunction1(clickOnNthDayOfTheMonth), clickOnNthYear = js.Any.fromFunction1(clickOnNthYear), clickOnPrevMonthButton = js.Any.fromFunction0(clickOnPrevMonthButton), clickOnSelectedDay = js.Any.fromFunction0(clickOnSelectedDay), clickOnYearDropdown = js.Any.fromFunction0(clickOnYearDropdown), close = js.Any.fromFunction0(close), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getCurrentMonthWithYear = js.Any.fromFunction0(getCurrentMonthWithYear), getFocusedDay = js.Any.fromFunction0(getFocusedDay), getFocusedDayElement = js.Any.fromFunction0(getFocusedDayElement), getMonthAndYear = js.Any.fromFunction0(getMonthAndYear), getMonthCaption = js.Any.fromFunction0(getMonthCaption), getMonthDropdownDriver = js.Any.fromFunction0(getMonthDropdownDriver), getMonthDropdownLabel = js.Any.fromFunction0(getMonthDropdownLabel), getNthWeekDayName = js.Any.fromFunction1(getNthWeekDayName), getNumOfSelectedDays = js.Any.fromFunction0(getNumOfSelectedDays), getNumOfVisibleMonths = js.Any.fromFunction0(getNumOfVisibleMonths), getSelectedDay = js.Any.fromFunction0(getSelectedDay), getSelectedDays = js.Any.fromFunction0(getSelectedDays), getSelectedYear = js.Any.fromFunction0(getSelectedYear), getSize = js.Any.fromFunction0(getSize), getYearDropdownDriver = js.Any.fromFunction0(getYearDropdownDriver), isDayActive = js.Any.fromFunction1(isDayActive), isFocusedDayVisuallyUnfocused = js.Any.fromFunction0(isFocusedDayVisuallyUnfocused), isHeaderExists = js.Any.fromFunction0(isHeaderExists), isMonthCaptionExists = js.Any.fromFunction0(isMonthCaptionExists), isMonthDropdownExists = js.Any.fromFunction0(isMonthDropdownExists), isTwoMonthsLayout = js.Any.fromFunction0(isTwoMonthsLayout), isYearCaptionExists = js.Any.fromFunction0(isYearCaptionExists), isYearDropdownExists = js.Any.fromFunction0(isYearDropdownExists), keyboardNextYear = js.Any.fromFunction0(keyboardNextYear), keyboardPrevYear = js.Any.fromFunction0(keyboardPrevYear), pressLeftArrow = js.Any.fromFunction0(pressLeftArrow), pressRightArrow = js.Any.fromFunction0(pressRightArrow), triggerKeyDown = js.Any.fromFunction0(triggerKeyDown))
      __obj.asInstanceOf[CalendarUniDriver]
    }
    
    extension [Self <: CalendarUniDriver](x: Self) {
      
      inline def setClickDay(value: js.Date => js.Promise[Any]): Self = StObject.set(x, "clickDay", js.Any.fromFunction1(value))
      
      inline def setClickOnMonthDropdown(value: () => js.Promise[Any]): Self = StObject.set(x, "clickOnMonthDropdown", js.Any.fromFunction0(value))
      
      inline def setClickOnNextMonthButton(value: () => js.Promise[Any]): Self = StObject.set(x, "clickOnNextMonthButton", js.Any.fromFunction0(value))
      
      inline def setClickOnNthDay(value: Double => js.Promise[Any]): Self = StObject.set(x, "clickOnNthDay", js.Any.fromFunction1(value))
      
      inline def setClickOnNthDayOfTheMonth(value: Double => js.Promise[Any]): Self = StObject.set(x, "clickOnNthDayOfTheMonth", js.Any.fromFunction1(value))
      
      inline def setClickOnNthYear(value: Double => js.Promise[Any]): Self = StObject.set(x, "clickOnNthYear", js.Any.fromFunction1(value))
      
      inline def setClickOnPrevMonthButton(value: () => js.Promise[Any]): Self = StObject.set(x, "clickOnPrevMonthButton", js.Any.fromFunction0(value))
      
      inline def setClickOnSelectedDay(value: () => js.Promise[Any]): Self = StObject.set(x, "clickOnSelectedDay", js.Any.fromFunction0(value))
      
      inline def setClickOnYearDropdown(value: () => js.Promise[Any]): Self = StObject.set(x, "clickOnYearDropdown", js.Any.fromFunction0(value))
      
      inline def setClose(value: () => js.Promise[Any]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setGetCurrentMonthWithYear(value: () => js.Promise[String]): Self = StObject.set(x, "getCurrentMonthWithYear", js.Any.fromFunction0(value))
      
      inline def setGetFocusedDay(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getFocusedDay", js.Any.fromFunction0(value))
      
      inline def setGetFocusedDayElement(value: () => UniDriver[Any]): Self = StObject.set(x, "getFocusedDayElement", js.Any.fromFunction0(value))
      
      inline def setGetMonthAndYear(value: () => js.Promise[js.Array[String]]): Self = StObject.set(x, "getMonthAndYear", js.Any.fromFunction0(value))
      
      inline def setGetMonthCaption(value: () => js.Promise[String]): Self = StObject.set(x, "getMonthCaption", js.Any.fromFunction0(value))
      
      inline def setGetMonthDropdownDriver(value: () => DropdownLayoutUniDriver): Self = StObject.set(x, "getMonthDropdownDriver", js.Any.fromFunction0(value))
      
      inline def setGetMonthDropdownLabel(value: () => js.Promise[String]): Self = StObject.set(x, "getMonthDropdownLabel", js.Any.fromFunction0(value))
      
      inline def setGetNthWeekDayName(value: Double => UniDriver[Any]): Self = StObject.set(x, "getNthWeekDayName", js.Any.fromFunction1(value))
      
      inline def setGetNumOfSelectedDays(value: () => js.Promise[Double]): Self = StObject.set(x, "getNumOfSelectedDays", js.Any.fromFunction0(value))
      
      inline def setGetNumOfVisibleMonths(value: () => js.Promise[Double]): Self = StObject.set(x, "getNumOfVisibleMonths", js.Any.fromFunction0(value))
      
      inline def setGetSelectedDay(value: () => js.Promise[String]): Self = StObject.set(x, "getSelectedDay", js.Any.fromFunction0(value))
      
      inline def setGetSelectedDays(value: () => js.Promise[Double]): Self = StObject.set(x, "getSelectedDays", js.Any.fromFunction0(value))
      
      inline def setGetSelectedYear(value: () => js.Promise[String]): Self = StObject.set(x, "getSelectedYear", js.Any.fromFunction0(value))
      
      inline def setGetSize(value: () => js.Promise[String]): Self = StObject.set(x, "getSize", js.Any.fromFunction0(value))
      
      inline def setGetYearDropdownDriver(value: () => DropdownLayoutUniDriver): Self = StObject.set(x, "getYearDropdownDriver", js.Any.fromFunction0(value))
      
      inline def setIsDayActive(value: js.Date => js.Promise[Boolean]): Self = StObject.set(x, "isDayActive", js.Any.fromFunction1(value))
      
      inline def setIsFocusedDayVisuallyUnfocused(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isFocusedDayVisuallyUnfocused", js.Any.fromFunction0(value))
      
      inline def setIsHeaderExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isHeaderExists", js.Any.fromFunction0(value))
      
      inline def setIsMonthCaptionExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isMonthCaptionExists", js.Any.fromFunction0(value))
      
      inline def setIsMonthDropdownExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isMonthDropdownExists", js.Any.fromFunction0(value))
      
      inline def setIsTwoMonthsLayout(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isTwoMonthsLayout", js.Any.fromFunction0(value))
      
      inline def setIsYearCaptionExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isYearCaptionExists", js.Any.fromFunction0(value))
      
      inline def setIsYearDropdownExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isYearDropdownExists", js.Any.fromFunction0(value))
      
      inline def setKeyboardNextYear(value: () => js.Promise[Unit]): Self = StObject.set(x, "keyboardNextYear", js.Any.fromFunction0(value))
      
      inline def setKeyboardPrevYear(value: () => js.Promise[Unit]): Self = StObject.set(x, "keyboardPrevYear", js.Any.fromFunction0(value))
      
      inline def setPressLeftArrow(value: () => js.Promise[Any]): Self = StObject.set(x, "pressLeftArrow", js.Any.fromFunction0(value))
      
      inline def setPressRightArrow(value: () => js.Promise[Any]): Self = StObject.set(x, "pressRightArrow", js.Any.fromFunction0(value))
      
      inline def setTriggerKeyDown(value: () => js.Promise[Any]): Self = StObject.set(x, "triggerKeyDown", js.Any.fromFunction0(value))
    }
  }
}
