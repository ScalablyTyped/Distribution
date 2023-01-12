package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetImageInfoSuccessData extends StObject {
  
  /**
    * 图片高度，单位px
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * 返回图片的方向
    */
  var orientation: js.UndefOr[String] = js.undefined
  
  /**
    * 返回图片的本地路径
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * 返回图片的格式
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * 图片宽度，单位px
    */
  var width: js.UndefOr[Double] = js.undefined
}
object GetImageInfoSuccessData {
  
  inline def apply(): GetImageInfoSuccessData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetImageInfoSuccessData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetImageInfoSuccessData] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
