package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.typescript.typescriptMod.AfterFinallyFlow
  - typings.typescript.typescriptMod.PreFinallyFlow
  - typings.typescript.typescriptMod.FlowStart
  - typings.typescript.typescriptMod.FlowLabel
  - typings.typescript.typescriptMod.FlowAssignment
  - typings.typescript.typescriptMod.FlowCall
  - typings.typescript.typescriptMod.FlowCondition
  - typings.typescript.typescriptMod.FlowSwitchClause
  - typings.typescript.typescriptMod.FlowArrayMutation
*/
trait FlowNode extends js.Object

object FlowNode {
  @scala.inline
  def FlowArrayMutation(
    antecedent: FlowNode,
    flags: FlowFlags,
    node: CallExpression | BinaryExpression,
    id: Int | Double = null
  ): FlowNode = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowNode]
  }
  @scala.inline
  def FlowStart(
    flags: FlowFlags,
    id: Int | Double = null,
    node: FunctionExpression | ArrowFunction | MethodDeclaration = null
  ): FlowNode = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowNode]
  }
  @scala.inline
  def FlowAssignment(
    antecedent: FlowNode,
    flags: FlowFlags,
    node: Expression | VariableDeclaration | BindingElement,
    id: Int | Double = null
  ): FlowNode = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowNode]
  }
  @scala.inline
  def FlowLabel(flags: FlowFlags, antecedents: js.Array[FlowNode] = null, id: Int | Double = null): FlowNode = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
    if (antecedents != null) __obj.updateDynamic("antecedents")(antecedents.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowNode]
  }
  @scala.inline
  def FlowCall(antecedent: FlowNode, flags: FlowFlags, node: CallExpression, id: Int | Double = null): FlowNode = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowNode]
  }
  @scala.inline
  def FlowSwitchClause(
    antecedent: FlowNode,
    clauseEnd: Double,
    clauseStart: Double,
    flags: FlowFlags,
    switchStatement: SwitchStatement,
    id: Int | Double = null
  ): FlowNode = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], clauseEnd = clauseEnd.asInstanceOf[js.Any], clauseStart = clauseStart.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], switchStatement = switchStatement.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowNode]
  }
  @scala.inline
  def FlowCondition(antecedent: FlowNode, flags: FlowFlags, node: Expression, id: Int | Double = null): FlowNode = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowNode]
  }
  @scala.inline
  def PreFinallyFlow(antecedent: FlowNode, flags: FlowFlags, lock: FlowLock, id: Int | Double = null): FlowNode = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], lock = lock.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowNode]
  }
  @scala.inline
  def AfterFinallyFlow(
    antecedent: FlowNode,
    flags: FlowFlags,
    id: Int | Double = null,
    locked: js.UndefOr[Boolean] = js.undefined
  ): FlowNode = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowNode]
  }
}

