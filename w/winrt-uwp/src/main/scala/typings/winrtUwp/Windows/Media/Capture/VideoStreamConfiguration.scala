package typings.winrtUwp.Windows.Media.Capture

import typings.winrtUwp.Windows.Media.MediaProperties.VideoEncodingProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a set of input and output VideoEncodingProperties for a video stream */
@js.native
trait VideoStreamConfiguration extends StObject {
  
  /** Gets a VideoEncodingProperties object representing an video stream input configuration. */
  var inputProperties: VideoEncodingProperties = js.native
  
  /** Gets a VideoEncodingProperties object representing an video stream output configuration. */
  var outputProperties: VideoEncodingProperties = js.native
}
object VideoStreamConfiguration {
  
  @scala.inline
  def apply(inputProperties: VideoEncodingProperties, outputProperties: VideoEncodingProperties): VideoStreamConfiguration = {
    val __obj = js.Dynamic.literal(inputProperties = inputProperties.asInstanceOf[js.Any], outputProperties = outputProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoStreamConfiguration]
  }
  
  @scala.inline
  implicit class VideoStreamConfigurationMutableBuilder[Self <: VideoStreamConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputProperties(value: VideoEncodingProperties): Self = StObject.set(x, "inputProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputProperties(value: VideoEncodingProperties): Self = StObject.set(x, "outputProperties", value.asInstanceOf[js.Any])
  }
}
