package typings.wordpressBlockEditor

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.wordpressBlockEditor.checkMod.MediaUploadCheck.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/block-editor/components/media-upload/check", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object MediaUploadCheck {
    
    trait Props extends StObject {
      
      var children: ReactNode
      
      var fallback: js.UndefOr[ReactNode] = js.undefined
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
        def setFallback(value: ReactNode): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      }
    }
  }
}
