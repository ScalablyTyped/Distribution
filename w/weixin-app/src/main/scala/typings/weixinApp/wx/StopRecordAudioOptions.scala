package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopRecordAudioOptions
  extends BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  var success_StopRecordAudioOptions: js.UndefOr[js.Function1[/* res */ TempFileResponse, Unit]] = js.native
}
object StopRecordAudioOptions {
  
  @scala.inline
  def apply(): StopRecordAudioOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopRecordAudioOptions]
  }
  
  @scala.inline
  implicit class StopRecordAudioOptionsMutableBuilder[Self <: StopRecordAudioOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: /* res */ TempFileResponse => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
