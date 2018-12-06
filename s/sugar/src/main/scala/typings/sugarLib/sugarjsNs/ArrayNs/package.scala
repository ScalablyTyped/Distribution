package typings
package sugarLib.sugarjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ArrayNs {
  type Chainable[T, RawValue] = (ChainableBase[T, RawValue]) with sugarLib.sugarjsNs.ObjectNs.ChainableBase[RawValue]
  type mapFn[T, U] = js.Function3[/* el */ T, /* i */ scala.Double, /* arr */ js.Array[T], U]
  type searchFn[T] = js.Function3[/* el */ T, /* i */ scala.Double, /* arr */ js.Array[T], scala.Boolean]
  type sortMapFn[T, U] = js.Function1[/* el */ T, U]
}
