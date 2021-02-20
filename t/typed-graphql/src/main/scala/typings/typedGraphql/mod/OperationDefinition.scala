package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationDefinition
  extends Definition
     with HasSelectionSet
     with Node {
  
  var directives: js.UndefOr[js.Array[Directive]] = js.native
  
  var kind: String = js.native
  
  var loc: js.UndefOr[Location] = js.native
  
  var name: js.UndefOr[Name] = js.native
  
  // Note: subscription is an experimental non-spec addition.
  var operation: String = js.native
  
  var selectionSet: SelectionSet = js.native
  
  var variableDefinitions: js.UndefOr[js.Array[VariableDefinition]] = js.native
}
object OperationDefinition {
  
  @scala.inline
  def apply(kind: String, operation: String, selectionSet: SelectionSet): OperationDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationDefinition]
  }
  
  @scala.inline
  implicit class OperationDefinitionMutableBuilder[Self <: OperationDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectives(value: js.Array[Directive]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectivesUndefined: Self = StObject.set(x, "directives", js.undefined)
    
    @scala.inline
    def setDirectivesVarargs(value: Directive*): Self = StObject.set(x, "directives", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: Location): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionSet(value: SelectionSet): Self = StObject.set(x, "selectionSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableDefinitions(value: js.Array[VariableDefinition]): Self = StObject.set(x, "variableDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableDefinitionsUndefined: Self = StObject.set(x, "variableDefinitions", js.undefined)
    
    @scala.inline
    def setVariableDefinitionsVarargs(value: VariableDefinition*): Self = StObject.set(x, "variableDefinitions", js.Array(value :_*))
  }
}
