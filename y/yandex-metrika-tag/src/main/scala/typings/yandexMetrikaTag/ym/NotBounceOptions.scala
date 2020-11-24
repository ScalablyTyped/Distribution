package typings.yandexMetrikaTag.ym

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotBounceOptions[CTX] extends js.Object {
  
  var callback: js.UndefOr[js.ThisFunction0[/* this */ CTX, Unit]] = js.native
  
  var ctx: js.UndefOr[CTX] = js.native
}
object NotBounceOptions {
  
  @scala.inline
  def apply[CTX](): NotBounceOptions[CTX] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotBounceOptions[CTX]]
  }
  
  @scala.inline
  implicit class NotBounceOptionsOps[Self <: NotBounceOptions[_], CTX] (val x: Self with NotBounceOptions[CTX]) extends AnyVal {
    
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
    def setCallback(value: js.ThisFunction0[/* this */ CTX, Unit]): Self = this.set("callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setCtx(value: CTX): Self = this.set("ctx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCtx: Self = this.set("ctx", js.undefined)
  }
}
