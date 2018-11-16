package typings
package vueLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesVueMod {
  type CombinedVueInstance[Instance /* <: Vue */, Data, Methods, Computed, Props] = Data with Methods with Computed with Props with Instance
  type ExtendedVue[Instance /* <: Vue */, Data, Methods, Computed, Props] = VueConstructor[(CombinedVueInstance[Instance, Data, Methods, Computed, Props]) with Vue]
}
