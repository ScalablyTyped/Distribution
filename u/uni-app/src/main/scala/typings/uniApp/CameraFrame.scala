package typings.uniApp

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CameraFrame extends StObject {
  
  /**
    * 图像像素点数据，一维数组，每四项表示一个像素点的 rgba
    */
  var data: js.UndefOr[ArrayBuffer] = js.native
  
  /**
    * 图像数据矩形的高度
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * 图像数据矩形的宽度
    */
  var width: js.UndefOr[Double] = js.native
}
object CameraFrame {
  
  @scala.inline
  def apply(): CameraFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CameraFrame]
  }
  
  @scala.inline
  implicit class CameraFrameMutableBuilder[Self <: CameraFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
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
