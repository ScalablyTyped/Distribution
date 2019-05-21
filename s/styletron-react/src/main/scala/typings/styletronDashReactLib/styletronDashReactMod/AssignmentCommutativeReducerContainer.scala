package typings
package styletronDashReactLib.styletronDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssignmentCommutativeReducerContainer extends ReducerContainer {
  var assignmentCommutative: styletronDashReactLib.styletronDashReactLibNumbers.`true`
  var reducer: Reducer
  var style: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  def factory(style: styletronDashStandardLib.styletronDashStandardMod.StyleObject): AssignmentCommutativeReducerContainer
}

object AssignmentCommutativeReducerContainer {
  @scala.inline
  def apply(
    assignmentCommutative: styletronDashReactLib.styletronDashReactLibNumbers.`true`,
    factory: styletronDashStandardLib.styletronDashStandardMod.StyleObject => AssignmentCommutativeReducerContainer,
    reducer: Reducer,
    style: styletronDashStandardLib.styletronDashStandardMod.StyleObject
  ): AssignmentCommutativeReducerContainer = {
    val __obj = js.Dynamic.literal(assignmentCommutative = assignmentCommutative, factory = js.Any.fromFunction1(factory), reducer = reducer, style = style)
  
    __obj.asInstanceOf[AssignmentCommutativeReducerContainer]
  }
}

