package typings
package winrtLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CameraCaptureUIMaxVideoResolution extends js.Object

@JSGlobal("Windows.Media.Capture.CameraCaptureUIMaxVideoResolution")
@js.native
object CameraCaptureUIMaxVideoResolution extends js.Object {
  @js.native
  sealed trait highDefinition
    extends winrtLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMaxVideoResolution
  
  @js.native
  sealed trait highestAvailable
    extends winrtLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMaxVideoResolution
  
  @js.native
  sealed trait lowDefinition
    extends winrtLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMaxVideoResolution
  
  @js.native
  sealed trait standardDefinition
    extends winrtLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMaxVideoResolution
  
  val highDefinition: highDefinition with java.lang.String = js.native
  val highestAvailable: highestAvailable with java.lang.String = js.native
  val lowDefinition: lowDefinition with java.lang.String = js.native
  val standardDefinition: standardDefinition with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.MediaNs.CaptureNs.CameraCaptureUIMaxVideoResolution with java.lang.String
  ] = js.native
}

