package typings
package sugarLib.sugarjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ArrayNs {
  type Chainable[T, RawValue] = (ChainableBase[T, RawValue]) with sugarLib.sugarjsNs.ObjectNs.ChainableBase[RawValue]
  type mapFn = js.Function3[/* el */ js.Any, /* i */ scala.Double, /* arr */ js.Array[js.Any], js.Any]
  type searchFn = js.Function3[/* el */ js.Any, /* i */ scala.Double, /* arr */ js.Array[js.Any], scala.Boolean]
  type sortMapFn = js.Function1[/* el */ js.Any, js.Any]
}
