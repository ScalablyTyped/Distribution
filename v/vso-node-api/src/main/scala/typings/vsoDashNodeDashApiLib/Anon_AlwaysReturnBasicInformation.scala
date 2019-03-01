package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlwaysReturnBasicInformation extends js.Object {
  var alwaysReturnBasicInformation: scala.Double
  var includeDeletedSubscriptions: scala.Double
  var includeFilterDetails: scala.Double
  var includeInvalidSubscriptions: scala.Double
  var none: scala.Double
}

object Anon_AlwaysReturnBasicInformation {
  @scala.inline
  def apply(
    alwaysReturnBasicInformation: scala.Double,
    includeDeletedSubscriptions: scala.Double,
    includeFilterDetails: scala.Double,
    includeInvalidSubscriptions: scala.Double,
    none: scala.Double
  ): Anon_AlwaysReturnBasicInformation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alwaysReturnBasicInformation")(alwaysReturnBasicInformation)
    __obj.updateDynamic("includeDeletedSubscriptions")(includeDeletedSubscriptions)
    __obj.updateDynamic("includeFilterDetails")(includeFilterDetails)
    __obj.updateDynamic("includeInvalidSubscriptions")(includeInvalidSubscriptions)
    __obj.updateDynamic("none")(none)
    __obj.asInstanceOf[Anon_AlwaysReturnBasicInformation]
  }
}

