package typings.wordpressBlockEditor

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressBlockEditor.componentsBlockSettingsMenuMod.BlockSettingsMenu.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsBlockSettingsMenuMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/block-editor/components/block-settings-menu", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object BlockSettingsMenu {
    
    trait Props extends StObject {
      
      var children: js.UndefOr[scala.Nothing] = js.undefined
      
      var clientIds: js.Array[String]
    }
    object Props {
      
      inline def apply(clientIds: js.Array[String]): Props = {
        val __obj = js.Dynamic.literal(clientIds = clientIds.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setClientIds(value: js.Array[String]): Self = StObject.set(x, "clientIds", value.asInstanceOf[js.Any])
        
        inline def setClientIdsVarargs(value: String*): Self = StObject.set(x, "clientIds", js.Array(value*))
      }
    }
  }
}
