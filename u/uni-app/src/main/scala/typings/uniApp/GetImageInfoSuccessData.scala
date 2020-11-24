package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetImageInfoSuccessData extends js.Object {
  
  /**
    * 图片高度，单位px
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * 返回图片的方向
    */
  var orientation: js.UndefOr[String] = js.native
  
  /**
    * 返回图片的本地路径
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * 返回图片的格式
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * 图片宽度，单位px
    */
  var width: js.UndefOr[Double] = js.native
}
object GetImageInfoSuccessData {
  
  @scala.inline
  def apply(): GetImageInfoSuccessData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetImageInfoSuccessData]
  }
  
  @scala.inline
  implicit class GetImageInfoSuccessDataOps[Self <: GetImageInfoSuccessData] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
