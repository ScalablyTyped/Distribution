package typings.wegameApi.wx.types

import typings.wegameApi.anon.ErrMsg
import typings.wegameApi.anon.Stat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatParams extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var fail: js.UndefOr[js.Function1[/* res */ ErrMsg, Unit]] = js.undefined
  
  var path: String
  
  var success: js.UndefOr[js.Function1[/* res */ Stat, Unit]] = js.undefined
}
object StatParams {
  
  inline def apply(path: String): StatParams = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatParams] (val x: Self) extends AnyVal {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ ErrMsg => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* res */ Stat => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
