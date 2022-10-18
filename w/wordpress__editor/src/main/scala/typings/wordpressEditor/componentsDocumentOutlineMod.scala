package typings.wordpressEditor

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressEditor.componentsDocumentOutlineMod.DocumentOutline.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsDocumentOutlineMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/editor/components/document-outline", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object DocumentOutline {
    
    trait Props extends StObject {
      
      var children: js.UndefOr[scala.Nothing] = js.undefined
      
      var hasOutlineItemsDisabled: js.UndefOr[Boolean] = js.undefined
      
      def onSelect(): Unit
    }
    object Props {
      
      inline def apply(onSelect: () => Unit): Props = {
        val __obj = js.Dynamic.literal(onSelect = js.Any.fromFunction0(onSelect))
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setHasOutlineItemsDisabled(value: Boolean): Self = StObject.set(x, "hasOutlineItemsDisabled", value.asInstanceOf[js.Any])
        
        inline def setHasOutlineItemsDisabledUndefined: Self = StObject.set(x, "hasOutlineItemsDisabled", js.undefined)
        
        inline def setOnSelect(value: () => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction0(value))
      }
    }
  }
}
