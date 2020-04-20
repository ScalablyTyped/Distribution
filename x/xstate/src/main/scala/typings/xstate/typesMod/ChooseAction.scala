package typings.xstate.typesMod

import typings.xstate.typesMod.ActionTypes.Choose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.xstate.typesMod._Action because Already inherited */ trait ChooseAction[TContext, TEvent /* <: EventObject */] extends ActionObject[TContext, TEvent] {
  var conds: js.Array[ChooseConditon[TContext, TEvent]]
  @JSName("type")
  var type_ChooseAction: Choose
}

object ChooseAction {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    conds: js.Array[ChooseConditon[TContext, TEvent]],
    `type`: Choose,
    exec: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent]) => js.Any | Unit = null
  ): ChooseAction[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(conds = conds.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (exec != null) __obj.updateDynamic("exec")(js.Any.fromFunction3(exec))
    __obj.asInstanceOf[ChooseAction[TContext, TEvent]]
  }
}

