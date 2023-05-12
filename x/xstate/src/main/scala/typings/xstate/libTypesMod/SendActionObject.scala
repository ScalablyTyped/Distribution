package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendActionObject[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */]
  extends StObject
     with SendAction[TContext, TEvent, TSentEvent] {
  
  var _event: typings.xstate.libTypesMod.SCXML.Event[TSentEvent] = js.native
  
  @JSName("delay")
  var delay_SendActionObject: js.UndefOr[Double] = js.native
  
  @JSName("event")
  var event_SendActionObject: TSentEvent = js.native
  
  @JSName("to")
  var to_SendActionObject: js.UndefOr[String | Double | (ActorRef[Any, Any])] = js.native
}
