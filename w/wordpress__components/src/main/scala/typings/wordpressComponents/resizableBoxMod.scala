package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.reResizable.mod.ResizableProps
import typings.react.mod.ComponentType
import typings.wordpressComponents.resizableBoxMod.ResizableBox.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resizableBoxMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/resizable-box", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object ResizableBox {
    
    trait Props
      extends StObject
         with ResizableProps {
      
      var showHandle: js.UndefOr[Boolean] = js.undefined
    }
    object Props {
      
      inline def apply(): Props = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        inline def setShowHandle(value: Boolean): Self = StObject.set(x, "showHandle", value.asInstanceOf[js.Any])
        
        inline def setShowHandleUndefined: Self = StObject.set(x, "showHandle", js.undefined)
      }
    }
  }
}
