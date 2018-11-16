package typings
package vuexLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Module[S, R] extends js.Object {
  var actions: js.UndefOr[ActionTree[S, R]] = js.undefined
  var getters: js.UndefOr[GetterTree[S, R]] = js.undefined
  var modules: js.UndefOr[ModuleTree[R]] = js.undefined
  var mutations: js.UndefOr[MutationTree[S]] = js.undefined
  var namespaced: js.UndefOr[scala.Boolean] = js.undefined
  var state: js.UndefOr[S | js.Function0[S]] = js.undefined
}

