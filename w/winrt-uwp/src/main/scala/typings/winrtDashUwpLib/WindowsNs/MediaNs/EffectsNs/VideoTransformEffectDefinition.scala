package typings
package winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the definition of a video transform effect. */
@JSGlobal("Windows.Media.Effects.VideoTransformEffectDefinition")
@js.native
/** Initializes a new instance of the VideoTransformEffectDefinition class. */
class VideoTransformEffectDefinition () extends js.Object {
  /** Gets the activatable class ID of the video transform effect definition. */
  var activatableClassId: java.lang.String = js.native
  /** Gets or sets the rectangle within which the video will be cropped, specified in pixels. */
  var cropRectangle: winrtDashUwpLib.WindowsNs.FoundationNs.Rect = js.native
  /** Gets or sets the direction in which the video will be mirrored. */
  var mirror: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaMirroringOptions = js.native
  /** Gets or sets the output size of the video, in pixels. */
  var outputSize: winrtDashUwpLib.WindowsNs.FoundationNs.Size = js.native
  /** Gets or sets the color that will be used to fill pixels in the frame that are not filled with video, such as when video is letterboxed. */
  var paddingColor: winrtDashUwpLib.WindowsNs.UINs.Color = js.native
  /** Gets or sets the media processing algorithm that is used for the video transform. */
  var processingAlgorithm: winrtDashUwpLib.WindowsNs.MediaNs.TranscodingNs.MediaVideoProcessingAlgorithm = js.native
  /** Gets the set of properties for configuring the VideoTransformEffectDefinition object. */
  var properties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet = js.native
  /** Gets or sets the angle and direction in which the video will be rotated. */
  var rotation: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaRotation = js.native
}

