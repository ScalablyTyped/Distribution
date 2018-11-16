package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a video frame that includes a list of faces detected by the FaceDetectionEffect . */
@JSGlobal("Windows.Media.Core.FaceDetectionEffectFrame")
@js.native
abstract class FaceDetectionEffectFrame () extends js.Object {
  /** Gets the list of objects representing the faces detected in the frame. */
  var detectedFaces: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtDashUwpLib.WindowsNs.MediaNs.FaceAnalysisNs.DetectedFace] = js.native
  /** Gets or sets the duration of the face detection effect frame. */
  var duration: scala.Double = js.native
  /** Gets the extended property set which enables getting and setting properties on the media frame. */
  var extendedProperties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet = js.native
  /** Gets or sets a value that indicates whether a video frame is the first frame after a gap in the stream. */
  var isDiscontinuous: scala.Boolean = js.native
  /** Gets a value indicating whether the frame is read-only. */
  var isReadOnly: scala.Boolean = js.native
  /** Gets or sets the relative time of the frame within the video stream. */
  var relativeTime: scala.Double = js.native
  /** Gets or sets a timestamp that is relative to the system and is correlatable across multiple media sources on the same device. */
  var systemRelativeTime: scala.Double = js.native
  /** Gets a string indicating the type of data the frame contains. */
  var `type`: java.lang.String = js.native
  /** Disposes of the object and associated resources. */
  def close(): scala.Unit = js.native
}

