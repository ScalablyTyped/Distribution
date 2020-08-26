package typings.xstate.typesMod

import typings.xstate.stateNodeMod.StateNode
import typings.xstate.xstateStrings.Asterisk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DelayedTransitionDefinition[TContext, TEvent /* <: EventObject */] extends TransitionDefinition[TContext, TEvent] {
  var delay: Double | String | (DelayExpr[TContext, TEvent]) = js.native
}

object DelayedTransitionDefinition {
  @scala.inline
  def apply[TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent](
    actions: js.Array[ActionObject[TContext, TEvent]],
    delay: Double | String | (DelayExpr[TContext, TEvent]),
    eventType: (/* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any) | typings.xstate.typesMod.ActionTypes.NullEvent | Asterisk,
    source: StateNode[TContext, _, TEvent, _],
    toJSON: () => typings.xstate.anon.Actions[TContext, TEvent]
  ): DelayedTransitionDefinition[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[DelayedTransitionDefinition[TContext, TEvent]]
  }
  @scala.inline
  implicit class DelayedTransitionDefinitionOps[Self <: DelayedTransitionDefinition[_, _], TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent] (val x: Self with (DelayedTransitionDefinition[TContext, TEvent])) extends AnyVal {
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
    def setDelayFunction3(value: (TContext, TEvent, /* meta */ SCXMLEventMeta[TEvent]) => Double): Self = this.set("delay", js.Any.fromFunction3(value))
    @scala.inline
    def setDelay(value: Double | String | (DelayExpr[TContext, TEvent])): Self = this.set("delay", value.asInstanceOf[js.Any])
  }
  
}

