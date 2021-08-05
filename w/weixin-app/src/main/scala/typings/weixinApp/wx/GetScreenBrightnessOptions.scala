package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetScreenBrightnessOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  /** 屏幕亮度值，范围 0~1，0 最暗，1 最亮 */
  @JSName("success")
  def success_MGetScreenBrightnessOptions(value: Double): Unit
}
object GetScreenBrightnessOptions {
  
  inline def apply(success: Double => Unit): GetScreenBrightnessOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetScreenBrightnessOptions]
  }
  
  extension [Self <: GetScreenBrightnessOptions](x: Self) {
    
    inline def setSuccess(value: Double => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
