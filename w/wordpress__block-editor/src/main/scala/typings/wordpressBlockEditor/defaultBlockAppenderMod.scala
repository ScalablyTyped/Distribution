package typings.wordpressBlockEditor

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressBlockEditor.defaultBlockAppenderMod.DefaultBlockAppender.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultBlockAppenderMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/block-editor/components/default-block-appender", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object DefaultBlockAppender {
    
    trait Props extends StObject {
      
      var lastBlockClientId: String
      
      var rootClientId: String
    }
    object Props {
      
      inline def apply(lastBlockClientId: String, rootClientId: String): Props = {
        val __obj = js.Dynamic.literal(lastBlockClientId = lastBlockClientId.asInstanceOf[js.Any], rootClientId = rootClientId.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setLastBlockClientId(value: String): Self = StObject.set(x, "lastBlockClientId", value.asInstanceOf[js.Any])
        
        inline def setRootClientId(value: String): Self = StObject.set(x, "rootClientId", value.asInstanceOf[js.Any])
      }
    }
  }
}
