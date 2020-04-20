package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBoth extends js.Object {
  var both: Double
  var none: Double
  var team: Double
  var user: Double
}

object AnonBoth {
  @scala.inline
  def apply(both: Double, none: Double, team: Double, user: Double): AnonBoth = {
    val __obj = js.Dynamic.literal(both = both.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBoth]
  }
}

