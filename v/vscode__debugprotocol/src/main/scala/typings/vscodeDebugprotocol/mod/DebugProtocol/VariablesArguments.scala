package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.indexed
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.named
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Arguments for `variables` request. */
trait VariablesArguments extends StObject {
  
  /** The number of variables to return. If count is missing or 0, all variables are returned. */
  var count: js.UndefOr[Double] = js.undefined
  
  /** Filter to limit the child variables to either named or indexed. If omitted, both types are fetched. */
  var filter: js.UndefOr[indexed | named] = js.undefined
  
  /** Specifies details on how to format the Variable values.
  			The attribute is only honored by a debug adapter if the corresponding capability `supportsValueFormattingOptions` is true.
  		*/
  var format: js.UndefOr[ValueFormat] = js.undefined
  
  /** The index of the first variable to return; if omitted children start at 0. */
  var start: js.UndefOr[Double] = js.undefined
  
  /** The Variable reference. */
  var variablesReference: Double
}
object VariablesArguments {
  
  inline def apply(variablesReference: Double): VariablesArguments = {
    val __obj = js.Dynamic.literal(variablesReference = variablesReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariablesArguments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VariablesArguments] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setFilter(value: indexed | named): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFormat(value: ValueFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setVariablesReference(value: Double): Self = StObject.set(x, "variablesReference", value.asInstanceOf[js.Any])
  }
}
