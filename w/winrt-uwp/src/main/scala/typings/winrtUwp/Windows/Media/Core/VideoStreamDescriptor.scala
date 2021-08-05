package typings.winrtUwp.Windows.Media.Core

import typings.winrtUwp.Windows.Media.MediaProperties.VideoEncodingProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines an video media stream. */
trait VideoStreamDescriptor extends StObject {
  
  /** Gets the encoding properties on the video stream. */
  var encodingProperties: VideoEncodingProperties
  
  /** Specifies whether the stream is currently in use by the MediaStreamSource . */
  var isSelected: Boolean
  
  /** Gets or sets the RFC-1766 language code for the stream. */
  var language: String
  
  /** Gets or sets the name of the stream. */
  var name: String
}
object VideoStreamDescriptor {
  
  inline def apply(encodingProperties: VideoEncodingProperties, isSelected: Boolean, language: String, name: String): VideoStreamDescriptor = {
    val __obj = js.Dynamic.literal(encodingProperties = encodingProperties.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoStreamDescriptor]
  }
  
  extension [Self <: VideoStreamDescriptor](x: Self) {
    
    inline def setEncodingProperties(value: VideoEncodingProperties): Self = StObject.set(x, "encodingProperties", value.asInstanceOf[js.Any])
    
    inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
