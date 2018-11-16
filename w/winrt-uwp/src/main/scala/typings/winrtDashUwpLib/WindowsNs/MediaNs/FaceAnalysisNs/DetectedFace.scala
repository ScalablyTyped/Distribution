package typings
package winrtDashUwpLib.WindowsNs.MediaNs.FaceAnalysisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a face that was detected in a SoftwareBitmap or a VideoFrame . */
@JSGlobal("Windows.Media.FaceAnalysis.DetectedFace")
@js.native
abstract class DetectedFace () extends js.Object {
  /** Gets the bounds the detected face occupies in the SoftwareBitmap or VideoFrame . */
  var faceBox: winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapBounds = js.native
}

