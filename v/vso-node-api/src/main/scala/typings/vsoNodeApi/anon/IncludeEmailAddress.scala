package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncludeEmailAddress extends js.Object {
  var includeEmailAddress: scala.Double
  var includeExtensions: scala.Double
  var none: scala.Double
}

object IncludeEmailAddress {
  @scala.inline
  def apply(includeEmailAddress: scala.Double, includeExtensions: scala.Double, none: scala.Double): IncludeEmailAddress = {
    val __obj = js.Dynamic.literal(includeEmailAddress = includeEmailAddress.asInstanceOf[js.Any], includeExtensions = includeExtensions.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeEmailAddress]
  }
}

