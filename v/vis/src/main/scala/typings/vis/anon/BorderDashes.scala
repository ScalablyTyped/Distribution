package typings.vis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderDashes extends StObject {
  
  var borderDashes: js.UndefOr[Boolean | js.Array[Double]] = js.undefined
  
  // only for borders
  var borderRadius: js.UndefOr[Double] = js.undefined
  
  // only for box shape
  var interpolation: js.UndefOr[Boolean] = js.undefined
  
  // only for image and circularImage shapes
  var useBorderWithImage: js.UndefOr[Boolean] = js.undefined
  
  // only for image and circularImage shapes
  var useImageSize: js.UndefOr[Boolean] = js.undefined
}
object BorderDashes {
  
  inline def apply(): BorderDashes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderDashes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BorderDashes] (val x: Self) extends AnyVal {
    
    inline def setBorderDashes(value: Boolean | js.Array[Double]): Self = StObject.set(x, "borderDashes", value.asInstanceOf[js.Any])
    
    inline def setBorderDashesUndefined: Self = StObject.set(x, "borderDashes", js.undefined)
    
    inline def setBorderDashesVarargs(value: Double*): Self = StObject.set(x, "borderDashes", js.Array(value*))
    
    inline def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    inline def setInterpolation(value: Boolean): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
    
    inline def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
    
    inline def setUseBorderWithImage(value: Boolean): Self = StObject.set(x, "useBorderWithImage", value.asInstanceOf[js.Any])
    
    inline def setUseBorderWithImageUndefined: Self = StObject.set(x, "useBorderWithImage", js.undefined)
    
    inline def setUseImageSize(value: Boolean): Self = StObject.set(x, "useImageSize", value.asInstanceOf[js.Any])
    
    inline def setUseImageSizeUndefined: Self = StObject.set(x, "useImageSize", js.undefined)
  }
}
