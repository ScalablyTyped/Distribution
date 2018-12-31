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

