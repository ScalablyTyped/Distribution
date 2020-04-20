package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescending extends js.Object {
  var ascending: Double
  var descending: Double
  var none: Double
}

object AnonDescending {
  @scala.inline
  def apply(ascending: Double, descending: Double, none: Double): AnonDescending = {
    val __obj = js.Dynamic.literal(ascending = ascending.asInstanceOf[js.Any], descending = descending.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDescending]
  }
}

