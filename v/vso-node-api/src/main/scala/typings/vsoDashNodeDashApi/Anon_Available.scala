package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Available extends js.Object {
  var available: Double
  var offline: Double
  var unavailable: Double
}

object Anon_Available {
  @scala.inline
  def apply(available: Double, offline: Double, unavailable: Double): Anon_Available = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], offline = offline.asInstanceOf[js.Any], unavailable = unavailable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Available]
  }
}

