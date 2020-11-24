package typings.wampy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelCallbacksHash extends js.Object {
  
  var onError: js.UndefOr[Callback] = js.native
  
  var onSuccess: js.UndefOr[Callback] = js.native
}
object CancelCallbacksHash {
  
  @scala.inline
  def apply(): CancelCallbacksHash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelCallbacksHash]
  }
  
  @scala.inline
  implicit class CancelCallbacksHashOps[Self <: CancelCallbacksHash] (val x: Self) extends AnyVal {
    
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
    def setOnError(value: () => Unit): Self = this.set("onError", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setOnSuccess(value: () => Unit): Self = this.set("onSuccess", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnSuccess: Self = this.set("onSuccess", js.undefined)
  }
}
