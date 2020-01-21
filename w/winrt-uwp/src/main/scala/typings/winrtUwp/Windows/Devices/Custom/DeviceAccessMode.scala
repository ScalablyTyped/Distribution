package typings.winrtUwp.Windows.Devices.Custom

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeviceAccessMode extends js.Object

/** The device access mode. */
@JSGlobal("Windows.Devices.Custom.DeviceAccessMode")
@js.native
object DeviceAccessMode extends js.Object {
  /** Read access. */
  @js.native
  sealed trait read extends DeviceAccessMode
  
  /** Read/write access. */
  @js.native
  sealed trait readWrite extends DeviceAccessMode
  
  /** Write access. */
  @js.native
  sealed trait write extends DeviceAccessMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeviceAccessMode with Double] = js.native
  /* 0 */ @js.native
  object read extends TopLevel[read with Double]
  
  /* 2 */ @js.native
  object readWrite extends TopLevel[readWrite with Double]
  
  /* 1 */ @js.native
  object write extends TopLevel[write with Double]
  
}

