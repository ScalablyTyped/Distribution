package typings.terminalKit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Promise extends js.Object {
  
  def abort(): Unit = js.native
  
  var promise: js.Promise[js.UndefOr[String]] = js.native
}
object Promise {
  
  @scala.inline
  def apply(abort: () => Unit, promise: js.Promise[js.UndefOr[String]]): Promise = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), promise = promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[Promise]
  }
  
  @scala.inline
  implicit class PromiseOps[Self <: Promise] (val x: Self) extends AnyVal {
    
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
    def setAbort(value: () => Unit): Self = this.set("abort", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPromise(value: js.Promise[js.UndefOr[String]]): Self = this.set("promise", value.asInstanceOf[js.Any])
  }
}
