package typings.winrtDashUwp.Windows.Devices.WiFiDirect.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WiFiDirectServiceError extends js.Object

/** Values used for the WiFiDirectServiceAdvertiser.ServiceError property. */
@JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceError")
@js.native
object WiFiDirectServiceError extends js.Object {
  /** No Wi-Fi adapter is found. */
  @js.native
  sealed trait noHardware extends WiFiDirectServiceError
  
  /** The Wi-Fi Direct radio is not available. */
  @js.native
  sealed trait radioNotAvailable extends WiFiDirectServiceError
  
  /** A required resource is in use. */
  @js.native
  sealed trait resourceInUse extends WiFiDirectServiceError
  
  /** No error. */
  @js.native
  sealed trait success extends WiFiDirectServiceError
  
  /** The Wi-Fi adapter does not support Wi-Fi Direct. */
  @js.native
  sealed trait unsupportedHardware extends WiFiDirectServiceError
  
  /* 4 */ val noHardware: typings.winrtDashUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceError.noHardware with Double = js.native
  /* 1 */ val radioNotAvailable: typings.winrtDashUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceError.radioNotAvailable with Double = js.native
  /* 2 */ val resourceInUse: typings.winrtDashUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceError.resourceInUse with Double = js.native
  /* 0 */ val success: typings.winrtDashUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceError.success with Double = js.native
  /* 3 */ val unsupportedHardware: typings.winrtDashUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceError.unsupportedHardware with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WiFiDirectServiceError with Double] = js.native
}

