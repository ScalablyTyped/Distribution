package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WiFiDirectAdvertisementListenStateDiscoverability extends js.Object

/** Specifies whether the Wi-Fi Direct device is listening and discoverable. */
@JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectAdvertisementListenStateDiscoverability")
@js.native
object WiFiDirectAdvertisementListenStateDiscoverability extends js.Object {
  /** The device is discoverable when the app is in the foreground or in the background. */
  @js.native
  sealed trait intensive
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.WiFiDirectAdvertisementListenStateDiscoverability
  
  /** The device is not discoverable. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.WiFiDirectAdvertisementListenStateDiscoverability
  
  /** The device is highly discoverable so long as the app is in the foreground. */
  @js.native
  sealed trait normal
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.WiFiDirectAdvertisementListenStateDiscoverability
  
  val intensive: intensive with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val normal: normal with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.WiFiDirectAdvertisementListenStateDiscoverability with java.lang.String
  ] = js.native
}

