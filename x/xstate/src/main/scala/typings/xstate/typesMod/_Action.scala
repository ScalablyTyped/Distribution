package typings.xstate.typesMod

import typings.xstate.typesMod.ActionTypes.Choose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Action[TContext, TEvent /* <: EventObject */] extends js.Object

object _Action {
  @scala.inline
  def ActionObject[TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent](`type`: String): _Action[TContext, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Action[TContext, TEvent]]
  }
  @scala.inline
  def ChooseAction[TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent](conds: js.Array[ChooseConditon[TContext, TEvent]], `type`: Choose): _Action[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(conds = conds.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Action[TContext, TEvent]]
  }
}

