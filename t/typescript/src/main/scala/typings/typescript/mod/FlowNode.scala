package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.typescript.mod.FlowStart
  - typings.typescript.mod.FlowLabel
  - typings.typescript.mod.FlowAssignment
  - typings.typescript.mod.FlowCondition
  - typings.typescript.mod.FlowSwitchClause
  - typings.typescript.mod.FlowArrayMutation
  - typings.typescript.mod.FlowCall
  - typings.typescript.mod.FlowReduceLabel
*/
trait FlowNode extends StObject
object FlowNode {
  
  inline def FlowArrayMutation(antecedent: FlowNode, flags: FlowFlags, node: CallExpression | BinaryExpression): typings.typescript.mod.FlowArrayMutation = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescript.mod.FlowArrayMutation]
  }
  
  inline def FlowAssignment(antecedent: FlowNode, flags: FlowFlags, node: Expression | VariableDeclaration | BindingElement): typings.typescript.mod.FlowAssignment = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescript.mod.FlowAssignment]
  }
  
  inline def FlowCall(antecedent: FlowNode, flags: FlowFlags, node: CallExpression): typings.typescript.mod.FlowCall = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescript.mod.FlowCall]
  }
  
  inline def FlowCondition(antecedent: FlowNode, flags: FlowFlags, node: Expression): typings.typescript.mod.FlowCondition = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescript.mod.FlowCondition]
  }
  
  inline def FlowLabel(flags: FlowFlags): typings.typescript.mod.FlowLabel = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescript.mod.FlowLabel]
  }
  
  inline def FlowReduceLabel(antecedent: FlowNode, antecedents: js.Array[FlowNode], flags: FlowFlags, target: FlowLabel): typings.typescript.mod.FlowReduceLabel = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], antecedents = antecedents.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescript.mod.FlowReduceLabel]
  }
  
  inline def FlowStart(flags: FlowFlags): typings.typescript.mod.FlowStart = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescript.mod.FlowStart]
  }
  
  inline def FlowSwitchClause(
    antecedent: FlowNode,
    clauseEnd: Double,
    clauseStart: Double,
    flags: FlowFlags,
    switchStatement: SwitchStatement
  ): typings.typescript.mod.FlowSwitchClause = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], clauseEnd = clauseEnd.asInstanceOf[js.Any], clauseStart = clauseStart.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], switchStatement = switchStatement.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescript.mod.FlowSwitchClause]
  }
}
