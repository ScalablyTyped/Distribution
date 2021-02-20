package typings.wxJsSdkDt.wx

import org.scalablytyped.runtime.StObject
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
  implicit class OpenLocationConfigMutableBuilder[Self <: OpenLocationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setInfoUrl(value: String): Self = StObject.set(x, "infoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoUrlUndefined: Self = StObject.set(x, "infoUrl", js.undefined)
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
