package typings.winrtDashUwp.Windows.Devices.WiFiDirect.Services

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WiFiDirectServiceError with Double] = js.native
  /* 4 */ @js.native
  object noHardware extends TopLevel[noHardware with Double]
  
  /* 1 */ @js.native
  object radioNotAvailable extends TopLevel[radioNotAvailable with Double]
  
  /* 2 */ @js.native
  object resourceInUse extends TopLevel[resourceInUse with Double]
  
  /* 0 */ @js.native
  object success extends TopLevel[success with Double]
  
  /* 3 */ @js.native
  object unsupportedHardware extends TopLevel[unsupportedHardware with Double]
  
}

