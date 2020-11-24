package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlowLabel
  extends FlowNodeBase
     with FlowNode {
  
  var antecedents: js.UndefOr[js.Array[FlowNode]] = js.native
}
object FlowLabel {
  
  @scala.inline
  def apply(flags: FlowFlags): FlowLabel = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowLabel]
  }
  
  @scala.inline
  implicit class FlowLabelOps[Self <: FlowLabel] (val x: Self) extends AnyVal {
    
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
    def setAntecedentsVarargs(value: FlowNode*): Self = this.set("antecedents", js.Array(value :_*))
    
    @scala.inline
    def setAntecedents(value: js.Array[FlowNode]): Self = this.set("antecedents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAntecedents: Self = this.set("antecedents", js.undefined)
  }
}
