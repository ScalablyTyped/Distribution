package typings.winrtUwp.Windows.Media.Capture

import typings.winrtUwp.Windows.Media.MediaProperties.VideoEncodingProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a set of input and output VideoEncodingProperties for a video stream */
trait VideoStreamConfiguration extends StObject {
  
  /** Gets a VideoEncodingProperties object representing an video stream input configuration. */
  var inputProperties: VideoEncodingProperties
  
  /** Gets a VideoEncodingProperties object representing an video stream output configuration. */
  var outputProperties: VideoEncodingProperties
}
object VideoStreamConfiguration {
  
  inline def apply(inputProperties: VideoEncodingProperties, outputProperties: VideoEncodingProperties): VideoStreamConfiguration = {
    val __obj = js.Dynamic.literal(inputProperties = inputProperties.asInstanceOf[js.Any], outputProperties = outputProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoStreamConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoStreamConfiguration] (val x: Self) extends AnyVal {
    
    inline def setInputProperties(value: VideoEncodingProperties): Self = StObject.set(x, "inputProperties", value.asInstanceOf[js.Any])
    
    inline def setOutputProperties(value: VideoEncodingProperties): Self = StObject.set(x, "outputProperties", value.asInstanceOf[js.Any])
  }
}
