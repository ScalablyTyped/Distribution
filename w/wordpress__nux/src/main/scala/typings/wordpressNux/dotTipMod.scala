package typings.wordpressNux

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.wordpressNux.dotTipMod.DotTip.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dotTipMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/nux/components/dot-tip", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object DotTip {
    
    @js.native
    trait Props extends StObject {
      
      /**
        * Any React element or elements can be passed as children. They will be rendered within the
        * tip bubble.
        */
      var children: ReactNode = js.native
      
      /**
        * A string that uniquely identifies the tip. Identifiers should be prefixed with the name
        * of the plugin, followed by a `/`. For example, `acme/add-to-cart`.
        */
      var tipId: String = js.native
    }
    object Props {
      
      @scala.inline
      def apply(tipId: String): Props = {
        val __obj = js.Dynamic.literal(tipId = tipId.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        @scala.inline
        def setTipId(value: String): Self = StObject.set(x, "tipId", value.asInstanceOf[js.Any])
      }
    }
  }
}
