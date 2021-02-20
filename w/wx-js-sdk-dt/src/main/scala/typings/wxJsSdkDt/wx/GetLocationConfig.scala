package typings.wxJsSdkDt.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLocationConfig extends WxBaseRequestConfig {
  
  @JSName("success")
  def success_MGetLocationConfig(res: Location): Unit = js.native
  
  /**
    * 默认为 wgs84 的 gps 坐标，如果要返回直接给 openLocation 用的火星坐标，可传入'gcj02'
    */
  var `type`: js.UndefOr[String] = js.native
}
object GetLocationConfig {
  
  @scala.inline
  def apply(success: Location => Unit): GetLocationConfig = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetLocationConfig]
  }
  
  @scala.inline
  implicit class GetLocationConfigMutableBuilder[Self <: GetLocationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: Location => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
