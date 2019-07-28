package typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the current power and availability status of the cash drawer. */
@JSGlobal("Windows.Devices.PointOfService.CashDrawerStatus")
@js.native
abstract class CashDrawerStatus () extends js.Object {
  /** ExtendedStatus provides a way for a Point of Service driver or provider to send custom notifications to the app. */
  var extendedStatus: Double = js.native
  /** Gets the status kind for the cash drawer status. */
  var statusKind: CashDrawerStatusKind = js.native
}

