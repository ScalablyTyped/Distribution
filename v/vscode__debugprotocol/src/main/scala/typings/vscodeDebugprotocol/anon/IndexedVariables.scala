package typings.vscodeDebugprotocol.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexedVariables extends StObject {
  
  /** The number of indexed child variables.
  				The client can use this information to present the variables in a paged UI and fetch them in chunks.
  				The value should be less than or equal to 2147483647 (2^31-1).
  			*/
  var indexedVariables: js.UndefOr[Double] = js.undefined
  
  /** The number of named child variables.
  				The client can use this information to present the variables in a paged UI and fetch them in chunks.
  				The value should be less than or equal to 2147483647 (2^31-1).
  			*/
  var namedVariables: js.UndefOr[Double] = js.undefined
  
  /** The type of the new value. Typically shown in the UI when hovering over the value. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** The new value of the variable. */
  var value: String
  
  /** If `variablesReference` is > 0, the new value is structured and its children can be retrieved by passing `variablesReference` to the `variables` request as long as execution remains suspended. See 'Lifetime of Object References' in the Overview section for details. */
  var variablesReference: js.UndefOr[Double] = js.undefined
}
object IndexedVariables {
  
  inline def apply(value: String): IndexedVariables = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexedVariables]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndexedVariables] (val x: Self) extends AnyVal {
    
    inline def setIndexedVariables(value: Double): Self = StObject.set(x, "indexedVariables", value.asInstanceOf[js.Any])
    
    inline def setIndexedVariablesUndefined: Self = StObject.set(x, "indexedVariables", js.undefined)
    
    inline def setNamedVariables(value: Double): Self = StObject.set(x, "namedVariables", value.asInstanceOf[js.Any])
    
    inline def setNamedVariablesUndefined: Self = StObject.set(x, "namedVariables", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setVariablesReference(value: Double): Self = StObject.set(x, "variablesReference", value.asInstanceOf[js.Any])
    
    inline def setVariablesReferenceUndefined: Self = StObject.set(x, "variablesReference", js.undefined)
  }
}
