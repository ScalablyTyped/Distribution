package typings.tsutils.controlFlowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ControlFlowEnd extends js.Object {
  
  val end: Boolean = js.native
  
  val statements: js.Array[ControlFlowStatement] = js.native
}
object ControlFlowEnd {
  
  @scala.inline
  def apply(end: Boolean, statements: js.Array[ControlFlowStatement]): ControlFlowEnd = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlFlowEnd]
  }
  
  @scala.inline
  implicit class ControlFlowEndOps[Self <: ControlFlowEnd] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: Boolean): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementsVarargs(value: ControlFlowStatement*): Self = this.set("statements", js.Array(value :_*))
    
    @scala.inline
    def setStatements(value: js.Array[ControlFlowStatement]): Self = this.set("statements", value.asInstanceOf[js.Any])
  }
}
