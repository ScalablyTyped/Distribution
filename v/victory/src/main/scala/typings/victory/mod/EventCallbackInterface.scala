package typings.victory.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Return value for eventHandlers values
  */
trait EventCallbackInterface[TTarget, TEventKey] extends StObject {
  
  /**
    * Use only in:
    * - VictoryChart
    * - VictoryStack
    */
  var childName: js.UndefOr[String] = js.undefined
  
  var eventKey: js.UndefOr[TEventKey] = js.undefined
  
  /**
    * Will be called with the calculated props for the individual selected element and result will override
    * props of selected element via object assignment
    * @param props
    */
  def mutation(props: js.Any): js.Any
  
  var target: js.UndefOr[TTarget] = js.undefined
}
object EventCallbackInterface {
  
  inline def apply[TTarget, TEventKey](mutation: js.Any => js.Any): EventCallbackInterface[TTarget, TEventKey] = {
    val __obj = js.Dynamic.literal(mutation = js.Any.fromFunction1(mutation))
    __obj.asInstanceOf[EventCallbackInterface[TTarget, TEventKey]]
  }
  
  extension [Self <: EventCallbackInterface[?, ?], TTarget, TEventKey](x: Self & (EventCallbackInterface[TTarget, TEventKey])) {
    
    inline def setChildName(value: String): Self = StObject.set(x, "childName", value.asInstanceOf[js.Any])
    
    inline def setChildNameUndefined: Self = StObject.set(x, "childName", js.undefined)
    
    inline def setEventKey(value: TEventKey): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
    
    inline def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
    
    inline def setMutation(value: js.Any => js.Any): Self = StObject.set(x, "mutation", js.Any.fromFunction1(value))
    
    inline def setTarget(value: TTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
