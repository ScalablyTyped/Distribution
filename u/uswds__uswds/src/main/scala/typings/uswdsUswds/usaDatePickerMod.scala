package typings.uswdsUswds

import org.scalablytyped.runtime.Shortcut
import typings.std.Document
import typings.std.HTMLButtonElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.uswdsUswds.anon.CalendarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usaDatePickerMod extends Shortcut {
  
  @JSImport("@uswds/uswds/js/usa-date-picker", JSImport.Default)
  @js.native
  val default: DatePicker = js.native
  
  @js.native
  trait DatePicker extends StObject {
    
    /**
      * Disable the date picker component
      *
      * @param el An element within the date picker component
      */
    def disable(el: HTMLInputElement): Unit = js.native
    
    /**
      * Enable the date picker component
      *
      * @param el An element within the date picker component
      */
    def enable(el: HTMLInputElement): Unit = js.native
    
    /**
      * Get an object of the properties and elements belonging directly to the given
      * date picker component.
      *
      * @param el the element within the date picker
      * @returns elements
      */
    def getDatePickerContext(el: HTMLElement): CalendarDate = js.native
    
    def init(root: Document): Unit = js.native
    def init(root: HTMLElement): Unit = js.native
    
    /**
      * Validate the value in the input as a valid date of format M/D/YYYY
      *
      * @param el An element within the date picker component
      */
    def isDateInputInvalid(el: HTMLInputElement): Boolean = js.native
    
    def off(el: HTMLElement): Unit = js.native
    
    def on(el: HTMLElement): Unit = js.native
    
    /**
      * render the calendar.
      *
      * @param el An element within the date picker component
      * @param _dateToDisplay a date to render on the calendar
      * @returns a reference to the new calendar element
      */
    def renderCalendar(el: HTMLElement, _dateToDisplay: js.Date): HTMLElement = js.native
    
    /**
      * Select the value of the date picker inputs.
      *
      * @param el An element within the date picker component
      * @param dateString The date string to update in YYYY-MM-DD format
      */
    def setCalendarValue(el: HTMLButtonElement, dateString: String): Unit = js.native
    
    /**
      * Update the calendar when visible.
      *
      * @param el an element within the date picker
      */
    def updateCalendarIfVisible(el: HTMLElement): Unit = js.native
    
    /**
      * Validate the value in the input as a valid date of format M/D/YYYY
      *
      * @param el An element within the date picker component
      */
    def validateDateInput(el: HTMLElement): Unit = js.native
  }
  
  type _To = DatePicker
  
  /* This means you don't have to write `default`, but can instead just say `usaDatePickerMod.foo` */
  override def _to: DatePicker = default
}
