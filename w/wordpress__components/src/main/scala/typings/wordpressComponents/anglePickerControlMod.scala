package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressComponents.anglePickerControlMod.AnglePickerControl.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anglePickerControlMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/angle-picker-control", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object AnglePickerControl {
    
    trait Props extends StObject {
      
      /**
        * Label to use for the angle picker. If not set the a translated label "Angle" is used.
        */
      var label: js.UndefOr[String] = js.undefined
      
      /**
        * A function that receives the new value of the input.
        */
      def onChange(value: Double): Unit
      
      /**
        * The current value of the input. The value represents an angle in degrees and should be a value between 0 and 360.
        */
      var value: Double
    }
    object Props {
      
      inline def apply(onChange: Double => Unit, value: Double): Props = {
        val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        
        inline def setOnChange(value: Double => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
        
        inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
  }
}
