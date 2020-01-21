package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIncludeEmailAddress extends js.Object {
  var includeEmailAddress: Double
  var includeExtensions: Double
  var none: Double
}

object AnonIncludeEmailAddress {
  @scala.inline
  def apply(includeEmailAddress: Double, includeExtensions: Double, none: Double): AnonIncludeEmailAddress = {
    val __obj = js.Dynamic.literal(includeEmailAddress = includeEmailAddress.asInstanceOf[js.Any], includeExtensions = includeExtensions.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIncludeEmailAddress]
  }
}

