package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the FaceDetected event. */
trait FaceDetectedEventArgs extends js.Object {
  /** Gets the FaceDetectionEffectFrame associated with a FaceDetected event. */
  var resultFrame: FaceDetectionEffectFrame
}

object FaceDetectedEventArgs {
  @scala.inline
  def apply(resultFrame: FaceDetectionEffectFrame): FaceDetectedEventArgs = {
    val __obj = js.Dynamic.literal(resultFrame = resultFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceDetectedEventArgs]
  }
}

