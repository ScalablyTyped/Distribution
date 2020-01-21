package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FaceDetectionMode with Double] = js.native
  /* 1 */ @js.native
  object balanced extends TopLevel[balanced with Double]
  
  /* 0 */ @js.native
  object highPerformance extends TopLevel[highPerformance with Double]
  
  /* 2 */ @js.native
  object highQuality extends TopLevel[highQuality with Double]
  
}

