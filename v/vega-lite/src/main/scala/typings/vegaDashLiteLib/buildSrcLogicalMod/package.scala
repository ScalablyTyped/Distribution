package typings
package vegaDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcLogicalMod {
  /* Rewritten from type alias, can be one of: 
    - LogicalNot[T]
    - LogicalAnd[T]
    - LogicalOr[T]
    - T
  */
  type LogicalOperand[T] = _LogicalOperand[T] | T
}
