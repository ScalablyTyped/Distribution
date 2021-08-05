package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VariableUsage extends StObject {
  
  var node: Variable
  
  var `type`: GraphQLInputType
}
object VariableUsage {
  
  inline def apply(node: Variable, `type`: GraphQLInputType): VariableUsage = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableUsage]
  }
  
  extension [Self <: VariableUsage](x: Self) {
    
    inline def setNode(value: Variable): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setType(value: GraphQLInputType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
