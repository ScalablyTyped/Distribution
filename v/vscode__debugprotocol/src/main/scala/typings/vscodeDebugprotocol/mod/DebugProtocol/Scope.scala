package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.arguments
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.locals
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.registers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A Scope is a named container for variables. Optionally a scope can map to a source or a range within a source. */
trait Scope extends StObject {
  
  /** The start column of the range covered by this scope. */
  var column: js.UndefOr[Double] = js.undefined
  
  /** The end column of the range covered by this scope. */
  var endColumn: js.UndefOr[Double] = js.undefined
  
  /** The end line of the range covered by this scope. */
  var endLine: js.UndefOr[Double] = js.undefined
  
  /** If true, the number of variables in this scope is large or expensive to retrieve. */
  var expensive: Boolean
  
  /** The number of indexed variables in this scope.
  			The client can use this information to present the variables in a paged UI and fetch them in chunks.
  		*/
  var indexedVariables: js.UndefOr[Double] = js.undefined
  
  /** The start line of the range covered by this scope. */
  var line: js.UndefOr[Double] = js.undefined
  
  /** Name of the scope such as 'Arguments', 'Locals', or 'Registers'. This string is shown in the UI as is and can be translated. */
  var name: String
  
  /** The number of named variables in this scope.
  			The client can use this information to present the variables in a paged UI and fetch them in chunks.
  		*/
  var namedVariables: js.UndefOr[Double] = js.undefined
  
  /** A hint for how to present this scope in the UI. If this attribute is missing, the scope is shown with a generic UI.
  			Values: 
  			'arguments': Scope contains method arguments.
  			'locals': Scope contains local variables.
  			'registers': Scope contains registers. Only a single `registers` scope should be returned from a `scopes` request.
  			etc.
  		*/
  var presentationHint: js.UndefOr[arguments | locals | registers | String] = js.undefined
  
  /** The source for this scope. */
  var source: js.UndefOr[Source] = js.undefined
  
  /** The variables of this scope can be retrieved by passing the value of variablesReference to the VariablesRequest. */
  var variablesReference: Double
}
object Scope {
  
  inline def apply(expensive: Boolean, name: String, variablesReference: Double): Scope = {
    val __obj = js.Dynamic.literal(expensive = expensive.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], variablesReference = variablesReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scope]
  }
  
  extension [Self <: Scope](x: Self) {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setEndColumn(value: Double): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
    
    inline def setEndColumnUndefined: Self = StObject.set(x, "endColumn", js.undefined)
    
    inline def setEndLine(value: Double): Self = StObject.set(x, "endLine", value.asInstanceOf[js.Any])
    
    inline def setEndLineUndefined: Self = StObject.set(x, "endLine", js.undefined)
    
    inline def setExpensive(value: Boolean): Self = StObject.set(x, "expensive", value.asInstanceOf[js.Any])
    
    inline def setIndexedVariables(value: Double): Self = StObject.set(x, "indexedVariables", value.asInstanceOf[js.Any])
    
    inline def setIndexedVariablesUndefined: Self = StObject.set(x, "indexedVariables", js.undefined)
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNamedVariables(value: Double): Self = StObject.set(x, "namedVariables", value.asInstanceOf[js.Any])
    
    inline def setNamedVariablesUndefined: Self = StObject.set(x, "namedVariables", js.undefined)
    
    inline def setPresentationHint(value: arguments | locals | registers | String): Self = StObject.set(x, "presentationHint", value.asInstanceOf[js.Any])
    
    inline def setPresentationHintUndefined: Self = StObject.set(x, "presentationHint", js.undefined)
    
    inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setVariablesReference(value: Double): Self = StObject.set(x, "variablesReference", value.asInstanceOf[js.Any])
  }
}
