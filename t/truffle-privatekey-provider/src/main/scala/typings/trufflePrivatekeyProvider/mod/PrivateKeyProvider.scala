package typings.trufflePrivatekeyProvider.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrivateKeyProvider extends js.Object {
  
  def send(args: js.Any*): js.Any = js.native
  
  def sendAsync(args: js.Any*): Unit = js.native
}
object PrivateKeyProvider {
  
  @scala.inline
  def apply(send: /* repeated */ js.Any => js.Any, sendAsync: /* repeated */ js.Any => Unit): PrivateKeyProvider = {
    val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send), sendAsync = js.Any.fromFunction1(sendAsync))
    __obj.asInstanceOf[PrivateKeyProvider]
  }
  
  @scala.inline
  implicit class PrivateKeyProviderOps[Self <: PrivateKeyProvider] (val x: Self) extends AnyVal {
    
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
    def setSend(value: /* repeated */ js.Any => js.Any): Self = this.set("send", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSendAsync(value: /* repeated */ js.Any => Unit): Self = this.set("sendAsync", js.Any.fromFunction1(value))
  }
}
