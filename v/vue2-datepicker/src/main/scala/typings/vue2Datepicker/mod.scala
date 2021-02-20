package typings.vue2Datepicker

import org.scalablytyped.runtime.Shortcut
import typings.std.Date
import typings.vue.optionsMod.Component
import typings.vue2Datepicker.anon.AppendToBody
import typings.vue2Datepicker.anon.FirstDayOfWeek
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default extends Shortcut {
    
    @JSImport("vue2-datepicker", JSImport.Default)
    @js.native
    val ^ : Component[js.Any, js.Any, js.Any, AppendToBody] = js.native
    
    type _To = Component[js.Any, js.Any, js.Any, AppendToBody]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: Component[js.Any, js.Any, js.Any, AppendToBody] = ^
  }
  
  object Datepicker {
    
    @js.native
    trait Lang extends StObject {
      
      var days: js.UndefOr[js.Array[String]] = js.native
      
      var formatLocale: FirstDayOfWeek = js.native
      
      var monthBeforeYear: Boolean = js.native
      
      var monthFormat: String = js.native
      
      var months: js.UndefOr[js.Array[String]] = js.native
      
      var yearFormat: String = js.native
    }
    object Lang {
      
      @scala.inline
      def apply(formatLocale: FirstDayOfWeek, monthBeforeYear: Boolean, monthFormat: String, yearFormat: String): Lang = {
        val __obj = js.Dynamic.literal(formatLocale = formatLocale.asInstanceOf[js.Any], monthBeforeYear = monthBeforeYear.asInstanceOf[js.Any], monthFormat = monthFormat.asInstanceOf[js.Any], yearFormat = yearFormat.asInstanceOf[js.Any])
        __obj.asInstanceOf[Lang]
      }
      
      @scala.inline
      implicit class LangMutableBuilder[Self <: Lang] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDays(value: js.Array[String]): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
        
        @scala.inline
        def setDaysVarargs(value: String*): Self = StObject.set(x, "days", js.Array(value :_*))
        
        @scala.inline
        def setFormatLocale(value: FirstDayOfWeek): Self = StObject.set(x, "formatLocale", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMonthBeforeYear(value: Boolean): Self = StObject.set(x, "monthBeforeYear", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMonthFormat(value: String): Self = StObject.set(x, "monthFormat", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMonths(value: js.Array[String]): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
        
        @scala.inline
        def setMonthsVarargs(value: String*): Self = StObject.set(x, "months", js.Array(value :_*))
        
        @scala.inline
        def setYearFormat(value: String): Self = StObject.set(x, "yearFormat", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Shortcuts extends StObject {
      
      def onClick(): js.Any = js.native
      
      var text: String = js.native
    }
    object Shortcuts {
      
      @scala.inline
      def apply(onClick: () => js.Any, text: String): Shortcuts = {
        val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction0(onClick), text = text.asInstanceOf[js.Any])
        __obj.asInstanceOf[Shortcuts]
      }
      
      @scala.inline
      implicit class ShortcutsMutableBuilder[Self <: Shortcuts] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOnClick(value: () => js.Any): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
        
        @scala.inline
        def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait TimePickerOptions extends StObject {
      
      var end: String = js.native
      
      var format: String = js.native
      
      var start: String = js.native
      
      var step: String = js.native
    }
    object TimePickerOptions {
      
      @scala.inline
      def apply(end: String, format: String, start: String, step: String): TimePickerOptions = {
        val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
        __obj.asInstanceOf[TimePickerOptions]
      }
      
      @scala.inline
      implicit class TimePickerOptionsMutableBuilder[Self <: TimePickerOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStep(value: String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait ValueType extends StObject {
      
      var date: Date = js.native
      
      var format: String = js.native
      
      var timestamp: Double = js.native
      
      var token: String = js.native
    }
    object ValueType {
      
      @scala.inline
      def apply(date: Date, format: String, timestamp: Double, token: String): ValueType = {
        val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
        __obj.asInstanceOf[ValueType]
      }
      
      @scala.inline
      implicit class ValueTypeMutableBuilder[Self <: ValueType] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      }
    }
  }
}
