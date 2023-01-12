package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressComponents.treeSelectMod.TreeSelect.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    - Dropped {[ P in std.Exclude<keyof @wordpress/components.@wordpress/components/select-control.SelectControl.Props<string>, 'options' | 'value'> ]: @wordpress/components.@wordpress/components/select-control.SelectControl.Props<string>[P]} */ trait Props extends StObject {
      
      /**
        * If this property is added, an option will be added with this label
        * to represent empty selection.
        */
      var noOptionLabel: js.UndefOr[String] = js.undefined
      
      var selectedId: js.UndefOr[String] = js.undefined
      
      /**
        * A `Tree` with the possible nodes the user can select.
        */
      var tree: js.UndefOr[Tree] = js.undefined
    }
    object Props {
      
      inline def apply(): Props = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        inline def setNoOptionLabel(value: String): Self = StObject.set(x, "noOptionLabel", value.asInstanceOf[js.Any])
        
        inline def setNoOptionLabelUndefined: Self = StObject.set(x, "noOptionLabel", js.undefined)
        
        inline def setSelectedId(value: String): Self = StObject.set(x, "selectedId", value.asInstanceOf[js.Any])
        
        inline def setSelectedIdUndefined: Self = StObject.set(x, "selectedId", js.undefined)
        
        inline def setTree(value: Tree): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
        
        inline def setTreeUndefined: Self = StObject.set(x, "tree", js.undefined)
        
        inline def setTreeVarargs(value: TreeNode*): Self = StObject.set(x, "tree", js.Array(value*))
      }
    }
    
    type Tree = js.Array[TreeNode]
    
    trait TreeNode extends StObject {
      
      var children: js.UndefOr[js.Array[TreeNode]] = js.undefined
      
      /**
        * Unique identifier for tree node.
        */
      var id: String
      
      /**
        * Human readable name for the tree node.
        */
      var name: String
    }
    object TreeNode {
      
      inline def apply(id: String, name: String): TreeNode = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[TreeNode]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: TreeNode] (val x: Self) extends AnyVal {
        
        inline def setChildren(value: js.Array[TreeNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        inline def setChildrenVarargs(value: TreeNode*): Self = StObject.set(x, "children", js.Array(value*))
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
  }
}
