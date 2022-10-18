package typings.vegaTypings.anon

import typings.vegaTypings.typesSpecExprMod.Expr
import typings.vegaTypings.typesSpecMarktypeMod.MarkType
import typings.vegaTypings.typesSpecStreamMod.EventStream
import typings.vegaTypings.typesSpecStreamMod.Stream
import typings.vegaTypings.typesSpecStreamMod.WindowEventType
import typings.vegaTypings.vegaTypingsStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  source :'window',   type :vega-typings.vega-typings/types/spec/stream.WindowEventType} & vega-typings.vega-typings/types/spec/stream.StreamParameters */
trait sourcewindowtypeWindowEveBetween
  extends StObject
     with EventStream {
  
  var between: js.UndefOr[js.Array[Stream]] = js.undefined
  
  var consume: js.UndefOr[Boolean] = js.undefined
  
  var debounce: js.UndefOr[Double] = js.undefined
  
  var filter: js.UndefOr[Expr | js.Array[Expr]] = js.undefined
  
  var markname: js.UndefOr[String] = js.undefined
  
  var marktype: js.UndefOr[MarkType] = js.undefined
  
  var source: window
  
  var throttle: js.UndefOr[Double] = js.undefined
  
  var `type`: WindowEventType
}
object sourcewindowtypeWindowEveBetween {
  
  inline def apply(`type`: WindowEventType): sourcewindowtypeWindowEveBetween = {
    val __obj = js.Dynamic.literal(source = "window")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[sourcewindowtypeWindowEveBetween]
  }
  
  extension [Self <: sourcewindowtypeWindowEveBetween](x: Self) {
    
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
    
    inline def setSource(value: window): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
    
    inline def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
    
    inline def setType(value: WindowEventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
