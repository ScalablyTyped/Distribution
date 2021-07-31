package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressComponents.dateMod.DatePicker.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateTimeMod {
  
  object DatePicker extends Shortcut {
    
    @JSImport("@wordpress/components/date-time", "DatePicker")
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `DatePicker.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object DateTimePicker extends Shortcut {
    
    @JSImport("@wordpress/components/date-time", "DateTimePicker")
    @js.native
    val ^ : ComponentType[typings.wordpressComponents.dateTimeMod.DateTimePicker.Props] = js.native
    
    /* Inlined std.Omit<@wordpress/components.@wordpress/components/date-time/date.default.Props, 'isInvalidDate'> */
    trait Props extends StObject {
      
      var currentDate: js.UndefOr[String] = js.undefined
      
      var is12Hour: js.UndefOr[Boolean] = js.undefined
      
      var onChange: js.Function1[/* currentDate */ String, Unit]
    }
    object Props {
      
      @scala.inline
      def apply(onChange: /* currentDate */ String => Unit): typings.wordpressComponents.dateTimeMod.DateTimePicker.Props = {
        val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
        __obj.asInstanceOf[typings.wordpressComponents.dateTimeMod.DateTimePicker.Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: typings.wordpressComponents.dateTimeMod.DateTimePicker.Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCurrentDate(value: String): Self = StObject.set(x, "currentDate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCurrentDateUndefined: Self = StObject.set(x, "currentDate", js.undefined)
        
        @scala.inline
        def setIs12Hour(value: Boolean): Self = StObject.set(x, "is12Hour", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIs12HourUndefined: Self = StObject.set(x, "is12Hour", js.undefined)
        
        @scala.inline
        def setOnChange(value: /* currentDate */ String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      }
    }
    
    type _To = ComponentType[typings.wordpressComponents.dateTimeMod.DateTimePicker.Props]
    
    /* This means you don't have to write `^`, but can instead just say `DateTimePicker.foo` */
    override def _to: ComponentType[typings.wordpressComponents.dateTimeMod.DateTimePicker.Props] = ^
  }
  
  object TimePicker extends Shortcut {
    
    @JSImport("@wordpress/components/date-time", "TimePicker")
    @js.native
    val ^ : ComponentType[typings.wordpressComponents.timeMod.TimePicker.Props] = js.native
    
    type _To = ComponentType[typings.wordpressComponents.timeMod.TimePicker.Props]
    
    /* This means you don't have to write `^`, but can instead just say `TimePicker.foo` */
    override def _to: ComponentType[typings.wordpressComponents.timeMod.TimePicker.Props] = ^
  }
}
