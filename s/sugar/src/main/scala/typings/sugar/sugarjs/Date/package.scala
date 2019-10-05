package typings.sugar.sugarjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Date {
  type Chainable[RawValue] = ChainableBase[RawValue] with typings.sugar.sugarjs.Object.ChainableBase[RawValue]
}
