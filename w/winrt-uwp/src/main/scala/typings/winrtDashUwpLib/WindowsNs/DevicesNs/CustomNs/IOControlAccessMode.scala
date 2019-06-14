package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.CustomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IOControlAccessMode extends js.Object

/** Identifies the access mode. */
@JSGlobal("Windows.Devices.Custom.IOControlAccessMode")
@js.native
object IOControlAccessMode extends js.Object {
  /** Any mode. */
  @js.native
  sealed trait any
    extends winrtDashUwpLib.WindowsNs.DevicesNs.CustomNs.IOControlAccessMode
  
  /** Read mode. */
  @js.native
  sealed trait read
    extends winrtDashUwpLib.WindowsNs.DevicesNs.CustomNs.IOControlAccessMode
  
  /** Read/write mode. */
  @js.native
  sealed trait readWrite
    extends winrtDashUwpLib.WindowsNs.DevicesNs.CustomNs.IOControlAccessMode
  
  /** Write mode. */
  @js.native
  sealed trait write
    extends winrtDashUwpLib.WindowsNs.DevicesNs.CustomNs.IOControlAccessMode
  
  /* 0 */ val any: any with scala.Double = js.native
  /* 1 */ val read: read with scala.Double = js.native
  /* 3 */ val readWrite: readWrite with scala.Double = js.native
  /* 2 */ val write: write with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.CustomNs.IOControlAccessMode with scala.Double
  ] = js.native
}

