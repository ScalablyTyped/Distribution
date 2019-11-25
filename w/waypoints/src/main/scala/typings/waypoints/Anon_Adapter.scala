package typings.waypoints

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Adapter extends js.Object {
  var Adapter: WaypointAdapter
  var name: String
}

object Anon_Adapter {
  @scala.inline
  def apply(Adapter: WaypointAdapter, name: String): Anon_Adapter = {
    val __obj = js.Dynamic.literal(Adapter = Adapter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Adapter]
  }
}

