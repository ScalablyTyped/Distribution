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
  
  val none: none with java.lang.String = js.native
  val photo: photo with java.lang.String = js.native
  val video: video with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.CaptureUse with java.lang.String] = js.native
}

