package typings.vueRuntimeDom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoHTMLAttributes
  extends StObject
     with MediaHTMLAttributes {
  
  var disablePictureInPicture: js.UndefOr[Booleanish] = js.undefined
  
  var height: js.UndefOr[Numberish] = js.undefined
  
  var poster: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Numberish] = js.undefined
}
object VideoHTMLAttributes {
  
  inline def apply(): VideoHTMLAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoHTMLAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoHTMLAttributes] (val x: Self) extends AnyVal {
    
    inline def setDisablePictureInPicture(value: Booleanish): Self = StObject.set(x, "disablePictureInPicture", value.asInstanceOf[js.Any])
    
    inline def setDisablePictureInPictureUndefined: Self = StObject.set(x, "disablePictureInPicture", js.undefined)
    
    inline def setHeight(value: Numberish): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
    
    inline def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
    
    inline def setWidth(value: Numberish): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
