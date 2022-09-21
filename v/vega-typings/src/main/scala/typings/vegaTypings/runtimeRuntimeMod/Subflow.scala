package typings.vegaTypings.runtimeRuntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<vega-typings.vega-typings/types/runtime/runtime.Runtime, 'operators' | 'streams' | 'updates'> */
trait Subflow extends StObject {
  
  var operators: js.Array[Operator]
  
  var streams: js.Array[Stream]
  
  var updates: js.Array[Update]
}
object Subflow {
  
  inline def apply(operators: js.Array[Operator], streams: js.Array[Stream], updates: js.Array[Update]): Subflow = {
    val __obj = js.Dynamic.literal(operators = operators.asInstanceOf[js.Any], streams = streams.asInstanceOf[js.Any], updates = updates.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subflow]
  }
  
  extension [Self <: Subflow](x: Self) {
    
    inline def setOperators(value: js.Array[Operator]): Self = StObject.set(x, "operators", value.asInstanceOf[js.Any])
    
    inline def setOperatorsVarargs(value: Operator*): Self = StObject.set(x, "operators", js.Array(value*))
    
    inline def setStreams(value: js.Array[Stream]): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
    
    inline def setStreamsVarargs(value: Stream*): Self = StObject.set(x, "streams", js.Array(value*))
    
    inline def setUpdates(value: js.Array[Update]): Self = StObject.set(x, "updates", value.asInstanceOf[js.Any])
    
    inline def setUpdatesVarargs(value: Update*): Self = StObject.set(x, "updates", js.Array(value*))
  }
}
