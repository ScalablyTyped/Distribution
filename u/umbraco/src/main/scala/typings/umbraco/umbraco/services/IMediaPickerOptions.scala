package typings.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Mediapicker dialog options object
  */
trait IMediaPickerOptions extends StObject {
  
  /*callback function*/
  var callback: js.Function
  
  /*Only display files that have an image file-extension*/
  var onlyImages: Boolean
}
object IMediaPickerOptions {
  
  inline def apply(callback: js.Function, onlyImages: Boolean): IMediaPickerOptions = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], onlyImages = onlyImages.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMediaPickerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMediaPickerOptions] (val x: Self) extends AnyVal {
    
    inline def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setOnlyImages(value: Boolean): Self = StObject.set(x, "onlyImages", value.asInstanceOf[js.Any])
  }
}
