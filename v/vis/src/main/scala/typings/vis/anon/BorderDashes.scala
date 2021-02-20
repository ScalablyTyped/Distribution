package typings.vis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderDashes extends StObject {
  
  var borderDashes: js.UndefOr[Boolean | js.Array[Double]] = js.native
  
  // only for borders
  var borderRadius: js.UndefOr[Double] = js.native
  
  // only for box shape
  var interpolation: js.UndefOr[Boolean] = js.native
  
  // only for image and circularImage shapes
  var useBorderWithImage: js.UndefOr[Boolean] = js.native
  
  // only for image and circularImage shapes
  var useImageSize: js.UndefOr[Boolean] = js.native
}
object BorderDashes {
  
  @scala.inline
  def apply(): BorderDashes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderDashes]
  }
  
  @scala.inline
  implicit class BorderDashesMutableBuilder[Self <: BorderDashes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderDashes(value: Boolean | js.Array[Double]): Self = StObject.set(x, "borderDashes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderDashesUndefined: Self = StObject.set(x, "borderDashes", js.undefined)
    
    @scala.inline
    def setBorderDashesVarargs(value: Double*): Self = StObject.set(x, "borderDashes", js.Array(value :_*))
    
    @scala.inline
    def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    @scala.inline
    def setInterpolation(value: Boolean): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
    
    @scala.inline
    def setUseBorderWithImage(value: Boolean): Self = StObject.set(x, "useBorderWithImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseBorderWithImageUndefined: Self = StObject.set(x, "useBorderWithImage", js.undefined)
    
    @scala.inline
    def setUseImageSize(value: Boolean): Self = StObject.set(x, "useImageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseImageSizeUndefined: Self = StObject.set(x, "useImageSize", js.undefined)
  }
}
