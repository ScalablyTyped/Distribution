package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIncludeEventTypeInformation extends js.Object {
  var includeEventTypeInformation: Double
  var includeGroup: Double
  var includeUser: Double
  var includeUserAndGroup: Double
  var none: Double
}

object AnonIncludeEventTypeInformation {
  @scala.inline
  def apply(
    includeEventTypeInformation: Double,
    includeGroup: Double,
    includeUser: Double,
    includeUserAndGroup: Double,
    none: Double
  ): AnonIncludeEventTypeInformation = {
    val __obj = js.Dynamic.literal(includeEventTypeInformation = includeEventTypeInformation.asInstanceOf[js.Any], includeGroup = includeGroup.asInstanceOf[js.Any], includeUser = includeUser.asInstanceOf[js.Any], includeUserAndGroup = includeUserAndGroup.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIncludeEventTypeInformation]
  }
}

