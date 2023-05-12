package typings.xstate.libTypesMod

import typings.xstate.libTypesMod.ActionTypes.Send
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendAction[TContext, TEvent /* <: EventObject */, TSentEvent /* <: EventObject */]
  extends StObject
     with ActionObject[TContext, TEvent, TSentEvent, BaseActionObject]
     with _BaseAction[TContext, TEvent, Any, TSentEvent] {
  
  var delay: js.UndefOr[Double | String | (DelayExpr[TContext, TEvent])] = js.native
  
  var event: TSentEvent | (SendExpr[TContext, TEvent, TSentEvent]) = js.native
  
  var id: String | Double = js.native
  
  var to: js.UndefOr[
    String | Double | (ActorRef[Any, Any]) | (ExprWithMeta[TContext, TEvent, String | Double | (ActorRef[Any, Any])])
  ] = js.native
  
  @JSName("type")
  var type_SendAction: Send = js.native
}
