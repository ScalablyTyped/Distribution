package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressComponents.treeSelectMod.TreeSelect.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeSelectMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/tree-select", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object TreeSelect {
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped {[ P in std.Exclude<keyof @wordpress/components.@wordpress/components/select-control.SelectControl.Props<string>, 'options' | 'value'> ]: @wordpress/components.@wordpress/components/select-control.SelectControl.Props<string>[P]} */ @js.native
    trait Props extends StObject {
      
      /**
        * If this property is added, an option will be added with this label
        * to represent empty selection.
        */
      var noOptionLabel: js.UndefOr[String] = js.native
      
      var selectedId: js.UndefOr[String] = js.native
      
      /**
        * A `Tree` with the possible nodes the user can select.
        */
      var tree: js.UndefOr[Tree] = js.native
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
        def setNoOptionLabel(value: String): Self = StObject.set(x, "noOptionLabel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNoOptionLabelUndefined: Self = StObject.set(x, "noOptionLabel", js.undefined)
        
        @scala.inline
        def setSelectedId(value: String): Self = StObject.set(x, "selectedId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelectedIdUndefined: Self = StObject.set(x, "selectedId", js.undefined)
        
        @scala.inline
        def setTree(value: Tree): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTreeUndefined: Self = StObject.set(x, "tree", js.undefined)
        
        @scala.inline
        def setTreeVarargs(value: TreeNode*): Self = StObject.set(x, "tree", js.Array(value :_*))
      }
    }
    
    type Tree = js.Array[TreeNode]
    
    @js.native
    trait TreeNode extends StObject {
      
      var children: js.UndefOr[js.Array[TreeNode]] = js.native
      
      /**
        * Unique identifier for tree node.
        */
      var id: String = js.native
      
      /**
        * Human readable name for the tree node.
        */
      var name: String = js.native
    }
    object TreeNode {
      
      @scala.inline
      def apply(id: String, name: String): TreeNode = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[TreeNode]
      }
      
      @scala.inline
      implicit class TreeNodeMutableBuilder[Self <: TreeNode] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChildren(value: js.Array[TreeNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        @scala.inline
        def setChildrenVarargs(value: TreeNode*): Self = StObject.set(x, "children", js.Array(value :_*))
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
  }
}
