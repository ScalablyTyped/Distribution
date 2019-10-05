package typings.webgme.Gme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var eid: String
  var etype: TerritoryEventType
  var id: js.UndefOr[String] = js.undefined
}

object Event {
  @scala.inline
  def apply(eid: String, etype: TerritoryEventType, id: String = null): Event = {
    val __obj = js.Dynamic.literal(eid = eid, etype = etype)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Event]
  }
}

