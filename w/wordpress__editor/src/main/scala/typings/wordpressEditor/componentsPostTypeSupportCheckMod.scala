package typings.wordpressEditor

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.wordpressEditor.componentsPostTypeSupportCheckMod.PostTypeSupportCheck.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsPostTypeSupportCheckMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/editor/components/post-type-support-check", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object PostTypeSupportCheck {
    
    trait Props extends StObject {
      
      var children: ReactNode
      
      var supportKeys: String | js.Array[String]
    }
    object Props {
      
      inline def apply(supportKeys: String | js.Array[String]): Props = {
        val __obj = js.Dynamic.literal(supportKeys = supportKeys.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        inline def setSupportKeys(value: String | js.Array[String]): Self = StObject.set(x, "supportKeys", value.asInstanceOf[js.Any])
        
        inline def setSupportKeysVarargs(value: String*): Self = StObject.set(x, "supportKeys", js.Array(value*))
      }
    }
  }
}
