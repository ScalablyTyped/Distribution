package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CaptureUse extends js.Object

/** Defines the values for the primary use of the capture device. */
@JSGlobal("Windows.Media.Devices.CaptureUse")
@js.native
object CaptureUse extends js.Object {
  /** The capture device does not have a primary use. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.CaptureUse
  
  /** The capture device is used primarily for photos. */
  @js.native
  sealed trait photo
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.CaptureUse
  
  /** The capture device is used primarily for video. */
  @js.native
  sealed trait video
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.CaptureUse
  
  /* 0 */ val none: none with scala.Double = js.native
  /* 1 */ val photo: photo with scala.Double = js.native
  /* 2 */ val video: video with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.CaptureUse with scala.Double] = js.native
}

