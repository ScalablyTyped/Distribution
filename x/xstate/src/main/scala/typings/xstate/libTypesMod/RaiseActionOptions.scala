package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RaiseActionOptions[TContext, TEvent /* <: EventObject */] extends StObject {
  
  var delay: js.UndefOr[Double | String | (DelayExpr[TContext, TEvent])] = js.undefined
  
  var id: js.UndefOr[String | Double] = js.undefined
}
object RaiseActionOptions {
  
  inline def apply[TContext, TEvent /* <: EventObject */](): RaiseActionOptions[TContext, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RaiseActionOptions[TContext, TEvent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RaiseActionOptions[?, ?], TContext, TEvent /* <: EventObject */] (val x: Self & (RaiseActionOptions[TContext, TEvent])) extends AnyVal {
    
    inline def setDelay(value: Double | String | (DelayExpr[TContext, TEvent])): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayFunction3(value: (TContext, TEvent, /* meta */ SCXMLEventMeta[TEvent]) => Double): Self = StObject.set(x, "delay", js.Any.fromFunction3(value))
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
