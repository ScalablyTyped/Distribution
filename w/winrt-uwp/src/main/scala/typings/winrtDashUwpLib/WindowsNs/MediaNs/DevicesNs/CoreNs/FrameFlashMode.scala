package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FrameFlashMode extends js.Object

/** Specifies the flash mode for a frame in a variable photo sequence. */
@JSGlobal("Windows.Media.Devices.Core.FrameFlashMode")
@js.native
object FrameFlashMode extends js.Object {
  /** The flash is disabled. */
  @js.native
  sealed trait disable
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.CoreNs.FrameFlashMode
  
  /** The flash is enabled. */
  @js.native
  sealed trait enable
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.CoreNs.FrameFlashMode
  
  /** The flash uses the global flash mode. */
  @js.native
  sealed trait global
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.CoreNs.FrameFlashMode
  
  val disable: disable with java.lang.String = js.native
  val enable: enable with java.lang.String = js.native
  val global: global with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.CoreNs.FrameFlashMode with java.lang.String
  ] = js.native
}

