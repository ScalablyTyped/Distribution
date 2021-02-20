package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasGetImageDataRes extends StObject {
  
  /**
    * 图像像素点数据，一维数组，每四项表示一个像素点的rgba
    */
  var data: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * 回调信息
    */
  var errMsg: js.UndefOr[String] = js.native
  
  /**
    * 图像数据矩形的高度
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * 图像数据矩形的宽度
    */
  var width: js.UndefOr[Double] = js.native
}
object CanvasGetImageDataRes {
  
  @scala.inline
  def apply(): CanvasGetImageDataRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasGetImageDataRes]
  }
  
  @scala.inline
  implicit class CanvasGetImageDataResMutableBuilder[Self <: CanvasGetImageDataRes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[_]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsgUndefined: Self = StObject.set(x, "errMsg", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
