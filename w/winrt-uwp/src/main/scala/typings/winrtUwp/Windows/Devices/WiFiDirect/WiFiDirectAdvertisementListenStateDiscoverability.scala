package typings.winrtUwp.Windows.Devices.WiFiDirect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WiFiDirectAdvertisementListenStateDiscoverability extends StObject
/** Specifies whether the Wi-Fi Direct device is listening and discoverable. */
@JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectAdvertisementListenStateDiscoverability")
@js.native
object WiFiDirectAdvertisementListenStateDiscoverability extends StObject {
  
  /** The device is discoverable when the app is in the foreground or in the background. */
  @js.native
  sealed trait intensive
    extends StObject
       with WiFiDirectAdvertisementListenStateDiscoverability
  
  /** The device is not discoverable. */
  @js.native
  sealed trait none
    extends StObject
       with WiFiDirectAdvertisementListenStateDiscoverability
  
  /** The device is highly discoverable so long as the app is in the foreground. */
  @js.native
  sealed trait normal
    extends StObject
       with WiFiDirectAdvertisementListenStateDiscoverability
}
