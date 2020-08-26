package typings.xstate.typesMod

import typings.xstate.xstateStrings.parallel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParallelMachineConfig[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */] extends StateNodeConfig[TContext, TStateSchema, TEvent] {
  @JSName("initial")
  var initial_ParallelMachineConfig: js.UndefOr[scala.Nothing] = js.native
  @JSName("type")
  var type_ParallelMachineConfig: js.UndefOr[parallel] = js.native
}

object ParallelMachineConfig {
  @scala.inline
  def apply[TContext, /* <: typings.xstate.typesMod.StateSchema[_] */ TStateSchema, /* <: typings.xstate.typesMod.EventObject */ TEvent](): ParallelMachineConfig[TContext, TStateSchema, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParallelMachineConfig[TContext, TStateSchema, TEvent]]
  }
  @scala.inline
  implicit class ParallelMachineConfigOps[Self <: ParallelMachineConfig[_, _, _], TContext, /* <: typings.xstate.typesMod.StateSchema[_] */ TStateSchema, /* <: typings.xstate.typesMod.EventObject */ TEvent] (val x: Self with (ParallelMachineConfig[TContext, TStateSchema, TEvent])) extends AnyVal {
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
    def setType(value: parallel): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

