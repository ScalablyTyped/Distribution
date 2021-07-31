package typings.wechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAPIParam[T] extends StObject {
  
  var complete: js.UndefOr[js.Function1[/* val */ T | IAPIError, Unit]] = js.undefined
  
  var config: js.UndefOr[ICloudConfig] = js.undefined
  
  var fail: js.UndefOr[js.Function1[/* err */ IAPIError, Unit]] = js.undefined
  
  var success: js.UndefOr[js.Function1[/* res */ T, Unit]] = js.undefined
}
object IAPIParam {
  
  @scala.inline
  def apply[T](): IAPIParam[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAPIParam[T]]
  }
  
  @scala.inline
  implicit class IAPIParamMutableBuilder[Self <: IAPIParam[?], T] (val x: Self & IAPIParam[T]) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* val */ T | IAPIError => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setConfig(value: ICloudConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setFail(value: /* err */ IAPIError => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ T => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
