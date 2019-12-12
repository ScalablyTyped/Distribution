package typings.winrtDashUwp.Windows.Devices.WiFiDirect

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Devices.WiFiDirect.WiFiDirectError.radioNotAvailable
import typings.winrtDashUwp.Windows.Devices.WiFiDirect.WiFiDirectError.resourceInUse
import typings.winrtDashUwp.Windows.Devices.WiFiDirect.WiFiDirectError.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WiFiDirectError extends js.Object

/** Specifies some common Wi-Fi Direct error cases. */
@JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectError")
@js.native
object WiFiDirectError extends js.Object {
  /** The Wi-Fi Direct radio was not available. This error occurs when the Wi-Fi Direct radio has been turned off. */
  @js.native
  sealed trait radioNotAvailable extends WiFiDirectError
  
  /** The operation cannot be serviced because the necessary resources are currently in use. */
  @js.native
  sealed trait resourceInUse extends WiFiDirectError
  
  /** The operation was successfully completed or serviced. */
  @js.native
  sealed trait success extends WiFiDirectError
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WiFiDirectError with Double] = js.native
  /* 1 */ @js.native
  object radioNotAvailable extends TopLevel[radioNotAvailable with Double]
  
  /* 2 */ @js.native
  object resourceInUse extends TopLevel[resourceInUse with Double]
  
  /* 0 */ @js.native
  object success extends TopLevel[success with Double]
  
}

