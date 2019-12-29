package typings.winrtDashUwp.Windows.Media.Capture

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CameraCaptureUIMaxVideoResolution extends js.Object

/** Determines the highest resolution the user can select for capturing video. */
@JSGlobal("Windows.Media.Capture.CameraCaptureUIMaxVideoResolution")
@js.native
object CameraCaptureUIMaxVideoResolution extends js.Object {
  /** The user can select resolutions up to high definition resolutions. */
  @js.native
  sealed trait highDefinition extends CameraCaptureUIMaxVideoResolution
  
  /** The user can select any resolution. */
  @js.native
  sealed trait highestAvailable extends CameraCaptureUIMaxVideoResolution
  
  /** The user can select resolutions up to low definition resolutions. */
  @js.native
  sealed trait lowDefinition extends CameraCaptureUIMaxVideoResolution
  
  /** The user can select resolutions up to standard definition resolutions. */
  @js.native
  sealed trait standardDefinition extends CameraCaptureUIMaxVideoResolution
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CameraCaptureUIMaxVideoResolution with Double] = js.native
  /* 3 */ @js.native
  object highDefinition extends TopLevel[highDefinition with Double]
  
  /* 0 */ @js.native
  object highestAvailable extends TopLevel[highestAvailable with Double]
  
  /* 1 */ @js.native
  object lowDefinition extends TopLevel[lowDefinition with Double]
  
  /* 2 */ @js.native
  object standardDefinition extends TopLevel[standardDefinition with Double]
  
}

