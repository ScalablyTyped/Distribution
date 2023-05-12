package typings.xstate.libTypesMod

import typings.xstate.libTypesMod.ActionTypes.Raise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RaiseAction[TContext, TExpressionEvent /* <: EventObject */, TEvent /* <: EventObject */]
  extends StObject
     with ActionObject[TContext, TExpressionEvent, TEvent, BaseActionObject]
     with _BaseAction[TContext, TExpressionEvent, Any, TEvent] {
  
  var delay: js.UndefOr[Double | String | (DelayExpr[TContext, TExpressionEvent])] = js.native
  
  var event: TEvent | (SendExpr[TContext, TExpressionEvent, TEvent]) = js.native
  
  var id: js.UndefOr[String | Double] = js.native
  
  @JSName("type")
  var type_RaiseAction: Raise = js.native
}
