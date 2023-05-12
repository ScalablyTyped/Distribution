package typings.xstate.libTypesMod

import typings.xstate.libTypesMod.ActionTypes.Log
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogAction[TContext, TExpressionEvent /* <: EventObject */, TEvent /* <: EventObject */]
  extends StObject
     with ActionObject[TContext, TExpressionEvent, TEvent, BaseActionObject]
     with _BaseAction[TContext, TExpressionEvent, Any, TEvent] {
  
  var expr: String | (LogExpr[TContext, TExpressionEvent]) = js.native
  
  var label: js.UndefOr[String] = js.native
  
  @JSName("type")
  var type_LogAction: Log = js.native
}
