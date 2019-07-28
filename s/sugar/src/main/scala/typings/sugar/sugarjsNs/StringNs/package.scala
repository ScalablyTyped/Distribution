package typings.sugar.sugarjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object StringNs {
  type Chainable[RawValue] = ChainableBase[RawValue] with typings.sugar.sugarjsNs.ObjectNs.ChainableBase[RawValue]
  type replaceFn = js.Function4[/* tag */ String, /* inner */ String, /* attr */ String, /* outer */ String, String]
}
