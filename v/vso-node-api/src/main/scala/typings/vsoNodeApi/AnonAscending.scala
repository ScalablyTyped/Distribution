package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAscending extends js.Object {
  var ascending: Double
  var default: Double
  var descending: Double
}

object AnonAscending {
  @scala.inline
  def apply(ascending: Double, default: Double, descending: Double): AnonAscending = {
    val __obj = js.Dynamic.literal(ascending = ascending.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], descending = descending.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAscending]
  }
}

