package typings.winrtUwp.Windows.Media.Effects

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typings.winrtUwp.Windows.Foundation.Rect
import typings.winrtUwp.Windows.Foundation.Size
import typings.winrtUwp.Windows.Media.MediaProperties.MediaMirroringOptions
import typings.winrtUwp.Windows.Media.MediaProperties.MediaRotation
import typings.winrtUwp.Windows.Media.Transcoding.MediaVideoProcessingAlgorithm
import typings.winrtUwp.Windows.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the definition of a video transform effect. */
@JSGlobal("Windows.Media.Effects.VideoTransformEffectDefinition")
@js.native
/** Initializes a new instance of the VideoTransformEffectDefinition class. */
class VideoTransformEffectDefinition () extends js.Object {
  /** Gets the activatable class ID of the video transform effect definition. */
  var activatableClassId: String = js.native
  /** Gets or sets the rectangle within which the video will be cropped, specified in pixels. */
  var cropRectangle: Rect = js.native
  /** Gets or sets the direction in which the video will be mirrored. */
  var mirror: MediaMirroringOptions = js.native
  /** Gets or sets the output size of the video, in pixels. */
  var outputSize: Size = js.native
  /** Gets or sets the color that will be used to fill pixels in the frame that are not filled with video, such as when video is letterboxed. */
  var paddingColor: Color = js.native
  /** Gets or sets the media processing algorithm that is used for the video transform. */
  var processingAlgorithm: MediaVideoProcessingAlgorithm = js.native
  /** Gets the set of properties for configuring the VideoTransformEffectDefinition object. */
  var properties: IPropertySet = js.native
  /** Gets or sets the angle and direction in which the video will be rotated. */
  var rotation: MediaRotation = js.native
}

