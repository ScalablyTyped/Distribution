package typings.xstate.jsonMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import typings.xstate.typesMod.ActionObject
import typings.xstate.typesMod.InvokeDefinition
import typings.xstate.xstateStrings.`final`
import typings.xstate.xstateStrings.atomic
import typings.xstate.xstateStrings.compound
import typings.xstate.xstateStrings.history
import typings.xstate.xstateStrings.parallel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateNodeConfig extends js.Object {
  var entry: js.Array[ActionObject[_, _]] = js.native
  var exit: js.Array[ActionObject[_, _]] = js.native
  var id: String = js.native
  var initial: js.UndefOr[String] = js.native
  var invoke: js.Array[InvokeDefinition[_, _]] = js.native
  var key: String = js.native
  var on: StringDictionary[js.Array[TransitionConfig]] = js.native
  var states: Record[String, StateNodeConfig] = js.native
  var `type`: atomic | compound | parallel | `final` | history = js.native
}

object StateNodeConfig {
  @scala.inline
  def apply(
    entry: js.Array[ActionObject[_, _]],
    exit: js.Array[ActionObject[_, _]],
    id: String,
    invoke: js.Array[InvokeDefinition[_, _]],
    key: String,
    on: StringDictionary[js.Array[TransitionConfig]],
    states: Record[String, StateNodeConfig],
    `type`: atomic | compound | parallel | `final` | history
  ): StateNodeConfig = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invoke = invoke.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateNodeConfig]
  }
  @scala.inline
  implicit class StateNodeConfigOps[Self <: StateNodeConfig] (val x: Self) extends AnyVal {
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
    def setEntryVarargs(value: (ActionObject[js.Any, js.Any])*): Self = this.set("entry", js.Array(value :_*))
    @scala.inline
    def setEntry(value: js.Array[ActionObject[_, _]]): Self = this.set("entry", value.asInstanceOf[js.Any])
    @scala.inline
    def setExitVarargs(value: (ActionObject[js.Any, js.Any])*): Self = this.set("exit", js.Array(value :_*))
    @scala.inline
    def setExit(value: js.Array[ActionObject[_, _]]): Self = this.set("exit", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvokeVarargs(value: (InvokeDefinition[js.Any, js.Any])*): Self = this.set("invoke", js.Array(value :_*))
    @scala.inline
    def setInvoke(value: js.Array[InvokeDefinition[_, _]]): Self = this.set("invoke", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setOn(value: StringDictionary[js.Array[TransitionConfig]]): Self = this.set("on", value.asInstanceOf[js.Any])
    @scala.inline
    def setStates(value: Record[String, StateNodeConfig]): Self = this.set("states", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: atomic | compound | parallel | `final` | history): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitial(value: String): Self = this.set("initial", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitial: Self = this.set("initial", js.undefined)
  }
  
}

