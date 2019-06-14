package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FaceDetectionMode extends js.Object

/** Specifies the mode used for face detection. */
@JSGlobal("Windows.Media.Core.FaceDetectionMode")
@js.native
object FaceDetectionMode extends js.Object {
  /** The prioritization of detection speed and result quality are balanced. */
  @js.native
  sealed trait balanced
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.FaceDetectionMode
  
  /** The speed of face detection is prioritized over the accuracy of the face detection results. */
  @js.native
  sealed trait highPerformance
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.FaceDetectionMode
  
  /** The accuracy of face detection results is prioritized over the speed of face detection. */
  @js.native
  sealed trait highQuality
    extends winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.FaceDetectionMode
  
  /* 1 */ val balanced: balanced with scala.Double = js.native
  /* 0 */ val highPerformance: highPerformance with scala.Double = js.native
  /* 2 */ val highQuality: highQuality with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.FaceDetectionMode with scala.Double] = js.native
}

