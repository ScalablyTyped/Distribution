package typings.urllib.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestOptions2 extends RequestOptions {
  
  var isRetry: js.UndefOr[js.Function1[/* res */ HttpClientResponse[_], Boolean]] = js.native
  
  var retry: js.UndefOr[Double] = js.native
  
  var retryDelay: js.UndefOr[Double] = js.native
}
object RequestOptions2 {
  
  @scala.inline
  def apply(): RequestOptions2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestOptions2]
  }
  
  @scala.inline
  implicit class RequestOptions2Ops[Self <: RequestOptions2] (val x: Self) extends AnyVal {
    
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
    def setIsRetry(value: /* res */ HttpClientResponse[_] => Boolean): Self = this.set("isRetry", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsRetry: Self = this.set("isRetry", js.undefined)
    
    @scala.inline
    def setRetry(value: Double): Self = this.set("retry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetry: Self = this.set("retry", js.undefined)
    
    @scala.inline
    def setRetryDelay(value: Double): Self = this.set("retryDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryDelay: Self = this.set("retryDelay", js.undefined)
  }
}
