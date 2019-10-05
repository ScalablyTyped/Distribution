package typings.winrtDashUwp.Windows.Devices.WiFiDirect

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
  sealed trait aborted extends WiFiDirectAdvertisementPublisherStatus
  
  /** The initial status of the publisher. */
  @js.native
  sealed trait created extends WiFiDirectAdvertisementPublisherStatus
  
  /** The publisher is started and advertisements are being published. */
  @js.native
  sealed trait started extends WiFiDirectAdvertisementPublisherStatus
  
  /** The publisher is stopped. */
  @js.native
  sealed trait stopped extends WiFiDirectAdvertisementPublisherStatus
  
  /* 3 */ val aborted: typings.winrtDashUwp.Windows.Devices.WiFiDirect.WiFiDirectAdvertisementPublisherStatus.aborted with Double = js.native
  /* 0 */ val created: typings.winrtDashUwp.Windows.Devices.WiFiDirect.WiFiDirectAdvertisementPublisherStatus.created with Double = js.native
  /* 1 */ val started: typings.winrtDashUwp.Windows.Devices.WiFiDirect.WiFiDirectAdvertisementPublisherStatus.started with Double = js.native
  /* 2 */ val stopped: typings.winrtDashUwp.Windows.Devices.WiFiDirect.WiFiDirectAdvertisementPublisherStatus.stopped with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WiFiDirectAdvertisementPublisherStatus with Double] = js.native
}

