package typings.wordpressComponents

import typings.react.mod.ReactNode
import typings.react.mod.ReactPortal
import typings.wordpressComponents.slotFillFillMod.Fill.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slotFillFillMod {
  
  object default {
    
    inline def apply(props: Props): ReactPortal = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactPortal]
    
    @JSImport("@wordpress/components/slot-fill/fill", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
  
  object Fill {
    
    trait Props extends StObject {
      
      var children: js.UndefOr[ReactNode] = js.undefined
      
      /**
        * Both `Slot` and `Fill` accept a `name` string prop, where a `Slot`
        * with a given `name` will render the `children` of any associated
        * `Fill`s.
        */
      var name: js.UndefOr[String] = js.undefined
    }
    object Props {
      
      inline def apply(): Props = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
  }
}
