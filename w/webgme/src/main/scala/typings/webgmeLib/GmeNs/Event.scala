package typings
package webgmeLib.GmeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var eid: java.lang.String
  var etype: TerritoryEventType
  var id: js.UndefOr[java.lang.String] = js.undefined
}

object Event {
  @scala.inline
  def apply(eid: java.lang.String, etype: TerritoryEventType, id: java.lang.String = null): Event = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("eid")(eid)
    __obj.updateDynamic("etype")(etype)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Event]
  }
}

