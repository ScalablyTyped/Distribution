package typings.winrtDashUwp.Windows.Devices.Bluetooth.GenericAttributeProfile

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GattCommunicationStatus extends js.Object

/** Represents the return status of a WinRT GATT API related Async operation. */
@JSGlobal("Windows.Devices.Bluetooth.GenericAttributeProfile.GattCommunicationStatus")
@js.native
object GattCommunicationStatus extends js.Object {
  /** The operation completed successfully. */
  @js.native
  sealed trait success extends GattCommunicationStatus
  
  /** No communication can be performed with the device, at this time. */
  @js.native
  sealed trait unreachable extends GattCommunicationStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GattCommunicationStatus with Double] = js.native
  /* 0 */ @js.native
  object success extends TopLevel[success with Double]
  
  /* 1 */ @js.native
  object unreachable extends TopLevel[unreachable with Double]
  
}

