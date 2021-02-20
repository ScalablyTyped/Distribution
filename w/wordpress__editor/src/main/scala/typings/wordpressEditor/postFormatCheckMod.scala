package typings.wordpressEditor

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.wordpressEditor.postFormatCheckMod.PostFormatCheck.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postFormatCheckMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/editor/components/post-format/check", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object PostFormatCheck {
    
    @js.native
    trait Props extends StObject {
      
      var children: ReactNode = js.native
      
      var supportKeys: js.UndefOr[String | js.Array[String]] = js.native
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
        def setSupportKeys(value: String | js.Array[String]): Self = StObject.set(x, "supportKeys", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSupportKeysUndefined: Self = StObject.set(x, "supportKeys", js.undefined)
        
        @scala.inline
        def setSupportKeysVarargs(value: String*): Self = StObject.set(x, "supportKeys", js.Array(value :_*))
      }
    }
  }
}
