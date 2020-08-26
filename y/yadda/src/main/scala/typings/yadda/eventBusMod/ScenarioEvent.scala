package typings.yadda.eventBusMod

import typings.yadda.yaddaStrings.__ON_SCENARIO__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScenarioEvent extends js.Object {
  var data: ScenarioEventData = js.native
  var name: __ON_SCENARIO__ = js.native
}

object ScenarioEvent {
  @scala.inline
  def apply(data: ScenarioEventData, name: __ON_SCENARIO__): ScenarioEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScenarioEvent]
  }
  @scala.inline
  implicit class ScenarioEventOps[Self <: ScenarioEvent] (val x: Self) extends AnyVal {
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
    def setData(value: ScenarioEventData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: __ON_SCENARIO__): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

