package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildTrigger extends js.Object {
  /**
    * The type of the trigger.
    */
  var triggerType: DefinitionTriggerType = js.native
}

object BuildTrigger {
  @scala.inline
  def apply(triggerType: DefinitionTriggerType): BuildTrigger = {
    val __obj = js.Dynamic.literal(triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildTrigger]
  }
  @scala.inline
  implicit class BuildTriggerOps[Self <: BuildTrigger] (val x: Self) extends AnyVal {
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
    def setTriggerType(value: DefinitionTriggerType): Self = this.set("triggerType", value.asInstanceOf[js.Any])
  }
  
}

