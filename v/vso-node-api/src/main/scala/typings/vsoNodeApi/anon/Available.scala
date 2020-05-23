package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Available extends js.Object {
  var available: scala.Double
  var offline: scala.Double
  var unavailable: scala.Double
}

object Available {
  @scala.inline
  def apply(available: scala.Double, offline: scala.Double, unavailable: scala.Double): Available = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], offline = offline.asInstanceOf[js.Any], unavailable = unavailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Available]
  }
}

