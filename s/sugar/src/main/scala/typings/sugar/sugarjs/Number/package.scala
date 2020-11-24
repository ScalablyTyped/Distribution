package typings.sugar.sugarjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Number {
  
  type Chainable[RawValue] = typings.sugar.sugarjs.Number.ChainableBase[RawValue] with typings.sugar.sugarjs.Object.ChainableBase[RawValue]
}
