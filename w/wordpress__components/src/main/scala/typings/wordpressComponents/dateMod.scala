package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.std.Date
import typings.wordpressComponents.dateMod.DatePicker.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/date-time/date", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object DatePicker {
    
    trait Props extends StObject {
      
      /**
        * The current date and time at initialization. Optionally pass in `null`
        * to specify no date is currently selected. Defaults to current date.
        */
      var currentDate: js.UndefOr[String] = js.undefined
      
      /**
        * Whether we use a 12-hour clock. With a 12-hour clock, an AM/PM
        * widget is displayed and the time format is assumed to be MM-DD-YYYY.
        */
      var is12Hour: js.UndefOr[Boolean] = js.undefined
      
      /**
        * A callback function that should return a `boolean` to signify if the
        * day is valid or not.
        */
      var isInvalidDate: js.UndefOr[js.Function1[/* date */ Date, Boolean]] = js.undefined
      
      /**
        * Function to call when the date value changes.
        */
      def onChange(currentDate: String): Unit
    }
    object Props {
      
      inline def apply(onChange: String => Unit): Props = {
        val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setCurrentDate(value: String): Self = StObject.set(x, "currentDate", value.asInstanceOf[js.Any])
        
        inline def setCurrentDateUndefined: Self = StObject.set(x, "currentDate", js.undefined)
        
        inline def setIs12Hour(value: Boolean): Self = StObject.set(x, "is12Hour", value.asInstanceOf[js.Any])
        
        inline def setIs12HourUndefined: Self = StObject.set(x, "is12Hour", js.undefined)
        
        inline def setIsInvalidDate(value: /* date */ Date => Boolean): Self = StObject.set(x, "isInvalidDate", js.Any.fromFunction1(value))
        
        inline def setIsInvalidDateUndefined: Self = StObject.set(x, "isInvalidDate", js.undefined)
        
        inline def setOnChange(value: String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      }
    }
  }
}
