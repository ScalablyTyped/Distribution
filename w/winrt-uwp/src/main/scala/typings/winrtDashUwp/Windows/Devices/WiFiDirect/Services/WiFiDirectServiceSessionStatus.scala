package typings.winrtDashUwp.Windows.Devices.WiFiDirect.Services

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionStatus.closed
import typings.winrtDashUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionStatus.initiated
import typings.winrtDashUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionStatus.open
import typings.winrtDashUwp.Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionStatus.requested
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WiFiDirectServiceSessionStatus extends js.Object

/** Values used to describe the status of a Wi-Fi Direct Service Session. */
@JSGlobal("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionStatus")
@js.native
object WiFiDirectServiceSessionStatus extends js.Object {
  /** The session has been closed. */
  @js.native
  sealed trait closed extends WiFiDirectServiceSessionStatus
  
  /** The session has been initiated. */
  @js.native
  sealed trait initiated extends WiFiDirectServiceSessionStatus
  
  /** The session is open. */
  @js.native
  sealed trait open extends WiFiDirectServiceSessionStatus
  
  /** A session has been requested. */
  @js.native
  sealed trait requested extends WiFiDirectServiceSessionStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WiFiDirectServiceSessionStatus with Double] = js.native
  /* 0 */ @js.native
  object closed extends TopLevel[closed with Double]
  
  /* 1 */ @js.native
  object initiated extends TopLevel[initiated with Double]
  
  /* 3 */ @js.native
  object open extends TopLevel[open with Double]
  
  /* 2 */ @js.native
  object requested extends TopLevel[requested with Double]
  
}

