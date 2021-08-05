package typings.tabris.mod

import typings.tabris.Blob
import typings.tabris.tabrisStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageLikeObject
  extends StObject
     with _ImageValue {
  
  var height: js.UndefOr[Double | auto] = js.undefined
  
  var scale: js.UndefOr[Double | auto] = js.undefined
  
  var src: String | ImageBitmap | Blob
  
  var width: js.UndefOr[Double | auto] = js.undefined
}
object ImageLikeObject {
  
  inline def apply(src: String | ImageBitmap | Blob): ImageLikeObject = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageLikeObject]
  }
  
  extension [Self <: ImageLikeObject](x: Self) {
    
    inline def setHeight(value: Double | auto): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setScale(value: Double | auto): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setSrc(value: String | ImageBitmap | Blob): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double | auto): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
