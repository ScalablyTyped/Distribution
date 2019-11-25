package typings.styletronDashReact.styletronDashReactMod

import typings.styletronDashReact.styletronDashReactNumbers.`false`
import typings.styletronDashStandard.styletronDashStandardMod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonAssignmentCommutativeReducerContainer extends ReducerContainer {
  var assignmentCommutative: `false`
  var reducer: Reducer
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
}

