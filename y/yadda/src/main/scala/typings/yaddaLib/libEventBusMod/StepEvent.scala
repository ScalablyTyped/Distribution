package typings
package yaddaLib.libEventBusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepEvent extends js.Object {
  var data: StepEventData
  var name: yaddaLib.yaddaLibStrings.__ON_STEP__
}

object StepEvent {
  @scala.inline
  def apply(data: StepEventData, name: yaddaLib.yaddaLibStrings.__ON_STEP__): StepEvent = {
    val __obj = js.Dynamic.literal(data = data, name = name)
  
    __obj.asInstanceOf[StepEvent]
  }
}

