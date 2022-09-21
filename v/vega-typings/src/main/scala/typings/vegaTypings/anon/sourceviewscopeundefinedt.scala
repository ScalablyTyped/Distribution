package typings.vegaTypings.anon

import typings.vegaTypings.exprMod.Expr
import typings.vegaTypings.marktypeMod.MarkType
import typings.vegaTypings.streamMod.EventStream
import typings.vegaTypings.streamMod.EventType
import typings.vegaTypings.streamMod.Stream
import typings.vegaTypings.vegaTypingsStrings.scope
import typings.vegaTypings.vegaTypingsStrings.view
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  source :'view' | 'scope' | undefined,   type :vega-typings.vega-typings/types/spec/stream.EventType} & vega-typings.vega-typings/types/spec/stream.StreamParameters */
trait sourceviewscopeundefinedt
  extends StObject
     with EventStream {
  
  var between: js.UndefOr[js.Array[Stream]] = js.undefined
  
  var consume: js.UndefOr[Boolean] = js.undefined
  
  var debounce: js.UndefOr[Double] = js.undefined
  
  var filter: js.UndefOr[Expr | js.Array[Expr]] = js.undefined
  
  var markname: js.UndefOr[String] = js.undefined
  
  var marktype: js.UndefOr[MarkType] = js.undefined
  
  var source: js.UndefOr[view | scope] = js.undefined
  
  var throttle: js.UndefOr[Double] = js.undefined
  
  var `type`: EventType
}
object sourceviewscopeundefinedt {
  
  inline def apply(`type`: EventType): sourceviewscopeundefinedt = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[sourceviewscopeundefinedt]
  }
  
  extension [Self <: sourceviewscopeundefinedt](x: Self) {
    
    inline def setBetween(value: js.Array[Stream]): Self = StObject.set(x, "between", value.asInstanceOf[js.Any])
    
    inline def setBetweenUndefined: Self = StObject.set(x, "between", js.undefined)
    
    inline def setBetweenVarargs(value: Stream*): Self = StObject.set(x, "between", js.Array(value*))
    
    inline def setConsume(value: Boolean): Self = StObject.set(x, "consume", value.asInstanceOf[js.Any])
    
    inline def setConsumeUndefined: Self = StObject.set(x, "consume", js.undefined)
    
    inline def setDebounce(value: Double): Self = StObject.set(x, "debounce", value.asInstanceOf[js.Any])
    
    inline def setDebounceUndefined: Self = StObject.set(x, "debounce", js.undefined)
    
    inline def setFilter(value: Expr | js.Array[Expr]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterVarargs(value: Expr*): Self = StObject.set(x, "filter", js.Array(value*))
    
    inline def setMarkname(value: String): Self = StObject.set(x, "markname", value.asInstanceOf[js.Any])
    
    inline def setMarknameUndefined: Self = StObject.set(x, "markname", js.undefined)
    
    inline def setMarktype(value: MarkType): Self = StObject.set(x, "marktype", value.asInstanceOf[js.Any])
    
    inline def setMarktypeUndefined: Self = StObject.set(x, "marktype", js.undefined)
    
    inline def setSource(value: view | scope): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
    
    inline def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
    
    inline def setType(value: EventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
