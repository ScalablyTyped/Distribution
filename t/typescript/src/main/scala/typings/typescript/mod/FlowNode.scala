package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.typescript.mod.FlowStart
  - typings.typescript.mod.FlowLabel
  - typings.typescript.mod.FlowAssignment
  - typings.typescript.mod.FlowCall
  - typings.typescript.mod.FlowCondition
  - typings.typescript.mod.FlowSwitchClause
  - typings.typescript.mod.FlowArrayMutation
  - typings.typescript.mod.FlowReduceLabel
*/
trait FlowNode extends js.Object
object FlowNode {
  
  @scala.inline
  def FlowCall(antecedent: FlowNode, flags: FlowFlags, node: CallExpression): FlowNode = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowNode]
  }
  
  @scala.inline
  def FlowAssignment(antecedent: FlowNode, flags: FlowFlags, node: Expression | VariableDeclaration | BindingElement): FlowNode = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowNode]
  }
  
  @scala.inline
  def FlowArrayMutation(antecedent: FlowNode, flags: FlowFlags, node: CallExpression | BinaryExpression): FlowNode = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowNode]
  }
  
  @scala.inline
  def FlowCondition(antecedent: FlowNode, flags: FlowFlags, node: Expression): FlowNode = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowNode]
  }
  
  @scala.inline
  def FlowSwitchClause(
    antecedent: FlowNode,
    clauseEnd: Double,
    clauseStart: Double,
    flags: FlowFlags,
    switchStatement: SwitchStatement
  ): FlowNode = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], clauseEnd = clauseEnd.asInstanceOf[js.Any], clauseStart = clauseStart.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], switchStatement = switchStatement.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowNode]
  }
  
  @scala.inline
  def FlowStart(flags: FlowFlags): FlowNode = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowNode]
  }
  
  @scala.inline
  def FlowLabel(flags: FlowFlags): FlowNode = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowNode]
  }
  
  @scala.inline
  def FlowReduceLabel(antecedent: FlowNode, antecedents: js.Array[FlowNode], flags: FlowFlags, target: FlowLabel): FlowNode = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], antecedents = antecedents.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowNode]
  }
}
