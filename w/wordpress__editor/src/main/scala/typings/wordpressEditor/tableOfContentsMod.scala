package typings.wordpressEditor

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressEditor.tableOfContentsMod.TableOfContents.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableOfContentsMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/editor/components/table-of-contents", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object TableOfContents {
    
    trait Props extends StObject {
      
      var children: js.UndefOr[scala.Nothing] = js.undefined
      
      var hasOutlineItemsDisabled: js.UndefOr[Boolean] = js.undefined
    }
    object Props {
      
      inline def apply(): Props = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setHasOutlineItemsDisabled(value: Boolean): Self = StObject.set(x, "hasOutlineItemsDisabled", value.asInstanceOf[js.Any])
        
        inline def setHasOutlineItemsDisabledUndefined: Self = StObject.set(x, "hasOutlineItemsDisabled", js.undefined)
      }
    }
  }
}
