package typings.winrtDashUwp.Windows.Devices.Custom

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeviceSharingMode extends js.Object

/** The device sharing mode. */
@JSGlobal("Windows.Devices.Custom.DeviceSharingMode")
@js.native
object DeviceSharingMode extends js.Object {
  /** The device is exclusive. */
  @js.native
  sealed trait exclusive extends DeviceSharingMode
  
  /** The device is shared. */
  @js.native
  sealed trait shared extends DeviceSharingMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeviceSharingMode with Double] = js.native
  /* 1 */ @js.native
  object exclusive extends TopLevel[exclusive with Double]
  
  /* 0 */ @js.native
  object shared extends TopLevel[shared with Double]
  
}

