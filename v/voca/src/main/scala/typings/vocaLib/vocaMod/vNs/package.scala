package typings
package vocaLib.vocaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object vNs {
  type CountPredicate = js.Function3[
    /* character */ java.lang.String, 
    /* index */ scala.Double, 
    /* str */ java.lang.String, 
    scala.Boolean
  ]
  type ReplacementFunction = js.Function2[
    /* match */ js.UndefOr[java.lang.String], 
    /* repeated */java.lang.String, 
    java.lang.String
  ]
}
