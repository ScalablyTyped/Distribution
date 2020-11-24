package typings.uniApp

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CameraFrame extends js.Object {
  
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
  implicit class CameraFrameOps[Self <: CameraFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setData(value: ArrayBuffer): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
