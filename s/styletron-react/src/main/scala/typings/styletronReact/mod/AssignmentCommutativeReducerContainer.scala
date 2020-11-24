package typings.styletronReact.mod

import typings.styletronReact.styletronReactBooleans.`true`
import typings.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssignmentCommutativeReducerContainer extends ReducerContainer {
  
  var assignmentCommutative: `true` = js.native
  
  def factory(style: StyleObject): AssignmentCommutativeReducerContainer = js.native
  
  var reducer: Reducer = js.native
  
  var style: StyleObject = js.native
}
object AssignmentCommutativeReducerContainer {
  
  @scala.inline
  def apply(
    assignmentCommutative: `true`,
    factory: StyleObject => AssignmentCommutativeReducerContainer,
    reducer: (/* style */ StyleObject, /* props */ js.UndefOr[js.Object]) => StyleObject,
    style: StyleObject
  ): AssignmentCommutativeReducerContainer = {
    val __obj = js.Dynamic.literal(assignmentCommutative = assignmentCommutative.asInstanceOf[js.Any], factory = js.Any.fromFunction1(factory), reducer = js.Any.fromFunction2(reducer), style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignmentCommutativeReducerContainer]
  }
  
  @scala.inline
  implicit class AssignmentCommutativeReducerContainerOps[Self <: AssignmentCommutativeReducerContainer] (val x: Self) extends AnyVal {
    
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
    def setAssignmentCommutative(value: `true`): Self = this.set("assignmentCommutative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFactory(value: StyleObject => AssignmentCommutativeReducerContainer): Self = this.set("factory", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReducer(value: (/* style */ StyleObject, /* props */ js.UndefOr[js.Object]) => StyleObject): Self = this.set("reducer", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStyle(value: StyleObject): Self = this.set("style", value.asInstanceOf[js.Any])
  }
}
