package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAscendingDescending extends js.Object {
  var ascending: Double
  var descending: Double
}

object AnonAscendingDescending {
  @scala.inline
  def apply(ascending: Double, descending: Double): AnonAscendingDescending = {
    val __obj = js.Dynamic.literal(ascending = ascending.asInstanceOf[js.Any], descending = descending.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAscendingDescending]
  }
}

