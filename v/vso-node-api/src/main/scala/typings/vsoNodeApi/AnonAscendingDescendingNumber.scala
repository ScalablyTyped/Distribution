package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAscendingDescendingNumber extends js.Object {
  var ascending: Double
  var descending: Double
}

object AnonAscendingDescendingNumber {
  @scala.inline
  def apply(ascending: Double, descending: Double): AnonAscendingDescendingNumber = {
    val __obj = js.Dynamic.literal(ascending = ascending.asInstanceOf[js.Any], descending = descending.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAscendingDescendingNumber]
  }
}

