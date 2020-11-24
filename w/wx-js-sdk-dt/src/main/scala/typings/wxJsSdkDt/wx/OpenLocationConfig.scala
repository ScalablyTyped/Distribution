package typings.wxJsSdkDt.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenLocationConfig extends WxBaseRequestConfig {
  
  /**
    * 地址详情说明
    */
  var address: js.UndefOr[String] = js.native
  
  /**
    * 在查看位置界面底部显示的超链接, 可点击跳转
    */
  var infoUrl: js.UndefOr[String] = js.native
  
  var latitude: js.UndefOr[Double] = js.native
  
  var longitude: js.UndefOr[Double] = js.native
  
  /**
    * 位置名
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * 地图缩放级别,整形值,范围从1~28。默认为最大
    */
  var scale: js.UndefOr[Double] = js.native
}
object OpenLocationConfig {
  
  @scala.inline
  def apply(): OpenLocationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenLocationConfig]
  }
  
  @scala.inline
  implicit class OpenLocationConfigOps[Self <: OpenLocationConfig] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setInfoUrl(value: String): Self = this.set("infoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfoUrl: Self = this.set("infoUrl", js.undefined)
    
    @scala.inline
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatitude: Self = this.set("latitude", js.undefined)
    
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongitude: Self = this.set("longitude", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
  }
}
