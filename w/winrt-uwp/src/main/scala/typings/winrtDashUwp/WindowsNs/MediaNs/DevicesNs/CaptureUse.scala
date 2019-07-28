package typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs

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
  sealed trait none extends CaptureUse
  
  /** The capture device is used primarily for photos. */
  @js.native
  sealed trait photo extends CaptureUse
  
  /** The capture device is used primarily for video. */
  @js.native
  sealed trait video extends CaptureUse
  
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.CaptureUse.none with Double = js.native
  /* 1 */ val photo: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.CaptureUse.photo with Double = js.native
  /* 2 */ val video: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.CaptureUse.video with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CaptureUse with Double] = js.native
}

