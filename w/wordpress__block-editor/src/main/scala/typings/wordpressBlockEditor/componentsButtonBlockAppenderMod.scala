package typings.wordpressBlockEditor

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressBlockEditor.componentsButtonBlockAppenderMod.ButtonBlockAppender.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsButtonBlockAppenderMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/block-editor/components/button-block-appender", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object ButtonBlockAppender {
    
    trait Props extends StObject {
      
      var children: js.UndefOr[scala.Nothing] = js.undefined
      
      var className: js.UndefOr[String] = js.undefined
      
      /**
        * The `clientId` of the Block from who's root new Blocks should be inserted. This prop is
        * required by the block `Inserter` component. Typically this is the `clientID` of the Block
        * where the prop is being rendered.
        */
      var rootClientId: String
    }
    object Props {
      
      inline def apply(rootClientId: String): Props = {
        val __obj = js.Dynamic.literal(rootClientId = rootClientId.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        inline def setRootClientId(value: String): Self = StObject.set(x, "rootClientId", value.asInstanceOf[js.Any])
      }
    }
  }
}
