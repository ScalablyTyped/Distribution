package typings.weixinApp.wx

import typings.weixinApp.anon.Latitude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 位置-----地图组件控制
trait GetCenterLocationOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  def success_MGetCenterLocationOptions(res: Latitude): Unit
}
object GetCenterLocationOptions {
  
  inline def apply(success: Latitude => Unit): GetCenterLocationOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetCenterLocationOptions]
  }
  
  extension [Self <: GetCenterLocationOptions](x: Self) {
    
    inline def setSuccess(value: Latitude => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
