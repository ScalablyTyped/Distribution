package typings.winrtDashUwp.Windows.Devices.WiFiDirect

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Devices.WiFiDirect.WiFiDirectAdvertisementListenStateDiscoverability.intensive
import typings.winrtDashUwp.Windows.Devices.WiFiDirect.WiFiDirectAdvertisementListenStateDiscoverability.none
import typings.winrtDashUwp.Windows.Devices.WiFiDirect.WiFiDirectAdvertisementListenStateDiscoverability.normal
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WiFiDirectAdvertisementListenStateDiscoverability with Double] = js.native
  /* 2 */ @js.native
  object intensive extends TopLevel[intensive with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object normal extends TopLevel[normal with Double]
  
}

