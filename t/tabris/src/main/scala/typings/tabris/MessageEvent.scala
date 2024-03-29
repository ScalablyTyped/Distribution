package typings.tabris

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageEvent
  extends StObject
     with Event {
  
  val data: Any
  
  def initMessageEvent(
    typeArg: String,
    canBubbleArg: Boolean,
    cancelableArg: Boolean,
    dataArg: Any,
    originArg: String,
    lastEventIdArg: String,
    sourceArg: Any
  ): Unit
  
  val origin: String
  
  val ports: Any
  
  val source: Any
}
object MessageEvent {
  
  inline def apply(
    AT_TARGET: Double,
    BUBBLING_PHASE: Double,
    CAPTURING_PHASE: Double,
    bubbles: Boolean,
    cancelable: Boolean,
    currentTarget: EventTarget,
    data: Any,
    defaultPrevented: Boolean,
    eventPhase: Double,
    initEvent: (String, Boolean, Boolean) => Unit,
    initMessageEvent: (String, Boolean, Boolean, Any, String, String, Any) => Unit,
    isTrusted: Boolean,
    origin: String,
    ports: Any,
    preventDefault: () => Unit,
    source: Any,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: EventTarget,
    timeStamp: Double,
    `type`: String
  ): MessageEvent = {
    val __obj = js.Dynamic.literal(AT_TARGET = AT_TARGET.asInstanceOf[js.Any], BUBBLING_PHASE = BUBBLING_PHASE.asInstanceOf[js.Any], CAPTURING_PHASE = CAPTURING_PHASE.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], initEvent = js.Any.fromFunction3(initEvent), initMessageEvent = js.Any.fromFunction7(initMessageEvent), isTrusted = isTrusted.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], ports = ports.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), source = source.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageEvent] (val x: Self) extends AnyVal {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setInitMessageEvent(value: (String, Boolean, Boolean, Any, String, String, Any) => Unit): Self = StObject.set(x, "initMessageEvent", js.Any.fromFunction7(value))
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setPorts(value: Any): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
