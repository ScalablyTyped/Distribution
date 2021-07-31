package typings.wordpressEditor

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.std.Record
import typings.wordpressBlocks.mod.BlockInstance
import typings.wordpressEditor.anon.PartialEditorSettings
import typings.wordpressEditor.providerMod.EditorProvider.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providerMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/editor/components/provider", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object EditorProvider {
    
    trait Props extends StObject {
      
      var blocks: js.UndefOr[js.Array[BlockInstance[StringDictionary[js.Any]]]] = js.undefined
      
      var children: ReactNode
      
      var initialEdits: js.UndefOr[js.Object] = js.undefined
      
      var post: Record[String, js.Any]
      
      var settings: js.UndefOr[PartialEditorSettings] = js.undefined
      
      var useSubRegistry: js.UndefOr[Boolean] = js.undefined
    }
    object Props {
      
      @scala.inline
      def apply(post: Record[String, js.Any]): Props = {
        val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBlocks(value: js.Array[BlockInstance[StringDictionary[js.Any]]]): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBlocksUndefined: Self = StObject.set(x, "blocks", js.undefined)
        
        @scala.inline
        def setBlocksVarargs(value: BlockInstance[StringDictionary[js.Any]]*): Self = StObject.set(x, "blocks", js.Array(value :_*))
        
        @scala.inline
        def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        @scala.inline
        def setInitialEdits(value: js.Object): Self = StObject.set(x, "initialEdits", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInitialEditsUndefined: Self = StObject.set(x, "initialEdits", js.undefined)
        
        @scala.inline
        def setPost(value: Record[String, js.Any]): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSettings(value: PartialEditorSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
        
        @scala.inline
        def setUseSubRegistry(value: Boolean): Self = StObject.set(x, "useSubRegistry", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUseSubRegistryUndefined: Self = StObject.set(x, "useSubRegistry", js.undefined)
      }
    }
  }
}
