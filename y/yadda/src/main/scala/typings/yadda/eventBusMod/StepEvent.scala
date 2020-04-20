package typings.yadda.eventBusMod

import typings.yadda.yaddaStrings.__ON_STEP__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepEvent extends js.Object {
  var data: StepEventData
  var name: __ON_STEP__
}

object StepEvent {
  @scala.inline
  def apply(data: StepEventData, name: __ON_STEP__): StepEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepEvent]
  }
}

