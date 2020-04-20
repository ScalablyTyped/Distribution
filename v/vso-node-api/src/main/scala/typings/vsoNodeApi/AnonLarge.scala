package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLarge extends js.Object {
  var large: Double
  var medium: Double
  var small: Double
}

object AnonLarge {
  @scala.inline
  def apply(large: Double, medium: Double, small: Double): AnonLarge = {
    val __obj = js.Dynamic.literal(large = large.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLarge]
  }
}

