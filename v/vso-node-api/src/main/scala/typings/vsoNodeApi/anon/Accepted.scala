package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Accepted extends js.Object {
  var accepted: scala.Double
  var open: scala.Double
  var rejected: scala.Double
}

object Accepted {
  @scala.inline
  def apply(accepted: scala.Double, open: scala.Double, rejected: scala.Double): Accepted = {
    val __obj = js.Dynamic.literal(accepted = accepted.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accepted]
  }
}

