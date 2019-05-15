package typings
package yaddaLib.libEventBusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScenarioEvent extends js.Object {
  var data: ScenarioEventData
  var name: yaddaLib.yaddaLibStrings.__ON_SCENARIO__
}

object ScenarioEvent {
  @scala.inline
  def apply(data: ScenarioEventData, name: yaddaLib.yaddaLibStrings.__ON_SCENARIO__): ScenarioEvent = {
    val __obj = js.Dynamic.literal(data = data, name = name)
  
    __obj.asInstanceOf[ScenarioEvent]
  }
}

