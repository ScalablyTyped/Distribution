package typings.winrtUwp.Windows.Media.Core

import typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines an audio media stream. */
@js.native
trait AudioStreamDescriptor extends StObject {
  
  /** The encoding properties of the stream. */
  var encodingProperties: AudioEncodingProperties = js.native
  
  /** Specifies whether the stream is currently in use by the MediaStreamSource . */
  var isSelected: Boolean = js.native
  
  /** Gets or sets the RFC-1766 language code for the stream. */
  var language: String = js.native
  
  /** Gets or sets the name of the stream. */
  var name: String = js.native
}
object AudioStreamDescriptor {
  
  @scala.inline
  def apply(encodingProperties: AudioEncodingProperties, isSelected: Boolean, language: String, name: String): AudioStreamDescriptor = {
    val __obj = js.Dynamic.literal(encodingProperties = encodingProperties.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioStreamDescriptor]
  }
  
  @scala.inline
  implicit class AudioStreamDescriptorMutableBuilder[Self <: AudioStreamDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncodingProperties(value: AudioEncodingProperties): Self = StObject.set(x, "encodingProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
