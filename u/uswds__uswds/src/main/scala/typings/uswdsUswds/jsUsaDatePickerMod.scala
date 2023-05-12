package typings.uswdsUswds

import org.scalablytyped.runtime.Shortcut
import typings.std.Document
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsUsaDatePickerMod extends Shortcut {
  
  @JSImport("@uswds/uswds/js/usa-date-picker", JSImport.Default)
  @js.native
  val default: DatePicker = js.native
  
  @js.native
  trait DatePicker extends StObject {
    
    /**
      * Disable the date picker component
      */
    def disable(el: HTMLElement): Unit = js.native
    
    /**
      * Enable the date picker component
      */
    def enable(el: HTMLElement): Unit = js.native
    
    /**
      * Get an object of the properties and elements belonging directly to the given
      * date picker component.
      */
    def getDatePickerContext(el: HTMLElement): DatePickerContext = js.native
    
    def init(root: Document): Unit = js.native
    def init(root: HTMLElement): Unit = js.native
    
    /**
      * Validate the value in the input as a valid date of format M/D/YYYY
      */
    def isDateInputInvalid(el: HTMLElement): Boolean = js.native
    
    def off(el: HTMLElement): Unit = js.native
    
    def on(el: HTMLElement): Unit = js.native
    
    /**
      * Render the calendar.
      */
    def renderCalendar(el: HTMLElement, _dateToDisplay: js.Date): HTMLElement = js.native
    
    /**
      * Select the value of the date picker inputs.
      */
    def setCalendarValue(el: HTMLElement, dateString: String): Unit = js.native
    
    /**
      * Update the calendar when visible.
      */
    def updateCalendarIfVisible(el: HTMLElement): Unit = js.native
    
    /**
      * Validate the value in the input as a valid date of format M/D/YYYY
      */
    def validateDateInput(el: HTMLElement): Unit = js.native
  }
  
  trait DatePickerContext extends StObject {
    
    var calendarDate: js.Date
    
    var calendarEl: HTMLDivElement
    
    var datePickerEl: HTMLElement
    
    var defaultDate: js.Date
    
    var externalInputEl: HTMLInputElement
    
    var firstYearChunkEl: HTMLDivElement
    
    var internalInputEl: HTMLInputElement
    
    var maxDate: js.Date
    
    var minDate: js.Date
    
    var rangeDate: js.Date
    
    var selectedDate: js.Date
    
    var statusEl: HTMLDivElement
  }
  object DatePickerContext {
    
    inline def apply(
      calendarDate: js.Date,
      calendarEl: HTMLDivElement,
      datePickerEl: HTMLElement,
      defaultDate: js.Date,
      externalInputEl: HTMLInputElement,
      firstYearChunkEl: HTMLDivElement,
      internalInputEl: HTMLInputElement,
      maxDate: js.Date,
      minDate: js.Date,
      rangeDate: js.Date,
      selectedDate: js.Date,
      statusEl: HTMLDivElement
    ): DatePickerContext = {
      val __obj = js.Dynamic.literal(calendarDate = calendarDate.asInstanceOf[js.Any], calendarEl = calendarEl.asInstanceOf[js.Any], datePickerEl = datePickerEl.asInstanceOf[js.Any], defaultDate = defaultDate.asInstanceOf[js.Any], externalInputEl = externalInputEl.asInstanceOf[js.Any], firstYearChunkEl = firstYearChunkEl.asInstanceOf[js.Any], internalInputEl = internalInputEl.asInstanceOf[js.Any], maxDate = maxDate.asInstanceOf[js.Any], minDate = minDate.asInstanceOf[js.Any], rangeDate = rangeDate.asInstanceOf[js.Any], selectedDate = selectedDate.asInstanceOf[js.Any], statusEl = statusEl.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatePickerContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DatePickerContext] (val x: Self) extends AnyVal {
      
      inline def setCalendarDate(value: js.Date): Self = StObject.set(x, "calendarDate", value.asInstanceOf[js.Any])
      
      inline def setCalendarEl(value: HTMLDivElement): Self = StObject.set(x, "calendarEl", value.asInstanceOf[js.Any])
      
      inline def setDatePickerEl(value: HTMLElement): Self = StObject.set(x, "datePickerEl", value.asInstanceOf[js.Any])
      
      inline def setDefaultDate(value: js.Date): Self = StObject.set(x, "defaultDate", value.asInstanceOf[js.Any])
      
      inline def setExternalInputEl(value: HTMLInputElement): Self = StObject.set(x, "externalInputEl", value.asInstanceOf[js.Any])
      
      inline def setFirstYearChunkEl(value: HTMLDivElement): Self = StObject.set(x, "firstYearChunkEl", value.asInstanceOf[js.Any])
      
      inline def setInternalInputEl(value: HTMLInputElement): Self = StObject.set(x, "internalInputEl", value.asInstanceOf[js.Any])
      
      inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setRangeDate(value: js.Date): Self = StObject.set(x, "rangeDate", value.asInstanceOf[js.Any])
      
      inline def setSelectedDate(value: js.Date): Self = StObject.set(x, "selectedDate", value.asInstanceOf[js.Any])
      
      inline def setStatusEl(value: HTMLDivElement): Self = StObject.set(x, "statusEl", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = DatePicker
  
  /* This means you don't have to write `default`, but can instead just say `jsUsaDatePickerMod.foo` */
  override def _to: DatePicker = default
}
