package typings.atWordpressData.atWordpressDataMod

import typings.atWordpressData.Fn_Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataRegistry extends js.Object {
  var dispatch: js.Function1[/* key */ String, DispatcherMap]
  var registerGenericStore: js.Function2[/* key */ String, /* config */ GenericStoreConfig, Unit]
  var registerStore: Fn_Config
  var select: js.Function1[/* key */ String, SelectorMap]
  var subscribe: Subscriber
}

object DataRegistry {
  @scala.inline
  def apply(
    dispatch: /* key */ String => DispatcherMap,
    registerGenericStore: (/* key */ String, /* config */ GenericStoreConfig) => Unit,
    registerStore: Fn_Config,
    select: /* key */ String => SelectorMap,
    subscribe: Subscriber
  ): DataRegistry = {
    val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), registerGenericStore = js.Any.fromFunction2(registerGenericStore), registerStore = registerStore, select = js.Any.fromFunction1(select), subscribe = subscribe)
  
    __obj.asInstanceOf[DataRegistry]
  }
}

