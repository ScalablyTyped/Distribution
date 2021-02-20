package typings.wordpressComponents

import typings.react.mod.global.JSX.Element
import typings.wordpressComponents.anon.Multiple
import typings.wordpressComponents.anon.OmitHTMLPropsHTMLSelectEl
import typings.wordpressComponents.anon.OnChange
import typings.wordpressComponents.anon.`1`
import typings.wordpressComponents.baseControlMod.BaseControl.ControlProps
import typings.wordpressComponents.selectControlMod.SelectControl.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectControlMod {
  
  object default {
    
    @JSImport("@wordpress/components/select-control", JSImport.Default)
    @js.native
    def apply[T /* <: String | js.Array[String] */](// tslint:disable-next-line:no-unnecessary-generics
    props: Props[T]): Element = js.native
  }
  
  object SelectControl {
    
    @js.native
    trait Option extends StObject {
      
      /**
        * The label to be shown to the user.
        */
      var label: String = js.native
      
      /**
        * The internal value used to choose the selected value. This is also
        * the value passed to `onChange` when the option is selected.
        */
      var value: String = js.native
    }
    object Option {
      
      @scala.inline
      def apply(label: String, value: String): Option = {
        val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[Option]
      }
      
      @scala.inline
      implicit class OptionMutableBuilder[Self <: Option] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    type Props[T /* <: String | js.Array[String] */] = OmitHTMLPropsHTMLSelectEl with ControlProps with OnChange[T] with (`1` | Multiple)
  }
}
