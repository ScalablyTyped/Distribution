package typings.wordpressComponents

import typings.react.mod.ReactNode
import typings.react.mod.ReactPortal
import typings.wordpressComponents.fillMod.Fill.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fillMod {
  
  object default {
    
    @scala.inline
    def apply(props: Props): ReactPortal = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactPortal]
    
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
      
      @scala.inline
      def apply(): Props = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
  }
}
