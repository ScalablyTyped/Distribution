package typings.wordpressComponents

import typings.react.mod.global.JSX.Element
import typings.wordpressComponents.baseControlMod.BaseControl.ControlProps
import typings.wordpressComponents.radioControlMod.RadioControl.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioControlMod {
  
  object default {
    
    // tslint:disable-next-line:no-unnecessary-generics
    inline def apply[T](props: Props[T]): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@wordpress/components/radio-control", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
  
  object RadioControl {
    
    trait Option[T] extends StObject {
      
      /**
        * The label to be shown to the user.
        */
      var label: String
      
      /**
        * The internal value compared against select and passed to `onChange`.
        */
      var value: T
    }
    object Option {
      
      inline def apply[T](label: String, value: T): Option[T] = {
        val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[Option[T]]
      }
      
      extension [Self <: Option[?], T](x: Self & Option[T]) {
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Props[T]
      extends StObject
         with ControlProps {
      
      /**
        * A function that receives the value of the new option that is being
        * selected as input.
        */
      def onChange(): Unit = js.native
      def onChange(value: T): Unit = js.native
      
      var options: js.UndefOr[js.Array[Option[T]]] = js.native
      
      /**
        * The value property of the currently selected option.
        */
      var selected: js.UndefOr[T] = js.native
    }
  }
}
