package typings.weixinApp.wx

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
  implicit class StartRecordOptionsOps[Self <: StartRecordOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTimeoutCallback(value: /* res */ RecordResponse => Unit): Self = this.set("timeoutCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTimeoutCallback: Self = this.set("timeoutCallback", js.undefined)
  }
}
