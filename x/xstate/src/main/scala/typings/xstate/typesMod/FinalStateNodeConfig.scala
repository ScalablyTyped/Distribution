package typings.xstate.typesMod

import typings.xstate.xstateStrings.`final`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FinalStateNodeConfig[TContext, TEvent /* <: EventObject */] extends AtomicStateNodeConfig[TContext, TEvent] {
  @JSName("type")
  var type_FinalStateNodeConfig: `final` = js.native
}

object FinalStateNodeConfig {
  @scala.inline
  def apply[TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent](`type`: `final`): FinalStateNodeConfig[TContext, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinalStateNodeConfig[TContext, TEvent]]
  }
  @scala.inline
  implicit class FinalStateNodeConfigOps[Self <: FinalStateNodeConfig[_, _], TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent] (val x: Self with (FinalStateNodeConfig[TContext, TEvent])) extends AnyVal {
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
    def setType(value: `final`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

