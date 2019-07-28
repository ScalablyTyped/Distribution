package typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WiFiDirectServiceStatus extends js.Object

/** Values used to describe the service status. */
@JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceStatus")
@js.native
object WiFiDirectServiceStatus extends js.Object {
  /** The service is available. */
  @js.native
  sealed trait available extends WiFiDirectServiceStatus
  
  /** The service is not currently accepting connections. */
  @js.native
  sealed trait busy extends WiFiDirectServiceStatus
  
  /** The service is returning service-defined custom status values. Get the status value from the WiFiDirectServiceAdvertiser.CustomServiceStatusCode property. */
  @js.native
  sealed trait custom extends WiFiDirectServiceStatus
  
  /* 0 */ val available: typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceStatus.available with Double = js.native
  /* 1 */ val busy: typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceStatus.busy with Double = js.native
  /* 2 */ val custom: typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceStatus.custom with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WiFiDirectServiceStatus with Double] = js.native
}

