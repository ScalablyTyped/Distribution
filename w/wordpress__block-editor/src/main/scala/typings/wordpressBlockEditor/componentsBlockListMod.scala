package typings.wordpressBlockEditor

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.wordpressBlockEditor.componentsBlockListMod.BlockList.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsBlockListMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/block-editor/components/block-list", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object BlockList {
    
    trait Props extends StObject {
      
      var className: js.UndefOr[String] = js.undefined
      
      /**
        * A 'render prop' function that can be used to customize the block's appender.
        */
      var renderAppender: js.UndefOr[js.Function0[Element]] = js.undefined
      
      var rootClientId: js.UndefOr[String] = js.undefined
    }
    object Props {
      
      inline def apply(): Props = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        inline def setRenderAppender(value: () => Element): Self = StObject.set(x, "renderAppender", js.Any.fromFunction0(value))
        
        inline def setRenderAppenderUndefined: Self = StObject.set(x, "renderAppender", js.undefined)
        
        inline def setRootClientId(value: String): Self = StObject.set(x, "rootClientId", value.asInstanceOf[js.Any])
        
        inline def setRootClientIdUndefined: Self = StObject.set(x, "rootClientId", js.undefined)
      }
    }
  }
}
