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
  
  val aborted: aborted with java.lang.String = js.native
  val created: created with java.lang.String = js.native
  val started: started with java.lang.String = js.native
  val stopped: stopped with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs.WiFiDirectAdvertisementPublisherStatus with java.lang.String
  ] = js.native
}

