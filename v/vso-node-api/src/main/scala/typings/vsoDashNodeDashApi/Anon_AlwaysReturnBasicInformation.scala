package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlwaysReturnBasicInformation extends js.Object {
  var alwaysReturnBasicInformation: Double
  var includeDeletedSubscriptions: Double
  var includeFilterDetails: Double
  var includeInvalidSubscriptions: Double
  var none: Double
}

object Anon_AlwaysReturnBasicInformation {
  @scala.inline
  def apply(
    alwaysReturnBasicInformation: Double,
    includeDeletedSubscriptions: Double,
    includeFilterDetails: Double,
    includeInvalidSubscriptions: Double,
    none: Double
  ): Anon_AlwaysReturnBasicInformation = {
    val __obj = js.Dynamic.literal(alwaysReturnBasicInformation = alwaysReturnBasicInformation, includeDeletedSubscriptions = includeDeletedSubscriptions, includeFilterDetails = includeFilterDetails, includeInvalidSubscriptions = includeInvalidSubscriptions, none = none)
  
    __obj.asInstanceOf[Anon_AlwaysReturnBasicInformation]
  }
}

