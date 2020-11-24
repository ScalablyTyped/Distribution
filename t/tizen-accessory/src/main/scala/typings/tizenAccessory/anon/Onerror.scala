package typings.tizenAccessory.anon

import typings.tizenAccessory.SAPeerAgent
import typings.tizenAccessory.tizenAccessoryStrings.AVAILABLE
import typings.tizenAccessory.tizenAccessoryStrings.UNAVAILABLE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Onerror extends js.Object {
  
  var onerror: js.UndefOr[js.Function1[/* errorCode */ String, Unit]] = js.native
  
  def onpeeragentfound(peerAgent: SAPeerAgent): Unit = js.native
  
  var onpeeragentupdated: js.UndefOr[
    js.Function2[/* peerAgent */ SAPeerAgent, /* status */ AVAILABLE | UNAVAILABLE, Unit]
  ] = js.native
}
object Onerror {
  
  @scala.inline
  def apply(onpeeragentfound: SAPeerAgent => Unit): Onerror = {
    val __obj = js.Dynamic.literal(onpeeragentfound = js.Any.fromFunction1(onpeeragentfound))
    __obj.asInstanceOf[Onerror]
  }
  
  @scala.inline
  implicit class OnerrorOps[Self <: Onerror] (val x: Self) extends AnyVal {
    
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
    def setOnpeeragentfound(value: SAPeerAgent => Unit): Self = this.set("onpeeragentfound", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnerror(value: /* errorCode */ String => Unit): Self = this.set("onerror", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnerror: Self = this.set("onerror", js.undefined)
    
    @scala.inline
    def setOnpeeragentupdated(value: (/* peerAgent */ SAPeerAgent, /* status */ AVAILABLE | UNAVAILABLE) => Unit): Self = this.set("onpeeragentupdated", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnpeeragentupdated: Self = this.set("onpeeragentupdated", js.undefined)
  }
}
