package typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs

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
  sealed trait auto extends AdvancedPhotoMode
  
  /** High Dynamic Range (HDR) capture mode. */
  @js.native
  sealed trait hdr extends AdvancedPhotoMode
  
  /** Standard capture mode. */
  @js.native
  sealed trait standard extends AdvancedPhotoMode
  
  /* 0 */ val auto: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.AdvancedPhotoMode.auto with Double = js.native
  /* 2 */ val hdr: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.AdvancedPhotoMode.hdr with Double = js.native
  /* 1 */ val standard: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.AdvancedPhotoMode.standard with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AdvancedPhotoMode with Double] = js.native
}

