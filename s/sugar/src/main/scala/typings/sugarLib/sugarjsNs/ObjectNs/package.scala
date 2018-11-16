package typings
package sugarLib.sugarjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ObjectNs {
  type Chainable[RawValue] = ChainableBase[RawValue]
  type mapFn = js.Function3[/* val */ js.Any, /* key */ java.lang.String, /* obj */ js.Object, js.Any]
  type resolveFn = js.Function5[
    /* key */ java.lang.String, 
    /* targetVal */ js.Any, 
    /* sourceVal */ js.Any, 
    /* target */ js.Object, 
    /* source */ js.Object, 
    scala.Boolean
  ]
  type searchFn = js.Function3[/* key */ java.lang.String, /* val */ js.Any, /* obj */ js.Object, scala.Boolean]
}
