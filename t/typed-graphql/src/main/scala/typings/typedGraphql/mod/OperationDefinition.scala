package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationDefinition
  extends StObject
     with Definition
     with HasSelectionSet
     with Node {
  
  var directives: js.UndefOr[js.Array[Directive]] = js.undefined
  
  var kind: String
  
  var loc: js.UndefOr[Location] = js.undefined
  
  var name: js.UndefOr[Name] = js.undefined
  
  // Note: subscription is an experimental non-spec addition.
  var operation: String
  
  var selectionSet: SelectionSet
  
  var variableDefinitions: js.UndefOr[js.Array[VariableDefinition]] = js.undefined
}
object OperationDefinition {
  
  inline def apply(kind: String, operation: String, selectionSet: SelectionSet): OperationDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationDefinition]
  }
  
  extension [Self <: OperationDefinition](x: Self) {
    
    inline def setDirectives(value: js.Array[Directive]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
    
    inline def setDirectivesUndefined: Self = StObject.set(x, "directives", js.undefined)
    
    inline def setDirectivesVarargs(value: Directive*): Self = StObject.set(x, "directives", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setLoc(value: Location): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setSelectionSet(value: SelectionSet): Self = StObject.set(x, "selectionSet", value.asInstanceOf[js.Any])
    
    inline def setVariableDefinitions(value: js.Array[VariableDefinition]): Self = StObject.set(x, "variableDefinitions", value.asInstanceOf[js.Any])
    
    inline def setVariableDefinitionsUndefined: Self = StObject.set(x, "variableDefinitions", js.undefined)
    
    inline def setVariableDefinitionsVarargs(value: VariableDefinition*): Self = StObject.set(x, "variableDefinitions", js.Array(value :_*))
  }
}
