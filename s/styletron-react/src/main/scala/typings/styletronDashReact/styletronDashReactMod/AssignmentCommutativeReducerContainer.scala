package typings.styletronDashReact.styletronDashReactMod

import typings.styletronDashReact.styletronDashReactNumbers.`true`
import typings.styletronDashStandard.styletronDashStandardMod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssignmentCommutativeReducerContainer extends ReducerContainer {
  var assignmentCommutative: `true`
  var reducer: Reducer
  var style: StyleObject
  def factory(style: StyleObject): AssignmentCommutativeReducerContainer
}

object AssignmentCommutativeReducerContainer {
  @scala.inline
  def apply(
    assignmentCommutative: `true`,
    factory: StyleObject => AssignmentCommutativeReducerContainer,
    reducer: (/* style */ StyleObject, /* props */ js.UndefOr[js.Object]) => StyleObject,
    style: StyleObject
  ): AssignmentCommutativeReducerContainer = {
    val __obj = js.Dynamic.literal(assignmentCommutative = assignmentCommutative, factory = js.Any.fromFunction1(factory), reducer = js.Any.fromFunction2(reducer), style = style)
  
    __obj.asInstanceOf[AssignmentCommutativeReducerContainer]
  }
}

