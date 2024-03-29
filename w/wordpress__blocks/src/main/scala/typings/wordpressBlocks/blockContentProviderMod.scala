package typings.wordpressBlocks

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.wordpressBlocks.blockContentProviderMod.BlockContentProvider.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blockContentProviderMod {
  
  @JSImport("@wordpress/blocks/block-content-provider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/blocks/block-content-provider", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  inline def withBlockContentContext[T /* <: ComponentType[Any] */](OriginalComponent: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("withBlockContentContext")(OriginalComponent.asInstanceOf[js.Any]).asInstanceOf[T]
  
  object BlockContentProvider {
    
    trait Props extends StObject {
      
      var children: ReactNode
      
      var innerBlocks: js.Array[BlockInstance[StringDictionary[Any]]]
    }
    object Props {
      
      inline def apply(innerBlocks: js.Array[BlockInstance[StringDictionary[Any]]]): Props = {
        val __obj = js.Dynamic.literal(innerBlocks = innerBlocks.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        inline def setInnerBlocks(value: js.Array[BlockInstance[StringDictionary[Any]]]): Self = StObject.set(x, "innerBlocks", value.asInstanceOf[js.Any])
        
        inline def setInnerBlocksVarargs(value: BlockInstance[StringDictionary[Any]]*): Self = StObject.set(x, "innerBlocks", js.Array(value*))
      }
    }
  }
}
