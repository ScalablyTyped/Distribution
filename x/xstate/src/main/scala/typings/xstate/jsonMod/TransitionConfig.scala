package typings.xstate.jsonMod

import typings.xstate.typesMod.ActionObject
import typings.xstate.typesMod.Guard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionConfig extends js.Object {
  var actions: js.Array[ActionObject[_, _]] = js.native
  var cond: js.UndefOr[Guard[_, _]] = js.native
  var eventType: String = js.native
  var source: String = js.native
  var target: js.Array[String] = js.native
}

object TransitionConfig {
  @scala.inline
  def apply(actions: js.Array[ActionObject[_, _]], eventType: String, source: String, target: js.Array[String]): TransitionConfig = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionConfig]
  }
  @scala.inline
  implicit class TransitionConfigOps[Self <: TransitionConfig] (val x: Self) extends AnyVal {
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
    def setActionsVarargs(value: (ActionObject[js.Any, js.Any])*): Self = this.set("actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: js.Array[ActionObject[_, _]]): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventType(value: String): Self = this.set("eventType", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetVarargs(value: String*): Self = this.set("target", js.Array(value :_*))
    @scala.inline
    def setTarget(value: js.Array[String]): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setCond(value: Guard[_, _]): Self = this.set("cond", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCond: Self = this.set("cond", js.undefined)
  }
  
}

