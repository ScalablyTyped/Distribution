package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlowSwitchClause
  extends FlowNodeBase
     with FlowNode {
  var antecedent: FlowNode = js.native
  var clauseEnd: Double = js.native
  var clauseStart: Double = js.native
  var switchStatement: SwitchStatement = js.native
}

object FlowSwitchClause {
  @scala.inline
  def apply(
    antecedent: FlowNode,
    clauseEnd: Double,
    clauseStart: Double,
    flags: FlowFlags,
    switchStatement: SwitchStatement
  ): FlowSwitchClause = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], clauseEnd = clauseEnd.asInstanceOf[js.Any], clauseStart = clauseStart.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], switchStatement = switchStatement.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowSwitchClause]
  }
  @scala.inline
  implicit class FlowSwitchClauseOps[Self <: FlowSwitchClause] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAntecedent(value: FlowNode): Self = this.set("antecedent", value.asInstanceOf[js.Any])
    @scala.inline
    def setClauseEnd(value: Double): Self = this.set("clauseEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setClauseStart(value: Double): Self = this.set("clauseStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwitchStatement(value: SwitchStatement): Self = this.set("switchStatement", value.asInstanceOf[js.Any])
  }
  
}

