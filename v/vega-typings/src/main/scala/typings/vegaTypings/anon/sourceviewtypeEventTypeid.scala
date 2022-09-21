package typings.vegaTypings.anon

import typings.vegaTypings.runtimeRuntimeMod.ID
import typings.vegaTypings.runtimeRuntimeMod.Stream
import typings.vegaTypings.runtimeRuntimeMod.expr
import typings.vegaTypings.streamMod.EventType
import typings.vegaTypings.vegaTypingsBooleans.`true`
import typings.vegaTypings.vegaTypingsStrings.view
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  source :'view',   type :vega-typings.vega-typings.EventType} & {  id :vega-typings.vega-typings/types/runtime/runtime.ID,   between :[vega-typings.vega-typings/types/runtime/runtime.ID, vega-typings.vega-typings/types/runtime/runtime.ID] | undefined,   filter :vega-typings.vega-typings/types/runtime/runtime.expr | undefined,   throttle :number | undefined,   debounce :number | undefined,   consume :true | undefined} */
trait sourceviewtypeEventTypeid
  extends StObject
     with Stream {
  
  /**
    * from parsers/stream.js:streamParameters
    * Currently, only merged or streams that reference another stream use these
    * parameters, but in the vega runtime any stream can have them
    */
  /**
    * Filter this stream for events that happen after an event from the first
    * stream and before an event in the second.
    */
  var between: js.UndefOr[js.Tuple2[ID, ID]] = js.undefined
  
  /**
    * Whether to stop native event propagation
    */
  var consume: js.UndefOr[`true`] = js.undefined
  
  var debounce: js.UndefOr[Double] = js.undefined
  
  var filter: js.UndefOr[expr] = js.undefined
  
  var id: ID
  
  var source: view
  
  var throttle: js.UndefOr[Double] = js.undefined
  
  var `type`: EventType
}
object sourceviewtypeEventTypeid {
  
  inline def apply(id: ID, `type`: EventType): sourceviewtypeEventTypeid = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = "view")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[sourceviewtypeEventTypeid]
  }
  
  extension [Self <: sourceviewtypeEventTypeid](x: Self) {
    
    inline def setBetween(value: js.Tuple2[ID, ID]): Self = StObject.set(x, "between", value.asInstanceOf[js.Any])
    
    inline def setBetweenUndefined: Self = StObject.set(x, "between", js.undefined)
    
    inline def setConsume(value: `true`): Self = StObject.set(x, "consume", value.asInstanceOf[js.Any])
    
    inline def setConsumeUndefined: Self = StObject.set(x, "consume", js.undefined)
    
    inline def setDebounce(value: Double): Self = StObject.set(x, "debounce", value.asInstanceOf[js.Any])
    
    inline def setDebounceUndefined: Self = StObject.set(x, "debounce", js.undefined)
    
    inline def setFilter(value: expr): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setId(value: ID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSource(value: view): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
    
    inline def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
    
    inline def setType(value: EventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
