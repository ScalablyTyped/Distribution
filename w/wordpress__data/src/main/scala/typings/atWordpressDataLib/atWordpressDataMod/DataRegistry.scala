package typings
package atWordpressDataLib.atWordpressDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataRegistry extends js.Object {
  var dispatch: js.Function1[/* key */ java.lang.String, DispatcherMap]
  var registerGenericStore: js.Function2[/* key */ java.lang.String, /* config */ GenericStoreConfig, scala.Unit]
  var registerStore: atWordpressDataLib.Fn_Config
  var select: js.Function1[/* key */ java.lang.String, SelectorMap]
  var subscribe: Subscriber
}

object DataRegistry {
  @scala.inline
  def apply(
    dispatch: /* key */ java.lang.String => DispatcherMap,
    registerGenericStore: (/* key */ java.lang.String, /* config */ GenericStoreConfig) => scala.Unit,
    registerStore: atWordpressDataLib.Fn_Config,
    select: /* key */ java.lang.String => SelectorMap,
    subscribe: Subscriber
  ): DataRegistry = {
    val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), registerGenericStore = js.Any.fromFunction2(registerGenericStore), registerStore = registerStore, select = js.Any.fromFunction1(select), subscribe = subscribe)
  
    __obj.asInstanceOf[DataRegistry]
  }
}

