package typings.wordpressBlocks

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.wordpressBlocks.blockContentProviderMod.BlockContentProvider.Props
import typings.wordpressBlocks.mod.BlockInstance
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
  
  inline def withBlockContentContext[T /* <: ComponentType[Any] */](wrapped: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends react.react.ComponentType<infer U> ? react.react.ComponentType<std.Omit<U, 'BlockContent'>> : never */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withBlockContentContext")(wrapped.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends react.react.ComponentType<infer U> ? react.react.ComponentType<std.Omit<U, 'BlockContent'>> : never */ js.Any]
  
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
      
      extension [Self <: Props](x: Self) {
        
        inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        inline def setInnerBlocks(value: js.Array[BlockInstance[StringDictionary[Any]]]): Self = StObject.set(x, "innerBlocks", value.asInstanceOf[js.Any])
        
        inline def setInnerBlocksVarargs(value: BlockInstance[StringDictionary[Any]]*): Self = StObject.set(x, "innerBlocks", js.Array(value*))
      }
    }
  }
}
