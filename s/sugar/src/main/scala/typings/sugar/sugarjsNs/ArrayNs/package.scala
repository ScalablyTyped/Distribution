package typings.sugar.sugarjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ArrayNs {
  type Chainable[T, RawValue] = (ChainableBase[T, RawValue]) with typings.sugar.sugarjsNs.ObjectNs.ChainableBase[RawValue]
  type mapFn[T, U] = js.Function3[/* el */ T, /* i */ Double, /* arr */ js.Array[T], U]
  type searchFn[T] = js.Function3[/* el */ T, /* i */ Double, /* arr */ js.Array[T], Boolean]
  type sortMapFn[T, U] = js.Function1[/* el */ T, U]
}
