package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs

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
  sealed trait available
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceStatus
  
  /** The service is not currently accepting connections. */
  @js.native
  sealed trait busy
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceStatus
  
  /** The service is returning service-defined custom status values. Get the status value from the WiFiDirectServiceAdvertiser.CustomServiceStatusCode property. */
  @js.native
  sealed trait custom
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceStatus
  
  /* 0 */ val available: available with scala.Double = js.native
  /* 1 */ val busy: busy with scala.Double = js.native
  /* 2 */ val custom: custom with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.ServicesNs.WiFiDirectServiceStatus with scala.Double
  ] = js.native
}

