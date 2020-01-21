package typings.winrtUwp.Windows.Media.DialProtocol

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DialDeviceDisplayStatus extends js.Object

/** The possible statuses a DIAL device can have in the DIAL device picker. You can use these to adjust the sub-status and other visual attributes for a particular device in the picker. */
@JSGlobal("Windows.Media.DialProtocol.DialDeviceDisplayStatus")
@js.native
object DialDeviceDisplayStatus extends js.Object {
  /** The device is connected. */
  @js.native
  sealed trait connected extends DialDeviceDisplayStatus
  
  /** The device is attempting to connect. */
  @js.native
  sealed trait connecting extends DialDeviceDisplayStatus
  
  /** The device is disconnected. */
  @js.native
  sealed trait disconnected extends DialDeviceDisplayStatus
  
  /** The device is attempting to disconnect. */
  @js.native
  sealed trait disconnecting extends DialDeviceDisplayStatus
  
  /** The device shows an error. */
  @js.native
  sealed trait error extends DialDeviceDisplayStatus
  
  /** The device is not connected. */
  @js.native
  sealed trait none extends DialDeviceDisplayStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DialDeviceDisplayStatus with Double] = js.native
  /* 2 */ @js.native
  object connected extends TopLevel[connected with Double]
  
  /* 1 */ @js.native
  object connecting extends TopLevel[connecting with Double]
  
  /* 4 */ @js.native
  object disconnected extends TopLevel[disconnected with Double]
  
  /* 3 */ @js.native
  object disconnecting extends TopLevel[disconnecting with Double]
  
  /* 5 */ @js.native
  object error extends TopLevel[error with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

