package typings.weixinApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<weixin-app.wx.Lifetimes> */
@js.native
trait PartialLifetimes extends js.Object {
  
  var attached: js.UndefOr[js.Function0[Unit]] = js.native
  
  var created: js.UndefOr[js.Function0[Unit]] = js.native
  
  var detached: js.UndefOr[js.Function0[Unit]] = js.native
  
  var moved: js.UndefOr[js.Function0[Unit]] = js.native
  
  var ready: js.UndefOr[js.Function0[Unit]] = js.native
}
object PartialLifetimes {
  
  @scala.inline
  def apply(): PartialLifetimes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLifetimes]
  }
  
  @scala.inline
  implicit class PartialLifetimesOps[Self <: PartialLifetimes] (val x: Self) extends AnyVal {
    
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
    def setAttached(value: () => Unit): Self = this.set("attached", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteAttached: Self = this.set("attached", js.undefined)
    
    @scala.inline
    def setCreated(value: () => Unit): Self = this.set("created", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setDetached(value: () => Unit): Self = this.set("detached", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDetached: Self = this.set("detached", js.undefined)
    
    @scala.inline
    def setMoved(value: () => Unit): Self = this.set("moved", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteMoved: Self = this.set("moved", js.undefined)
    
    @scala.inline
    def setReady(value: () => Unit): Self = this.set("ready", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteReady: Self = this.set("ready", js.undefined)
  }
}
