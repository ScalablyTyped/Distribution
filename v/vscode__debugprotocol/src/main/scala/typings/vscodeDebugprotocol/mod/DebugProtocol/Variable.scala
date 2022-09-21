package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A Variable is a name/value pair.
		The `type` attribute is shown if space permits or when hovering over the variable's name.
		The `kind` attribute is used to render additional properties of the variable, e.g. different icons can be used to indicate that a variable is public or private.
		If the value is structured (has children), a handle is provided to retrieve the children with the VariablesRequest.
		If the number of named or indexed children is large, the numbers should be returned via the `namedVariables` and `indexedVariables` attributes.
		The client can use this information to present the children in a paged UI and fetch them in chunks.
	*/
trait Variable extends StObject {
  
  /** The evaluatable name of this variable which can be passed to the `evaluate` request to fetch the variable's value. */
  var evaluateName: js.UndefOr[String] = js.undefined
  
  /** The number of indexed child variables.
  			The client can use this information to present the children in a paged UI and fetch them in chunks.
  		*/
  var indexedVariables: js.UndefOr[Double] = js.undefined
  
  /** The memory reference for the variable if the variable represents executable code, such as a function pointer.
  			This attribute is only required if the corresponding capability `supportsMemoryReferences` is true.
  		*/
  var memoryReference: js.UndefOr[String] = js.undefined
  
  /** The variable's name. */
  var name: String
  
  /** The number of named child variables.
  			The client can use this information to present the children in a paged UI and fetch them in chunks.
  		*/
  var namedVariables: js.UndefOr[Double] = js.undefined
  
  /** Properties of a variable that can be used to determine how to render the variable in the UI. */
  var presentationHint: js.UndefOr[VariablePresentationHint] = js.undefined
  
  /** The type of the variable's value. Typically shown in the UI when hovering over the value.
  			This attribute should only be returned by a debug adapter if the corresponding capability `supportsVariableType` is true.
  		*/
  var `type`: js.UndefOr[String] = js.undefined
  
  /** The variable's value.
  			This can be a multi-line text, e.g. for a function the body of a function.
  			For structured variables (which do not have a simple value), it is recommended to provide a one-line representation of the structured object. This helps to identify the structured object in the collapsed state when its children are not yet visible.
  			An empty string can be used if no value should be shown in the UI.
  		*/
  var value: String
  
  /** If variablesReference is > 0, the variable is structured and its children can be retrieved by passing variablesReference to the VariablesRequest. */
  var variablesReference: Double
}
object Variable {
  
  inline def apply(name: String, value: String, variablesReference: Double): Variable = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], variablesReference = variablesReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Variable]
  }
  
  extension [Self <: Variable](x: Self) {
    
    inline def setEvaluateName(value: String): Self = StObject.set(x, "evaluateName", value.asInstanceOf[js.Any])
    
    inline def setEvaluateNameUndefined: Self = StObject.set(x, "evaluateName", js.undefined)
    
    inline def setIndexedVariables(value: Double): Self = StObject.set(x, "indexedVariables", value.asInstanceOf[js.Any])
    
    inline def setIndexedVariablesUndefined: Self = StObject.set(x, "indexedVariables", js.undefined)
    
    inline def setMemoryReference(value: String): Self = StObject.set(x, "memoryReference", value.asInstanceOf[js.Any])
    
    inline def setMemoryReferenceUndefined: Self = StObject.set(x, "memoryReference", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNamedVariables(value: Double): Self = StObject.set(x, "namedVariables", value.asInstanceOf[js.Any])
    
    inline def setNamedVariablesUndefined: Self = StObject.set(x, "namedVariables", js.undefined)
    
    inline def setPresentationHint(value: VariablePresentationHint): Self = StObject.set(x, "presentationHint", value.asInstanceOf[js.Any])
    
    inline def setPresentationHintUndefined: Self = StObject.set(x, "presentationHint", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setVariablesReference(value: Double): Self = StObject.set(x, "variablesReference", value.asInstanceOf[js.Any])
  }
}
