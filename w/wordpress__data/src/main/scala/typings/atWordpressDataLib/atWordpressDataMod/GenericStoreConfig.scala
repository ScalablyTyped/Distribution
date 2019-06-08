package typings
package atWordpressDataLib.atWordpressDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenericStoreConfig extends js.Object {
  var subscribe: Subscriber
  def getActions(): DispatcherMap
  def getSelectors(): SelectorMap
}

object GenericStoreConfig {
  @scala.inline
  def apply(getActions: () => DispatcherMap, getSelectors: () => SelectorMap, subscribe: Subscriber): GenericStoreConfig = {
    val __obj = js.Dynamic.literal(getActions = js.Any.fromFunction0(getActions), getSelectors = js.Any.fromFunction0(getSelectors), subscribe = subscribe)
  
    __obj.asInstanceOf[GenericStoreConfig]
  }
}

