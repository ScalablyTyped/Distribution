package typings
package sugarLib.sugarjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object StringNs {
  type Chainable[RawValue] = ChainableBase[RawValue] with sugarLib.sugarjsNs.ObjectNs.ChainableBase[RawValue]
  type replaceFn = js.Function4[
    /* tag */ java.lang.String, 
    /* inner */ java.lang.String, 
    /* attr */ java.lang.String, 
    /* outer */ java.lang.String, 
    java.lang.String
  ]
}
