package typings.winrtUwp.Windows.Media.Effects

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import typings.winrtUwp.Windows.Foundation.Rect
import typings.winrtUwp.Windows.Foundation.Size
import typings.winrtUwp.Windows.Media.MediaProperties.MediaMirroringOptions
import typings.winrtUwp.Windows.Media.MediaProperties.MediaRotation
import typings.winrtUwp.Windows.Media.Transcoding.MediaVideoProcessingAlgorithm
import typings.winrtUwp.Windows.UI.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the definition of a video transform effect. */
@js.native
trait VideoTransformEffectDefinition extends StObject {
  
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
  
  @scala.inline
  implicit class VideoTransformEffectDefinitionMutableBuilder[Self <: VideoTransformEffectDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivatableClassId(value: String): Self = StObject.set(x, "activatableClassId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropRectangle(value: Rect): Self = StObject.set(x, "cropRectangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMirror(value: MediaMirroringOptions): Self = StObject.set(x, "mirror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputSize(value: Size): Self = StObject.set(x, "outputSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingColor(value: Color): Self = StObject.set(x, "paddingColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingAlgorithm(value: MediaVideoProcessingAlgorithm): Self = StObject.set(x, "processingAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: IPropertySet): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotation(value: MediaRotation): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
  }
}
