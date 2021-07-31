package typings.wegameApi.wx.types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetKeepScreenOnParams extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var keepScreenOn: Boolean
  
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object SetKeepScreenOnParams {
  
  @scala.inline
  def apply(keepScreenOn: Boolean): SetKeepScreenOnParams = {
    val __obj = js.Dynamic.literal(keepScreenOn = keepScreenOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetKeepScreenOnParams]
  }
  
  @scala.inline
  implicit class SetKeepScreenOnParamsMutableBuilder[Self <: SetKeepScreenOnParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setKeepScreenOn(value: Boolean): Self = StObject.set(x, "keepScreenOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: () => Unit): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
