package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilterIllegalMemberships extends js.Object {
  var filterIllegalMemberships: Double
  var none: Double
}

object AnonFilterIllegalMemberships {
  @scala.inline
  def apply(filterIllegalMemberships: Double, none: Double): AnonFilterIllegalMemberships = {
    val __obj = js.Dynamic.literal(filterIllegalMemberships = filterIllegalMemberships.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFilterIllegalMemberships]
  }
}

