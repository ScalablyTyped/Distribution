package typings.weixinApp.wx

import typings.weixinApp.anon.EncryptedData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeRunDataOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  var success_WeRunDataOptions: js.UndefOr[js.Function1[/* res */ EncryptedData, Unit]] = js.undefined
}
object WeRunDataOptions {
  
  inline def apply(): WeRunDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeRunDataOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WeRunDataOptions] (val x: Self) extends AnyVal {
    
    inline def setSuccess(value: /* res */ EncryptedData => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
