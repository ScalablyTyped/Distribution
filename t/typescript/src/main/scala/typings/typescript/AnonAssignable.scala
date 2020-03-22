package typings.typescript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAssignable extends js.Object {
  var assignable: Double
  var identity: Double
  var strictSubtype: Double
  var subtype: Double
}

object AnonAssignable {
  @scala.inline
  def apply(assignable: Double, identity: Double, strictSubtype: Double, subtype: Double): AnonAssignable = {
    val __obj = js.Dynamic.literal(assignable = assignable.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], strictSubtype = strictSubtype.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAssignable]
  }
}

