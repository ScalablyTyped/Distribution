package typings.yadda.eventBusMod

import typings.yadda.yaddaStrings.__ON_DEFINE__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefineEvent extends js.Object {
  var data: DefineEventData
  var name: __ON_DEFINE__
}

object DefineEvent {
  @scala.inline
  def apply(data: DefineEventData, name: __ON_DEFINE__): DefineEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineEvent]
  }
}

