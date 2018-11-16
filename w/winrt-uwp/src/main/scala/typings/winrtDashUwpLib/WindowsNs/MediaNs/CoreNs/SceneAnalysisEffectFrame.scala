package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a video frame that includes the results of the scene analysis operation. */
@JSGlobal("Windows.Media.Core.SceneAnalysisEffectFrame")
@js.native
abstract class SceneAnalysisEffectFrame () extends js.Object {
  /** Gets or sets the duration of the scene analysis effect frame. */
  var duration: scala.Double = js.native
  /** Gets the extended property set which enables getting and setting properties on the media frame. */
  var extendedProperties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet = js.native
  /** Gets a CapturedFrameControlValues object that indicates the capture settings used for the frame. */
  var frameControlValues: winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.CapturedFrameControlValues = js.native
  /** Gets a HighDynamicRangeOutput object that provides recommended FrameController objects and a value indicating the certainty of the HDR analysis. */
  var highDynamicRange: HighDynamicRangeOutput = js.native
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

