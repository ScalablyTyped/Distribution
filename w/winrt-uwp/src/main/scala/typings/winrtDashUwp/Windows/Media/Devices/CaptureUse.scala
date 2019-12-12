package typings.winrtDashUwp.Windows.Media.Devices

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Media.Devices.CaptureUse.none
import typings.winrtDashUwp.Windows.Media.Devices.CaptureUse.photo
import typings.winrtDashUwp.Windows.Media.Devices.CaptureUse.video
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CaptureUse with Double] = js.native
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object photo extends TopLevel[photo with Double]
  
  /* 2 */ @js.native
  object video extends TopLevel[video with Double]
  
}

