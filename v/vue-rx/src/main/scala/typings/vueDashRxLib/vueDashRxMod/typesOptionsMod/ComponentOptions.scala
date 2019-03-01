package typings
package vueDashRxLib.vueDashRxMod.typesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentOptions[V /* <: vueLib.typesVueMod.Vue */] extends js.Object {
  var domStreams: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var observableMethods: js.UndefOr[js.Array[java.lang.String] | (stdLib.Record[java.lang.String, java.lang.String])] = js.undefined
  var subscriptions: js.UndefOr[
    vueDashRxLib.vueDashRxMod.Observables | (js.ThisFunction0[/* this */ V, vueDashRxLib.vueDashRxMod.Observables])
  ] = js.undefined
}

object ComponentOptions {
  @scala.inline
  def apply[V /* <: vueLib.typesVueMod.Vue */](
    domStreams: js.Array[java.lang.String] = null,
    observableMethods: js.Array[java.lang.String] | (stdLib.Record[java.lang.String, java.lang.String]) = null,
    subscriptions: vueDashRxLib.vueDashRxMod.Observables | (js.ThisFunction0[/* this */ V, vueDashRxLib.vueDashRxMod.Observables]) = null
  ): ComponentOptions[V] = {
    val __obj = js.Dynamic.literal()
    if (domStreams != null) __obj.updateDynamic("domStreams")(domStreams)
    if (observableMethods != null) __obj.updateDynamic("observableMethods")(observableMethods.asInstanceOf[js.Any])
    if (subscriptions != null) __obj.updateDynamic("subscriptions")(subscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentOptions[V]]
  }
}

