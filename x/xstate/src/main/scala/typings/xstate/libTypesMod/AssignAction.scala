package typings.xstate.libTypesMod

import typings.xstate.libTypesMod.ActionTypes.Assign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssignAction[TContext, TExpressionEvent /* <: EventObject */, TEvent /* <: EventObject */]
  extends StObject
     with ActionObject[TContext, TExpressionEvent, TEvent, BaseActionObject]
     with _BaseAction[TContext, TExpressionEvent, Any, TEvent] {
  
  var assignment: (Assigner[TContext, TExpressionEvent]) | (PropertyAssigner[TContext, TExpressionEvent]) = js.native
  
  @JSName("type")
  var type_AssignAction: Assign = js.native
}
