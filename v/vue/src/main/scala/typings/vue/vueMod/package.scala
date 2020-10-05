package typings.vue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object vueMod {
  type CombinedVueInstance[Instance /* <: typings.vue.vueMod.Vue */, Data, Methods, Computed, Props] = Data with Methods with Computed with Props with Instance
  type ExtendedVue[Instance /* <: typings.vue.vueMod.Vue */, Data, Methods, Computed, Props] = typings.vue.vueMod.VueConstructor[
    (typings.vue.vueMod.CombinedVueInstance[Instance, Data, Methods, Computed, Props]) with typings.vue.vueMod.Vue
  ]
}
