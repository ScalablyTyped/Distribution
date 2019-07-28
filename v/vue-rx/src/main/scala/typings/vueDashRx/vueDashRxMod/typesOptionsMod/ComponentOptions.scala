package typings.vueDashRx.vueDashRxMod.typesOptionsMod

import typings.std.Record
import typings.vue.typesVueMod.Vue
import typings.vueDashRx.vueDashRxMod.Observables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentOptions[V /* <: Vue */] extends js.Object {
  var domStreams: js.UndefOr[js.Array[String]] = js.undefined
  var observableMethods: js.UndefOr[js.Array[String] | (Record[String, String])] = js.undefined
  var subscriptions: js.UndefOr[Observables | (js.ThisFunction0[/* this */ V, Observables])] = js.undefined
}

object ComponentOptions {
  @scala.inline
  def apply[V /* <: Vue */](
    domStreams: js.Array[String] = null,
    observableMethods: js.Array[String] | (Record[String, String]) = null,
    subscriptions: Observables | (js.ThisFunction0[/* this */ V, Observables]) = null
  ): ComponentOptions[V] = {
    val __obj = js.Dynamic.literal()
    if (domStreams != null) __obj.updateDynamic("domStreams")(domStreams)
    if (observableMethods != null) __obj.updateDynamic("observableMethods")(observableMethods.asInstanceOf[js.Any])
    if (subscriptions != null) __obj.updateDynamic("subscriptions")(subscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentOptions[V]]
  }
}

