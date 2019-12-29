package typings.winrtDashUwp.Windows.Devices.Enumeration

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeviceAccessStatus extends js.Object

/** Indicates the status of the access to a device. */
@JSGlobal("Windows.Devices.Enumeration.DeviceAccessStatus")
@js.native
object DeviceAccessStatus extends js.Object {
  /** Access to the device is allowed. */
  @js.native
  sealed trait allowed extends DeviceAccessStatus
  
  /** Access to the device has been disallowed by the system. */
  @js.native
  sealed trait deniedBySystem extends DeviceAccessStatus
  
  /** Access to the device has been disallowed by the user. */
  @js.native
  sealed trait deniedByUser extends DeviceAccessStatus
  
  /** The device access is not specified. */
  @js.native
  sealed trait unspecified extends DeviceAccessStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeviceAccessStatus with Double] = js.native
  /* 1 */ @js.native
  object allowed extends TopLevel[allowed with Double]
  
  /* 3 */ @js.native
  object deniedBySystem extends TopLevel[deniedBySystem with Double]
  
  /* 2 */ @js.native
  object deniedByUser extends TopLevel[deniedByUser with Double]
  
  /* 0 */ @js.native
  object unspecified extends TopLevel[unspecified with Double]
  
}

