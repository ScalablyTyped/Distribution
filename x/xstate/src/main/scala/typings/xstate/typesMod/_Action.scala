package typings.xstate.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.xstate.typesMod.ActionTypes.Choose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Action[TContext, TEvent /* <: EventObject */] extends js.Object

object _Action {
  @scala.inline
  def ActionObject[TContext, TEvent](
    `type`: String,
    StringDictionary: /* other */ StringDictionary[js.Any] = null,
    exec: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent]) => js.Any | Unit = null
  ): _Action[TContext, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (exec != null) __obj.updateDynamic("exec")(js.Any.fromFunction3(exec))
    __obj.asInstanceOf[_Action[TContext, TEvent]]
  }
  @scala.inline
  def ChooseAction[TContext, TEvent](
    conds: js.Array[ChooseConditon[TContext, TEvent]],
    `type`: Choose,
    exec: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent]) => js.Any | Unit = null
  ): _Action[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(conds = conds.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (exec != null) __obj.updateDynamic("exec")(js.Any.fromFunction3(exec))
    __obj.asInstanceOf[_Action[TContext, TEvent]]
  }
}

