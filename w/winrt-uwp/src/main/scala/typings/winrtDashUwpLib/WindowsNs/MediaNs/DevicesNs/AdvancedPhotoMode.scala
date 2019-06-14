package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AdvancedPhotoMode extends js.Object

/** Defines the advanced photo capture modes. */
@JSGlobal("Windows.Media.Devices.AdvancedPhotoMode")
@js.native
object AdvancedPhotoMode extends js.Object {
  /** The system dynamically determines the advanced photo capture mode. */
  @js.native
  sealed trait auto
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.AdvancedPhotoMode
  
  /** High Dynamic Range (HDR) capture mode. */
  @js.native
  sealed trait hdr
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.AdvancedPhotoMode
  
  /** Standard capture mode. */
  @js.native
  sealed trait standard
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.AdvancedPhotoMode
  
  /* 0 */ val auto: auto with scala.Double = js.native
  /* 2 */ val hdr: hdr with scala.Double = js.native
  /* 1 */ val standard: standard with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.AdvancedPhotoMode with scala.Double] = js.native
}

