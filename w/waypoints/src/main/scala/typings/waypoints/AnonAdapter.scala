package typings.waypoints

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdapter extends js.Object {
  var Adapter: WaypointAdapter
  var name: String
}

object AnonAdapter {
  @scala.inline
  def apply(Adapter: WaypointAdapter, name: String): AnonAdapter = {
    val __obj = js.Dynamic.literal(Adapter = Adapter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAdapter]
  }
}

