package typings.winrtDashUwp.Windows.Media.Core

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
  sealed trait balanced extends FaceDetectionMode
  
  /** The speed of face detection is prioritized over the accuracy of the face detection results. */
  @js.native
  sealed trait highPerformance extends FaceDetectionMode
  
  /** The accuracy of face detection results is prioritized over the speed of face detection. */
  @js.native
  sealed trait highQuality extends FaceDetectionMode
  
  /* 1 */ val balanced: typings.winrtDashUwp.Windows.Media.Core.FaceDetectionMode.balanced with Double = js.native
  /* 0 */ val highPerformance: typings.winrtDashUwp.Windows.Media.Core.FaceDetectionMode.highPerformance with Double = js.native
  /* 2 */ val highQuality: typings.winrtDashUwp.Windows.Media.Core.FaceDetectionMode.highQuality with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FaceDetectionMode with Double] = js.native
}

