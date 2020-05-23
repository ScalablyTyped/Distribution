package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Both extends js.Object {
  var both: scala.Double
  var none: scala.Double
  var team: scala.Double
  var user: scala.Double
}

object Both {
  @scala.inline
  def apply(both: scala.Double, none: scala.Double, team: scala.Double, user: scala.Double): Both = {
    val __obj = js.Dynamic.literal(both = both.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Both]
  }
}

