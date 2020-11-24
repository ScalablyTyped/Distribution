package typings.wordpressData.mod

import typings.wordpressData.anon.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataRegistry extends js.Object {
  
  var dispatch: js.Function1[/* key */ String, DispatcherMap] = js.native
  
  var registerGenericStore: js.Function2[/* key */ String, /* config */ GenericStoreConfig, Unit] = js.native
  
  var registerStore: FnCall = js.native
  
  var select: js.Function1[/* key */ String, SelectorMap] = js.native
  
  var subscribe: Subscriber = js.native
}
object DataRegistry {
  
  @scala.inline
  def apply(
    dispatch: /* key */ String => DispatcherMap,
    registerGenericStore: (/* key */ String, /* config */ GenericStoreConfig) => Unit,
    registerStore: FnCall,
    select: /* key */ String => SelectorMap,
    subscribe: /* callback */ js.Function0[Unit] => js.Function0[Unit]
  ): DataRegistry = {
    val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), registerGenericStore = js.Any.fromFunction2(registerGenericStore), registerStore = registerStore.asInstanceOf[js.Any], select = js.Any.fromFunction1(select), subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[DataRegistry]
  }
  
  @scala.inline
  implicit class DataRegistryOps[Self <: DataRegistry] (val x: Self) extends AnyVal {
    
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
    def setRegisterGenericStore(value: (/* key */ String, /* config */ GenericStoreConfig) => Unit): Self = this.set("registerGenericStore", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRegisterStore(value: FnCall): Self = this.set("registerStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: /* key */ String => SelectorMap): Self = this.set("select", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubscribe(value: /* callback */ js.Function0[Unit] => js.Function0[Unit]): Self = this.set("subscribe", js.Any.fromFunction1(value))
  }
}
