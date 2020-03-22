package typings.wordpressData

import typings.wordpressData.mod.DispatcherMap
import typings.wordpressData.mod.GenericStoreConfig
import typings.wordpressData.mod.SelectorMap
import typings.wordpressData.mod.Subscriber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@wordpress/data.@wordpress/data.DataRegistry> */
trait PartialDataRegistry extends js.Object {
  var dispatch: js.UndefOr[js.Function1[/* key */ String, DispatcherMap]] = js.undefined
  var registerGenericStore: js.UndefOr[js.Function2[/* key */ String, /* config */ GenericStoreConfig, Unit]] = js.undefined
  var registerStore: js.UndefOr[FnCall] = js.undefined
  var select: js.UndefOr[js.Function1[/* key */ String, SelectorMap]] = js.undefined
  var subscribe: js.UndefOr[Subscriber] = js.undefined
}

object PartialDataRegistry {
  @scala.inline
  def apply(
    dispatch: /* key */ String => DispatcherMap = null,
    registerGenericStore: (/* key */ String, /* config */ GenericStoreConfig) => Unit = null,
    registerStore: FnCall = null,
    select: /* key */ String => SelectorMap = null,
    subscribe: /* callback */ js.Function0[Unit] => js.Function0[Unit] = null
  ): PartialDataRegistry = {
    val __obj = js.Dynamic.literal()
    if (dispatch != null) __obj.updateDynamic("dispatch")(js.Any.fromFunction1(dispatch))
    if (registerGenericStore != null) __obj.updateDynamic("registerGenericStore")(js.Any.fromFunction2(registerGenericStore))
    if (registerStore != null) __obj.updateDynamic("registerStore")(registerStore.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1(select))
    if (subscribe != null) __obj.updateDynamic("subscribe")(js.Any.fromFunction1(subscribe))
    __obj.asInstanceOf[PartialDataRegistry]
  }
}

