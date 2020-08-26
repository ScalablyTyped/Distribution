package typings.xstate.typesMod

import typings.xstate.xstateBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.xstate.typesMod.SimpleOrStateNodeConfig because Already inherited */ @js.native
trait AtomicStateNodeConfig[TContext, TEvent /* <: EventObject */]
  extends StateNodeConfig[TContext, StateSchema[js.Any], TEvent] {
  @JSName("initial")
  var initial_AtomicStateNodeConfig: js.UndefOr[scala.Nothing] = js.native
  @JSName("onDone")
  var onDone_AtomicStateNodeConfig: js.UndefOr[scala.Nothing] = js.native
  @JSName("parallel")
  var parallel_AtomicStateNodeConfig: js.UndefOr[`false`] = js.native
  @JSName("states")
  var states_AtomicStateNodeConfig: js.UndefOr[scala.Nothing] = js.native
}

object AtomicStateNodeConfig {
  @scala.inline
  def apply[TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent](): AtomicStateNodeConfig[TContext, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AtomicStateNodeConfig[TContext, TEvent]]
  }
  @scala.inline
  implicit class AtomicStateNodeConfigOps[Self <: AtomicStateNodeConfig[_, _], TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent] (val x: Self with (AtomicStateNodeConfig[TContext, TEvent])) extends AnyVal {
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
    def setParallel(value: `false`): Self = this.set("parallel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParallel: Self = this.set("parallel", js.undefined)
  }
  
}

