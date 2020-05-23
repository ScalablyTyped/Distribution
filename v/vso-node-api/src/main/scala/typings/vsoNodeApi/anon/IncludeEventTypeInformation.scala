package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncludeEventTypeInformation extends js.Object {
  var includeEventTypeInformation: scala.Double
  var includeGroup: scala.Double
  var includeUser: scala.Double
  var includeUserAndGroup: scala.Double
  var none: scala.Double
}

object IncludeEventTypeInformation {
  @scala.inline
  def apply(
    includeEventTypeInformation: scala.Double,
    includeGroup: scala.Double,
    includeUser: scala.Double,
    includeUserAndGroup: scala.Double,
    none: scala.Double
  ): IncludeEventTypeInformation = {
    val __obj = js.Dynamic.literal(includeEventTypeInformation = includeEventTypeInformation.asInstanceOf[js.Any], includeGroup = includeGroup.asInstanceOf[js.Any], includeUser = includeUser.asInstanceOf[js.Any], includeUserAndGroup = includeUserAndGroup.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeEventTypeInformation]
  }
}

