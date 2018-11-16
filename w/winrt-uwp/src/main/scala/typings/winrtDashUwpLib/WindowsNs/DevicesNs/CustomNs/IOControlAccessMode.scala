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
  
  val any: any with java.lang.String = js.native
  val read: read with java.lang.String = js.native
  val readWrite: readWrite with java.lang.String = js.native
  val write: write with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.CustomNs.IOControlAccessMode with java.lang.String
  ] = js.native
}

