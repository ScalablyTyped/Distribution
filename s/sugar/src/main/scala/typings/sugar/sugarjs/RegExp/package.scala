package typings.sugar.sugarjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object RegExp {
  type Chainable[RawValue] = typings.sugar.sugarjs.RegExp.ChainableBase[RawValue] with typings.sugar.sugarjs.Object.ChainableBase[RawValue]
}
