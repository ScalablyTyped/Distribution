package typings.weixinApp.wx

import typings.weixinApp.weixinAppStrings.gcj02
import typings.weixinApp.weixinAppStrings.wgs84
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLocationOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /** 传入 true 会返回高度信息，由于获取高度需要较高精确度，会减慢接口返回速度 */
  var altitude: js.UndefOr[Boolean] = js.native
  
  /** 高精度定位超时时间(ms)，指定时间内返回最高精度，该值3000ms以上高精度定位才有效果 */
  var highAccuracyExpireTime: js.UndefOr[Double] = js.native
  
  /** 开启高精度定位 */
  var isHighAccuracy: js.UndefOr[Boolean] = js.native
  
  /** 接口调用成功的回调函数，返回内容详见返回参数说明。 */
  @JSName("success")
  def success_MGetLocationOptions(res: LocationData): Unit = js.native
  
  /** 默认为 wgs84 返回 gps 坐标，gcj02 返回可用于wx.openLocation的坐标 */
  var `type`: js.UndefOr[wgs84 | gcj02] = js.native
}
object GetLocationOptions {
  
  @scala.inline
  def apply(success: LocationData => Unit): GetLocationOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetLocationOptions]
  }
  
  @scala.inline
  implicit class GetLocationOptionsMutableBuilder[Self <: GetLocationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltitude(value: Boolean): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    @scala.inline
    def setHighAccuracyExpireTime(value: Double): Self = StObject.set(x, "highAccuracyExpireTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighAccuracyExpireTimeUndefined: Self = StObject.set(x, "highAccuracyExpireTime", js.undefined)
    
    @scala.inline
    def setIsHighAccuracy(value: Boolean): Self = StObject.set(x, "isHighAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHighAccuracyUndefined: Self = StObject.set(x, "isHighAccuracy", js.undefined)
    
    @scala.inline
    def setSuccess(value: LocationData => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setType(value: wgs84 | gcj02): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
