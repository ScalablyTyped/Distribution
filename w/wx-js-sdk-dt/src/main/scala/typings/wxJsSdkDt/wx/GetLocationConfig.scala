package typings.wxJsSdkDt.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLocationConfig
  extends StObject
     with WxBaseRequestConfig {
  
  @JSName("success")
  def success_MGetLocationConfig(res: Location): Unit
  
  /**
    * 默认为 wgs84 的 gps 坐标，如果要返回直接给 openLocation 用的火星坐标，可传入'gcj02'
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object GetLocationConfig {
  
  inline def apply(success: Location => Unit): GetLocationConfig = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetLocationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLocationConfig] (val x: Self) extends AnyVal {
    
    inline def setSuccess(value: Location => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
