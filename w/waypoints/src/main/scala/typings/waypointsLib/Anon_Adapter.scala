package typings
package waypointsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Adapter extends js.Object {
  var Adapter: WaypointAdapter
  var name: java.lang.String
}

object Anon_Adapter {
  @scala.inline
  def apply(Adapter: WaypointAdapter, name: java.lang.String): Anon_Adapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Adapter")(Adapter)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_Adapter]
  }
}

