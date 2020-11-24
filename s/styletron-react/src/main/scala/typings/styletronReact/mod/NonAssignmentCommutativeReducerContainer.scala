package typings.styletronReact.mod

import typings.styletronReact.styletronReactBooleans.`false`
import typings.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NonAssignmentCommutativeReducerContainer extends ReducerContainer {
  
  var assignmentCommutative: `false` = js.native
  
  var reducer: Reducer = js.native
}
object NonAssignmentCommutativeReducerContainer {
  
  @scala.inline
  def apply(
    assignmentCommutative: `false`,
    reducer: (/* style */ StyleObject, /* props */ js.UndefOr[js.Object]) => StyleObject
  ): NonAssignmentCommutativeReducerContainer = {
    val __obj = js.Dynamic.literal(assignmentCommutative = assignmentCommutative.asInstanceOf[js.Any], reducer = js.Any.fromFunction2(reducer))
    __obj.asInstanceOf[NonAssignmentCommutativeReducerContainer]
  }
  
  @scala.inline
  implicit class NonAssignmentCommutativeReducerContainerOps[Self <: NonAssignmentCommutativeReducerContainer] (val x: Self) extends AnyVal {
    
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
    def setAssignmentCommutative(value: `false`): Self = this.set("assignmentCommutative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReducer(value: (/* style */ StyleObject, /* props */ js.UndefOr[js.Object]) => StyleObject): Self = this.set("reducer", js.Any.fromFunction2(value))
  }
}
