package typings.winrtUwp.Windows.Devices.WiFiDirect.Services

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WiFiDirectServiceStatus with Double] = js.native
  /* 0 */ @js.native
  object available extends TopLevel[available with Double]
  
  /* 1 */ @js.native
  object busy extends TopLevel[busy with Double]
  
  /* 2 */ @js.native
  object custom extends TopLevel[custom with Double]
  
}

