package typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiDirectNs

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
  sealed trait intensive extends WiFiDirectAdvertisementListenStateDiscoverability
  
  /** The device is not discoverable. */
  @js.native
  sealed trait none extends WiFiDirectAdvertisementListenStateDiscoverability
  
  /** The device is highly discoverable so long as the app is in the foreground. */
  @js.native
  sealed trait normal extends WiFiDirectAdvertisementListenStateDiscoverability
  
  /* 2 */ val intensive: typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiDirectNs.WiFiDirectAdvertisementListenStateDiscoverability.intensive with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiDirectNs.WiFiDirectAdvertisementListenStateDiscoverability.none with Double = js.native
  /* 1 */ val normal: typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiDirectNs.WiFiDirectAdvertisementListenStateDiscoverability.normal with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WiFiDirectAdvertisementListenStateDiscoverability with Double] = js.native
}

