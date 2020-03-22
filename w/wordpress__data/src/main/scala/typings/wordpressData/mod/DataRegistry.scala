package typings.wordpressData.mod

import typings.wordpressData.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataRegistry extends js.Object {
  var dispatch: js.Function1[/* key */ String, DispatcherMap]
  var registerGenericStore: js.Function2[/* key */ String, /* config */ GenericStoreConfig, Unit]
  var registerStore: FnCall
  var select: js.Function1[/* key */ String, SelectorMap]
  var subscribe: Subscriber
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
}

