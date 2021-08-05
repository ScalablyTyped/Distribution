package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopRecordOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  var success_StopRecordOptions: js.UndefOr[js.Function1[/* res */ RecordResponse, Unit]] = js.undefined
}
object StopRecordOptions {
  
  inline def apply(): StopRecordOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopRecordOptions]
  }
  
  extension [Self <: StopRecordOptions](x: Self) {
    
    inline def setSuccess(value: /* res */ RecordResponse => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
