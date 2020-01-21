package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the FaceDetected event. */
@JSGlobal("Windows.Media.Core.FaceDetectedEventArgs")
@js.native
abstract class FaceDetectedEventArgs () extends js.Object {
  /** Gets the FaceDetectionEffectFrame associated with a FaceDetected event. */
  var resultFrame: FaceDetectionEffectFrame = js.native
}

