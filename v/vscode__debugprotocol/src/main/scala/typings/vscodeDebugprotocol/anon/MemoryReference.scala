package typings.vscodeDebugprotocol.anon

import typings.vscodeDebugprotocol.mod.DebugProtocol.VariablePresentationHint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemoryReference extends StObject {
  
  /** The number of indexed child variables.
  				The client can use this information to present the variables in a paged UI and fetch them in chunks.
  				The value should be less than or equal to 2147483647 (2^31-1).
  			*/
  var indexedVariables: js.UndefOr[Double] = js.undefined
  
  /** A memory reference to a location appropriate for this result.
  				For pointer type eval results, this is generally a reference to the memory address contained in the pointer.
  				This attribute should be returned by a debug adapter if corresponding capability  `supportsMemoryReferences` is true.
  			*/
  var memoryReference: js.UndefOr[String] = js.undefined
  
  /** The number of named child variables.
  				The client can use this information to present the variables in a paged UI and fetch them in chunks.
  				The value should be less than or equal to 2147483647 (2^31-1).
  			*/
  var namedVariables: js.UndefOr[Double] = js.undefined
  
  /** Properties of an evaluate result that can be used to determine how to render the result in the UI. */
  var presentationHint: js.UndefOr[VariablePresentationHint] = js.undefined
  
  /** The result of the evaluate request. */
  var result: String
  
  /** The type of the evaluate result.
  				This attribute should only be returned by a debug adapter if the ccorresponding capability  `supportsVariableType` is true.
  			*/
  var `type`: js.UndefOr[String] = js.undefined
  
  /** If variablesReference is > 0, the evaluate result is structured and its children can be retrieved by passing variablesReference to the VariablesRequest.
  				The value should be less than or equal to 2147483647 (2^31-1).
  			*/
  var variablesReference: Double
}
object MemoryReference {
  
  inline def apply(result: String, variablesReference: Double): MemoryReference = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], variablesReference = variablesReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MemoryReference] (val x: Self) extends AnyVal {
    
    inline def setIndexedVariables(value: Double): Self = StObject.set(x, "indexedVariables", value.asInstanceOf[js.Any])
    
    inline def setIndexedVariablesUndefined: Self = StObject.set(x, "indexedVariables", js.undefined)
    
    inline def setMemoryReference(value: String): Self = StObject.set(x, "memoryReference", value.asInstanceOf[js.Any])
    
    inline def setMemoryReferenceUndefined: Self = StObject.set(x, "memoryReference", js.undefined)
    
    inline def setNamedVariables(value: Double): Self = StObject.set(x, "namedVariables", value.asInstanceOf[js.Any])
    
    inline def setNamedVariablesUndefined: Self = StObject.set(x, "namedVariables", js.undefined)
    
    inline def setPresentationHint(value: VariablePresentationHint): Self = StObject.set(x, "presentationHint", value.asInstanceOf[js.Any])
    
    inline def setPresentationHintUndefined: Self = StObject.set(x, "presentationHint", js.undefined)
    
    inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVariablesReference(value: Double): Self = StObject.set(x, "variablesReference", value.asInstanceOf[js.Any])
  }
}
