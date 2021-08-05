package typings.wegameApi.anon

import typings.wegameApi.wegameApiStrings.dark
import typings.wegameApi.wegameApiStrings.light
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailStyle extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 样式风格
    */
  var style: light | dark
  
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object FailStyle {
  
  inline def apply(style: light | dark): FailStyle = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailStyle]
  }
  
  extension [Self <: FailStyle](x: Self) {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setStyle(value: light | dark): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: () => Unit): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
