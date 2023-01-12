package typings.winrt.Windows.Media.MediaProperties

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IImageEncodingPropertiesStatics extends StObject {
  
  def createJpeg(): ImageEncodingProperties
  
  def createJpegXR(): ImageEncodingProperties
  
  def createPng(): ImageEncodingProperties
}
object IImageEncodingPropertiesStatics {
  
  inline def apply(
    createJpeg: () => ImageEncodingProperties,
    createJpegXR: () => ImageEncodingProperties,
    createPng: () => ImageEncodingProperties
  ): IImageEncodingPropertiesStatics = {
    val __obj = js.Dynamic.literal(createJpeg = js.Any.fromFunction0(createJpeg), createJpegXR = js.Any.fromFunction0(createJpegXR), createPng = js.Any.fromFunction0(createPng))
    __obj.asInstanceOf[IImageEncodingPropertiesStatics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IImageEncodingPropertiesStatics] (val x: Self) extends AnyVal {
    
    inline def setCreateJpeg(value: () => ImageEncodingProperties): Self = StObject.set(x, "createJpeg", js.Any.fromFunction0(value))
    
    inline def setCreateJpegXR(value: () => ImageEncodingProperties): Self = StObject.set(x, "createJpegXR", js.Any.fromFunction0(value))
    
    inline def setCreatePng(value: () => ImageEncodingProperties): Self = StObject.set(x, "createPng", js.Any.fromFunction0(value))
  }
}
