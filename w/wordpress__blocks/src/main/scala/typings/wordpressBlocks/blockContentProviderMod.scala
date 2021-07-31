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
  
  @scala.inline
  def withBlockContentContext[T /* <: ComponentType[js.Any] */](wrapped: T): ComponentType[Omit[js.Any, BlockContent]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withBlockContentContext")(wrapped.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Omit[js.Any, BlockContent]]]
  
  object BlockContentProvider {
    
    trait Props extends StObject {
      
      var children: ReactNode
      
      var innerBlocks: js.Array[BlockInstance[StringDictionary[js.Any]]]
    }
    object Props {
      
      @scala.inline
      def apply(innerBlocks: js.Array[BlockInstance[StringDictionary[js.Any]]]): Props = {
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
        def setInnerBlocks(value: js.Array[BlockInstance[StringDictionary[js.Any]]]): Self = StObject.set(x, "innerBlocks", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInnerBlocksVarargs(value: BlockInstance[StringDictionary[js.Any]]*): Self = StObject.set(x, "innerBlocks", js.Array(value :_*))
      }
    }
  }
}
