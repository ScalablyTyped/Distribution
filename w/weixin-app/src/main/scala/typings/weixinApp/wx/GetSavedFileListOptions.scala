package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSavedFileListOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  /** 接口调用成功的回调函数 */
  @JSName("success")
  var success_GetSavedFileListOptions: js.UndefOr[js.Function1[/* res */ GetSavedFileListData, Unit]] = js.undefined
}
object GetSavedFileListOptions {
  
  @scala.inline
  def apply(): GetSavedFileListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSavedFileListOptions]
  }
  
  @scala.inline
  implicit class GetSavedFileListOptionsMutableBuilder[Self <: GetSavedFileListOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: /* res */ GetSavedFileListData => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
