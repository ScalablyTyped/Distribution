package typings.wordpressData.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenericStoreConfig extends js.Object {
  
  def getActions(): DispatcherMap = js.native
  
  def getSelectors(): SelectorMap = js.native
  
  var subscribe: Subscriber = js.native
}
object GenericStoreConfig {
  
  @scala.inline
  def apply(
    getActions: () => DispatcherMap,
    getSelectors: () => SelectorMap,
    subscribe: /* callback */ js.Function0[Unit] => js.Function0[Unit]
  ): GenericStoreConfig = {
    val __obj = js.Dynamic.literal(getActions = js.Any.fromFunction0(getActions), getSelectors = js.Any.fromFunction0(getSelectors), subscribe = js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[GenericStoreConfig]
  }
  
  @scala.inline
  implicit class GenericStoreConfigOps[Self <: GenericStoreConfig] (val x: Self) extends AnyVal {
    
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
    def setGetActions(value: () => DispatcherMap): Self = this.set("getActions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSelectors(value: () => SelectorMap): Self = this.set("getSelectors", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSubscribe(value: /* callback */ js.Function0[Unit] => js.Function0[Unit]): Self = this.set("subscribe", js.Any.fromFunction1(value))
  }
}
