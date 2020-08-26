package typings.xstate.typesMod

import typings.xstate.typesMod.ActionTypes.Choose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.xstate.typesMod._Action because Already inherited */ @js.native
trait ChooseAction[TContext, TEvent /* <: EventObject */] extends ActionObject[TContext, TEvent] {
  var conds: js.Array[ChooseConditon[TContext, TEvent]] = js.native
  @JSName("type")
  var type_ChooseAction: Choose = js.native
}

object ChooseAction {
  @scala.inline
  def apply[TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent](conds: js.Array[ChooseConditon[TContext, TEvent]], `type`: Choose): ChooseAction[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(conds = conds.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseAction[TContext, TEvent]]
  }
  @scala.inline
  implicit class ChooseActionOps[Self <: ChooseAction[_, _], TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent] (val x: Self with (ChooseAction[TContext, TEvent])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCondsVarargs(value: (ChooseConditon[TContext, TEvent])*): Self = this.set("conds", js.Array(value :_*))
    @scala.inline
    def setConds(value: js.Array[ChooseConditon[TContext, TEvent]]): Self = this.set("conds", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Choose): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

