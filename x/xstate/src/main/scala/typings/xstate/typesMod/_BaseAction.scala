package typings.xstate.typesMod

import typings.xstate.anon.Id
import typings.xstate.typesMod.ActionTypes.Assign
import typings.xstate.typesMod.ActionTypes.Choose
import typings.xstate.typesMod.ActionTypes.Stop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _BaseAction[TContext, TEvent /* <: EventObject */, TAction /* <: BaseActionObject */] extends StObject
object _BaseAction {
  
  inline def AssignAction[TContext, TEvent /* <: EventObject */](assignment: (Assigner[TContext, TEvent]) | (PropertyAssigner[TContext, TEvent]), `type`: Assign): typings.xstate.typesMod.AssignAction[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(assignment = assignment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.xstate.typesMod.AssignAction[TContext, TEvent]]
  }
  
  inline def CancelAction(sendId: String | Double, `type`: String): typings.xstate.typesMod.CancelAction = {
    val __obj = js.Dynamic.literal(sendId = sendId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.xstate.typesMod.CancelAction]
  }
  
  inline def ChooseAction[TContext, TEvent /* <: EventObject */](conds: js.Array[ChooseCondition[TContext, TEvent]], `type`: Choose): typings.xstate.typesMod.ChooseAction[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(conds = conds.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.xstate.typesMod.ChooseAction[TContext, TEvent]]
  }
  
  inline def LogAction[TContext, TEvent /* <: EventObject */](expr: String | (LogExpr[TContext, TEvent]), `type`: String): typings.xstate.typesMod.LogAction[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.xstate.typesMod.LogAction[TContext, TEvent]]
  }
  
  inline def StopAction[TContext, TEvent /* <: EventObject */](activity: String | Id | (Expr[TContext, TEvent, String | Id]), `type`: Stop): typings.xstate.typesMod.StopAction[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(activity = activity.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.xstate.typesMod.StopAction[TContext, TEvent]]
  }
}
