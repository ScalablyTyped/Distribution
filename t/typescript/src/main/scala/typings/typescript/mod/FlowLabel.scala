package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlowLabel
  extends StObject
     with FlowNodeBase {
  
  var antecedents: js.UndefOr[js.Array[FlowNode]] = js.undefined
}
object FlowLabel {
  
  inline def apply(flags: FlowFlags): FlowLabel = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowLabel]
  }
  
  extension [Self <: FlowLabel](x: Self) {
    
    inline def setAntecedents(value: js.Array[FlowNode]): Self = StObject.set(x, "antecedents", value.asInstanceOf[js.Any])
    
    inline def setAntecedentsUndefined: Self = StObject.set(x, "antecedents", js.undefined)
    
    inline def setAntecedentsVarargs(value: FlowNode*): Self = StObject.set(x, "antecedents", js.Array(value*))
  }
}
