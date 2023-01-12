package typings.wegameApi.wx.types

import typings.wegameApi.wegameApiStrings.jpg
import typings.wegameApi.wegameApiStrings.png
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToTempFileSyncParams extends StObject {
  
  /**
    * 目标文件的高度，会将截取的部分拉伸或压缩至该数值
    */
  var destHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * 目标文件的宽度，会将截取的部分拉伸或压缩至该数值
    */
  var destWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * 目标文件的类型
    */
  var fileType: js.UndefOr[jpg | png] = js.undefined
  
  /**
    * 截取 canvas 的高度
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * jpg图片的质量，仅当 fileType 为 jpg 时有效。取值范围为 0.0（最低）- 1.0（最高），不含 0。不在范围内时当作 1.0
    */
  var quality: js.UndefOr[Double] = js.undefined
  
  /**
    * 截取 canvas 的宽度
    */
  var width: js.UndefOr[Double] = js.undefined
  
  /**
    * 截取 canvas 的左上角横坐标
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * 截取 canvas 的左上角纵坐标
    */
  var y: js.UndefOr[Double] = js.undefined
}
object ToTempFileSyncParams {
  
  inline def apply(): ToTempFileSyncParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToTempFileSyncParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToTempFileSyncParams] (val x: Self) extends AnyVal {
    
    inline def setDestHeight(value: Double): Self = StObject.set(x, "destHeight", value.asInstanceOf[js.Any])
    
    inline def setDestHeightUndefined: Self = StObject.set(x, "destHeight", js.undefined)
    
    inline def setDestWidth(value: Double): Self = StObject.set(x, "destWidth", value.asInstanceOf[js.Any])
    
    inline def setDestWidthUndefined: Self = StObject.set(x, "destWidth", js.undefined)
    
    inline def setFileType(value: jpg | png): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    inline def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
