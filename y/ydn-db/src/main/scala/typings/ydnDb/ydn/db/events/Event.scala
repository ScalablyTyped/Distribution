package typings.ydnDb.ydn.db.events

import typings.ydnDb.ydn.db.EventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var name: String
  var `type`: EventType
}

object Event {
  @scala.inline
  def apply(name: String, `type`: EventType): Event = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

