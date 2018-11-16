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
  
  val auto: auto with java.lang.String = js.native
  val hdr: hdr with java.lang.String = js.native
  val standard: standard with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.AdvancedPhotoMode with java.lang.String
  ] = js.native
}

