package typings.wegameApi.wx.types

import typings.wegameApi.wegameApiStrings.game
import typings.wegameApi.wegameApiStrings.normal
import typings.wegameApi.wegameApiStrings.ui
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccelerometerParams extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var interval: game | ui | normal
  
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object AccelerometerParams {
  
  @scala.inline
  def apply(interval: game | ui | normal): AccelerometerParams = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerometerParams]
  }
  
  @scala.inline
  implicit class AccelerometerParamsMutableBuilder[Self <: AccelerometerParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setInterval(value: game | ui | normal): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: () => Unit): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
