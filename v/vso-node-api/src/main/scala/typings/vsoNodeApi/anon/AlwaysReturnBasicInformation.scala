package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlwaysReturnBasicInformation extends js.Object {
  var alwaysReturnBasicInformation: scala.Double
  var includeDeletedSubscriptions: scala.Double
  var includeFilterDetails: scala.Double
  var includeInvalidSubscriptions: scala.Double
  var none: scala.Double
}

object AlwaysReturnBasicInformation {
  @scala.inline
  def apply(
    alwaysReturnBasicInformation: scala.Double,
    includeDeletedSubscriptions: scala.Double,
    includeFilterDetails: scala.Double,
    includeInvalidSubscriptions: scala.Double,
    none: scala.Double
  ): AlwaysReturnBasicInformation = {
    val __obj = js.Dynamic.literal(alwaysReturnBasicInformation = alwaysReturnBasicInformation.asInstanceOf[js.Any], includeDeletedSubscriptions = includeDeletedSubscriptions.asInstanceOf[js.Any], includeFilterDetails = includeFilterDetails.asInstanceOf[js.Any], includeInvalidSubscriptions = includeInvalidSubscriptions.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlwaysReturnBasicInformation]
  }
}

