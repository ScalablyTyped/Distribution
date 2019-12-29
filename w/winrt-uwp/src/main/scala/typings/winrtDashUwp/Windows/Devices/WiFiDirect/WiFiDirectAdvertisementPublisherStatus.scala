package typings.winrtDashUwp.Windows.Devices.WiFiDirect

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WiFiDirectAdvertisementPublisherStatus with Double] = js.native
  /* 3 */ @js.native
  object aborted extends TopLevel[aborted with Double]
  
  /* 0 */ @js.native
  object created extends TopLevel[created with Double]
  
  /* 1 */ @js.native
  object started extends TopLevel[started with Double]
  
  /* 2 */ @js.native
  object stopped extends TopLevel[stopped with Double]
  
}

