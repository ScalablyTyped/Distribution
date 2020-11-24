package typings.wordpressComponents.treeSelectMod.TreeSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @wordpress/components.@wordpress/components/select-control.SelectControl.Props<string>, 'options' | 'value'> ]: @wordpress/components.@wordpress/components/select-control.SelectControl.Props<string>[P]} */ @js.native
trait Props extends js.Object {
  
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
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNoOptionLabel(value: String): Self = this.set("noOptionLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoOptionLabel: Self = this.set("noOptionLabel", js.undefined)
    
    @scala.inline
    def setSelectedId(value: String): Self = this.set("selectedId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedId: Self = this.set("selectedId", js.undefined)
    
    @scala.inline
    def setTreeVarargs(value: TreeNode*): Self = this.set("tree", js.Array(value :_*))
    
    @scala.inline
    def setTree(value: Tree): Self = this.set("tree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTree: Self = this.set("tree", js.undefined)
  }
}
