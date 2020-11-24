package typings.wavesurferJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XHROptions extends js.Object {
  
  var requestHeaders: js.UndefOr[js.Array[XHRRequestHeader]] = js.native
  
  var withCredentials: js.UndefOr[Boolean] = js.native
}
object XHROptions {
  
  @scala.inline
  def apply(): XHROptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XHROptions]
  }
  
  @scala.inline
  implicit class XHROptionsOps[Self <: XHROptions] (val x: Self) extends AnyVal {
    
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
    def setRequestHeadersVarargs(value: XHRRequestHeader*): Self = this.set("requestHeaders", js.Array(value :_*))
    
    @scala.inline
    def setRequestHeaders(value: js.Array[XHRRequestHeader]): Self = this.set("requestHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestHeaders: Self = this.set("requestHeaders", js.undefined)
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithCredentials: Self = this.set("withCredentials", js.undefined)
  }
}
