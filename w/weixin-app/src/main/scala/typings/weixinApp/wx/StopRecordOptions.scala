package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopRecordOptions
  extends BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  var success_StopRecordOptions: js.UndefOr[js.Function1[/* res */ RecordResponse, Unit]] = js.native
}
object StopRecordOptions {
  
  @scala.inline
  def apply(): StopRecordOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopRecordOptions]
  }
  
  @scala.inline
  implicit class StopRecordOptionsMutableBuilder[Self <: StopRecordOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: /* res */ RecordResponse => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
