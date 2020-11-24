package typings.tizenAccessory.anon

import typings.tizenAccessory.SAPeerAgent
import typings.tizenAccessory.SASocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Onconnect extends js.Object {
  
  var onconnect: js.UndefOr[js.Function1[/* socket */ SASocket, Unit]] = js.native
  
  var onerror: js.UndefOr[js.Function2[/* errorCode */ String, /* peerAgent */ SAPeerAgent, Unit]] = js.native
  
  var onrequest: js.UndefOr[js.Function1[/* peerAgent */ SAPeerAgent, Unit]] = js.native
}
object Onconnect {
  
  @scala.inline
  def apply(): Onconnect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Onconnect]
  }
  
  @scala.inline
  implicit class OnconnectOps[Self <: Onconnect] (val x: Self) extends AnyVal {
    
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
    def setOnconnect(value: /* socket */ SASocket => Unit): Self = this.set("onconnect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnconnect: Self = this.set("onconnect", js.undefined)
    
    @scala.inline
    def setOnerror(value: (/* errorCode */ String, /* peerAgent */ SAPeerAgent) => Unit): Self = this.set("onerror", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnerror: Self = this.set("onerror", js.undefined)
    
    @scala.inline
    def setOnrequest(value: /* peerAgent */ SAPeerAgent => Unit): Self = this.set("onrequest", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnrequest: Self = this.set("onrequest", js.undefined)
  }
}
