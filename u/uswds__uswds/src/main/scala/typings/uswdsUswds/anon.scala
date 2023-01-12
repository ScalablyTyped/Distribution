package typings.uswdsUswds

import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.HTMLLIElement
import typings.std.HTMLSelectElement
import typings.std.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ApQueryFilter extends StObject {
    
    var apQueryFilter: String
    
    var filter: String
    
    var hourQueryFilter: String
    
    var minuteQueryFilter: String
  }
  object ApQueryFilter {
    
    inline def apply(apQueryFilter: String, filter: String, hourQueryFilter: String, minuteQueryFilter: String): ApQueryFilter = {
      val __obj = js.Dynamic.literal(apQueryFilter = apQueryFilter.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], hourQueryFilter = hourQueryFilter.asInstanceOf[js.Any], minuteQueryFilter = minuteQueryFilter.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApQueryFilter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ApQueryFilter] (val x: Self) extends AnyVal {
      
      inline def setApQueryFilter(value: String): Self = StObject.set(x, "apQueryFilter", value.asInstanceOf[js.Any])
      
      inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setHourQueryFilter(value: String): Self = StObject.set(x, "hourQueryFilter", value.asInstanceOf[js.Any])
      
      inline def setMinuteQueryFilter(value: String): Self = StObject.set(x, "minuteQueryFilter", value.asInstanceOf[js.Any])
    }
  }
  
  trait CalendarDate extends StObject {
    
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
  object CalendarDate {
    
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
    ): CalendarDate = {
      val __obj = js.Dynamic.literal(calendarDate = calendarDate.asInstanceOf[js.Any], calendarEl = calendarEl.asInstanceOf[js.Any], datePickerEl = datePickerEl.asInstanceOf[js.Any], defaultDate = defaultDate.asInstanceOf[js.Any], externalInputEl = externalInputEl.asInstanceOf[js.Any], firstYearChunkEl = firstYearChunkEl.asInstanceOf[js.Any], internalInputEl = internalInputEl.asInstanceOf[js.Any], maxDate = maxDate.asInstanceOf[js.Any], minDate = minDate.asInstanceOf[js.Any], rangeDate = rangeDate.asInstanceOf[js.Any], selectedDate = selectedDate.asInstanceOf[js.Any], statusEl = statusEl.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalendarDate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CalendarDate] (val x: Self) extends AnyVal {
      
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
  
  trait ClearInputBtnEl extends StObject {
    
    var clearInputBtnEl: HTMLButtonElement
    
    var comboBoxEl: HTMLElement
    
    var disableFiltering: Boolean
    
    var focusedOptionEl: HTMLLIElement
    
    var inputEl: HTMLInputElement
    
    var isPristine: Boolean
    
    var listEl: HTMLUListElement
    
    var selectEl: HTMLSelectElement
    
    var selectedOptionEl: HTMLLIElement
    
    var statusEl: HTMLDivElement
    
    var toggleListBtnEl: HTMLButtonElement
  }
  object ClearInputBtnEl {
    
    inline def apply(
      clearInputBtnEl: HTMLButtonElement,
      comboBoxEl: HTMLElement,
      disableFiltering: Boolean,
      focusedOptionEl: HTMLLIElement,
      inputEl: HTMLInputElement,
      isPristine: Boolean,
      listEl: HTMLUListElement,
      selectEl: HTMLSelectElement,
      selectedOptionEl: HTMLLIElement,
      statusEl: HTMLDivElement,
      toggleListBtnEl: HTMLButtonElement
    ): ClearInputBtnEl = {
      val __obj = js.Dynamic.literal(clearInputBtnEl = clearInputBtnEl.asInstanceOf[js.Any], comboBoxEl = comboBoxEl.asInstanceOf[js.Any], disableFiltering = disableFiltering.asInstanceOf[js.Any], focusedOptionEl = focusedOptionEl.asInstanceOf[js.Any], inputEl = inputEl.asInstanceOf[js.Any], isPristine = isPristine.asInstanceOf[js.Any], listEl = listEl.asInstanceOf[js.Any], selectEl = selectEl.asInstanceOf[js.Any], selectedOptionEl = selectedOptionEl.asInstanceOf[js.Any], statusEl = statusEl.asInstanceOf[js.Any], toggleListBtnEl = toggleListBtnEl.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClearInputBtnEl]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClearInputBtnEl] (val x: Self) extends AnyVal {
      
      inline def setClearInputBtnEl(value: HTMLButtonElement): Self = StObject.set(x, "clearInputBtnEl", value.asInstanceOf[js.Any])
      
      inline def setComboBoxEl(value: HTMLElement): Self = StObject.set(x, "comboBoxEl", value.asInstanceOf[js.Any])
      
      inline def setDisableFiltering(value: Boolean): Self = StObject.set(x, "disableFiltering", value.asInstanceOf[js.Any])
      
      inline def setFocusedOptionEl(value: HTMLLIElement): Self = StObject.set(x, "focusedOptionEl", value.asInstanceOf[js.Any])
      
      inline def setInputEl(value: HTMLInputElement): Self = StObject.set(x, "inputEl", value.asInstanceOf[js.Any])
      
      inline def setIsPristine(value: Boolean): Self = StObject.set(x, "isPristine", value.asInstanceOf[js.Any])
      
      inline def setListEl(value: HTMLUListElement): Self = StObject.set(x, "listEl", value.asInstanceOf[js.Any])
      
      inline def setSelectEl(value: HTMLSelectElement): Self = StObject.set(x, "selectEl", value.asInstanceOf[js.Any])
      
      inline def setSelectedOptionEl(value: HTMLLIElement): Self = StObject.set(x, "selectedOptionEl", value.asInstanceOf[js.Any])
      
      inline def setStatusEl(value: HTMLDivElement): Self = StObject.set(x, "statusEl", value.asInstanceOf[js.Any])
      
      inline def setToggleListBtnEl(value: HTMLButtonElement): Self = StObject.set(x, "toggleListBtnEl", value.asInstanceOf[js.Any])
    }
  }
  
  trait DropZoneEl extends StObject {
    
    var dropZoneEl: HTMLDivElement
    
    var inputEl: HTMLInputElement
  }
  object DropZoneEl {
    
    inline def apply(dropZoneEl: HTMLDivElement, inputEl: HTMLInputElement): DropZoneEl = {
      val __obj = js.Dynamic.literal(dropZoneEl = dropZoneEl.asInstanceOf[js.Any], inputEl = inputEl.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropZoneEl]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DropZoneEl] (val x: Self) extends AnyVal {
      
      inline def setDropZoneEl(value: HTMLDivElement): Self = StObject.set(x, "dropZoneEl", value.asInstanceOf[js.Any])
      
      inline def setInputEl(value: HTMLInputElement): Self = StObject.set(x, "inputEl", value.asInstanceOf[js.Any])
    }
  }
}
