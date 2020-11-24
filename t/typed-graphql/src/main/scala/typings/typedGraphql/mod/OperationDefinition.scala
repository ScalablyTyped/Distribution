package typings.typedGraphql.mod

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
  implicit class OperationDefinitionOps[Self <: OperationDefinition] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: String): Self = this.set("operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionSet(value: SelectionSet): Self = this.set("selectionSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectivesVarargs(value: Directive*): Self = this.set("directives", js.Array(value :_*))
    
    @scala.inline
    def setDirectives(value: js.Array[Directive]): Self = this.set("directives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectives: Self = this.set("directives", js.undefined)
    
    @scala.inline
    def setLoc(value: Location): Self = this.set("loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoc: Self = this.set("loc", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setVariableDefinitionsVarargs(value: VariableDefinition*): Self = this.set("variableDefinitions", js.Array(value :_*))
    
    @scala.inline
    def setVariableDefinitions(value: js.Array[VariableDefinition]): Self = this.set("variableDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariableDefinitions: Self = this.set("variableDefinitions", js.undefined)
  }
}
