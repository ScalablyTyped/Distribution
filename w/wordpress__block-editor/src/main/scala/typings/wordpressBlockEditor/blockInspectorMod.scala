package typings.wordpressBlockEditor

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressBlockEditor.blockInspectorMod.BlockInspector.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blockInspectorMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/block-editor/components/block-inspector", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object BlockInspector {
    
    @js.native
    trait Props extends StObject {
      
      var children: js.UndefOr[scala.Nothing] = js.native
      
      var showNoBlockSelectedMessage: js.UndefOr[Boolean] = js.native
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
        def setShowNoBlockSelectedMessage(value: Boolean): Self = StObject.set(x, "showNoBlockSelectedMessage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShowNoBlockSelectedMessageUndefined: Self = StObject.set(x, "showNoBlockSelectedMessage", js.undefined)
      }
    }
  }
}
