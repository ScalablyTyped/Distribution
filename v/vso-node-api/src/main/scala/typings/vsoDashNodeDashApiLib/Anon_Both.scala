package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Both extends js.Object {
  var both: scala.Double
  var none: scala.Double
  var team: scala.Double
  var user: scala.Double
}

object Anon_Both {
  @scala.inline
  def apply(both: scala.Double, none: scala.Double, team: scala.Double, user: scala.Double): Anon_Both = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("both")(both)
    __obj.updateDynamic("none")(none)
    __obj.updateDynamic("team")(team)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[Anon_Both]
  }
}

