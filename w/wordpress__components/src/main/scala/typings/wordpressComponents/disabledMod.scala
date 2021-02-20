package typings.wordpressComponents

import typings.react.mod.Consumer
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.wordpressComponents.disabledMod.Disabled.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object disabledMod {
  
  object default {
    
    @JSImport("@wordpress/components/disabled", JSImport.Default)
    @js.native
    def apply(props: Props): Element = js.native
    @JSImport("@wordpress/components/disabled", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/components/disabled", "default.Consumer")
    @js.native
    def Consumer: typings.react.mod.Consumer[Boolean] = js.native
    @scala.inline
    def Consumer_=(x: Consumer[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Consumer")(x.asInstanceOf[js.Any])
  }
  
  object Disabled {
    
    @js.native
    trait Props extends StObject {
      
      var children: ReactNode = js.native
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
      }
    }
  }
}
