package typings.wordpressBlocks

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.std.Omit
import typings.wordpressBlocks.blockContentProviderMod.BlockContentProvider.Props
import typings.wordpressBlocks.mod.BlockInstance
import typings.wordpressBlocks.wordpressBlocksStrings.BlockContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blockContentProviderMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/blocks/block-content-provider", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  @JSImport("@wordpress/blocks/block-content-provider", "withBlockContentContext")
  @js.native
  def withBlockContentContext[T /* <: ComponentType[_] */](wrapped: T): ComponentType[Omit[_, BlockContent]] = js.native
  
  object BlockContentProvider {
    
    @js.native
    trait Props extends StObject {
      
      var children: ReactNode = js.native
      
      var innerBlocks: js.Array[BlockInstance[StringDictionary[_]]] = js.native
    }
    object Props {
      
      @scala.inline
      def apply(innerBlocks: js.Array[BlockInstance[StringDictionary[_]]]): Props = {
        val __obj = js.Dynamic.literal(innerBlocks = innerBlocks.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        @scala.inline
        def setInnerBlocks(value: js.Array[BlockInstance[StringDictionary[_]]]): Self = StObject.set(x, "innerBlocks", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInnerBlocksVarargs(value: BlockInstance[StringDictionary[js.Any]]*): Self = StObject.set(x, "innerBlocks", js.Array(value :_*))
      }
    }
  }
}
