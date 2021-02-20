package typings.winrtUwp.Windows.Devices.WiFiDirect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WiFiDirectAdvertisementPublisherStatus extends StObject
/** Represents the possible states of the WiFiDirectAdvertisementPublisher . */
@JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectAdvertisementPublisherStatus")
@js.native
object WiFiDirectAdvertisementPublisherStatus extends StObject {
  
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
}
