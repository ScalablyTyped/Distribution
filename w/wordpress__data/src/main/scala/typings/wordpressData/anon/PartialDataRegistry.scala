package typings.wordpressData.anon

import typings.wordpressData.mod.DispatcherMap
import typings.wordpressData.mod.GenericStoreConfig
import typings.wordpressData.mod.SelectorMap
import typings.wordpressData.mod.Subscriber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@wordpress/data.@wordpress/data.DataRegistry> */
@js.native
trait PartialDataRegistry extends js.Object {
  
  var dispatch: js.UndefOr[js.Function1[/* key */ String, DispatcherMap]] = js.native
  
  var registerGenericStore: js.UndefOr[js.Function2[/* key */ String, /* config */ GenericStoreConfig, Unit]] = js.native
  
  var registerStore: js.UndefOr[FnCall] = js.native
  
  var select: js.UndefOr[js.Function1[/* key */ String, SelectorMap]] = js.native
  
  var subscribe: js.UndefOr[Subscriber] = js.native
}
object PartialDataRegistry {
  
  @scala.inline
  def apply(): PartialDataRegistry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDataRegistry]
  }
  
  @scala.inline
  implicit class PartialDataRegistryOps[Self <: PartialDataRegistry] (val x: Self) extends AnyVal {
    
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
    def setDispatch(value: /* key */ String => DispatcherMap): Self = this.set("dispatch", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDispatch: Self = this.set("dispatch", js.undefined)
    
    @scala.inline
    def setRegisterGenericStore(value: (/* key */ String, /* config */ GenericStoreConfig) => Unit): Self = this.set("registerGenericStore", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRegisterGenericStore: Self = this.set("registerGenericStore", js.undefined)
    
    @scala.inline
    def setRegisterStore(value: FnCall): Self = this.set("registerStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegisterStore: Self = this.set("registerStore", js.undefined)
    
    @scala.inline
    def setSelect(value: /* key */ String => SelectorMap): Self = this.set("select", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    
    @scala.inline
    def setSubscribe(value: /* callback */ js.Function0[Unit] => js.Function0[Unit]): Self = this.set("subscribe", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSubscribe: Self = this.set("subscribe", js.undefined)
  }
}
