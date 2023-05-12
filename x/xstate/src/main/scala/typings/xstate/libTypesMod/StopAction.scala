package typings.xstate.libTypesMod

import typings.xstate.anon.Id
import typings.xstate.libTypesMod.ActionTypes.Stop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopAction[TContext, TExpressionEvent /* <: EventObject */, TEvent /* <: EventObject */]
  extends StObject
     with ActionObject[TContext, TExpressionEvent, TEvent, BaseActionObject]
     with _BaseAction[TContext, TExpressionEvent, Any, TEvent] {
  
  var activity: String | Id | (Expr[TContext, TExpressionEvent, String | Id]) = js.native
  
  @JSName("type")
  var type_StopAction: Stop = js.native
}
