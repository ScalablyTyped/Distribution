package typings.typescript.mod

import org.scalablytyped.runtime.StObject
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
  implicit class FlowLabelMutableBuilder[Self <: FlowLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAntecedents(value: js.Array[FlowNode]): Self = StObject.set(x, "antecedents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAntecedentsUndefined: Self = StObject.set(x, "antecedents", js.undefined)
    
    @scala.inline
    def setAntecedentsVarargs(value: FlowNode*): Self = StObject.set(x, "antecedents", js.Array(value :_*))
  }
}
