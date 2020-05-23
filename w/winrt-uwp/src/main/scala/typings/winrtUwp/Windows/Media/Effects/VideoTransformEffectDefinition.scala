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
trait VideoTransformEffectDefinition extends js.Object {
  /** Gets the activatable class ID of the video transform effect definition. */
  var activatableClassId: String
  /** Gets or sets the rectangle within which the video will be cropped, specified in pixels. */
  var cropRectangle: Rect
  /** Gets or sets the direction in which the video will be mirrored. */
  var mirror: MediaMirroringOptions
  /** Gets or sets the output size of the video, in pixels. */
  var outputSize: Size
  /** Gets or sets the color that will be used to fill pixels in the frame that are not filled with video, such as when video is letterboxed. */
  var paddingColor: Color
  /** Gets or sets the media processing algorithm that is used for the video transform. */
  var processingAlgorithm: MediaVideoProcessingAlgorithm
  /** Gets the set of properties for configuring the VideoTransformEffectDefinition object. */
  var properties: IPropertySet
  /** Gets or sets the angle and direction in which the video will be rotated. */
  var rotation: MediaRotation
}

object VideoTransformEffectDefinition {
  @scala.inline
  def apply(
    activatableClassId: String,
    cropRectangle: Rect,
    mirror: MediaMirroringOptions,
    outputSize: Size,
    paddingColor: Color,
    processingAlgorithm: MediaVideoProcessingAlgorithm,
    properties: IPropertySet,
    rotation: MediaRotation
  ): VideoTransformEffectDefinition = {
    val __obj = js.Dynamic.literal(activatableClassId = activatableClassId.asInstanceOf[js.Any], cropRectangle = cropRectangle.asInstanceOf[js.Any], mirror = mirror.asInstanceOf[js.Any], outputSize = outputSize.asInstanceOf[js.Any], paddingColor = paddingColor.asInstanceOf[js.Any], processingAlgorithm = processingAlgorithm.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoTransformEffectDefinition]
  }
}

