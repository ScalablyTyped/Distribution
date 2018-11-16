package typings
package vuexLib.vuexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StoreOptions[S] extends js.Object {
  var actions: js.UndefOr[ActionTree[S, S]] = js.undefined
  var getters: js.UndefOr[GetterTree[S, S]] = js.undefined
  var modules: js.UndefOr[ModuleTree[S]] = js.undefined
  var mutations: js.UndefOr[MutationTree[S]] = js.undefined
  var plugins: js.UndefOr[js.Array[Plugin[S]]] = js.undefined
  var state: js.UndefOr[S] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

