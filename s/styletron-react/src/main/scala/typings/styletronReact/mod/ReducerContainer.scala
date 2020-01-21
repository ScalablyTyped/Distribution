package typings.styletronReact.mod

import typings.styletronReact.styletronReactBooleans.`false`
import typings.styletronReact.styletronReactBooleans.`true`
import typings.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.styletronReact.mod.AssignmentCommutativeReducerContainer
  - typings.styletronReact.mod.NonAssignmentCommutativeReducerContainer
*/
trait ReducerContainer extends js.Object

object ReducerContainer {
  @scala.inline
  def AssignmentCommutativeReducerContainer(
    assignmentCommutative: `true`,
    factory: StyleObject => typings.styletronReact.mod.AssignmentCommutativeReducerContainer,
    reducer: (/* style */ StyleObject, /* props */ js.UndefOr[js.Object]) => StyleObject,
    style: StyleObject
  ): ReducerContainer = {
    val __obj = js.Dynamic.literal(assignmentCommutative = assignmentCommutative.asInstanceOf[js.Any], factory = js.Any.fromFunction1(factory), reducer = js.Any.fromFunction2(reducer), style = style.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReducerContainer]
  }
  @scala.inline
  def NonAssignmentCommutativeReducerContainer(
    assignmentCommutative: `false`,
    reducer: (/* style */ StyleObject, /* props */ js.UndefOr[js.Object]) => StyleObject
  ): ReducerContainer = {
    val __obj = js.Dynamic.literal(assignmentCommutative = assignmentCommutative.asInstanceOf[js.Any], reducer = js.Any.fromFunction2(reducer))
  
    __obj.asInstanceOf[ReducerContainer]
  }
}

