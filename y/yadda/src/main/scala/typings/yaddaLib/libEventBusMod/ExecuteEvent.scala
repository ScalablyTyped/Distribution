package typings
package yaddaLib.libEventBusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecuteEvent extends js.Object {
  var data: ExecuteEventData
  var name: yaddaLib.yaddaLibStrings.__ON_EXECUTE__
}

object ExecuteEvent {
  @scala.inline
  def apply(data: ExecuteEventData, name: yaddaLib.yaddaLibStrings.__ON_EXECUTE__): ExecuteEvent = {
    val __obj = js.Dynamic.literal(data = data, name = name)
  
    __obj.asInstanceOf[ExecuteEvent]
  }
}

