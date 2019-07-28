package typings.sugar.sugarjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ObjectNs {
  type Chainable[RawValue] = ChainableBase[RawValue]
  type mapFn[T, U] = js.Function3[/* val */ T, /* key */ String, /* obj */ js.Object, U]
  type resolveFn[T] = js.Function5[
    /* key */ String, 
    /* targetVal */ T, 
    /* sourceVal */ T, 
    /* target */ js.Object, 
    /* source */ js.Object, 
    Boolean
  ]
  type searchFn[T] = js.Function3[/* key */ String, /* val */ T, /* obj */ js.Object, Boolean]
}
