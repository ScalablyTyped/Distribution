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

trait StateNodeConfig extends js.Object {
  var entry: js.Array[ActionObject[_, _]]
  var exit: js.Array[ActionObject[_, _]]
  var id: String
  var initial: js.UndefOr[String] = js.undefined
  var invoke: js.Array[InvokeDefinition[_, _]]
  var key: String
  var on: StringDictionary[js.Array[TransitionConfig]]
  var states: Record[String, StateNodeConfig]
  var `type`: atomic | compound | parallel | `final` | history
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
    `type`: atomic | compound | parallel | `final` | history,
    initial: String = null
  ): StateNodeConfig = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invoke = invoke.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (initial != null) __obj.updateDynamic("initial")(initial.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateNodeConfig]
  }
}

