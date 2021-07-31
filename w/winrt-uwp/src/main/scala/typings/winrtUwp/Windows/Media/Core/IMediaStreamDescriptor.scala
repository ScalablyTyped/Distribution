package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines a media stream. */
trait IMediaStreamDescriptor extends StObject {
  
  /** Specifies whether the stream is currently in use by the MediaStreamSource . */
  var isSelected: Boolean
  
  /** Gets or sets the RFC-1766 language code for the stream. */
  var language: String
  
  /** Gets or sets the name of the stream. */
  var name: String
}
object IMediaStreamDescriptor {
  
  @scala.inline
  def apply(isSelected: Boolean, language: String, name: String): IMediaStreamDescriptor = {
    val __obj = js.Dynamic.literal(isSelected = isSelected.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMediaStreamDescriptor]
  }
  
  @scala.inline
  implicit class IMediaStreamDescriptorMutableBuilder[Self <: IMediaStreamDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
