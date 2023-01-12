package typings.vanillajsDatepicker

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateRangePickerMod {
  
  @JSImport("vanillajs-datepicker/DateRangePicker", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with DateRangePicker {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: DateRangePickerOptions) = this()
  }
  
  @js.native
  trait DateRangePicker extends StObject {
    
    var _updating: Boolean = js.native
    
    var allowOneSidedRange: Boolean = js.native
    
    var datepickers: js.Array[typings.vanillajsDatepicker.datepickerMod.default] = js.native
    
    def dates: js.UndefOr[js.Array[js.Date]] = js.native
    
    def destroy(): DateRangePicker = js.native
    
    var element: HTMLElement = js.native
    
    def getDates(): js.Tuple2[js.UndefOr[js.Date], js.UndefOr[js.Date]] = js.native
    def getDates(format: String): js.Tuple2[js.UndefOr[js.Date], js.UndefOr[js.Date]] = js.native
    
    var inputs: js.Array[HTMLElement] = js.native
    
    def setDates(rangeStart: String, rangeEnd: String): Unit = js.native
    def setDates(rangeStart: String, rangeEnd: js.Date): Unit = js.native
    def setDates(rangeStart: String, rangeEnd: js.Object): Unit = js.native
    def setDates(rangeStart: String, rangeEnd: Double): Unit = js.native
    def setDates(rangeStart: js.Date, rangeEnd: String): Unit = js.native
    def setDates(rangeStart: js.Date, rangeEnd: js.Date): Unit = js.native
    def setDates(rangeStart: js.Date, rangeEnd: js.Object): Unit = js.native
    def setDates(rangeStart: js.Date, rangeEnd: Double): Unit = js.native
    def setDates(rangeStart: js.Object, rangeEnd: String): Unit = js.native
    def setDates(rangeStart: js.Object, rangeEnd: js.Date): Unit = js.native
    def setDates(rangeStart: js.Object, rangeEnd: js.Object): Unit = js.native
    def setDates(rangeStart: js.Object, rangeEnd: Double): Unit = js.native
    def setDates(rangeStart: Double, rangeEnd: String): Unit = js.native
    def setDates(rangeStart: Double, rangeEnd: js.Date): Unit = js.native
    def setDates(rangeStart: Double, rangeEnd: js.Object): Unit = js.native
    def setDates(rangeStart: Double, rangeEnd: Double): Unit = js.native
    
    def setOptions(options: js.Object): Unit = js.native
  }
  
  trait DateRangePickerOptions extends StObject {
    
    var allowOneSidedRange: js.UndefOr[Boolean] = js.undefined
    
    var inputs: js.UndefOr[js.Array[HTMLElement]] = js.undefined
  }
  object DateRangePickerOptions {
    
    inline def apply(): DateRangePickerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateRangePickerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DateRangePickerOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowOneSidedRange(value: Boolean): Self = StObject.set(x, "allowOneSidedRange", value.asInstanceOf[js.Any])
      
      inline def setAllowOneSidedRangeUndefined: Self = StObject.set(x, "allowOneSidedRange", js.undefined)
      
      inline def setInputs(value: js.Array[HTMLElement]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
      
      inline def setInputsVarargs(value: HTMLElement*): Self = StObject.set(x, "inputs", js.Array(value*))
    }
  }
}
