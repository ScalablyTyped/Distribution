package typings.sugar.sugarjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Array {
  
  type Chainable[T, RawValue] = (typings.sugar.sugarjs.Array.ChainableBase[T, RawValue]) with typings.sugar.sugarjs.Object.ChainableBase[RawValue]
  
  type mapFn[T, U] = js.Function3[/* el */ T, /* i */ scala.Double, /* arr */ typings.sugar.Array[T], U]
  
  type searchFn[T] = js.Function3[/* el */ T, /* i */ scala.Double, /* arr */ typings.sugar.Array[T], scala.Boolean]
  
  type sortMapFn[T, U] = js.Function1[/* el */ T, U]
}
