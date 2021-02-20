package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VariableUsage extends StObject {
  
  var node: Variable = js.native
  
  var `type`: GraphQLInputType = js.native
}
object VariableUsage {
  
  @scala.inline
  def apply(node: Variable, `type`: GraphQLInputType): VariableUsage = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableUsage]
  }
  
  @scala.inline
  implicit class VariableUsageMutableBuilder[Self <: VariableUsage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNode(value: Variable): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: GraphQLInputType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
