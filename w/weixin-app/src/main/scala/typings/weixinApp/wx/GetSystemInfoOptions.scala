package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSystemInfoOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  /** 成功获取系统信息的回调 */
  @JSName("success")
  def success_MGetSystemInfoOptions(res: SystemInfo): Unit
}
object GetSystemInfoOptions {
  
  @scala.inline
  def apply(success: SystemInfo => Unit): GetSystemInfoOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetSystemInfoOptions]
  }
  
  @scala.inline
  implicit class GetSystemInfoOptionsMutableBuilder[Self <: GetSystemInfoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: SystemInfo => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
