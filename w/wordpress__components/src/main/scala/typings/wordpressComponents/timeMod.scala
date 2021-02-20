package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressComponents.timeMod.TimePicker.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/date-time/time", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object TimePicker {
    
    @js.native
    trait Props extends StObject {
      
      /**
        * Date string to use as current time. If not set, current time is used.
        */
      var currentTime: js.UndefOr[String] = js.native
      
      /**
        * Whether we use a 12-hour clock. With a 12-hour clock, an AM/PM
        * widget is displayed and the time format is assumed to be MM-DD-YYYY.
        */
      var is12Hour: js.UndefOr[Boolean] = js.native
      
      /**
        * Function to call when the time value changes.
        */
      def onChange(time: String): Unit = js.native
    }
    object Props {
      
      @scala.inline
      def apply(onChange: String => Unit): Props = {
        val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCurrentTime(value: String): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCurrentTimeUndefined: Self = StObject.set(x, "currentTime", js.undefined)
        
        @scala.inline
        def setIs12Hour(value: Boolean): Self = StObject.set(x, "is12Hour", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIs12HourUndefined: Self = StObject.set(x, "is12Hour", js.undefined)
        
        @scala.inline
        def setOnChange(value: String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      }
    }
  }
}
