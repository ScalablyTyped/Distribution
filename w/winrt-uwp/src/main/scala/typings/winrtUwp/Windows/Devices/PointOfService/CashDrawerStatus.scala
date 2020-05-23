package typings.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the current power and availability status of the cash drawer. */
trait CashDrawerStatus extends js.Object {
  /** ExtendedStatus provides a way for a Point of Service driver or provider to send custom notifications to the app. */
  var extendedStatus: Double
  /** Gets the status kind for the cash drawer status. */
  var statusKind: CashDrawerStatusKind
}

object CashDrawerStatus {
  @scala.inline
  def apply(extendedStatus: Double, statusKind: CashDrawerStatusKind): CashDrawerStatus = {
    val __obj = js.Dynamic.literal(extendedStatus = extendedStatus.asInstanceOf[js.Any], statusKind = statusKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[CashDrawerStatus]
  }
}

