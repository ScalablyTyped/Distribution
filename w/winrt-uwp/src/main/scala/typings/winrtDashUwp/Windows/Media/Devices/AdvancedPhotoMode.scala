package typings.winrtDashUwp.Windows.Media.Devices

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Media.Devices.AdvancedPhotoMode.auto
import typings.winrtDashUwp.Windows.Media.Devices.AdvancedPhotoMode.hdr
import typings.winrtDashUwp.Windows.Media.Devices.AdvancedPhotoMode.standard
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AdvancedPhotoMode with Double] = js.native
  /* 0 */ @js.native
  object auto extends TopLevel[auto with Double]
  
  /* 2 */ @js.native
  object hdr extends TopLevel[hdr with Double]
  
  /* 1 */ @js.native
  object standard extends TopLevel[standard with Double]
  
}

