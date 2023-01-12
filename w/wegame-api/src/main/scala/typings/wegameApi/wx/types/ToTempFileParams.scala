package typings.wegameApi.wx.types

import typings.wegameApi.anon.TempFilePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToTempFileParams
  extends StObject
     with ToTempFileSyncParams {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var success: js.UndefOr[js.Function1[/* res */ TempFilePath, Unit]] = js.undefined
}
object ToTempFileParams {
  
  inline def apply(): ToTempFileParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToTempFileParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToTempFileParams] (val x: Self) extends AnyVal {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSuccess(value: /* res */ TempFilePath => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
