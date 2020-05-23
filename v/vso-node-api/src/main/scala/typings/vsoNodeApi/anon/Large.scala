package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Large extends js.Object {
  var large: scala.Double
  var medium: scala.Double
  var small: scala.Double
}

object Large {
  @scala.inline
  def apply(large: scala.Double, medium: scala.Double, small: scala.Double): Large = {
    val __obj = js.Dynamic.literal(large = large.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any])
    __obj.asInstanceOf[Large]
  }
}

