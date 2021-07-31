package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VariableDefinition
  extends StObject
     with Node {
  
  var defaultValue: js.UndefOr[Value] = js.undefined
  
  var kind: String
  
  var loc: js.UndefOr[Location] = js.undefined
  
  var `type`: Type
  
  var variable: Variable
}
object VariableDefinition {
  
  @scala.inline
  def apply(kind: String, `type`: Type, variable: Variable): VariableDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableDefinition]
  }
  
  @scala.inline
  implicit class VariableDefinitionMutableBuilder[Self <: VariableDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: Value): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: Location): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariable(value: Variable): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
  }
}
