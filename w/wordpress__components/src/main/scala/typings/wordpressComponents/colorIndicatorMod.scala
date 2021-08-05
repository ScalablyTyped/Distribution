package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.HTMLProps
import typings.std.HTMLSpanElement
import typings.wordpressComponents.colorIndicatorMod.ColorIndicator.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorIndicatorMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/color-indicator", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object ColorIndicator {
    
    trait Props
      extends StObject
         with HTMLProps[HTMLSpanElement] {
      
      /**
        * A string color value.
        */
      var colorValue: String
    }
    object Props {
      
      inline def apply(colorValue: String): Props = {
        val __obj = js.Dynamic.literal(colorValue = colorValue.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setColorValue(value: String): Self = StObject.set(x, "colorValue", value.asInstanceOf[js.Any])
      }
    }
  }
}
