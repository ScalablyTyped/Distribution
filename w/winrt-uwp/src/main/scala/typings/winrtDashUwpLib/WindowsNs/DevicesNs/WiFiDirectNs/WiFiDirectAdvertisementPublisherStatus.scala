package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WiFiDirectAdvertisementPublisherStatus extends js.Object

/** Represents the possible states of the WiFiDirectAdvertisementPublisher . */
@JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectAdvertisementPublisherStatus")
@js.native
object WiFiDirectAdvertisementPublisherStatus extends js.Object {
  /** The publisher is aborted due to error. */
  @js.native
  sealed trait aborted
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.WiFiDirectAdvertisementPublisherStatus
  
  /** The initial status of the publisher. */
  @js.native
  sealed trait created
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.WiFiDirectAdvertisementPublisherStatus
  
  /** The publisher is started and advertisements are being published. */
  @js.native
  sealed trait started
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.WiFiDirectAdvertisementPublisherStatus
  
  /** The publisher is stopped. */
  @js.native
  sealed trait stopped
    extends winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.WiFiDirectAdvertisementPublisherStatus
  
  /* 3 */ val aborted: aborted with scala.Double = js.native
  /* 0 */ val created: created with scala.Double = js.native
  /* 1 */ val started: started with scala.Double = js.native
  /* 2 */ val stopped: stopped with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.WiFiDirectAdvertisementPublisherStatus with scala.Double
  ] = js.native
}

