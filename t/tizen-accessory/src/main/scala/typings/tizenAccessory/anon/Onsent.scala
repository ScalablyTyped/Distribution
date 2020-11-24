package typings.tizenAccessory.anon

import typings.tizenAccessory.SAPeerAgent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Onsent extends js.Object {
  
  var onerror: js.UndefOr[
    js.Function3[/* errorCode */ String, /* peerAgent */ SAPeerAgent, /* id */ String, Unit]
  ] = js.native
  
  var onsent: js.UndefOr[js.Function2[/* peerAgent */ SAPeerAgent, /* id */ String, Unit]] = js.native
}
object Onsent {
  
  @scala.inline
  def apply(): Onsent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Onsent]
  }
  
  @scala.inline
  implicit class OnsentOps[Self <: Onsent] (val x: Self) extends AnyVal {
    
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
    def setOnerror(value: (/* errorCode */ String, /* peerAgent */ SAPeerAgent, /* id */ String) => Unit): Self = this.set("onerror", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnerror: Self = this.set("onerror", js.undefined)
    
    @scala.inline
    def setOnsent(value: (/* peerAgent */ SAPeerAgent, /* id */ String) => Unit): Self = this.set("onsent", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnsent: Self = this.set("onsent", js.undefined)
  }
}
