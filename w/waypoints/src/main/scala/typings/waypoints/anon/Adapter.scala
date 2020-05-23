package typings.waypoints.anon

import typings.waypoints.WaypointAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Adapter extends js.Object {
  var Adapter: WaypointAdapter
  var name: String
}

object Adapter {
  @scala.inline
  def apply(Adapter: WaypointAdapter, name: String): Adapter = {
    val __obj = js.Dynamic.literal(Adapter = Adapter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Adapter]
  }
}

