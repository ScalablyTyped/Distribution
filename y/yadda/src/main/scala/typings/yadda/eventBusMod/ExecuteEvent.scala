package typings.yadda.eventBusMod

import typings.yadda.yaddaStrings.__ON_EXECUTE__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecuteEvent extends js.Object {
  var data: ExecuteEventData
  var name: __ON_EXECUTE__
}

object ExecuteEvent {
  @scala.inline
  def apply(data: ExecuteEventData, name: __ON_EXECUTE__): ExecuteEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteEvent]
  }
}

