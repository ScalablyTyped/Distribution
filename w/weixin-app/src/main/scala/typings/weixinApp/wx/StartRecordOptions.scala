package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartRecordOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /** 超过30s或页面onHide时会结束录像 */
  var timeoutCallback: js.UndefOr[js.Function1[/* res */ RecordResponse, Unit]] = js.native
}
object StartRecordOptions {
  
  @scala.inline
  def apply(): StartRecordOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartRecordOptions]
  }
  
  @scala.inline
  implicit class StartRecordOptionsMutableBuilder[Self <: StartRecordOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimeoutCallback(value: /* res */ RecordResponse => Unit): Self = StObject.set(x, "timeoutCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTimeoutCallbackUndefined: Self = StObject.set(x, "timeoutCallback", js.undefined)
  }
}
