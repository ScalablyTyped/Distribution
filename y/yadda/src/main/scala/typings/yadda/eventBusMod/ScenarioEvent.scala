package typings.yadda.eventBusMod

import typings.yadda.yaddaStrings.__ON_SCENARIO__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScenarioEvent extends js.Object {
  var data: ScenarioEventData
  var name: __ON_SCENARIO__
}

object ScenarioEvent {
  @scala.inline
  def apply(data: ScenarioEventData, name: __ON_SCENARIO__): ScenarioEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScenarioEvent]
  }
}

