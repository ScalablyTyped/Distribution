package typings.vanillajsDatepicker

import typings.std.HTMLElement
import typings.vanillajsDatepicker.dateRangePickerMod.DateRangePickerOptions
import typings.vanillajsDatepicker.dateRangePickerMod.default
import typings.vanillajsDatepicker.datepickerMod.DatepickerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vanillajs-datepicker", "DateRangePicker")
  @js.native
  open class DateRangePicker protected () extends default {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: DateRangePickerOptions) = this()
  }
  
  @JSImport("vanillajs-datepicker", "Datepicker")
  @js.native
  open class Datepicker protected ()
    extends typings.vanillajsDatepicker.datepickerMod.default {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: DatepickerOptions) = this()
    def this(element: HTMLElement, options: Unit, rangepicker: default) = this()
    def this(element: HTMLElement, options: DatepickerOptions, rangepicker: default) = this()
  }
  /* static members */
  object Datepicker {
    
    @JSImport("vanillajs-datepicker", "Datepicker")
    @js.native
    val ^ : js.Any = js.native
    
    inline def formatDate(date: js.Date, format: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def formatDate(date: js.Date, format: String, lang: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], lang.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def formatDate(date: Double, format: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def formatDate(date: Double, format: String, lang: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any], lang.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def parseDate(dateStr: String, format: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDate")(dateStr.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def parseDate(dateStr: String, format: String, lang: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDate")(dateStr.asInstanceOf[js.Any], format.asInstanceOf[js.Any], lang.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def parseDate(dateStr: js.Date, format: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDate")(dateStr.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def parseDate(dateStr: js.Date, format: String, lang: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDate")(dateStr.asInstanceOf[js.Any], format.asInstanceOf[js.Any], lang.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def parseDate(dateStr: Double, format: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDate")(dateStr.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def parseDate(dateStr: Double, format: String, lang: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDate")(dateStr.asInstanceOf[js.Any], format.asInstanceOf[js.Any], lang.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
}
